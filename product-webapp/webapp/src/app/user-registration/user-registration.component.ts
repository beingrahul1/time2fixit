import { Component } from '@angular/core';
import { UserService } from '../user.service';
import { user } from './user.model';

@Component({
  selector: 'app-user-registration',
  templateUrl: './user-registration.component.html',
  styleUrls: ['./user-registration.component.css']
})
export class UserRegistrationComponent {

  constructor(private registrationService:UserService){}

  user1=new user();

  addUser()
  {
    if(this.user1.password==this.user1.confirmPassword){
    this.registrationService.registerUser(this.user1).subscribe(
      data=>{
        console.log(data)
        alert("User Registered");
        // this.router.navigate(['/login']);
      },
      error=>{
        console.log(error);
      }
      )
    }
      else{
        alert("Password Not Matched");
      }
  }

  validatePhoneNumber() {
    const phoneNumber = this.user1.phoneNumber.toString(); // Convert to string
    const validPhoneNumber = /^\d{10}$/; // Regular expression for 10-digit number
    
    if (validPhoneNumber.test(phoneNumber)) {
      // The phone number is valid, you can proceed with other actions here
      console.log('Valid phone number:', phoneNumber);
    } else {
      // The phone number is not valid, you can handle this as needed
      console.error('Invalid phone number:', phoneNumber);
    }
  }
}
