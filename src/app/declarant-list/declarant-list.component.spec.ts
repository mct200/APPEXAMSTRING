import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeclarantListComponent } from './declarant-list.component';

describe('DeclarantListComponent', () => {
  let component: DeclarantListComponent;
  let fixture: ComponentFixture<DeclarantListComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DeclarantListComponent]
    });
    fixture = TestBed.createComponent(DeclarantListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
