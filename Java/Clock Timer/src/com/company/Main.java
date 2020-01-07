package com.company;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception{
        Scanner reader = new Scanner(System.in);
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);


        seconds.setValue(59);
        minutes.setValue(59);
        hours.setValue(23);


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


        }
    }

}


