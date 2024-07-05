package com.hspedu.Homework.Homework13;


public class Teacher extends Person{
    private long work_age;
    public Teacher(String name, char sex, int age,long work_age) {
        super(name, sex, age);
        this.work_age=work_age;
    }

    public long getWork_age() {
        return work_age;
    }

    public void setWork_age(long work_age) {
        this.work_age = work_age;
    }
    public void teacher(){
        System.out.println("我会好好教学");
    }
    public String play(){
        return getName()+"喜欢下象棋";
    }
    public void teacherShow() {
        System.out.println("老师的信息：");
        System.out.println("姓名：" + getName());
        System.out.println("年龄：" + getAge());
        System.out.println("性别：" + getSex());
        System.out.println("工号：" + getWork_age());
       teacher();
        System.out.println(play());
    }
    public void basic(){
        System.out.println("此人的信息为---------------------------");
        System.out.println("姓名:" + getName());
        System.out.println("年龄：" + getAge());
        System.out.println("性别：" + getSex());
        System.out.println("学号：" + getWork_age());
    }
}
