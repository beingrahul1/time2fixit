import { Component, OnInit } from '@angular/core';
// import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { user } from '../user-registration/user.model';
import { UserService } from '../user.service';

@Component({
  selector: 'app-updateuser',
  templateUrl: './updateuser.component.html',
  styleUrls: ['./updateuser.component.css']
})
export class UpdateuserComponent implements OnInit {
  // public UserUpdate!: FormGroup;



constructor(private u1 : UserService){}
users : user []=[];
user1=new user();
  ngOnInit(){
    // this.onSubmit();
  }
  onSubmit()
  {
    this.user1.email = "raj@gmail.com";
    this.u1.updateuser(this.user1).subscribe(
      data=>{
        //this.users=data;
        alert("user updated")
        console.log(data);

      },
      error=>{
        console.error('Error fetching data:', error);
      }
   
    )
  }
}