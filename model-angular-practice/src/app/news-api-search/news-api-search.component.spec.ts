import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NewsApiSearchComponent } from './news-api-search.component';

describe('NewsApiSearchComponent', () => {
  let component: NewsApiSearchComponent;
  let fixture: ComponentFixture<NewsApiSearchComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NewsApiSearchComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(NewsApiSearchComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
