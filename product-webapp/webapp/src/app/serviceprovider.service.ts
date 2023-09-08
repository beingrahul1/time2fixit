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
}
