import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeclarantUpdateComponent } from './declarant-update.component';

describe('DeclarantUpdateComponent', () => {
  let component: DeclarantUpdateComponent;
  let fixture: ComponentFixture<DeclarantUpdateComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DeclarantUpdateComponent]
    });
    fixture = TestBed.createComponent(DeclarantUpdateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
