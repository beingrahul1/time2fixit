import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { feedback } from './feedback/feedback.model';
import { Order } from './order-tracking-service/tracking.model';
import { user } from './user-registration/user.model';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http:HttpClient) { }
  updateuser(user1:user){
    return this.http.post<user>('http://localhost:1234/customer/update',user1)}

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
  getServiceProfile(email:String) {
    return this.http.get<any[]>(`http://localhost:2222/profile/service/${email}`);
  }
<<<<<<< HEAD
  registerTrack(tracking:Order){
    return this.http.post<Order>(`http://localhost:1234/track`,tracking);
  }
  updateTrack(bookingId:number,order:Order) {
    return this.http.put<Order>(`http://localhost:1234/track/${bookingId}`,order);
  }
  getTrack() {
    return this.http.get<Order[]>(`http://localhost:1234/track`);
  }

  searchTrackById(bookingId:number)
{
return this.http.get<Order>(`http://localhost:1234/track/${bookingId}`);
}
=======
  displayuser(user1:user){
    return this.http.post<user>('http://localhost:1234/customer/get',user1);
  }
>>>>>>> a1bbbe0 (getuser  dashboard update)
}
