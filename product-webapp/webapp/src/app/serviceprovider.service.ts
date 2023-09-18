import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { provider } from './provider-update/provider.model';
import { Observable, Observer } from 'rxjs';
import { serviceprovider } from './service-provider-registration/serviceProvider.model';
@Injectable({
  providedIn: 'root'
})
export class ServiceproviderService {

  constructor(private http:HttpClient) { }
  registerServiceProvider(sp: serviceprovider){
    return this.http.post<serviceprovider>(`http:localhost:1111/servicecenter/registration/na/signup`,sp)
  }



  serviceProviderList(): Observable<any>
  {
    return this.http.get<provider[]>(`http:localhost:2222/apis/findAll`, {responseType: "text" as "json"});
  }
  
  getByEmail(query:string): Observable<any>
  {
    return this.http.get<provider[]>(`http://localhost:2222/apis/matchAllProvidersWithEmail?email=${encodeURIComponent(query)}`, {responseType: "text" as "json"});
  }

  getByShopname(query:any): Observable<any>
  {
    return this.http.get<provider[]>(`http://localhost:2222/apis/matchProvidersWithshopname?email=${encodeURIComponent(query)}`, {responseType: "text" as "json"});
  }
  getByShopownername(query:any): Observable<any>
  {
    return this.http.get<provider[]>(`http://localhost:2222/apis/matchProvidersWithshopownername?email=${encodeURIComponent(query)}`, {responseType: "text" as "json"});
  }
  getByAddress(query:any): Observable<any>
  {
    return this.http.get<provider[]>(`http://localhost:2222/apis/matchAllProvidersWithEmail?email=${encodeURIComponent(query)}`, {responseType: "text" as "json"});
  }
  getByserviceProduct(query:any): Observable<any>
  {
    return this.http.get<provider[]>(`http://localhost:2222/apis/matchProvidersWithserviceProduct?email=${encodeURIComponent(query)}`, {responseType: "text" as "json"});
  }
  getByproductBrand(query:any): Observable<any>
  {
    return this.http.get<provider[]>(`http://localhost:2222/apis/matchProvidersWithproductBrand"?email=${encodeURIComponent(query)}`, {responseType: "text" as "json"});
  }




  getByshopNameandShopOwnerName(query:any): Observable<any>
  {
    return this.http.get<provider[]>(`http:localhost:2222/apis/matchProvidersWithshopnameAndshopownername?email=${encodeURIComponent(query)}`, {responseType: "text" as "json"});
  }

  getByShopNameandServiceProduct(query:any): Observable<any>
  {
    return this.http.get<provider[]>(`http:localhost:2222/apis/matchProvidersWithshopnameAndserviceProduct?email=${encodeURIComponent(query)}`, {responseType: "text" as "json"});
  }

  getByShopNameandProductBrand(query:any): Observable<any>
  {
    return this.http.get<provider[]>(`http:localhost:2222/apis/matchProvidersWithshopnameAndproductBrand?email=${encodeURIComponent(query)}`, {responseType: "text" as "json"});
  }

  getByShopNameandAddress(query:any): Observable<any>
  {
    return this.http.get<provider[]>(`http:localhost:2222/apis/matchProvidersWithshopnameAndaddress?email=${query}`, {responseType: "text" as "json"});
  }
  getByShopownernameandAddress(query:any): Observable<any>
  {
    return this.http.get<provider[]>(`http://localhost:2222/apis/matchProvidersWithshopownernameAndaddress?email=${encodeURIComponent(query)}`, {responseType: "text" as "json"});
  }


  getByShopNameandShopOwnernameAndAddress(query:any) : Observable<any>{
    return this.http.get<provider[]>(`http://localhost:2222/apis/mmatchProvidersWithshopnameAndshopownernameAndaddress?email=${encodeURIComponent(query)}`, {responseType: "text" as "json"});
  }
  
