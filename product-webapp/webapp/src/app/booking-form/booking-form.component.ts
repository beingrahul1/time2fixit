import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Appointment } from '../appointment.model';
import { AppointmentService } from '../appointments.service';
import { Booking } from '../Booking.model';

@Component({
  selector: 'app-booking-form',
  templateUrl: './booking-form.component.html',
  styleUrls: ['./booking-form.component.css']
})
export class BookingFormComponent {
  bookingForm: FormGroup;

  constructor(private fb: FormBuilder, private appointmentService: AppointmentService) {
    this.bookingForm = this.fb.group({
      name: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]],
      service: ['', Validators.required],
      brand: ['', Validators.required],
      date: ['', Validators.required],
      time: ['', Validators.required],
      paymentMode: ['', Validators.required],
      cardNumber: ['']
    });
  }

  // onSubmit(): void {
  //   // if (this.bookingForm.valid) {
  //     const appointmentData: Appointment = this.bookingForm.value;
  //     this.appointmentService.bookAppointment(appointmentData)
  //       .subscribe(
  //         () => {
  //           console.log('Appointment booked successfully');
  //           this.bookingForm.reset();
  //         },
  //         (error) => {
  //           console.error('Error booking appointment:', error);
  //         }
  //       );
  //   }
    booking: Booking = new Booking();
    submitBooking() {
      console.log(this.booking);
      this.appointmentService.bookAppointment(this.booking).subscribe((response) => {
        console.log('Booking created:', response);
        // Clear the form or perform any other necessary actions
        this.booking = new Booking();
      });
    }

  }
// }