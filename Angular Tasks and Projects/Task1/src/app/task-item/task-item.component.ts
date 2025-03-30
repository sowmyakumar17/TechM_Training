import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-task-item',
  templateUrl: './task-item.component.html',
  styleUrl: './task-item.component.css'
})
export class TaskItemComponent {
  @Input() task: any;
  @Output() taskCompleted = new EventEmitter<number>();
  @Output() taskActivated = new EventEmitter<number>();

  completeTask() {
    this.taskCompleted.emit(this.task.id);
  }
  activate(){
    this.taskActivated.emit(this.task.id);
  }
}
