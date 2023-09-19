import { Component, OnInit } from '@angular/core';
import { provider } from '../provider-update/provider.model';
import { ServiceproviderService } from '../serviceprovider.service';

@Component({
  selector: 'app-servicelist',
  templateUrl: './servicelist.component.html',
  styleUrls: ['./servicelist.component.css']
})
export class ServicelistComponent implements OnInit{

  constructor(private serviceprovider:ServiceproviderService){}
  ngOnInit(): void {
  this.getServiceProviderList();
  }

  searchtxt : string ='';
  shopName : boolean = false;
  shopOwnerName : boolean = false;
  email : boolean = false;
  location : boolean = false;
  phoneNumber : boolean = false;
  productBrand : boolean = false;
  serviceProduct : boolean = false;

  listofproviders : provider [] =[];


  onSubmit()
  {
<<<<<<< HEAD
    this.listofproviders=[];
    console.log(this.listofproviders)
=======
>>>>>>> c81ad4bc5d36e487100d11c2ab71eec6197449a7
    console.log(this.location);
    console.log(this.email);
    console.log(this.shopName);
    console.log(this.shopOwnerName);
    console.log(this.productBrand);
    console.log(this.serviceProduct);

    if(this.location == false && this.email && this.phoneNumber == false && this.shopName == false && this.shopOwnerName ==false && this.productBrand == false && this.serviceProduct == false)
    {
      this.serviceprovider.getByEmail(this.searchtxt).subscribe(
        data=>{
          console.log(data);
          
          const parsedObject = JSON.parse(data)

          for (const item of parsedObject) {
            const providerInstance = new provider();
            providerInstance.email = item.email;
            providerInstance.shopname = item.shopname;
            providerInstance.password = item.password;
            providerInstance.contactnumber = item.contactnumber;
            providerInstance.serviceProduct = item.serviceProduct;
            providerInstance.productBrand = item.productBrand;
            providerInstance.shopownername = item.shopownername;
            providerInstance.address = item.address;
            providerInstance.profilePic = item.profilePic;
          
            
            this.listofproviders.push(providerInstance);
          }
          

<<<<<<< HEAD
        },
        error=>{
          console.log(error);
        }
      )
    }
    if(this.location && this.email == false && this.phoneNumber == false && this.shopName == false && this.shopOwnerName ==false && this.productBrand == false && this.serviceProduct == false)
    {
      this.serviceprovider.getByAddress(this.searchtxt).subscribe(
        data=>{
          console.log(data);
          
          const parsedObject = JSON.parse(data)

          for (const item of parsedObject) {
            const providerInstance = new provider();
            providerInstance.email = item.email;
            providerInstance.shopname = item.shopname;
            providerInstance.password = item.password;
            providerInstance.contactnumber = item.contactnumber;
            providerInstance.serviceProduct = item.serviceProduct;
            providerInstance.productBrand = item.productBrand;
            providerInstance.shopownername = item.shopownername;
            providerInstance.address = item.address;
            providerInstance.profilePic = item.profilePic;
          
            
            this.listofproviders.push(providerInstance);
          }
          

=======
>>>>>>> c81ad4bc5d36e487100d11c2ab71eec6197449a7
        },
        error=>{
          console.log(error);
        }
      )
    }




if(this.location == false && this.email  == false && this.phoneNumber && this.shopName == false && this.shopOwnerName ==false && this.productBrand == false && this.serviceProduct == false)
    {
      this.serviceprovider.getByAllFields(this.searchtxt).subscribe(
        data=>{
          console.log(data);
          
          const parsedObject = JSON.parse(data)

          for (const item of parsedObject) {
            const providerInstance = new provider();
            providerInstance.email = item.email;
            providerInstance.shopname = item.shopname;
            providerInstance.password = item.password;
            providerInstance.contactnumber = item.contactnumber;
            providerInstance.serviceProduct = item.serviceProduct;
            providerInstance.productBrand = item.productBrand;
            providerInstance.shopownername = item.shopownername;
            providerInstance.address = item.address;
            providerInstance.profilePic = item.profilePic;
          
            
            this.listofproviders.push(providerInstance);
          }
          

        },
        error=>{
          console.log(error);
        }
      )
    }




if(this.location == false && this.email  == false && this.phoneNumber == false && this.shopName && this.shopOwnerName ==false && this.productBrand == false && this.serviceProduct == false)
    {
      this.serviceprovider.getByShopname(this.searchtxt).subscribe(
        data=>{
          console.log(data);
          
          const parsedObject = JSON.parse(data)

          for (const item of parsedObject) {
            const providerInstance = new provider();
            providerInstance.email = item.email;
            providerInstance.shopname = item.shopname;
            providerInstance.password = item.password;
            providerInstance.contactnumber = item.contactnumber;
            providerInstance.serviceProduct = item.serviceProduct;
            providerInstance.productBrand = item.productBrand;
            providerInstance.shopownername = item.shopownername;
            providerInstance.address = item.address;
            providerInstance.profilePic = item.profilePic;
          
            
            this.listofproviders.push(providerInstance);
          }
          

        },
        error=>{
          console.log(error);
        }
      )
    }



if(this.location == false && this.email  == false && this.phoneNumber == false && this.shopName == false && this.shopOwnerName  && this.productBrand == false && this.serviceProduct == false)
    {
      this.serviceprovider.getByShopownername(this.searchtxt).subscribe(
        data=>{
          console.log(data);
          
          const parsedObject = JSON.parse(data)

          for (const item of parsedObject) {
            const providerInstance = new provider();
            providerInstance.email = item.email;
            providerInstance.shopname = item.shopname;
            providerInstance.password = item.password;
            providerInstance.contactnumber = item.contactnumber;
            providerInstance.serviceProduct = item.serviceProduct;
            providerInstance.productBrand = item.productBrand;
            providerInstance.shopownername = item.shopownername;
            providerInstance.address = item.address;
            providerInstance.profilePic = item.profilePic;
          
            
            this.listofproviders.push(providerInstance);
          }
          

        },
        error=>{
          console.log(error);
        }
      )
    }





if(this.location == false && this.email  == false && this.phoneNumber == false && this.shopName == false && this.shopOwnerName ==false && this.productBrand && this.serviceProduct == false)
    {
      this.serviceprovider.getByproductBrand(this.searchtxt).subscribe(
        data=>{
          console.log(data);
          
          const parsedObject = JSON.parse(data)

          for (const item of parsedObject) {
            const providerInstance = new provider();
            providerInstance.email = item.email;
            providerInstance.shopname = item.shopname;
            providerInstance.password = item.password;
            providerInstance.contactnumber = item.contactnumber;
            providerInstance.serviceProduct = item.serviceProduct;
            providerInstance.productBrand = item.productBrand;
            providerInstance.shopownername = item.shopownername;
            providerInstance.address = item.address;
            providerInstance.profilePic = item.profilePic;
          
            
            this.listofproviders.push(providerInstance);
          }
          

        },
        error=>{
          console.log(error);
        }
      )
    }



if(this.location == false && this.email == false && this.phoneNumber == false && this.shopName == false && this.shopOwnerName ==false && this.productBrand == false && this.serviceProduct )
    {
      this.serviceprovider.getByserviceProduct(this.searchtxt).subscribe(
        data=>{
          console.log(data);
          
          const parsedObject = JSON.parse(data)

          for (const item of parsedObject) {
            const providerInstance = new provider();
            providerInstance.email = item.email;
            providerInstance.shopname = item.shopname;
            providerInstance.password = item.password;
            providerInstance.contactnumber = item.contactnumber;
            providerInstance.serviceProduct = item.serviceProduct;
            providerInstance.productBrand = item.productBrand;
            providerInstance.shopownername = item.shopownername;
            providerInstance.address = item.address;
            providerInstance.profilePic = item.profilePic;
          
            
            this.listofproviders.push(providerInstance);
          }
          

        },
        error=>{
          console.log(error);
        }
      )
    }





    if(this.location == false && this.email == false && this.phoneNumber == false && this.shopName && this.shopOwnerName && this.productBrand == false && this.serviceProduct == false)
    {
      this.serviceprovider.getByshopNameandShopOwnerName(this.searchtxt).subscribe(
        data=>{
          console.log(data);
          
          const parsedObject = JSON.parse(data);
          for (const item of parsedObject) {
            const providerInstance = new provider();
            providerInstance.email = item.email;
            providerInstance.shopname = item.shopname;
            providerInstance.password = item.password;
            providerInstance.contactnumber = item.contactnumber;
            providerInstance.serviceProduct = item.serviceProduct;
            providerInstance.productBrand = item.productBrand;
            providerInstance.shopownername = item.shopownername;
            providerInstance.address = item.address;
            providerInstance.profilePic = item.profilePic;         
            
            this.listofproviders.push(providerInstance);
          }

        },
        error=>{
          console.log(error);
        }
      )
    }

    if(this.location == false && this.email == false && this.phoneNumber == false && this.shopName && this.shopOwnerName ==false && this.productBrand == false && this.serviceProduct)
    {
      this.serviceprovider.getByShopNameandServiceProduct(this.searchtxt).subscribe(
        data=>{
          const parsedObject = JSON.parse(data);
          for (const item of parsedObject) {
            const providerInstance = new provider();
            providerInstance.email = item.email;
            providerInstance.shopname = item.shopname;
            providerInstance.password = item.password;
            providerInstance.contactnumber = item.contactnumber;
            providerInstance.serviceProduct = item.serviceProduct;
            providerInstance.productBrand = item.productBrand;
            providerInstance.shopownername = item.shopownername;
            providerInstance.address = item.address;
            providerInstance.profilePic = item.profilePic;         
            
            this.listofproviders.push(providerInstance);
          }

        },
        error=>{
          console.log(error);
        }
      )
    }

    if(this.location && this.email==false && this.phoneNumber == false && this.shopName == false && this.shopOwnerName && this.productBrand == false && this.serviceProduct == false)
    {
      this.serviceprovider.getByShopownernameandAddress(this.searchtxt).subscribe(
        data=>{
          const parsedObject = JSON.parse(data);
          for (const item of parsedObject) {
            const providerInstance = new provider();
            providerInstance.email = item.email;
            providerInstance.shopname = item.shopname;
            providerInstance.password = item.password;
            providerInstance.contactnumber = item.contactnumber;
            providerInstance.serviceProduct = item.serviceProduct;
            providerInstance.productBrand = item.productBrand;
            providerInstance.shopownername = item.shopownername;
            providerInstance.address = item.address;
            providerInstance.profilePic = item.profilePic;         
            
            this.listofproviders.push(providerInstance);
          }
        },
        error=>{
          console.log(error);
        }
      )
    }


    if(this.location == false && this.email == false && this.phoneNumber == false && this.shopName && this.shopOwnerName ==false && this.productBrand && this.serviceProduct == false)
    {
      this.serviceprovider.getByShopNameandProductBrand(this.searchtxt).subscribe(
        data=>{
          const parsedObject = JSON.parse(data);
          for (const item of parsedObject) {
            const providerInstance = new provider();
            providerInstance.email = item.email;
            providerInstance.shopname = item.shopname;
            providerInstance.password = item.password;
            providerInstance.contactnumber = item.contactnumber;
            providerInstance.serviceProduct = item.serviceProduct;
            providerInstance.productBrand = item.productBrand;
            providerInstance.shopownername = item.shopownername;
            providerInstance.address = item.address;
            providerInstance.profilePic = item.profilePic;         
            
            this.listofproviders.push(providerInstance);
          }
        },
        error=>{
          console.log(error);
        }
      )
    }

    if(this.location && this.email == false && this.phoneNumber == false && this.shopName && this.shopOwnerName ==false && this.productBrand == false && this.serviceProduct == false)
    {
      this.serviceprovider.getByShopNameandAddress(this.searchtxt).subscribe(
        data=>{
          const parsedObject = JSON.parse(data);
          for (const item of parsedObject) {
            const providerInstance = new provider();
            providerInstance.email = item.email;
            providerInstance.shopname = item.shopname;
            providerInstance.password = item.password;
            providerInstance.contactnumber = item.contactnumber;
            providerInstance.serviceProduct = item.serviceProduct;
            providerInstance.productBrand = item.productBrand;
            providerInstance.shopownername = item.shopownername;
            providerInstance.address = item.address;
            providerInstance.profilePic = item.profilePic;         
            
            this.listofproviders.push(providerInstance);
          }
        },
        error=>{
          console.log(error);
        }
      )
    }

   if(this.location == false && this.email == false && this.phoneNumber && this.shopName && this.shopOwnerName ==false && this.productBrand == false && this.serviceProduct == false)
   {
     this.serviceprovider.getByShopNameandContactNumber(this.searchtxt).subscribe(
       data=>{
        const parsedObject = JSON.parse(data);
        for (const item of parsedObject) {
          const providerInstance = new provider();
          providerInstance.email = item.email;
          providerInstance.shopname = item.shopname;
          providerInstance.password = item.password;
          providerInstance.contactnumber = item.contactnumber;
          providerInstance.serviceProduct = item.serviceProduct;
          providerInstance.productBrand = item.productBrand;
          providerInstance.shopownername = item.shopownername;
          providerInstance.address = item.address;
          providerInstance.profilePic = item.profilePic;         
          
          this.listofproviders.push(providerInstance);
        }
       },
       error=>{
         console.log(error);
       }
     )
   }

   if(this.location == false && this.email && this.phoneNumber == false && this.shopName && this.shopOwnerName ==false && this.productBrand == false && this.serviceProduct == false)
   {
     this.serviceprovider.getByShopNameandEmail(this.searchtxt).subscribe(
       data=>{
        const parsedObject = JSON.parse(data);
        for (const item of parsedObject) {
          const providerInstance = new provider();
          providerInstance.email = item.email;
          providerInstance.shopname = item.shopname;
          providerInstance.password = item.password;
          providerInstance.contactnumber = item.contactnumber;
          providerInstance.serviceProduct = item.serviceProduct;
          providerInstance.productBrand = item.productBrand;
          providerInstance.shopownername = item.shopownername;
          providerInstance.address = item.address;
          providerInstance.profilePic = item.profilePic;         
          
          this.listofproviders.push(providerInstance);
        }
       },
       error=>{
         console.log(error);
       }
     )
   }

   if(this.location == false && this.email == false && this.phoneNumber == false && this.shopName == false && this.shopOwnerName && this.productBrand == false && this.serviceProduct)
   {
     this.serviceprovider.getByShopOwnerNameandServiceProduct(this.searchtxt).subscribe(
       data=>{
        const parsedObject = JSON.parse(data);
        for (const item of parsedObject) {
          const providerInstance = new provider();
          providerInstance.email = item.email;
          providerInstance.shopname = item.shopname;
          providerInstance.password = item.password;
          providerInstance.contactnumber = item.contactnumber;
          providerInstance.serviceProduct = item.serviceProduct;
          providerInstance.productBrand = item.productBrand;
          providerInstance.shopownername = item.shopownername;
          providerInstance.address = item.address;
          providerInstance.profilePic = item.profilePic;         
          
          this.listofproviders.push(providerInstance);
        }
       },
       error=>{
         console.log(error);
       }
     )
   }

   if(this.location == false && this.email == false && this.phoneNumber == false && this.shopName == false && this.shopOwnerName && this.productBrand && this.serviceProduct == false)
   {
     this.serviceprovider.getByShopOwnerNameandProductBrand(this.searchtxt).subscribe(
       data=>{
        const parsedObject = JSON.parse(data);
        for (const item of parsedObject) {
          const providerInstance = new provider();
          providerInstance.email = item.email;
          providerInstance.shopname = item.shopname;
          providerInstance.password = item.password;
          providerInstance.contactnumber = item.contactnumber;
          providerInstance.serviceProduct = item.serviceProduct;
          providerInstance.productBrand = item.productBrand;
          providerInstance.shopownername = item.shopownername;
          providerInstance.address = item.address;
          providerInstance.profilePic = item.profilePic;         
          
          this.listofproviders.push(providerInstance);
        }
       },
       error=>{
         console.log(error);
       }
     )
   }
   if(this.location == false && this.email == false && this.phoneNumber && this.shopName == false && this.shopOwnerName && this.productBrand == false && this.serviceProduct == false)
   {
     this.serviceprovider.getByShopOwnerNameandcontactNumber(this.searchtxt).subscribe(
       data=>{
        const parsedObject = JSON.parse(data);
        for (const item of parsedObject) {
          const providerInstance = new provider();
          providerInstance.email = item.email;
          providerInstance.shopname = item.shopname;
          providerInstance.password = item.password;
          providerInstance.contactnumber = item.contactnumber;
          providerInstance.serviceProduct = item.serviceProduct;
          providerInstance.productBrand = item.productBrand;
          providerInstance.shopownername = item.shopownername;
          providerInstance.address = item.address;
          providerInstance.profilePic = item.profilePic;         
          
          this.listofproviders.push(providerInstance);
        }
       },
       error=>{
         console.log(error);
       }
     )
   }

   if(this.location == false && this.email && this.phoneNumber == false && this.shopName == false && this.shopOwnerName && this.productBrand == false && this.serviceProduct == false)
   {
     this.serviceprovider.getByShopOwnerNameandEmail(this.searchtxt).subscribe(
       data=>{
        const parsedObject = JSON.parse(data);
        for (const item of parsedObject) {
          const providerInstance = new provider();
          providerInstance.email = item.email;
          providerInstance.shopname = item.shopname;
          providerInstance.password = item.password;
          providerInstance.contactnumber = item.contactnumber;
          providerInstance.serviceProduct = item.serviceProduct;
          providerInstance.productBrand = item.productBrand;
          providerInstance.shopownername = item.shopownername;
          providerInstance.address = item.address;
          providerInstance.profilePic = item.profilePic;         
          
          this.listofproviders.push(providerInstance);
        }
       },
       error=>{
         console.log(error);
       }
     )
   }

   if(this.location && this.email == false && this.phoneNumber == false && this.shopName == false && this.shopOwnerName ==false && this.productBrand == false && this.serviceProduct)
   {
     this.serviceprovider.getByServiceProductandAddress(this.searchtxt).subscribe(
       data=>{
        const parsedObject = JSON.parse(data);
        for (const item of parsedObject) {
          const providerInstance = new provider();
          providerInstance.email = item.email;
          providerInstance.shopname = item.shopname;
          providerInstance.password = item.password;
          providerInstance.contactnumber = item.contactnumber;
          providerInstance.serviceProduct = item.serviceProduct;
          providerInstance.productBrand = item.productBrand;
          providerInstance.shopownername = item.shopownername;
          providerInstance.address = item.address;
          providerInstance.profilePic = item.profilePic;         
          
          this.listofproviders.push(providerInstance);
        }
       },
       error=>{
         console.log(error);
       }
     )
   }

   if(this.location && this.email == false && this.phoneNumber == false && this.shopName == false && this.shopOwnerName ==false && this.productBrand && this.serviceProduct == false)
   {
     this.serviceprovider.getByProductBrandandAddress(this.searchtxt).subscribe(
       data=>{
        const parsedObject = JSON.parse(data);
        for (const item of parsedObject) {
          const providerInstance = new provider();
          providerInstance.email = item.email;
          providerInstance.shopname = item.shopname;
          providerInstance.password = item.password;
          providerInstance.contactnumber = item.contactnumber;
          providerInstance.serviceProduct = item.serviceProduct;
          providerInstance.productBrand = item.productBrand;
          providerInstance.shopownername = item.shopownername;
          providerInstance.address = item.address;
          providerInstance.profilePic = item.profilePic;         
          
          this.listofproviders.push(providerInstance);
        }
       },
       error=>{
         console.log(error);
       }
     )
   }

   if(this.location == false && this.email == false && this.phoneNumber && this.shopName == false && this.shopOwnerName ==false && this.productBrand == false && this.serviceProduct)
   {
     this.serviceprovider.getByServiceProductandcontactNumber(this.searchtxt).subscribe(
       data=>{
        const parsedObject = JSON.parse(data);
        for (const item of parsedObject) {
          const providerInstance = new provider();
          providerInstance.email = item.email;
          providerInstance.shopname = item.shopname;
          providerInstance.password = item.password;
          providerInstance.contactnumber = item.contactnumber;
          providerInstance.serviceProduct = item.serviceProduct;
          providerInstance.productBrand = item.productBrand;
          providerInstance.shopownername = item.shopownername;
          providerInstance.address = item.address;
          providerInstance.profilePic = item.profilePic;         
          
          this.listofproviders.push(providerInstance);
        }
       },
       error=>{
         console.log(error);
       }
     )
   }
   if(this.location == false && this.email == false && this.phoneNumber && this.shopName == false && this.shopOwnerName ==false && this.productBrand && this.serviceProduct == false)
   {
     this.serviceprovider.getByProductBrandandcontactNumber(this.searchtxt).subscribe(
       data=>{
        const parsedObject = JSON.parse(data);
        for (const item of parsedObject) {
          const providerInstance = new provider();
          providerInstance.email = item.email;
          providerInstance.shopname = item.shopname;
          providerInstance.password = item.password;
          providerInstance.contactnumber = item.contactnumber;
          providerInstance.serviceProduct = item.serviceProduct;
          providerInstance.productBrand = item.productBrand;
          providerInstance.shopownername = item.shopownername;
          providerInstance.address = item.address;
          providerInstance.profilePic = item.profilePic;         
          
          this.listofproviders.push(providerInstance);
        }
       },
       error=>{
         console.log(error);
       }
     )
   }
   if(this.location == false && this.email && this.phoneNumber == false && this.shopName == false && this.shopOwnerName ==false && this.productBrand == false && this.serviceProduct)
   {
     this.serviceprovider.getByServiceProductandEmail(this.searchtxt).subscribe(
       data=>{
        const parsedObject = JSON.parse(data);
        for (const item of parsedObject) {
          const providerInstance = new provider();
          providerInstance.email = item.email;
          providerInstance.shopname = item.shopname;
          providerInstance.password = item.password;
          providerInstance.contactnumber = item.contactnumber;
          providerInstance.serviceProduct = item.serviceProduct;
          providerInstance.productBrand = item.productBrand;
          providerInstance.shopownername = item.shopownername;
          providerInstance.address = item.address;
          providerInstance.profilePic = item.profilePic;         
          
          this.listofproviders.push(providerInstance);
        }
       },
       error=>{
         console.log(error);
       }
     )
   }

   if(this.location == false && this.email && this.phoneNumber == false && this.shopName == false && this.shopOwnerName ==false && this.productBrand && this.serviceProduct == false)
   {
     this.serviceprovider.getByProductBrandandEmail(this.searchtxt).subscribe(
       data=>{
        const parsedObject = JSON.parse(data);
        for (const item of parsedObject) {
          const providerInstance = new provider();
          providerInstance.email = item.email;
          providerInstance.shopname = item.shopname;
          providerInstance.password = item.password;
          providerInstance.contactnumber = item.contactnumber;
          providerInstance.serviceProduct = item.serviceProduct;
          providerInstance.productBrand = item.productBrand;
          providerInstance.shopownername = item.shopownername;
          providerInstance.address = item.address;
          providerInstance.profilePic = item.profilePic;         
          
          this.listofproviders.push(providerInstance);
        }
       },
       error=>{
         console.log(error);
       }
     )
   }

   if(this.location == false && this.email == false && this.phoneNumber == false && this.shopName == false && this.shopOwnerName == false && this.productBrand && this.serviceProduct)
   {
     this.serviceprovider.getByServiceProductandProductBrand(this.searchtxt).subscribe(
       data=>{
        const parsedObject = JSON.parse(data);
        for (const item of parsedObject) {
          const providerInstance = new provider();
          providerInstance.email = item.email;
          providerInstance.shopname = item.shopname;
          providerInstance.password = item.password;
          providerInstance.contactnumber = item.contactnumber;
          providerInstance.serviceProduct = item.serviceProduct;
          providerInstance.productBrand = item.productBrand;
          providerInstance.shopownername = item.shopownername;
          providerInstance.address = item.address;
          providerInstance.profilePic = item.profilePic;         
          
          this.listofproviders.push(providerInstance);
        }
       },
       error=>{
         console.log(error);
       }
     )
   }

   if(this.location && this.email == false && this.phoneNumber && this.shopName == false && this.shopOwnerName ==false && this.productBrand == false && this.serviceProduct == false)
   {
     this.serviceprovider.getByAddressandContactNumber(this.searchtxt).subscribe(
       data=>{
        const parsedObject = JSON.parse(data);
        for (const item of parsedObject) {
          const providerInstance = new provider();
          providerInstance.email = item.email;
          providerInstance.shopname = item.shopname;
          providerInstance.password = item.password;
          providerInstance.contactnumber = item.contactnumber;
          providerInstance.serviceProduct = item.serviceProduct;
          providerInstance.productBrand = item.productBrand;
          providerInstance.shopownername = item.shopownername;
          providerInstance.address = item.address;
          providerInstance.profilePic = item.profilePic;         
          
          this.listofproviders.push(providerInstance);
        }
       },
       error=>{
         console.log(error);
       }
     )
   }

   if(this.location && this.email && this.phoneNumber == false && this.shopName == false && this.shopOwnerName ==false && this.productBrand == false && this.serviceProduct == false)
   {
     this.serviceprovider.getByAddressandEmail(this.searchtxt).subscribe(
       data=>{
        const parsedObject = JSON.parse(data);
        for (const item of parsedObject) {
          const providerInstance = new provider();
          providerInstance.email = item.email;
          providerInstance.shopname = item.shopname;
          providerInstance.password = item.password;
          providerInstance.contactnumber = item.contactnumber;
          providerInstance.serviceProduct = item.serviceProduct;
          providerInstance.productBrand = item.productBrand;
          providerInstance.shopownername = item.shopownername;
          providerInstance.address = item.address;
          providerInstance.profilePic = item.profilePic;         
          
          this.listofproviders.push(providerInstance);
        }
       },
       error=>{
         console.log(error);
       }
     )
   }

   if(this.location && this.email && this.phoneNumber && this.shopName && this.shopOwnerName && this.productBrand && this.serviceProduct)
   {
     this.serviceprovider.getByAllFields(this.searchtxt).subscribe(
       data=>{
        const parsedObject = JSON.parse(data);
        for (const item of parsedObject) {
          const providerInstance = new provider();
          providerInstance.email = item.email;
          providerInstance.shopname = item.shopname;
          providerInstance.password = item.password;
          providerInstance.contactnumber = item.contactnumber;
          providerInstance.serviceProduct = item.serviceProduct;
          providerInstance.productBrand = item.productBrand;
          providerInstance.shopownername = item.shopownername;
          providerInstance.address = item.address;
          providerInstance.profilePic = item.profilePic;         
          
          this.listofproviders.push(providerInstance);
        }
       },
       error=>{
         console.log(error);
       }
     )
   }

    
   if(this.location  && this.shopName && this.shopOwnerName && this.productBrand == false && this.serviceProduct == false)
   {
     this.serviceprovider.getByShopNameandShopOwnernameAndAddress(this.searchtxt).subscribe(
       data=>{
        const parsedObject = JSON.parse(data);
        for (const item of parsedObject) {
          const providerInstance = new provider();
          providerInstance.email = item.email;
          providerInstance.shopname = item.shopname;
          providerInstance.password = item.password;
          providerInstance.contactnumber = item.contactnumber;
          providerInstance.serviceProduct = item.serviceProduct;
          providerInstance.productBrand = item.productBrand;
          providerInstance.shopownername = item.shopownername;
          providerInstance.address = item.address;
          providerInstance.profilePic = item.profilePic;         
          
          this.listofproviders.push(providerInstance);
        }
       },
       error=>{
         console.log(error);
       }
     )
   }
  


   if(this.location == false  && this.shopName && this.shopOwnerName && this.productBrand == false && this.serviceProduct)
   {
     this.serviceprovider.getByShopNameandShopOwnernameAndServiceProduct(this.searchtxt).subscribe(
       data=>{
        const parsedObject = JSON.parse(data);
        for (const item of parsedObject) {
          const providerInstance = new provider();
          providerInstance.email = item.email;
          providerInstance.shopname = item.shopname;
          providerInstance.password = item.password;
          providerInstance.contactnumber = item.contactnumber;
          providerInstance.serviceProduct = item.serviceProduct;
          providerInstance.productBrand = item.productBrand;
          providerInstance.shopownername = item.shopownername;
          providerInstance.address = item.address;
          providerInstance.profilePic = item.profilePic;         
          
          this.listofproviders.push(providerInstance);
        }
       },
       error=>{
         console.log(error);
       }
     )
   }
  



   if(this.location == false  && this.shopName && this.shopOwnerName && this.productBrand && this.serviceProduct == false )
   {
     this.serviceprovider.getByShopNameandShopOwnernameAndProductBrand(this.searchtxt).subscribe(
       data=>{
        const parsedObject = JSON.parse(data);
        for (const item of parsedObject) {
          const providerInstance = new provider();
          providerInstance.email = item.email;
          providerInstance.shopname = item.shopname;
          providerInstance.password = item.password;
          providerInstance.contactnumber = item.contactnumber;
          providerInstance.serviceProduct = item.serviceProduct;
          providerInstance.productBrand = item.productBrand;
          providerInstance.shopownername = item.shopownername;
          providerInstance.address = item.address;
          providerInstance.profilePic = item.profilePic;         
          
          this.listofproviders.push(providerInstance);
        }
       },
       error=>{
         console.log(error);
       }
     )
   }





       if(this.location  && this.shopName  && this.shopOwnerName && this.productBrand  == false && this.serviceProduct )
   {
     this.serviceprovider.getByShopnameAndShopownernameAndAddressAndServiceProduct(this.searchtxt).subscribe(
       data=>{
        const parsedObject = JSON.parse(data);
        for (const item of parsedObject) {
          const providerInstance = new provider();
          providerInstance.email = item.email;
          providerInstance.shopname = item.shopname;
          providerInstance.password = item.password;
          providerInstance.contactnumber = item.contactnumber;
          providerInstance.serviceProduct = item.serviceProduct;
          providerInstance.productBrand = item.productBrand;
          providerInstance.shopownername = item.shopownername;
          providerInstance.address = item.address;
          providerInstance.profilePic = item.profilePic;         
          
          this.listofproviders.push(providerInstance);
        }
       },
       error=>{
         console.log(error);
       }
     )
   }


   if(this.location  && this.shopName && this.shopOwnerName && this.productBrand && this.serviceProduct == false )
   {
     this.serviceprovider.getByShopnameAndShopownernameAndAddressAndProductBrand(this.searchtxt).subscribe(
       data=>{
        const parsedObject = JSON.parse(data);
        for (const item of parsedObject) {
          const providerInstance = new provider();
          providerInstance.email = item.email;
          providerInstance.shopname = item.shopname;
          providerInstance.password = item.password;
          providerInstance.contactnumber = item.contactnumber;
          providerInstance.serviceProduct = item.serviceProduct;
          providerInstance.productBrand = item.productBrand;
          providerInstance.shopownername = item.shopownername;
          providerInstance.address = item.address;
          providerInstance.profilePic = item.profilePic;         
          
          this.listofproviders.push(providerInstance);
        }
       },
       error=>{
         console.log(error);
       }
     )
   }


   if(this.location  == false && this.shopName && this.shopOwnerName && this.productBrand && this.serviceProduct )
   {
     this.serviceprovider.getByShopnameAndShopownernameAndServiceProductAndProductBrand(this.searchtxt).subscribe(
       data=>{
        const parsedObject = JSON.parse(data);
        for (const item of parsedObject) {
          const providerInstance = new provider();
          providerInstance.email = item.email;
          providerInstance.shopname = item.shopname;
          providerInstance.password = item.password;
          providerInstance.contactnumber = item.contactnumber;
          providerInstance.serviceProduct = item.serviceProduct;
          providerInstance.productBrand = item.productBrand;
          providerInstance.shopownername = item.shopownername;
          providerInstance.address = item.address;
          providerInstance.profilePic = item.profilePic;         
          
          this.listofproviders.push(providerInstance);
        }
       },
       error=>{
         console.log(error);
       }
     )
   }


   if(this.location && this.shopName && this.shopOwnerName  == false && this.productBrand && this.serviceProduct)
   {
     this.serviceprovider.getByShopnameAndAddressAndServiceProductAndProductBrand(this.searchtxt).subscribe(
       data=>{
        const parsedObject = JSON.parse(data);
        for (const item of parsedObject) {
          const providerInstance = new provider();
          providerInstance.email = item.email;
          providerInstance.shopname = item.shopname;
          providerInstance.password = item.password;
          providerInstance.contactnumber = item.contactnumber;
          providerInstance.serviceProduct = item.serviceProduct;
          providerInstance.productBrand = item.productBrand;
          providerInstance.shopownername = item.shopownername;
          providerInstance.address = item.address;
          providerInstance.profilePic = item.profilePic;         
          
          this.listofproviders.push(providerInstance);
        }
       },
       error=>{
         console.log(error);
       }
     )
   }


   if(this.location  && this.shopName  == false && this.shopOwnerName && this.productBrand && this.serviceProduct )
   {
     this.serviceprovider.getByShopownernameAndAddressAndServiceProductAndProductBrand(this.searchtxt).subscribe(
       data=>{
        const parsedObject = JSON.parse(data);
        for (const item of parsedObject) {
          const providerInstance = new provider();
          providerInstance.email = item.email;
          providerInstance.shopname = item.shopname;
          providerInstance.password = item.password;
          providerInstance.contactnumber = item.contactnumber;
          providerInstance.serviceProduct = item.serviceProduct;
          providerInstance.productBrand = item.productBrand;
          providerInstance.shopownername = item.shopownername;
          providerInstance.address = item.address;
          providerInstance.profilePic = item.profilePic;         
          
          this.listofproviders.push(providerInstance);
        }
       },
       error=>{
         console.log(error);
       }
     )
   }
  




   if(this.location  && this.shopName && this.shopOwnerName  == false && this.productBrand  == false && this.serviceProduct)
   {
     this.serviceprovider.getByShopNameandAddressAndServiceProduct(this.searchtxt).subscribe(
       data=>{
        const parsedObject = JSON.parse(data);
        for (const item of parsedObject) {
          const providerInstance = new provider();
          providerInstance.email = item.email;
          providerInstance.shopname = item.shopname;
          providerInstance.password = item.password;
          providerInstance.contactnumber = item.contactnumber;
          providerInstance.serviceProduct = item.serviceProduct;
          providerInstance.productBrand = item.productBrand;
          providerInstance.shopownername = item.shopownername;
          providerInstance.address = item.address;
          providerInstance.profilePic = item.profilePic;         
          
          this.listofproviders.push(providerInstance);
        }
       },
       error=>{
         console.log(error);
       }
     )
   }
  




   if(this.location  && this.shopName && this.shopOwnerName  == false && this.productBrand && this.serviceProduct == false )
   {
     this.serviceprovider.getByShopNameandAddressAndProductBrand(this.searchtxt).subscribe(
       data=>{
        const parsedObject = JSON.parse(data);
        for (const item of parsedObject) {
          const providerInstance = new provider();
          providerInstance.email = item.email;
          providerInstance.shopname = item.shopname;
          providerInstance.password = item.password;
          providerInstance.contactnumber = item.contactnumber;
          providerInstance.serviceProduct = item.serviceProduct;
          providerInstance.productBrand = item.productBrand;
          providerInstance.shopownername = item.shopownername;
          providerInstance.address = item.address;
          providerInstance.profilePic = item.profilePic;         
          
          this.listofproviders.push(providerInstance);
        }
       },
       error=>{
         console.log(error);
       }
     )
   }
  





   if(this.location  == false  && this.shopName && this.shopOwnerName == false  && this.productBrand && this.serviceProduct)
   {
     this.serviceprovider.getByShopNameandServiceProductAndProductBrand(this.searchtxt).subscribe(
       data=>{
        const parsedObject = JSON.parse(data);
        for (const item of parsedObject) {
          const providerInstance = new provider();
          providerInstance.email = item.email;
          providerInstance.shopname = item.shopname;
          providerInstance.password = item.password;
          providerInstance.contactnumber = item.contactnumber;
          providerInstance.serviceProduct = item.serviceProduct;
          providerInstance.productBrand = item.productBrand;
          providerInstance.shopownername = item.shopownername;
          providerInstance.address = item.address;
          providerInstance.profilePic = item.profilePic;         
          
          this.listofproviders.push(providerInstance);
        }
       },
       error=>{
         console.log(error);
       }
     )
   }
  




   if(this.location  && this.shopName  == false && this.shopOwnerName && this.productBrand  == false && this.serviceProduct)
   {
     this.serviceprovider.getByShopOwnernameAndAddressAndServiceProduct(this.searchtxt).subscribe(
       data=>{
        const parsedObject = JSON.parse(data);
        for (const item of parsedObject) {
          const providerInstance = new provider();
          providerInstance.email = item.email;
          providerInstance.shopname = item.shopname;
          providerInstance.password = item.password;
          providerInstance.contactnumber = item.contactnumber;
          providerInstance.serviceProduct = item.serviceProduct;
          providerInstance.productBrand = item.productBrand;
          providerInstance.shopownername = item.shopownername;
          providerInstance.address = item.address;
          providerInstance.profilePic = item.profilePic;         
          
          this.listofproviders.push(providerInstance);
        }
       },
       error=>{
         console.log(error);
       }
     )
   }
  



   if(this.location  && this.shopName  == false && this.shopOwnerName && this.productBrand && this.serviceProduct == false )
   {
     this.serviceprovider.getByShopOwnernameAndAddressAndProductBrand(this.searchtxt).subscribe(
       data=>{
        const parsedObject = JSON.parse(data);
        for (const item of parsedObject) {
          const providerInstance = new provider();
          providerInstance.email = item.email;
          providerInstance.shopname = item.shopname;
          providerInstance.password = item.password;
          providerInstance.contactnumber = item.contactnumber;
          providerInstance.serviceProduct = item.serviceProduct;
          providerInstance.productBrand = item.productBrand;
          providerInstance.shopownername = item.shopownername;
          providerInstance.address = item.address;
          providerInstance.profilePic = item.profilePic;         
          
          this.listofproviders.push(providerInstance);
        }
       },
       error=>{
         console.log(error);
       }
     )
   }
  



   if(this.location   == false && this.shopName  == false && this.shopOwnerName && this.productBrand && this.serviceProduct)
   {
     this.serviceprovider.getByShopOwnernameAndServiceProductAndProductBrand(this.searchtxt).subscribe(
       data=>{
        const parsedObject = JSON.parse(data);
        for (const item of parsedObject) {
          const providerInstance = new provider();
          providerInstance.email = item.email;
          providerInstance.shopname = item.shopname;
          providerInstance.password = item.password;
          providerInstance.contactnumber = item.contactnumber;
          providerInstance.serviceProduct = item.serviceProduct;
          providerInstance.productBrand = item.productBrand;
          providerInstance.shopownername = item.shopownername;
          providerInstance.address = item.address;
          providerInstance.profilePic = item.profilePic;         
          
          this.listofproviders.push(providerInstance);
        }
       },
       error=>{
         console.log(error);
       }
     )
   }
  



   if(this.location  && this.shopName  == false && this.shopOwnerName  == false && this.productBrand && this.serviceProduct)
   {
     this.serviceprovider.getByAddressAndServiceProductAndProductBrand(this.searchtxt).subscribe(
       data=>{
        const parsedObject = JSON.parse(data);
        for (const item of parsedObject) {
          const providerInstance = new provider();
          providerInstance.email = item.email;
          providerInstance.shopname = item.shopname;
          providerInstance.password = item.password;
          providerInstance.contactnumber = item.contactnumber;
          providerInstance.serviceProduct = item.serviceProduct;
          providerInstance.productBrand = item.productBrand;
          providerInstance.shopownername = item.shopownername;
          providerInstance.address = item.address;
          providerInstance.profilePic = item.profilePic;         
          
          this.listofproviders.push(providerInstance);
        }
       },
       error=>{
         console.log(error);
       }
     )
   }
  
 }

  getServiceProviderList()
  {
   this.serviceprovider.serviceProviderList().subscribe(
     data=>{
      const parsedObject = JSON.parse(data);
      for (const item of parsedObject) {
        const providerInstance = new provider();
        providerInstance.email = item.email;
        providerInstance.shopname = item.shopname;
        providerInstance.password = item.password;
        providerInstance.contactnumber = item.contactnumber;
        providerInstance.serviceProduct = item.serviceProduct;
        providerInstance.productBrand = item.productBrand;
        providerInstance.shopownername = item.shopownername;
        providerInstance.address = item.address;
        providerInstance.profilePic = item.profilePic;         
        
        this.listofproviders.push(providerInstance);
      }
<<<<<<< HEAD
      console.log(this.listofproviders)
=======
>>>>>>> c81ad4bc5d36e487100d11c2ab71eec6197449a7
     },
     error=>{
       console.log(error);
     }
    )
  }



  
<<<<<<< HEAD
  }
=======
  }
>>>>>>> c81ad4bc5d36e487100d11c2ab71eec6197449a7
