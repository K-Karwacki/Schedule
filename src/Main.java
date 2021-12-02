import javafx.application.Application;

import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main
{
  public static void main(String[] args)
  {
    Schedule newSchedule = new Schedule();

    System.out.println("Hello everyone");
    System.out.println("This is shit!");
    System.out.println("This is shit!");
    System.out.println("This is shit!");
    System.out.println("This is shit!");
    System.out.println("This is shit!");
    System.out.println("This is shit!");
    System.out.println("Help");
    System.out.println("this is alex");
    SadLife();
    SadLife();
    SadLife();
    SadLife();


//    Date date = new Date();
//    Calendar newC = new GregorianCalendar();
//    newC.setTime(date);
////    System.out.println(newC.get(Calendar.WEEK_OF_YEAR));
//    System.out.println(newC.get(Calendar.DATE));

    Application.launch(Schedule.class);
  }
  public static void SadLife(){
    System.out.println("Wtf!");
  }
}
