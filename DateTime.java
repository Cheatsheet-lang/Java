import java.util.Date;

// Date and Time in Java

public class DateTime {
    public static void main(String[] args) {
        Date date = new Date();
        Date date2 = new Date(2020, 10, 10);
        Date date3 = new Date(2030, 8, 12);

        // Operations on Date
        System.out.println("Date: " + date.toString());
        System.out.println("Date2: " + date2.toString());

        // Comparing Dates
        System.out.println("Date2 is after Date: " + date2.after(date));
        System.out.println("Date2 is before Date: " + date2.before(date));

        // Getting the time elapsed
        System.out.println("Time elapsed between Date2 and Date: " + date2.getTime());
        System.out.println("Time elapsed between Date3 and Date: " + date3.getTime());

        // Setting the time
        long millisec = 302000000;
        date.setTime(millisec);
        System.out.println(date.toString());
    }
}