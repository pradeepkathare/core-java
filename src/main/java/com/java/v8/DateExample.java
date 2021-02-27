package com.java.v8;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;


public class DateExample {

	public static void main(String[] args) {

		System.out.println("Date Example");
		
		//	The new classes intended to replace Date class are LocalDate, LocalTime and LocalDateTime.
	
		//LocalDate and many more option
		//The LocalDate class represents a date. There is no representation of a time or time-zone.
		LocalDate localDate = LocalDate.now();
		System.out.println("localdate : "+localDate);
		System.out.println("localdate getDayOfMonth: "+localDate.getDayOfMonth());
		System.out.println("localdate getDayOfYear: "+localDate.getDayOfYear());
		System.out.println("localdate getMonthValue: "+localDate.getMonthValue());
		System.out.println("localdate getChronology: "+localDate.getChronology());
		System.out.println("localdate getDayOfWeek: "+localDate.getDayOfWeek());
		System.out.println("localdate getMonth: "+localDate.getMonth());
		
		System.out.println("-----------------");
		//LocalTime localTime = LocalTime.of(12, 20);
		 //The LocalTime class represents a time. There is no representation of a date or time-zone.
		LocalTime localTime = LocalTime.now();
		System.out.println("localTime : "+localTime);
		System.out.println("localTime getHour: "+localTime.getHour());
		System.out.println("localTime getMinute: "+localTime.getMinute());
		System.out.println("localTime getSecond: "+localTime.getSecond());
		System.out.println("localTime MAX: "+localTime.MAX);
		System.out.println("localTime MIDNIGHT: "+localTime.MIDNIGHT);
	
		//The LocalDateTime class represents a date-time. There is no representation of a time-zone.
		System.out.println("-----------------");
		LocalDateTime localDateTime = LocalDateTime.now(); 
		System.out.println("localDateTime getDayOfMonth: "+localDateTime.getDayOfMonth());
		System.out.println("localDateTime getHour: "+localDateTime.getHour());
		
		//If you want to use the date functionality with zone information, then Lambda provide you extra 3 classes similar to above one i.e. OffsetDate, OffsetTime and OffsetDateTime.
		System.out.println("-----------------");
		OffsetDateTime offsetDateTime = OffsetDateTime.now();
		System.out.println("offsetDateTime : "+offsetDateTime);
		
		System.out.println("-------zonedDateTime----------");
		ZonedDateTime zonedDateTime=ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		System.out.println("zonedDateTime : "+zonedDateTime.toString()); 
		
		//New classes to represent timestamp and duration
		//The Instant class represents an instant in time to an accuracy of nanoseconds. Operations on an Instant include comparison to another Instant and adding or subtracting a duration.
		
		System.out.println("--------Instant----------");
		Instant instant = Instant.now();
		System.out.println("instant : "+instant.atZone(ZoneId.of("Asia/Kolkata")));
		System.out.println("instant plus: "+instant.plus(Duration.ofMillis(5000)));
		System.out.println("instant getEpochSecond: "+instant.getEpochSecond());
		System.out.println("instant plusMillis: "+instant.plusMillis(5000));
		System.out.println("instant minusMillis: "+instant.minusMillis(5000));
		
		System.out.println("--------Duration----------");
		Duration duration = Duration.ofDays(10);
		System.out.println("duration toDays:"+duration.toDays());
		System.out.println("duration ofHours:"+Duration.ofHours(31));
		System.out.println("duration ofMillis:"+Duration.ofMillis(180));
		System.out.println("duration ofMinutes:"+Duration.ofMinutes(65));
		System.out.println("duration ofSeconds:"+Duration.ofSeconds(70));
		System.out.println("duration between:"+Duration.between(Instant.now(), Instant.now().minus(Duration.ofDays(1))));
		
		//Added utility classes over existing enums
		//day-of-week to represent, from 1 (Monday) to 7 (Sunday)
		System.out.println(DayOfWeek.of(2));                    //TUESDAY
		 
		DayOfWeek day = DayOfWeek.FRIDAY;
		System.out.println(day.getValue());                     //5
		 
		LocalDate localDate1 = LocalDate.now();
		System.out.println("DayOfWeek : "+localDate1.with(DayOfWeek.MONDAY));  //2013-05-13  i.e. when was monday in current week ?
		
		//https://howtodoinjava.com/java8/date-and-time-api-changes-in-java-8-lambda/
	}

}
