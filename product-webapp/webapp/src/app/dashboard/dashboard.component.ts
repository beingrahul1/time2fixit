import { Component, OnInit } from '@angular/core';
import { user } from '../user-registration/user.model';
import { UserService } from '../user.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent  implements OnInit{
  constructor(private u1: UserService){}
 users: user[]=[];
 user1=new user();
 user2 = new user();
 
  ngOnInit() {
    // throw new Error('Method not implemented.');
    this.edit();
  }


  edit(){
    this.user1.email = "raj@gmail.com";
    this.u1.displayuser(this.user1).subscribe(
      data=>{
         this.user2=data;
    
        console.log(data);

      },
      error=>{
        console.error('Error fetching data:', error);
      }
   
    )
  }


}
