import { Component } from '@angular/core';

@Component({
  selector: 'app-task-list',
  templateUrl: './task-list.component.html',
  styleUrl: './task-list.component.css'
})
export class TaskListComponent {
  tasks = [
    { id: 1, title: 'Complete Angular Project', completed: false },
    { id: 2, title: 'Review Project', completed: false },
    { id: 3, title: 'Write Documentation', completed: false }
  ];

  markTaskCompleted(taskId: number) {
    this.tasks = this.tasks.map(task =>
      task.id === taskId ? { ...task, completed: true } : task
    )
  }

  markTaskActivated(taskId: number) {
    this.tasks = this.tasks.map(task =>
      task.id === taskId ? { ...task, completed: false } : task
    )
  }
}
