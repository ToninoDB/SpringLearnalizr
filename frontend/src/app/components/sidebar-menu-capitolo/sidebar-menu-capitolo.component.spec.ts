import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SidebarMenuCapitoloComponent } from './sidebar-menu-capitolo.component';

describe('SidebarMenuCapitoloComponent', () => {
  let component: SidebarMenuCapitoloComponent;
  let fixture: ComponentFixture<SidebarMenuCapitoloComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [SidebarMenuCapitoloComponent]
    });
    fixture = TestBed.createComponent(SidebarMenuCapitoloComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
