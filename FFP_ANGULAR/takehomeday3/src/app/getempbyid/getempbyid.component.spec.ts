import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GetempbyidComponent } from './getempbyid.component';

describe('GetempbyidComponent', () => {
  let component: GetempbyidComponent;
  let fixture: ComponentFixture<GetempbyidComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [GetempbyidComponent]
    });
    fixture = TestBed.createComponent(GetempbyidComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
