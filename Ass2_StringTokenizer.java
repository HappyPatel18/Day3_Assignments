package com.Day3;


import java.util.Scanner;

class TestStringTokenizer{
      public void seperateString(String  a){
          String[] result=a.split(",");
          for(String i:result){
              System.out.println(i);
          }
      }
}
public class Ass2_StringTokenizer {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your words");
        String names=input.nextLine();
        TestStringTokenizer obj=new TestStringTokenizer();
        obj.seperateString(names);
    }
}
