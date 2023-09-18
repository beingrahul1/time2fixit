import { Component } from '@angular/core';
import { ServiceproviderService } from '../serviceprovider.service';
import { serviceprovider } from './serviceProvider.model';

@Component({
  selector: 'app-service-provider-registration',
  templateUrl: './service-provider-registration.component.html',
  styleUrls: ['./service-provider-registration.component.css']
})
export class ServiceProviderRegistrationComponent {

  constructor(private registrationService:ServiceproviderService){}

  user1=new serviceprovider();
  addUser()
  {
    if(this.user1.password==this.user1.confirmPassword){
    this.registrationService.registerServiceProvider(this.user1).subscribe(
      data=>{
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
