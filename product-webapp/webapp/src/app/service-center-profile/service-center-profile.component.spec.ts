import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ServiceCenterProfileComponent } from './service-center-profile.component';

describe('ServiceCenterProfileComponent', () => {
  let component: ServiceCenterProfileComponent;
  let fixture: ComponentFixture<ServiceCenterProfileComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ServiceCenterProfileComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ServiceCenterProfileComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
