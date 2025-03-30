import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-student-card',
  templateUrl: './student-card.component.html',
  styleUrl: './student-card.component.css'
})
export class StudentCardComponent {
  @Input() student: any;
  @Output() studentclicked = new EventEmitter<number>();
   studentBoxClick(){
    this.studentclicked.emit(this.student.regNo);
   }
}
