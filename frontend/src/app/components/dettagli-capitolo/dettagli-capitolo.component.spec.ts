import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DettagliCapitoloComponent } from './dettagli-capitolo.component';

describe('DettagliCapitoloComponent', () => {
  let component: DettagliCapitoloComponent;
  let fixture: ComponentFixture<DettagliCapitoloComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DettagliCapitoloComponent]
    });
    fixture = TestBed.createComponent(DettagliCapitoloComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
