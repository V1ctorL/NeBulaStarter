/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nebulastart;

import java.lang.String;
import java.util.List;
import javafx.application.Application;
import javafx.application.HostServices;
import javafx.application.Platform;
import javafx.beans.InvalidationListener;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author 85466
 */
public class NebulaStart extends Application {
    
    public static void main(String[] args) {
        
        launch(args);
        
    }
    
    @Override
    public void init() throws Exception {
        
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        
        Label label1 = new Label(Ping.ping1());
        Label label2 = new Label(Ping.ping2());
        Label label3 = new Label(Ping.ping3());
        Label label4 = new Label(Ping.ping4());
        Label label5 = new Label(Ping.ping5());
        
        Hyperlink link1 = new Hyperlink("http://172.20.10.6:8080/NeBulaWebClient", new Button("节点1"));
        Hyperlink link2 = new Hyperlink("http://172.20.10.5:8080/NeBulaWebClient", new Button("节点2"));
        Hyperlink link3 = new Hyperlink("http://172.20.10.3:8080/NeBulaWebClient", new Button("节点3"));
        Hyperlink link4 = new Hyperlink("http://172.20.10.7:8080/NeBulaWebClient", new Button("节点4"));
        Hyperlink link5 = new Hyperlink("http://172.20.10.8:8080/NeBulaWebClient", new Button("节点5"));
        
        label1.setLayoutX(317);
        label1.setLayoutY(22);
        
        label2.setLayoutX(317);
        label2.setLayoutY(59);
        
        label3.setLayoutX(317);
        label3.setLayoutY(96);
        
        label4.setLayoutX(317);
        label4.setLayoutY(133);
        
        label5.setLayoutX(317);
        label5.setLayoutY(170);
        
        link1.setLayoutX(15);
        link1.setLayoutY(15);
        
        link2.setLayoutX(15);
        link2.setLayoutY(52);
        
        link3.setLayoutX(15);
        link3.setLayoutY(89);
        
        link4.setLayoutX(15);
        link4.setLayoutY(126);
        
        link5.setLayoutX(15);
        link5.setLayoutY(163);
        
        AnchorPane ap1 = new AnchorPane();
        
        ap1.setStyle("-fx-background-color:#98FB98");
        
        ap1.getChildren().addAll(label1,label2,label3,label4,label5,link1,link2,link3,link4,link5);
        
        Scene scene1 = new Scene(ap1);
        
        stage.setScene(scene1);
        
        stage.setWidth(400);
        
        stage.setHeight(242);
        
        stage.setResizable(false);
        
        stage.setTitle("NebulaStart");
        
        stage.getIcons().add(new Image("/icon/Nebula.png"));
        
        stage.show();
        
        link1.setOnAction(new EventHandler<ActionEvent>(){
            
            @Override
            public void handle(ActionEvent event1) {
                
                HostServices host1 = NebulaStart.this.getHostServices();
                
                host1.showDocument(link1.getText());
                
            }
            
        });
        
        link2.setOnAction(new EventHandler<ActionEvent>(){
            
            @Override
            public void handle(ActionEvent event2) {
                
                HostServices host2 = NebulaStart.this.getHostServices();
                
                host2.showDocument(link2.getText());
                
            }
            
        });
        
        link3.setOnAction(new EventHandler<ActionEvent>(){
            
            @Override
            public void handle(ActionEvent event3) {
                
                HostServices host3 = NebulaStart.this.getHostServices();
                
                host3.showDocument(link3.getText());
                
            }
            
        });
        
        link4.setOnAction(new EventHandler<ActionEvent>(){
            
            @Override
            public void handle(ActionEvent event4) {
                
                HostServices host4 = NebulaStart.this.getHostServices();
                
                host4.showDocument(link4.getText());
                
            }
            
        });
        
        link5.setOnAction(new EventHandler<ActionEvent>(){
            
            @Override
            public void handle(ActionEvent event5) {
                
                HostServices host5 = NebulaStart.this.getHostServices();
                
                host5.showDocument(link5.getText());
                
            }
            
        });
        
        
    }
    
    @Override
    public void stop() throws Exception {
        
    }
    
}
