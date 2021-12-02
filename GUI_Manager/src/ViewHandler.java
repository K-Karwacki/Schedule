import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

import javafx.event.ActionEvent;

public class ViewHandler
{
  private Scene currentScene;
  private Stage primaryStage;
  public int a = 1;
  //help

  public ViewHandler(){
    this.currentScene = new Scene(new Region());
  }

  public void startOn(Stage primaryStage){
    this.primaryStage = primaryStage;
    openView();
  }

  public void openView(){
    Region root = loadGUIView("HomePage.fxml");
    currentScene.setRoot(root);
    String title = "";
    
    if(root.getUserData() != null){
      title += root.getUserData();
    }

//    primaryStage.setResizable(false);
    primaryStage.setTitle(title);
    primaryStage.setScene(currentScene);
    primaryStage.setWidth(root.getPrefWidth());
    primaryStage.setHeight(root.getPrefHeight());
    primaryStage.show();
  }

  public Region loadGUIView(String fxmlFile){
    Region root = null;
    try{
      FXMLLoader loader = new FXMLLoader();
      loader.setLocation(getClass().getResource(fxmlFile));
      root = loader.load();
    }catch (Exception e){
      e.printStackTrace();
    }
    return root;
  }

  public void loadCreateScheduleView(ActionEvent event)
  {
    Region parent = loadGUIView("CreateSchedulePage.fxml");
    Scene scheduleScene = new Scene(parent);

    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene(scheduleScene);
    window.show();
  }
}
