package ch3_Operator;

import jdk.swing.interop.SwingInterOpUtils;

public class BitExam {
      public static void main(String[] args) {
            int a=9;
            int b=11;

            System.out.println(Integer.toBinaryString(a)); // 1001
            System.out.println(Integer.toBinaryString(b));// 1011
            System.out.println();

            // &(AND) 연산
            System.out.println("10진수 : "+(a&b)); //10진수 : 9
            System.out.println("2진수 : "+Integer.toBinaryString(a&b)); //2진수 : 1001
            System.out.println();

            // |(OR) 연산
            System.out.println("10진수 : "+(a|b)); //10진수 : 11
            System.out.println("2진수 : "+Integer.toBinaryString(a|b)); //2진수 : 1011
            System.out.println();

            // ^(XOR) 연산
            System.out.println("10진수 : "+(a^b)); //10진수 : 2
            System.out.println("2진수 : "+Integer.toBinaryString(a^b)); //2진수 : 0010
            System.out.println();

            // ~(NOT) 연산
            System.out.println("10진수 : "+~a); //10진수 : -10
            System.out.println("2진수 : "+Integer.toBinaryString(~a)); //2진수 : 11111111111111111111111111110110
            System.out.println();

            // << (left shift) 연산
            System.out.println(3<<2);//10진수 : 12
            System.out.println("3의 이진수 표현 : "+Integer.toBinaryString(3)); // 11
            System.out.println(Integer.toBinaryString(3<<2)); //2진수 : 1100
            System.out.println();

            // >> (right shift) 연산
            System.out.println("16의 이진수 표현 : "+Integer.toBinaryString(16)); // 10000
            System.out.println(16>>2);//10진수 : 4
            System.out.println(Integer.toBinaryString(16>>2)); //2진수 : 100
            System.out.println();
      }
}
