package com.java.muktha_ref;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

public class TestInstant {

	static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		String inst="2020-03-03T06:21:41.336Z";
		System.out.println("queuetime="+inst);
		Instant instant = Instant.now();//.plusMillis();
		System.out.println("currenttime="+instant);
		System.out.println(instant);
		Instant inst1=Instant.parse(inst);
		Duration duration = Duration.between(instant, inst1);
		//System.out.println("duration.abs()="+duration.abs());
		System.out.println("ChronoUnit.MILLIS.between(instant, inst1)="+ChronoUnit.MILLIS.between(inst1, instant));
		System.out.println("diff={}"+Duration.between(inst1, instant).toMillis());
		ChronoUnit.MILLIS.between(instant, inst1);
		
		 final SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
	        f.setTimeZone(TimeZone.getTimeZone("UTC"));
	        System.out.println(f.format(new Date()));
	        String utc=getCurrentUtcTimeJoda();
	        Instant inst2=Instant.parse(utc);
	        System.out.println("ChronoUnit.MILLIS.between(inst2, instant)="+ChronoUnit.MILLIS.between(instant, inst2));
	      
	}

	/*public static String getUTCdatetimeAsString() throws ParseException {
		final SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
		sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
		final String utcTime = sdf.format(new Date());
		System.out.println("mills=" + sdf.parse(utcTime).getTime());
		System.out.println("utcTime=" + utcTime);
		return utcTime;
	}

	public static String getUTCdatetimeAsMills() throws ParseException {
		final SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
		sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
		final String utcTime = sdf.format(new Date());
		System.out.println("mills=" + sdf.parse(utcTime).getTime());
		return utcTime;
	}*/
	
	private static String getCurrentUtcTimeJoda() throws ParseException {
	    DateTime now = new DateTime(); // Gives the default time zone.
	    DateTime dateTime = now.toDateTime(DateTimeZone.UTC ); // Converting default zone to UTC
	    System.out.println("latesttime in utc="+dateTime.toString());
	    Calendar.getInstance(TimeZone.getTimeZone("UTC")).getTime();
	    //Interval.
	    System.out.println(Calendar.getInstance(TimeZone.getTimeZone("UTC")).getTime());
	    return dateTime.toString();
	}
}

//2020-03-03T07:43:15.416Z
//ChronoUnit.MILLIS.between(instant, inst1)=4894080
//diff={}PT-1H-21M-34.08S
