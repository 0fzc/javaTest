package com.hspedu.Homework.Homework13;

public class Student extends Person {
    private long stu_id;

    public Student(String name, char sex, int age, long stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }

    //合理封装
    public long getStu_id() {
        return stu_id;
    }

    public void setStu_id(long stu_id) {
        this.stu_id = stu_id;
    }

    public void study() {
        System.out.println("我会好好学习");
    }

    public String play() {
        return getName() + "喜欢玩足球";
    }

    //  调用属性
    public void studentShow() {
        System.out.println("学生的信息：");
        System.out.println("姓名：" + getName());
        System.out.println("年龄：" + getAge());
        System.out.println("性别：" + getSex());
        System.out.println("学号：" + getStu_id());
        study();
        System.out.println(play());

    }
    public void basic(){
        System.out.println("此人的信息为----------------");
        System.out.println("姓名:" + getName());
        System.out.println("年龄：" + getAge());
        System.out.println("性别：" + getSex());
        System.out.println("学号：" + getStu_id());
    }
}