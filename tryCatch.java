package com.hspedu.Homework;

import java.util.Scanner;
//      异常处理方法   try——catch
//  判断输入数值
/**
 * @author 冯振聪
 * @version 1.0
 */
public class fsf {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int num=0;
        String str="";

        while(true){
            System.out.println("请输入一个整数");
            str=myScanner.next();//初步定义
            try {
                num=Integer.parseInt(str);//如果抛出异常，则try后面的不再执行,执行catch
                System.out.println("输入的值为"+num);
                break;
            } catch (NumberFormatException e) {
                System.out.println("输入错误，请输入一个整数");
//                throw new RuntimeException(e);   这句话会抛出红字
            }


        }
    }
}
