package com.axess.demo;

public class OperatorsDemo {
public static void main(String[] args) {
     int num1=100;
     int num2=50;
     int result=num1+num2;
     System.out.println("Additon of two numbers"+result);
     
     System.out.println("***Unary Operators***");
     num1++;
     System.out.println("after increment"+num1);
     num1--;
     System.out.println("after decrement :" + num1);
     ++num1;
     //--num1;
     System.out.println(+num1);
     
     System.out.println("logical & relational operator");
     int a = 100;
     int b = 50;
     int c= 9;
     System.out.println(a<b && a<c);
     System.out.println(a<b || a<c);
     
     System.out.println("ternary operator");
     int results=(a>b)?a:b;
     System.out.println(results);

     String res =(a>b)?"a is greater ":"b is greater";
     System.out.println(res);
}
}
