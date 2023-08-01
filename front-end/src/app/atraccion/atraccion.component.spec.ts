import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AtraccionComponent } from './atraccion.component';

describe('AtraccionComponent', () => {
  let component: AtraccionComponent;
  let fixture: ComponentFixture<AtraccionComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AtraccionComponent]
    });
    fixture = TestBed.createComponent(AtraccionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
