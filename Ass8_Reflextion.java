package com.Day3;


import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Scanner;


class A{

    public String a_Name;
    private String a_Id;
    protected long a_Number;
//    A a=new A();

    public A(){
        this.a_Name="abc";
        this.a_Id="IU";
        this.a_Number=6352779087L;
    }

    protected String A_GetName(){
        return "Happy Patel";
    }
    public  String A_GetSalary(){
        return "Salary";
    }

}

class B{
    public String B_Name;
    private String B_Id;
    protected long B_Number;

    public B(){
        this.B_Name="abc";
        this.B_Id="IU";
        this.B_Number=6352779087L;
    }

    public String b_GetName(){
        return "Happy Patel";
    }
    public  String b_GetSalary(){
        return "Salary";
    }

}

class ClassDetails{
     A a=new A();
     B b=new B();

    Class b_cls=b.getClass();
    Class a_cls=a.getClass();


    public  void getInfo(String c_name,String info){


     if(c_name.toLowerCase(Locale.ROOT).equals("a")){
         System.out.println("The name of the class is "+a_cls.getName());

         switch (info.toLowerCase(Locale.ROOT)){
             case "m": getMethods(a_cls);
             break;
             case "f": getFields(a_cls);
             break;
             case "all":getMethods(a_cls); getFields(a_cls);
             break;
             default:
                 System.out.println("Please Enter the info from the choice given");

         }

     }
       else if(c_name.toLowerCase(Locale.ROOT).equals("b")){
         System.out.println("The name of the class is "+b_cls.getName());
         switch (info.toLowerCase(Locale.ROOT)){
             case "m": getMethods(b_cls);
             break;
             case "f": getFields(b_cls);
             break;
             case "all":getMethods(b_cls); getFields(b_cls);
             break;
             default:
                 System.out.println("Please Enter the info from the choice given");

         }


     }
//
    }
      public void getMethods(Class x){
          Method[] methods = x.getMethods();
          for (Method method:methods){
              System.out.println(method.getName());

          }

      }

    public void getFields(Class x){

        Field[] allFields=x.getFields();
        for (Field field:allFields){
            System.out.println(field.getName());

        }
    }
}

public class Ass8_Reflextion {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter ClassName ");
        String c_Name=input.nextLine();
        System.out.println("Enter type of info Example: \"ALL\"for all info , \"M\" for methods ,\"F\" for fields ");
        String info=input.nextLine();
        ClassDetails obj=new ClassDetails();
        obj.getInfo(c_Name,info);


    }
}
