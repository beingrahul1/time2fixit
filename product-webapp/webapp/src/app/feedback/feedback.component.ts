import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { feedback } from './feedback.model';
import { UserService } from '../user.service';

@Component({
  selector: 'app-feedback',
  templateUrl: './feedback.component.html',
  styleUrls: ['./feedback.component.css']
})
export class FeedbackComponent {
  feedback = new feedback();
  constructor(private registrationService:UserService){}
  invalidInput = false;

  submitFeedback() {
    if (this.feedback.email && this.feedback.rating && this.feedback.feedback) {
      this.registrationService.registerfeedback(this.feedback).subscribe(
        data=>{
          console.log(data)
          alert("feedback taken");
          // this.router.navigate(['/login']);
        },
        error=>{
          console.log(error);
        }
        )
      this.invalidInput = false;
    } else {
      
      this.invalidInput = true;
    }
  }
}
