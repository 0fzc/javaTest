package com.hspedu.Homework.Homework13;

public class Homework13 {
    public static void main(String[] args) {
        Student student = new Student("冯振聪", '男', 18, 2023105190127L);
        student.studentShow();
        System.out.println("------------------------------------------------------------------");
        Teacher teacher = new Teacher("韩顺平", '男', 40, 2005110300451L);
        teacher.teacherShow();


    }
}
