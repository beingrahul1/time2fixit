import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Appointment } from './appointment.model';
import { Booking } from './Booking.model';

@Injectable({
  providedIn: 'root'
})
export class AppointmentService {
  private apiUrl = 'http://localhost:1111/bookings'; // Replace with your actual backend API endpoint

  constructor(private http: HttpClient) { }

  bookAppointment(appointmentData: Booking): Observable<any> {
    return this.http.post(this.apiUrl + '/create', appointmentData);
  }

}