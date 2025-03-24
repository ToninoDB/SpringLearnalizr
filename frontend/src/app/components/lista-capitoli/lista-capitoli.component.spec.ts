import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListaCapitoliComponent } from './lista-capitoli.component';

describe('ListaCapitoliComponent', () => {
  let component: ListaCapitoliComponent;
  let fixture: ComponentFixture<ListaCapitoliComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ListaCapitoliComponent]
    });
    fixture = TestBed.createComponent(ListaCapitoliComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
