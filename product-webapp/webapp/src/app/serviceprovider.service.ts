import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { serviceprovider } from './service-provider-registration/serviceProvider.model';

@Injectable({
  providedIn: 'root'
})
export class ServiceproviderService {

  constructor(private http:HttpClient) { }
  registerServiceProvider(sp: serviceprovider){
    return this.http.post<serviceprovider>(`http://localhost:1111/servicecenter/registration/na/signup`,sp)
  }

  serviceProviderList()
  {
    return this.http.get<serviceprovider[]>('EndPoint');
  }

  getByEmail()
  {
    return this.http.get<serviceprovider[]>('EndPoint');
  }

  getByshopNameandShopOwnerName()
  {
    return this.http.get<serviceprovider[]>('EndPoint');
  }

  getByShopNameandServiceProduct()
  {
    return this.http.get<serviceprovider[]>('EndPoint');
  }

  getByShopNameandProductBrand()
  {
    return this.http.get<serviceprovider[]>('EndPoint');
  }

  getByShopNameandAddress()
  {
    return this.http.get<serviceprovider[]>('EndPoint');
  }

  getByShopNameandContactNumber()
  {
    return this.http.get<serviceprovider[]>('EndPoint');
  }

  getByShopNameandEmail()
  {
    return this.http.get<serviceprovider[]>('EndPoint');
  }

  getByShopOwnerNameandServiceProduct()
  {
    return this.http.get<serviceprovider[]>('EndPoint');
  }

  getByShopOwnerNameandProductBrand()
  {
    return this.http.get<serviceprovider[]>('EndPoint');
  }

  getByShopOwnerNameandcontactNumber()
  {
    return this.http.get<serviceprovider[]>('EndPoint');
  }

  getByShopOwnerNameandEmail()
  {
    return this.http.get<serviceprovider[]>('EndPoint');
  }

  getByProductBrandandAddress()
  {
    return this.http.get<serviceprovider[]>('EndPoint');
  }

  getByServiceProductandAddress()
  {
    return this.http.get<serviceprovider[]>('EndPoint');
  }

  getByServiceProductandcontactNumber()
  {
    return this.http.get<serviceprovider[]>('EndPoint');
  }

  getByProductBrandandcontactNumber()
  {
    return this.http.get<serviceprovider[]>('EndPoint');
  }

  getByProductBrandandEmail()
  {
    return this.http.get<serviceprovider[]>('EndPoint');
  }

  getByServiceProductandEmail()
  {
    return this.http.get<serviceprovider[]>('EndPoint');
  }

  getByServiceProductandProductBrand()
  {
    return this.http.get<serviceprovider[]>('EndPoint');
  }

  getByAddressandContactNumber()
  {
    return this.http.get<serviceprovider[]>('EndPoint');
  }

  getByAddressandEmail()
  {
    return this.http.get<serviceprovider[]>('EndPoint');
  }

  getByAllFields()
  {
    return this.http.get<serviceprovider[]>('EndPoint');
  }
}
