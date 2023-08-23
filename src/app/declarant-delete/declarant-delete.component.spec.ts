import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeclarantDeleteComponent } from './declarant-delete.component';

describe('DeclarantDeleteComponent', () => {
  let component: DeclarantDeleteComponent;
  let fixture: ComponentFixture<DeclarantDeleteComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DeclarantDeleteComponent]
    });
    fixture = TestBed.createComponent(DeclarantDeleteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
