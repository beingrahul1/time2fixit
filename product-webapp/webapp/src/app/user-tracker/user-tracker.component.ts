
import { Component,OnInit,Input} from '@angular/core';
import { UserTrackerService } from '../user-tracker.service';


@Component({
  selector: 'app-user-tracker',
  templateUrl: './user-tracker.component.html',
  styleUrls: ['./user-tracker.component.css']
})
export class UserTrackerComponent implements OnInit {
  userEmail: string="abc@gmail.com";
  trackingData!: any[];

  constructor(private trackingService:UserTrackerService) { }

  ngOnInit() {
    this.fetchTrackingData();
  }

  fetchTrackingData() {
    if (this.userEmail) {
      this.trackingService.getTrackingByUserEmail(this.userEmail).subscribe(data => {
        this.trackingData = data;
      });
    }
  }
  
}