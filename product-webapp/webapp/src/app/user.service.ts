import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { feedback } from './feedback/feedback.model';
import { user } from './user-registration/user.model';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http:HttpClient) { }

  registerUser(user:user){
    return this.http.post<user>(`http://localhost:1111/user/registration/na/signup`,user)
  }
  registerfeedback(feedback:feedback){
    return this.http.post<feedback>(`http://localhost:2222/feedback`,feedback)
  }
  getFeedback() {
    return this.http.get<feedback[]>(`http://localhost:2222/feedback`);
  }
  deleteFeedback(email:String)
  {
return this.http.delete<any>(`http://localhost:2222/feedback/${email}`);
  }
  updateuser(user1:user){
    return this.http.post<user>('http://localhost:1234/customer/update',user1)
  }
}
