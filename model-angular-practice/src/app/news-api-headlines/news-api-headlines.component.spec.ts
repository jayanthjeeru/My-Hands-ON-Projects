import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NewsApiHeadlinesComponent } from './news-api-headlines.component';

describe('NewsApiHeadlinesComponent', () => {
  let component: NewsApiHeadlinesComponent;
  let fixture: ComponentFixture<NewsApiHeadlinesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NewsApiHeadlinesComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(NewsApiHeadlinesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
