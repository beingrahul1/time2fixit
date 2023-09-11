import { Component } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {

  isDropdownOpen = false;

  toggleDropdown(event: Event): void {
    event.preventDefault(); // Prevent default link behavior
    
    this.isDropdownOpen = !this.isDropdownOpen; // Toggle the dropdown
  }
}
