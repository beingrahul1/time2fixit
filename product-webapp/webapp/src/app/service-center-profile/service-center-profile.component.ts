import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { serviceProfile } from './serviceProfile.model';

@Component({
  selector: 'app-service-center-profile',
  templateUrl: './service-center-profile.component.html',
  styleUrls: ['./service-center-profile.component.css']
})
export class ServiceCenterProfileComponent implements OnInit {
  serviceProfile: serviceProfile[] = [];
  email: string = '';
  constructor(private serviceCenterProfile:UserService){}
  ngOnInit(): void {
    this.serviceCenterProfile.getServiceProfile(this.email).subscribe(

      data=>{

        this.serviceProfile=data;
      },
      error=>{
        console.log(error)
      }

    );
  }

  
}
