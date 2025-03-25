import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CapitoloComponent } from './capitolo.component';

describe('CapitoloComponent', () => {
  let component: CapitoloComponent;
  let fixture: ComponentFixture<CapitoloComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CapitoloComponent]
    });
    fixture = TestBed.createComponent(CapitoloComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
