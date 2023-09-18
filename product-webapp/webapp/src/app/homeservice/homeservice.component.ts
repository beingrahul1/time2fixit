import { Component } from '@angular/core';
import { ActivatedRoute, Params, Router } from '@angular/router';
import { LoginService } from '../login.service';

@Component({
  selector: 'app-homeservice',
  templateUrl: './homeservice.component.html',
  styleUrls: ['./homeservice.component.css']
})
export class HomeserviceComponent {
  isDropdownOpen = false;

  toggleDropdown(event: Event): void {
    event.preventDefault(); // Prevent default link behavior
    
    this.isDropdownOpen = !this.isDropdownOpen; // Toggle the dropdown
  }
  

  constructor(public authService: LoginService,private route: ActivatedRoute, private router: Router) { }

  // ngOnInit(): void { }

  userEmailFromQueryParam: string | null = null;

  ngOnInit(): void {
    this.route.queryParams.subscribe((params: Params) => { 
      this.userEmailFromQueryParam = params['email'] || null;
    }); 
  }

  logout(): void{
    this.authService.logout();
  }
}
