import java.util.ArrayList;

import javafx.application.Application;
import javafx.stage.*;

public class Schedule extends Application
{
  private final String[] studyDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};


  public Schedule(){

  }

//  public String[] getStudyDays()
//  {
//    return studyDays;
//  }

  public void start(Stage primaryStage){
    ViewHandler view = new ViewHandler();
    view.startOn(primaryStage);
  }
}
