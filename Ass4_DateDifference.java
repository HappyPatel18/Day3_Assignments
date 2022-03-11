package com.Day3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class Ass4_DateDifference {

    static SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");

    public static void dataDifference(String a_date,String b_date) throws  ParseException {
            Date date1 = sdf.parse(a_date);   //Parsing is common in all the methods
            Date date2 = sdf.parse(b_date);
            long time_difference = date2.getTime() - date1.getTime();
            long days_difference = (time_difference / (1000 * 60 * 60 * 24)) % 365;
            System.out.println("Number of Days are : " + days_difference);
            long difference_In_Years = (time_difference / (1000L * 60 * 60 * 24 * 365));
            System.out.println("Number of Year are : " + difference_In_Years);



    }

    public static void main(String[] args) throws DataFormatException, ParseException {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 1st Date in the format 'yyyy/MM/dd' ");
        String date1=input.nextLine();
        System.out.println("Enter 2nd Date in the format 'yyyy/MM/dd' ");

        String date2=input.nextLine();
        dataDifference(date1,date2);





    }
}
