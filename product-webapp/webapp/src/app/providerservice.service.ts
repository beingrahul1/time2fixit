import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class ProviderserviceService {

  constructor(private http: HttpClient) { }
  updateUser(data: any) {
    const apiUrl = 'http://localhost:2222/apis/update'; 
    return this.http.put(apiUrl, data);
  }
}
