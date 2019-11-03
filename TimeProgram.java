package com.my.pro;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeProgram {
	static DateTimeFormatter etFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy  HH:mma 'ET'");
	static DateTimeFormatter globalFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy  HH:mma z");

    static ZoneId istZoneId = ZoneId.of("Asia/Kolkata");
    static ZoneId etZoneId = ZoneId.of("America/New_York");

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDateTime currentDateTime = LocalDateTime.now();
        ZonedDateTime currentISTime = currentDateTime.atZone(istZoneId);                //India Time
        ZonedDateTime currentETime = currentISTime.withZoneSameInstant(etZoneId);       //ET Time
        System.out.println("Current Indian Time");
        System.out.println(globalFormat.format(currentISTime));
        System.out.println("Current EST Time");
        System.out.println(etFormat.format(currentETime));
        
        ZonedDateTime before_hour_EST= currentETime.minusHours(1);
        System.out.println("before est hour");
        System.out.println( etFormat.format(before_hour_EST));
        
	    String Querytotime=etFormat.format(currentETime).substring(0,14)+":00:00";
	    String Queryfromtime=etFormat.format(before_hour_EST).substring(0,14)+":00:00";
	     
	        System.out.println(Queryfromtime);
	        
	        System.out.println(Querytotime);
	        
	      /*  ZonedDateTime next_hour= currentISTime.plusHours(1);
	        String nexth=etFormat.format(next_hour).substring(13, 16);
	        
	       
	       
	        String time = etFormat.format(currentETime).substring(13,16);
	        System.out.println(time+":00");
	        System.out.println(nexth+":00");*/
	        
	}

}
