package com.company;

import java.util.Calendar;
import java.util.Date;

public class Main {

	// write your code here
        public static void main(String[] args) {
            Date now = new Date();
            System.out.println(now);

            Date now2 = new Date();

            if (now.equals(now2)) {
                System.out.println("bang nhau");
            }
            if (now.before(now2)) {

            }
            if (now.after(now2)) {

            }
            now.getTime(); // tra ve mili giay;
            now.setTime(0);

            Calendar ca = Calendar.getInstance();
            System.out.println(ca.getTime()); // tra ve ngay thang hien tai trong he thong;

            ca.add(Calendar.HOUR,-1);
            ca.add(Calendar.DATE,-1);

            System.out.println(ca.getTime());

        }
    }