  getByShopNameandShopOwnernameAndServiceProduct(query:any) : Observable<any>{
    return this.http.get<provider[]>(`http://localhost:2222/apis/matchProvidersWithshopnameAndshopownernameAndserviceProduct?email=${encodeURIComponent(query)}`, {responseType: "text" as "json"});
  }
  
  
  getByShopNameandShopOwnernameAndProductBrand(query:any) : Observable<any>{
    return this.http.get<provider[]>(`http://localhost:2222/apis/matchProvidersWithshopnameAndshopownernameAndproductBrand?email=${encodeURIComponent(query)}`, {responseType: "text" as "json"});
  }
  getByShopNameandAddressAndServiceProduct(query:any) : Observable<any>{
    return this.http.get<provider[]>(`http://localhost:2222/apis/matchProvidersWithshopnameAndaddressAndserviceProduct?email=${encodeURIComponent(query)}`, {responseType: "text" as "json"});
  }
  
  getByShopNameandAddressAndProductBrand(query:any) : Observable<any>{
    return this.http.get<provider[]>(`http://localhost:2222/apis/matchProvidersWithshopnameAndaddressAndproductBrand?email=${encodeURIComponent(query)}`, {responseType: "text" as "json"});
  }
  
  getByShopNameandServiceProductAndProductBrand(query:any) : Observable<any>{
    return this.http.get<provider[]>(`http://localhost:2222/apis/matchProvidersWithshopnameAndserviceProductAndproductBrand?email=${encodeURIComponent(query)}`, {responseType: "text" as "json"});
  }
  
   getByShopOwnernameAndAddressAndServiceProduct(query:any) : Observable<any>{
     return this.http.get<provider[]>(`http://localhost:2222/apis/mtchProvidersWithshopownernameAndaddressAndserviceProduct?email=${encodeURIComponent(query)}`, {responseType: "text" as "json"});
   }
  
   getByShopOwnernameAndAddressAndProductBrand(query:any) : Observable<any>{
     return this.http.get<provider[]>(`http://localhost:2222/apis/matchProvidersWithshopownernameAndaddressAndproductBrand?email=${encodeURIComponent(query)}`, {responseType: "text" as "json"});
   }
  
   getByShopOwnernameAndServiceProductAndProductBrand(query:any) : Observable<any>{
     return this.http.get<provider[]>(`http://localhost:2222/apis/matchProvidersWithshopownernameAndserviceProductAndproductBrand?email=${encodeURIComponent(query)}`, {responseType: "text" as "json"});
   }
  
   getByAddressAndServiceProductAndProductBrand(query:any) : Observable<any>{
     return this.http.get<provider[]>(`http://localhost:2222/apis/matchProvidersWithaddressAndserviceProductAndproductBrand?email=${encodeURIComponent(query)}`, {responseType: "text" as "json"});
   }
  

   getByShopNameandContactNumber(query:any): Observable<any>
   {
     return this.http.get<provider[]>(`http://localhost:2222/apis/matchProvidersWithshopnameAndcontactnumber?email=${encodeURIComponent(query)}`, {responseType: "text" as "json"});
   }

   getByShopNameandEmail(query:any): Observable<any>
   {
     return this.http.get<provider[]>(`http://localhost:2222/apis/matchProvidersWithshopnameAndemail?email=${encodeURIComponent(query)}`, {responseType: "text" as "json"});
   }

   getByShopOwnerNameandServiceProduct(query:any): Observable<any>
   {
     return this.http.get<provider[]>(`http://localhost:2222/apis/matchProvidersWithshopownernameserviceProduct"?email=${encodeURIComponent(query)}`, {responseType: "text" as "json"});
   }

   getByShopOwnerNameandProductBrand(query:any): Observable<any>
   {
     return this.http.get<provider[]>(`http://localhost:2222/apis/matchProvidersWithshopownernameproductBrand?email=${encodeURIComponent(query)}`, {responseType: "text" as "json"});
   }

   getByShopOwnerNameandcontactNumber(query:any): Observable<any>
   {
     return this.http.get<provider[]>(`http://localhost:2222/apis/matchProvidersWithshopownernamecontactnumber?email=${encodeURIComponent(query)}`, {responseType: "text" as "json"});
   }

   getByShopOwnerNameandEmail(query:any): Observable<any>
   {
     return this.http.get<provider[]>(`http://localhost:2222/apis/matchProvidersWithshopshopownernameemail?email=${encodeURIComponent(query)}`, {responseType: "text" as "json"});
   }

   getByProductBrandandAddress(query:any): Observable<any>
   {
     return this.http.get<provider[]>(`http://localhost:2222/apis/matchProvidersWithproductBrandAndaddress?email=${encodeURIComponent(query)}`, {responseType: "text" as "json"});
   }

