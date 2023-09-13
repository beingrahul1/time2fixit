import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FormBuilder, FormGroup, FormControl } from '@angular/forms'
import { ProviderserviceService } from '../providerservice.service';


@Component({
  selector: 'app-provider-update',
  templateUrl: './provider-update.component.html',
  styleUrls: ['./provider-update.component.css']
})
export class ProviderUpdateComponent {
  ngOnInit() {

  }
  title = 'serviceProvider';
  regForm = new FormGroup({
    shopname: new FormControl(),
    email:new FormControl(),
    password: new FormControl(),
    shopownername: new FormControl(),
    contactnumber: new FormControl(),
    serviceProduct: new FormControl(),
    productBrand: new FormControl(),
    image: new FormControl()

  });

  
  selectedServiceProduct: string[] = [];
 
  selectedProductBrand: string[] = [];
  
  toggleserviceProduct(product: string) {
    if (this.selectedServiceProduct.includes(product)) {
      this.selectedServiceProduct = this.selectedServiceProduct.filter(prod => prod !== product);
    } else {
      this.selectedServiceProduct.push(product);
    }
  }
  
  toggleproductBrand(brand: string) {
    if (this.selectedProductBrand.includes(brand)) {
      this.selectedProductBrand = this.selectedProductBrand.filter(brnd => brnd !== brand);
    } else {
      this.selectedProductBrand.push(brand);
    }
  }


  constructor(private router:Router, private fb: FormBuilder, private providerservice: ProviderserviceService) {}
  onImageSelected(fileInput:any)
  {
  
   let reader= new FileReader();
  
   reader.onload= (e:any)=>{
  
    let img=new Image();
    img.src=e.target.result;
  
    img.onload= rs=>{
      this.regForm.value['image']= e.target.result;
    } 
  
   }
  
   reader.readAsDataURL(fileInput.target.files[0])
  }
  onSubmit() {
    if (this.regForm.valid){
      const formData = this.regForm.value;      
      formData.serviceProduct=this.selectedServiceProduct;
      formData.productBrand=this.selectedProductBrand;
      
    this.providerservice.updateUser(this.regForm.value).subscribe(
      response => {
        console.log(this.regForm);
        console.log('Data submitted successfully:', response);
        alert('Details updated');
          this.regForm.reset();
      },
      error => {
        console.error('Error submitting data:', error);
        alert("Check your details");
      }
    );}
    else{
      alert("Enter the details correctly");
    }
  }}

