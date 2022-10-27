package handson;

import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.joda.time.*;
import org.joda.time.format.DateTimeFormat;

public class WolrdTime {
    public String getTimeByCountry(String local) {
       // Calendar calendar = Calendar.getInstance();
       // calendar.setTime(new Date());

       
        DateTimeZone zone = DateTimeZone.forID(local);

       // SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");

       // sdf.setTimeZone(TimeZone.getTimeZone(zone.toString()));

       org.joda.time.format.DateTimeFormatter fmt = DateTimeFormat.forPattern("HH:mm");
       DateTime dt = new DateTime(zone);
       
       return dt.toString("HH:mm");
        // .format ("HH:mm")
    }

    public static void main(String[] args) {
      WolrdTime wt = new WolrdTime();
        System.out.println(wt.getTimeByCountry("America/Adak"));
    }

}
