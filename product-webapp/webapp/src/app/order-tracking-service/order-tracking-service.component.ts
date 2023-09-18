import { Component } from '@angular/core';
import { UserService } from '../user.service';
import { Order } from './tracking.model';

@Component({
  selector: 'app-order-tracking-service',
  templateUrl: './order-tracking-service.component.html',
  styleUrls: ['./order-tracking-service.component.css']
})
export class OrderTrackingServiceComponent {
  constructor(private registrationService:UserService){}
  order=new Order();
  invalidInput = false;
  submitOrder(){
    this.registrationService.registerTrack(this.order).subscribe(
      data=>{
        console.log(data)
        alert("Tracking Details Registered");
        window.location.reload();
        // this.router.navigate(['/login']);
        
      },
      error=>{
        console.log(error);
      }
    )
  }
  // if (this.feedback.email && this.feedback.rating && this.feedback.feedback) {
  //   this.registrationService.registerfeedback(this.feedback).subscribe(
  //     data=>{
  //       console.log(data)
  //       alert("feedback taken");
  //       // this.router.navigate(['/login']);
  //     },
  //     error=>{
  //       console.log(error);
  //     }
  //     )
  //   this.invalidInput = false;
  // } else {
    
  //   this.invalidInput = true;
  // }
}
