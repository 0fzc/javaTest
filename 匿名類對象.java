package com.hspedu.Homework;

public class test_ {
    public static void main(String[] args) {
        phone phone = new phone();
        phone.alarm(new Bell() {//匿名类开头
            @Override
            public void ring() {
                System.out.println("闹钟响了");
            }
        });//结尾
        phone.alarm(new Bell() {
            @Override
            public void ring() {
                System.out.println("起床了");
            }
        });
    }


}
interface Bell{
    void ring();//抽象方法
}//接口
class phone{
    public void alarm(Bell bell){
        bell.ring();//接口为参数
    }
}
