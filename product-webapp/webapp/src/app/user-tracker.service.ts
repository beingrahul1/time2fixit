import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserTrackerService {
  private baseUrl = 'http://localhost:1234/track';
  constructor(private http: HttpClient) { }
  getTrackingByUserEmail(userEmail: string): Observable<any[]> {
    const url = `${this.baseUrl}?userEmail=${userEmail}`;
    return this.http.get<any[]>(url);
  }
  
}

