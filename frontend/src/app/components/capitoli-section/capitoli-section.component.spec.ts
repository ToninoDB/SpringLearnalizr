import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CapitoliSectionComponent } from './capitoli-section.component';

describe('CapitoliSectionComponent', () => {
  let component: CapitoliSectionComponent;
  let fixture: ComponentFixture<CapitoliSectionComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CapitoliSectionComponent]
    });
    fixture = TestBed.createComponent(CapitoliSectionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
