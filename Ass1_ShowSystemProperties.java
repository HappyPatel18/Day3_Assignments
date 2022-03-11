package com.Day3;

import java.util.Locale;
import java.util.Scanner;
import java.util.SortedMap;

class SystemProperties{

    public void command(String[] command){
            String check=command[0].toLowerCase(Locale.ROOT);
        if(check.equals("uname")){
             uName();
        }else if(check.equals("osname")){
             osName();

        }else if(check.equals("udir")){
             udir();

        }else if(check.equals("all")){
           uName();osName();udir();
        }else{
            System.out.println("Please enter from the given inputs");
        }


    }


    public void uName(){
        System.out.println("User Name is : "+System.getProperty("user.name"));

    }

    public void osName(){
        System.out.println("OPERATING SYSTEM IS : "+System.getProperty("os.name"));

    }

    public void udir(){
        System.out.println("User Directory is  : "+System.getProperty("java.home"));

    }
}

public class Ass1_ShowSystemProperties {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        SystemProperties obj=new SystemProperties();
        obj.command(args);




    }
}
