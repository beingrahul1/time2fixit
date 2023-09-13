import { Component, Input, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { feedbackData } from './feedbackData.model';

@Component({
  selector: 'app-feedback-data',
  templateUrl: './feedback-data.component.html',
  styleUrls: ['./feedback-data.component.css']
})
export class FeedbackDataComponent implements OnInit {
  constructor(private feedbackDataService:UserService){}
  ngOnInit(): void {
    this.getFeedback();
  }
  feedbackData:feedbackData[]=[];
  
  getFeedback()
  {

    this.feedbackDataService.getFeedback().subscribe(

      data=>{

        this.feedbackData=data;
      },
      error=>{
        console.log(error)
      }

    );
  }

  delete(email: String) {

    this.feedbackDataService.deleteFeedback(email).subscribe(
      data => {

        alert("deleted id " + email);
        this.getFeedback();
      },
      error => {
        console.log(error)
      }

    )

  }


}
