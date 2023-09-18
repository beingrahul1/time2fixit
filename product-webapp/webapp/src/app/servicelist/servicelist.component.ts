import { Component, OnInit } from '@angular/core';
import { serviceprovider } from '../service-provider-registration/serviceProvider.model';
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

  listofproviders : serviceprovider [] =[];

  onSubmit()
  {
    if(this.location == false && this.email && this.phoneNumber == false && this.shopName == false && this.shopOwnerName == false && this.productBrand == false && this.serviceProduct == false)
    {
      this.serviceprovider.getByEmail().subscribe(
        data=>{
          this.listofproviders = data;
        },
        error=>{
          console.log(error);
        }
      )
    }

    if(this.location == false && this.email == false && this.phoneNumber == false && this.shopName && this.shopOwnerName && this.productBrand == false && this.serviceProduct == false)
    {
      this.serviceprovider.getByshopNameandShopOwnerName().subscribe(
        data=>{
          this.listofproviders = data;
        },
        error=>{
          console.log(error);
        }
      )
    }

    if(this.location == false && this.email && this.phoneNumber == false && this.shopName == false && this.shopOwnerName && this.productBrand == false && this.serviceProduct)
    {
      this.serviceprovider.getByShopNameandServiceProduct().subscribe(
        data=>{
          this.listofproviders = data;
        },
        error=>{
          console.log(error);
        }
      )
    }

    if(this.shopName && this.productBrand)
    {
      this.serviceprovider.getByShopNameandProductBrand().subscribe(
        data=>{
          this.listofproviders = data;
        },
        error=>{
          console.log(error);
        }
      )
    }

    if(this.shopName && this.location)
    {
      this.serviceprovider.getByShopNameandAddress().subscribe(
        data=>{
          this.listofproviders = data;
        },
        error=>{
          console.log(error);
        }
      )
    }

    if(this.shopName && this.phoneNumber)
    {
      this.serviceprovider.getByShopNameandContactNumber().subscribe(
        data=>{
          this.listofproviders = data;
        },
        error=>{
          console.log(error);
        }
      )
    }

    if(this.shopName && this.email)
    {
      this.serviceprovider.getByShopNameandEmail().subscribe(
        data=>{
          this.listofproviders = data;
        },
        error=>{
          console.log(error);
        }
      )
    }

    if(this.shopOwnerName && this.serviceProduct)
    {
      this.serviceprovider.getByShopOwnerNameandServiceProduct().subscribe(
        data=>{
          this.listofproviders = data;
        },
        error=>{
          console.log(error);
        }
      )
    }

    if(this.shopOwnerName && this.productBrand)
    {
      this.serviceprovider.getByShopOwnerNameandProductBrand().subscribe(
        data=>{
          this.listofproviders = data;
        },
        error=>{
          console.log(error);
        }
      )
    }
    if(this.shopOwnerName && this.phoneNumber)
    {
      this.serviceprovider.getByShopOwnerNameandcontactNumber().subscribe(
        data=>{
          this.listofproviders = data;
        },
        error=>{
          console.log(error);
        }
      )
    }

    if(this.shopOwnerName && this.email)
    {
      this.serviceprovider.getByShopOwnerNameandEmail().subscribe(
        data=>{
          this.listofproviders = data;
        },
        error=>{
          console.log(error);
        }
      )
    }

    if(this.serviceProduct && this.location)
    {
      this.serviceprovider.getByServiceProductandAddress().subscribe(
        data=>{
          this.listofproviders = data;
        },
        error=>{
          console.log(error);
        }
      )
    }

    if(this.productBrand && this.location)
    {
      this.serviceprovider.getByProductBrandandAddress().subscribe(
        data=>{
          this.listofproviders = data;
        },
        error=>{
          console.log(error);
        }
      )
    }

    if(this.serviceProduct && this.phoneNumber)
    {
      this.serviceprovider.getByServiceProductandcontactNumber().subscribe(
        data=>{
          this.listofproviders = data;
        },
        error=>{
          console.log(error);
        }
      )
    }
    if(this.productBrand && this.phoneNumber)
    {
      this.serviceprovider.getByProductBrandandcontactNumber().subscribe(
        data=>{
          this.listofproviders = data;
        },
        error=>{
          console.log(error);
        }
      )
    }
    if(this.serviceProduct && this.email)
    {
      this.serviceprovider.getByServiceProductandEmail().subscribe(
        data=>{
          this.listofproviders = data;
        },
        error=>{
          console.log(error);
        }
      )
    }

    if(this.productBrand && this.email)
    {
      this.serviceprovider.getByProductBrandandEmail().subscribe(
        data=>{
          this.listofproviders = data;
        },
        error=>{
          console.log(error);
        }
      )
    }

    if(this.serviceProduct && this.productBrand)
    {
      this.serviceprovider.getByServiceProductandProductBrand().subscribe(
        data=>{
          this.listofproviders = data;
        },
        error=>{
          console.log(error);
        }
      )
    }

    if(this.location && this.phoneNumber)
    {
      this.serviceprovider.getByAddressandContactNumber().subscribe(
        data=>{
          this.listofproviders = data;
        },
        error=>{
          console.log(error);
        }
      )
    }

    if(this.location && this.email)
    {
      this.serviceprovider.getByAddressandEmail().subscribe(
        data=>{
          this.listofproviders = data;
        },
        error=>{
          console.log(error);
        }
      )
    }

    if(this.location && this.email && this.phoneNumber && this.shopName && this.shopOwnerName && this.productBrand && this.serviceProduct)
    {
      this.serviceprovider.serviceProviderList().subscribe(
        data=>{
          this.listofproviders = data;
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
        this.listofproviders = data;
      },
      error=>{
        console.log(error);
      }
    )
  }



  
}