   getByServiceProductandAddress(query:any): Observable<any>
   {
     return this.http.get<provider[]>(`http://localhost:2222/apis/matchProvidersWithserviceProductAndaddress?email=${encodeURIComponent(query)}`, {responseType: "text" as "json"});
   }

   getByServiceProductandcontactNumber(query:any): Observable<any>
   {
     return this.http.get<provider[]>(`http://localhost:2222/apis/matchProvidersWithserviceProductAndcontactnumber?email=${encodeURIComponent(query)}`, {responseType: "text" as "json"});
   }

   getByProductBrandandcontactNumber(query:any): Observable<any>
   {
     return this.http.get<provider[]>(`http://localhost:2222/apis/matchProvidersWithproductBrandAndcontactnumber?email=${encodeURIComponent(query)}`, {responseType: "text" as "json"});
   }

   getByProductBrandandEmail(query:any): Observable<any>
   {
     return this.http.get<provider[]>(`http://localhost:2222/apis/matchProvidersWithproductBrandAndemail?email=${encodeURIComponent(query)}`, {responseType: "text" as "json"});
   }

   getByServiceProductandEmail(query:any): Observable<any>
   {
     return this.http.get<provider[]>(`http://localhost:2222/apis/matchProvidersWithserviceProductAndemail?email=${encodeURIComponent(query)}`, {responseType: "text" as "json"});
   }

   getByServiceProductandProductBrand(query:any): Observable<any>
   {
     return this.http.get<provider[]>(`http://localhost:2222/apis/matchProvidersWithserviceProductAndproductBrand?email=${encodeURIComponent(query)}`, {responseType: "text" as "json"});
   }

   getByAddressandContactNumber(query:any): Observable<any>
   {
     return this.http.get<provider[]>(`http://localhost:2222/apis/matchProvidersWithaddressAndcontactnumber?email=${encodeURIComponent(query)}`, {responseType: "text" as "json"});
   }

   getByAddressandEmail(query:any): Observable<any>
   {
     return this.http.get<provider[]>(`http://localhost:2222/apis/matchProvidersWithaddressAndemail?email=${encodeURIComponent(query)}`, {responseType: "text" as "json"});
   }
  
   getByShopnameAndShopownernameAndAddressAndServiceProduct(query:any) : Observable<any>{
     return this.http.get<provider[]>(`http://localhost:2222/apis/matchProvidersWithshopnameAndshopownernameAndaddressAndserviceProduct?email=${encodeURIComponent(query)}`, {responseType: "text" as "json"});
   }
  
   getByShopnameAndShopownernameAndAddressAndProductBrand(query:any): Observable<any> {
     return this.http.get<provider[]>(`http://localhost:2222/apis/matchProvidersWithshopnameAndshopownernameAndaddressAndproductBrand?email=${encodeURIComponent(query)}`, {responseType: "text" as "json"});
   }
  
   getByShopnameAndShopownernameAndServiceProductAndProductBrand(query:any) : Observable<any>{
     return this.http.get<provider[]>(`http://localhost:2222/apis/matchProvidersWithshopnameAndshopownernameAndserviceProductAndproductBrand?email=${encodeURIComponent(query)}`, {responseType: "text" as "json"});
   }
  
   getByShopnameAndAddressAndServiceProductAndProductBrand(query:any): Observable<any> {
     return this.http.get<provider[]>(`http://localhost:2222/apis/matchProvidersWithshopnameAndaddressAndserviceProductAndproductBrand?email=${encodeURIComponent(query)}`, {responseType: "text" as "json"});
   }
  
   getByShopownernameAndAddressAndServiceProductAndProductBrand(query:any): Observable<any> {
     return this.http.get<provider[]>(`http://localhost:2222/apis/matchProvidersWithshopownernameAndaddressAndserviceProductAndproductBrand?email=${encodeURIComponent(query)}`, {responseType: "text" as "json"});
   }
  
   getByAllFields(query:any): Observable<any>
   {
     return this.http.get<provider[]>(`http://localhost:2222/apis/matchAllProvidersAllFields?email=${encodeURIComponent(query)}`, {responseType: "text" as "json"});
   }
 

}
