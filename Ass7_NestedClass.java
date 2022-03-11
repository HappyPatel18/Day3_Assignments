package com.Day3;

class Employee{
   private String eName;

    public Employee(String a){
        String name=a.toString();
        this.eName=name;
    }

    public String getEname(){
        return eName;
    }


    class SalaryStructure{
        private double basic_Sal;
        private double hra;
        public SalaryStructure(String salary){
           this.basic_Sal=Float.parseFloat(salary);
        }

        public double getBasicSal(){
            return basic_Sal;
        }

        public double getHra(){
            return (basic_Sal*0.125);
        }

    }
}

public class Ass7_NestedClass {

    public static void main(String[] args) {

        Employee outer=new Employee(args[0]);
        Employee.SalaryStructure inner=outer.new SalaryStructure(args[1]);
       String name= outer.getEname();
       double bas_sal=inner.getBasicSal();
       double hra=inner.getHra();

        System.out.println("The Name of the Employee is : "+name);
        System.out.println("The Basic Salary of an Employee is : "+bas_sal);
        System.out.println("The HRA of an Employee is : "+hra);
        System.out.println("The total Salary of an Employee is : "+(hra+bas_sal));


    }
}
