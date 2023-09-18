import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { Order } from './updateOrder.model';

@Component({
  selector: 'app-update-order-tracking',
  templateUrl: './update-order-tracking.component.html',
  styleUrls: ['./update-order-tracking.component.css']
})
export class UpdateOrderTrackingComponent implements OnInit{
  constructor(private trackData:UserService){}
  ngOnInit(): void {
    this.getTrack();
  }

  player=new Order();

  selectedOption!: string;
  options: string[] = ['Pending','Shipped','Delivered'];
  searchTxt:number=0;
  showMessage: boolean = false;
  message: string = '';


  players:Order[]=[];
  getTrack(){
    this.trackData.getTrack().subscribe(
      data=>{
        this.players=data;
      },
      error=>{
        console.log(error);
      }
    );
  }

  searchById()
  {

      this.trackData.searchTrackById(this.searchTxt).subscribe(
    
        data=>{
  
          this.player=data;
  
        },
        error=>{
          console.log(error)
        }
    
      )
      }
  
  updatePlayer() {
    console.log(this.player);
    this.trackData.updateTrack(this.searchTxt, this.player).subscribe(
      data => {
        this.showMessage = true;
        this.message = 'STATUS : APPLIED';
        alert("Status Updated");
        this.getTrack();
        window.location.reload();
      },
      error => {
        this.showMessage = true;
        this.message = 'STATUS : NOT APPLIED TRY AGAIN';
      }

    );
  }
}
