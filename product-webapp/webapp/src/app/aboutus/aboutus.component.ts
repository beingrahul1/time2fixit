import { Component } from '@angular/core';

interface TeamMember {
  name: string;
  position: string;
  company: string;
  avatarUrl: string;
  linkedIn: String;
  instagram: String;
}

@Component({
  selector: 'app-aboutus',
  templateUrl: './aboutus.component.html',
  styleUrls: ['./aboutus.component.css']
})
export class AboutusComponent {
  teamMembers: TeamMember[] = [
    {
      name: 'Priyanshu Singh',
      position: 'Project Mentor',
      company: 'NIIT Stackroute',
      avatarUrl: 'assets/user.jpeg',
      linkedIn: '',
      instagram: ''
    },
    {
      name: 'Shahid Killedar',
      position: 'Training Mentor',
      company: 'NIIT Stackroute',
      avatarUrl: 'assets/user.jpeg',
      linkedIn: '',
      instagram: ''
    },
    {
      name: 'Bhavin Kanbi',
      position: 'Software Engineer',
      company: 'CGI',
      avatarUrl: 'assets/user.jpeg',
      linkedIn: '',
      instagram: ''
    },
    {
      name: 'Esmrit Dwivedi',
      position: 'Software Engineer',
      company: 'CGI',
      avatarUrl: 'assets/user.jpeg',
      linkedIn: '',
      instagram: ''
    },
    {
      name: 'Maheswar Reddy',
      position: 'Software Engineer',
      company: 'CGI',
      avatarUrl: 'assets/user.jpeg',
      linkedIn: '',
      instagram: ''
    },
    {
      name: 'Rahul Raj',
      position: 'Software Engineer',
      company: 'CGI',
      avatarUrl: 'assets/user.jpeg',
      linkedIn: '',
      instagram: ''
    },
    {
      name: 'Padma Priya',
      position: 'Software Engineer',
      company: 'CGI',
      avatarUrl: 'assets/user.jpeg',
      linkedIn: '',
      instagram: ''
    },
    {
      name: 'Aswini S',
      position: 'Software Engineer',
      company: 'CGI',
      avatarUrl: 'assets/user.jpeg',
      linkedIn: '',
      instagram: ''
    },
    {
      name: 'Anuraam',
      position: 'Software Engineer',
      company: 'CGI',
      avatarUrl: 'assets/user.jpeg',
      linkedIn: '',
      instagram: ''
    }
  ];

  constructor() { }

  ngOnInit(): void {
  }
}

