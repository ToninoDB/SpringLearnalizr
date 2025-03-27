import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HeroCapitoloComponent } from './hero-capitolo.component';

describe('HeroCapitoloComponent', () => {
  let component: HeroCapitoloComponent;
  let fixture: ComponentFixture<HeroCapitoloComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [HeroCapitoloComponent]
    });
    fixture = TestBed.createComponent(HeroCapitoloComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
