package com.Day3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ass3_DateAndTime {

    public static void formatDate(String formatType,String date) throws ParseException {

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
        Date date_formatted= sdf.parse(date);
        SimpleDateFormat sdf1=new SimpleDateFormat(formatType);
        System.out.println(sdf1.format(date_formatted));

      }


    public static void main(String[] args) throws ParseException {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Format you want to print");
        String format=input.nextLine();
        System.out.println("Enter the date in yyyy/MM/dd Format");
        String date=input.nextLine().trim();

        if(date.length()!=0){
            formatDate(format,date);

        }else{
            date= String.valueOf(java.time.LocalDate.now());
            formatDate(format,date);

        }

    }
}
