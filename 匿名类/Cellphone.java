package com.hspedu.Homework.Homework04;

/**
 * @author 冯振聪
 * @version 1.0
 */
public class Cellphone {
    public void testWork(Computer computer,double n1,double n2){//传入接口，这样可以用work方法
        double result=computer.work(n1,n2);
        System.out.println("计算的结果是"+result);
    }

}
interface Computer{
    public abstract double work(double n1,double n2);
    //传入两个值



}
