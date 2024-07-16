package com.hspedu.Homework.Homework04;

/**
 * @author 冯振聪
 * @version 1.0
 */
public class test {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testWork(new Computer() {//放接口
            @Override
            public double work(double n1, double n2) {
                return n1+n2;
            }
        },10,8);
    }
}
