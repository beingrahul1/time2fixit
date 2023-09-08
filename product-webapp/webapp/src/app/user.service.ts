import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { user } from './user-registration/user.model';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http:HttpClient) { }

  registerUser(user:user){
    return this.http.post<user>(`http://localhost:1111/user/registration/na/signup`,user)
  }
}
