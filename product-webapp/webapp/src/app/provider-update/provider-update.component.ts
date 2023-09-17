import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FormBuilder, FormGroup, FormControl, FormArray } from '@angular/forms'
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
    address: new FormControl(),
    profilePic: new FormControl()

  });


  productBrands: string[] = ['Redmi', 'Samsung', 'HP', 'Dell'];
  selectedproductBrands: string[] = [];

    toggleproductBrand(productBrand: string) {
    if (this.selectedproductBrands.includes(productBrand)) {
      this.selectedproductBrands = this.selectedproductBrands.filter(pb => pb !== productBrand);
    } else {
      this.selectedproductBrands.push(productBrand);
    }
  }
  serviceProducts: string[] = ['Mobile', 'Tablet', 'Laptop', 'PC'];
  selectedserviceProducts: string[] = [];

    toggleserviceProduct(serviceProduct: string) {
    if (this.selectedserviceProducts.includes(serviceProduct)) {
      this.selectedserviceProducts = this.selectedserviceProducts.filter(sp => sp !== serviceProduct);
    } else {
      this.selectedserviceProducts.push(serviceProduct);
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
      this.regForm.value['profilePic']= e.target.result;
    }

   }

   reader.readAsDataURL(fileInput.target.files[0])
  }
  onSubmit() {
    console.log(this.selectedserviceProducts);
    console.log(this.selectedproductBrands);
    if (this.regForm.valid){
      this.regForm.value.serviceProduct=this.selectedserviceProducts;
      this.regForm.value.productBrand=this.selectedproductBrands;
      


      
    this.providerservice.updateUser(this.regForm.value).subscribe(
      response => {
        
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

