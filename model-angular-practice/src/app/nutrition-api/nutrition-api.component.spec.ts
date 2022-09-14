import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NutritionApiComponent } from './nutrition-api.component';

describe('NutritionApiComponent', () => {
  let component: NutritionApiComponent;
  let fixture: ComponentFixture<NutritionApiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NutritionApiComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(NutritionApiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
