package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception{
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);
        Scanner reader = new Scanner(System.in);

        seconds.setValue(0);
        minutes.setValue(0);
        hours.setValue(0);
        System.out.println("***************");
        System.out.println("* Clock Timer *");
        System.out.println("***************");
        System.out.println("");
        System.out.println("This code starts an endless counter looping on 23:59:59");
        System.out.println("");
        System.out.println("Please enter a command: type[start/quit]");
        String commander = reader.nextLine();


        if (commander.equals("start"))
        {
        while (true) {
            System.out.println( hours + ":" + minutes + ":" + seconds);
            Thread.sleep(1000);



            if (minutes.getValue()==59&&seconds.getValue()==59)
            {
                minutes.next();
                seconds.next();

                if (hours.getValue()==23&&minutes.getValue()==59&&seconds.getValue()==59)
                {
                    hours.next();

                }else hours.next();
            }

            else if (seconds.getValue()==59)
            {
                minutes.next();
                seconds.next();

            }
            else
                seconds.next();


        }}else System.out.println("Thank you :)");
    }

}


