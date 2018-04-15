package com.company.enums;

import java.util.EnumSet;


public class EnumUtils {
    public static void iterateEnumByForEach() {
        EnumSet.allOf(DaysOfWeekEnum.class)
                .forEach(d -> System.out.println(d));
    }

    public static void iterateEnumByStreams() {
        DaysOfWeekEnum.stream()
                .filter(d -> d.getTypeOfDay().equals("OFF"))
                .forEach(System.out::println);

    }
}
