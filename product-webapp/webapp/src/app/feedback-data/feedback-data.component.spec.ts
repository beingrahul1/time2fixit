import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FeedbackDataComponent } from './feedback-data.component';

describe('FeedbackDataComponent', () => {
  let component: FeedbackDataComponent;
  let fixture: ComponentFixture<FeedbackDataComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FeedbackDataComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FeedbackDataComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
