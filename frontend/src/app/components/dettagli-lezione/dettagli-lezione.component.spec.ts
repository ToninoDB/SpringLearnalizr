import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DettagliLezioneComponent } from './dettagli-lezione.component';

describe('DettagliLezioneComponent', () => {
  let component: DettagliLezioneComponent;
  let fixture: ComponentFixture<DettagliLezioneComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DettagliLezioneComponent]
    });
    fixture = TestBed.createComponent(DettagliLezioneComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
