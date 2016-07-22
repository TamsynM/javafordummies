/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetester;

import java.util.*;
import java.time.*;

/**
 *
 * @author tamurphy
 */
public class TimeTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\nLocalTime: " + LocalTime.now().toString());
        System.out.println("\nLocalDateTime: " + LocalDateTime.now().toString());
        System.out.println("\nZonedDateTime: " + ZonedDateTime.now().toString());
        System.out.println("\nOffsetTime: " + OffsetTime.now().toString());
        System.out.println("\nOffsetDateTime: " + OffsetDateTime.now().toString());
        System.out.println("\nMonthDay: " + MonthDay.now().toString());
        System.out.println("\nYearMonth: " + YearMonth.now().toString());
        System.out.println("\nInstant: " + Instant.now().toString());
    }
    
}
