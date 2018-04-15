package com.company.enums;

import java.util.stream.Stream;

public enum DaysOfWeekEnum {
    SUNDAY("OFF"),
    MONDAY("WORKING"),
    TUESDAY("WORKING"),
    WEDNESDAY("WORKING"),
    THURSDAY("WORKING"),
    FRIDAY("WORKING"),
    SATURDAY("OFF");

    private String typeOfDay;

    DaysOfWeekEnum(String typeOfDay){
        this.typeOfDay = typeOfDay;
    }
    public static Stream<DaysOfWeekEnum> stream() {
        return Stream.of(DaysOfWeekEnum.values());
    }

    public String getTypeOfDay() {
        return typeOfDay;
    }
}
