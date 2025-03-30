import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Day1Task';

  students = [
    {regNo:202412,name:"Sagar",dept:"Computer and Communication Engineering",contact:1234567898},
    {regNo:202413,name:"Basha",dept:"Computer and Communication Engineering",contact:1234567898},
    {regNo:202414,name:"Chiru",dept:"Electrical and Communication Engineering",contact:1234567898},
    {regNo:202415,name:"Sutej",dept:"Artificial Intelligence and Data Science Engineering",contact:1234567898},
    {regNo:202416,name:"Rahul",dept:"Computer Science Engineering",contact:1234567898}
  ]
  std:any = {};

  isObjectNotEmpty(obj: any): boolean {
    return obj && Object.keys(obj).length > 0;
  }
  
  markstudentclicked(num:number){
    this.students.map(student => student.regNo===num ? this.std=student:{});
  }
}
