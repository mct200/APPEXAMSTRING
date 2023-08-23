import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeclarantAddComponent } from './declarant-add.component';

describe('DeclarantAddComponent', () => {
  let component: DeclarantAddComponent;
  let fixture: ComponentFixture<DeclarantAddComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DeclarantAddComponent]
    });
    fixture = TestBed.createComponent(DeclarantAddComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
