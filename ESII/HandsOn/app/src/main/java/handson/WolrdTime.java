package handson;

import org.joda.time.*;
import org.joda.time.format.DateTimeFormat;

public class WolrdTime {
  public String getTimeByCountry(String local) {

    // Gets a time zone instance for the specified time zone id.
    DateTimeZone zone = DateTimeZone.forID(local);

    /**
     * Factory to create a formatter from a pattern String. The pattern string is
     * described above in the class level javadoc.It is very similar to
     * SimpleDateFormat patterns.
     * 
     */
    org.joda.time.format.DateTimeFormatter fmt = DateTimeFormat.forPattern("HH:mm");

    /**
     * Constructs an instance set to the current system milisecond time in the
     * specified time zone.
     */
    DateTime dt = new DateTime(zone);

    return fmt.print(dt);
    // .format ("HH:mm")
  }

  public static void main(String[] args) {
    WolrdTime wt = new WolrdTime();
    System.out.println(wt.getTimeByCountry("America/Adak"));
  }

}
