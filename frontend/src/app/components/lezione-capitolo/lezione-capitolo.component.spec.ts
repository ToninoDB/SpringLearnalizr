import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LezioneCapitoloComponent } from './lezione-capitolo.component';

describe('LezioneCapitoloComponent', () => {
  let component: LezioneCapitoloComponent;
  let fixture: ComponentFixture<LezioneCapitoloComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [LezioneCapitoloComponent]
    });
    fixture = TestBed.createComponent(LezioneCapitoloComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
