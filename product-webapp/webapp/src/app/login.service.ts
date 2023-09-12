import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private http:HttpClient, private router:Router) { }
  private currentUser: any;
  private isLoggedIn = false;

  // registerUser(user:Login)
  // {

  //   return this.http.post("http://localhost:1111/login",user);
  // }

  authUser(email: string, password: string) {
    this.currentUser = email;
    console.log(this.currentUser);
    return this.http.post<any>(`http://localhost:8082/user/na/login`, { email, password, responseType:'text' as 'json' });
    
}


getEmail(): string {
  console.log(this.currentUser);
  return this.currentUser;
}


login(authrequest:authRequest){
  return this.http.post<string>('http://localhost:8082/user/na/login',authrequest,{responseType:'text' as 'json'})
  }
  getTokenUrl(token:string|null){
    let myToken='Bearer '+token ;
    let headers =new HttpHeaders().set('Authorization',myToken);
    console.log(myToken)
    return this.http.get<string>(`http://localhost:8082/user/cgitest`,{headers ,responseType:'text' as 'json'})
  
  }

  setIsAuthenticated(): void{
    localStorage.setItem('authenticated','true');
  }

  isAuthenticated(): boolean{
    return this.isLoggedIn=localStorage.getItem('authenticated')==='true'?true:false;
  }

  

  logout(): void{
    localStorage.removeItem('authenticated');
    localStorage.removeItem('email');
    localStorage.removeItem('role');
    localStorage.removeItem('userId');
    this.router.navigate(['/home']);
  }
}
export class authRequest{
  email:string='';
  password:string='';
}