package com.globant.beans.datetime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormatDemo {

    public static void main(String[] args) {
        LocalTime timeMorning = LocalTime.parse("08:30:05.500");
        LocalTime timeAfternoon = LocalTime.parse("15:25:04.300");

        LocalTime timeEvening = LocalTime
                .parse("21:35:07.600");

        DateTimeFormatter formatter = DateTimeFormatter
                .ofPattern("h.m.s B");

        System.out.println(timeEvening
                .format(formatter));


        System.out.println(timeAfternoon.format(formatter));
        System.out.println(timeMorning.format(formatter));
    }


}
