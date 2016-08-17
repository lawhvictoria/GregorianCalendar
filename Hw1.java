import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.*;

public class Hw1 {

    public static void main(String[] args) {
    //GregorianCalendar cal = new GregorianCalendar(); // Today’s date
    Calendar cal = new GregorianCalendar();
    String[] strDays = new String[] {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    //GregorianCalendar eBday = new GregorianCalendar(1919, Calendar.APRIL, 9);
    Calendar eBday = new GregorianCalendar(2015, Calendar.OCTOBER, 30);
    //Use the values Calendar.JANUARY . . . Calendar.DECEMBER to specify the month.
    //The add method can be used to add a number of days to a GregorianCalendar object:
    //--cal.add(Calendar.MONTH, 1);
    cal.add(Calendar.DAY_OF_MONTH, 100);     // Now cal is a hundred days from today
    //This is a mutator method—it changes the cal object.
    //The get method can be used to query a given GregorianCalendar object:
    int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
    int month = cal.get(Calendar.MONTH);
    int year = cal.get(Calendar.YEAR);
    int weekday = cal.get(Calendar.DAY_OF_WEEK);
    // 1 is Sunday, 2 is Monday, . . . , 7 is Saturday
    System.out.println("Calendar's Year: " + cal.get(Calendar.YEAR));
    System.out.println("Calendar's Day: " + cal.get(Calendar.DATE));
    System.out.println("calendar's day_of_week:" + cal.get(Calendar.DAY_OF_WEEK));
    System.out.println("calendar month:" + cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH ) );
    System.out.println("bday month:" + eBday.getDisplayName(GregorianCalendar.MONTH, Calendar.LONG, Locale.ENGLISH ) );
    System.out.println("eBday Calendar's Day: " + eBday.get(Calendar.DATE));
    System.out.println("Calendar week day:" + strDays[cal.get(Calendar.DAY_OF_WEEK) - 1]); 
    
    System.out.println("The date and weekday that is 100 days from today: " + strDays[cal.get(Calendar.DAY_OF_WEEK) - 1] + ", " + cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH) + " " + cal.get(Calendar.DATE) + ", " + cal.get(Calendar.YEAR));
    System.out.println("The weekday of my birthday: " + strDays[eBday.get(Calendar.DAY_OF_WEEK) - 1]);
    
    eBday.add(Calendar.DAY_OF_MONTH, 10000);
    
    System.out.println("The date that is 10,000 days from my birthday: " + eBday.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH) + " " + eBday.get(Calendar.DATE) + ", " + eBday.get(Calendar.YEAR));
    }
    
}
