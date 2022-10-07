import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PlayerApiComponent } from './player-api.component';

describe('PlayerApiComponent', () => {
  let component: PlayerApiComponent;
  let fixture: ComponentFixture<PlayerApiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PlayerApiComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PlayerApiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
