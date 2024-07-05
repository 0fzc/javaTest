package com.hspedu.Homework.Homework13;

public class poly_arr {
    public static void main(String[] args) {
        poly_arr polyArr = new poly_arr();

        Person person01 = new Teacher("袁芳鑫", '女', 23, 202011258L);
       Person person02 = new Teacher("老杨", '男', 70, 9982520211L);
       Person person11 = new Student("冯振聪", '男', 18, 2023105190127L);
       Person person12 = new Student("陈雷涛", '男', 19, 202310555415127L);
       Person persons[]= new Person [4];
       persons[0]=person01;
       persons[1]=person02;
       persons[2]=person11;
       persons[3]=person12;
        for (int i = 0; i <persons.length-1 ; i++) {
            for (int j = 0; j < persons.length-1-i; j++) {
                if(persons[i].getAge()<persons[i+1].getAge()){
                    Person p=persons[i];
                    persons[i]=persons[i+1];
                    persons[i+1]=p;
                }
            }
        }
        for (int i = 0; i <4 ; i++) {
            persons[i].basic();
        }
        for (int i = 0; i < persons.length; i++) {
            polyArr.studyOrTeach(persons[i]);
        }
    }
    public void studyOrTeach(Person p1){
        if(p1 instanceof Student){
            ((Student) p1).study();
        }
        else if(p1 instanceof Teacher){
            ((Teacher) p1).teacher();
        }
        else{
            System.out.println("输入错误");
        }
    }

}
