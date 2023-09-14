import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HomeserviceComponent } from './homeservice.component';

describe('HomeserviceComponent', () => {
  let component: HomeserviceComponent;
  let fixture: ComponentFixture<HomeserviceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HomeserviceComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(HomeserviceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
