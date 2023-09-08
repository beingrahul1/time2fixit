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

}
