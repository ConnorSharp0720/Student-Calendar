import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class LeftPane extends BorderPane {
	
	final private int WIDTH = 170;
	
	final private Label paneTitle = new Label("Categories");
	private HBox addBar;
	private VBox checkboxList;
	private AnchorPane titleBar;
	private ActionHandler actionHandler;
	
	private AnchorPane bottomBar;
	private Button addCat;
	
	
	public LeftPane() {
		
		actionHandler = new ActionHandler();
	
		paneTitle.setId("title-text");
		
		this.setPadding(new Insets(10, 5, 10, 5));
		this.setPrefWidth(WIDTH);
		this.setPrefHeight(600);
		
		buildLeftPane();
	}
	
	public void buildLeftPane() {
		buildTitleBar();
		buildCheckboxList();
		buildBottomBar();
		
		VBox top = new VBox();
		top.getChildren().addAll(titleBar, checkboxList);
		
		this.setTop(top);
		this.setBottom(bottomBar);
	}
	
	public Pane buildTitleBar() {
		titleBar = new AnchorPane();
		
		/*
		addCat = new Button();
		addCat.setGraphic(Resources.createImage("add.png", 15, 15));
		*/
		
		titleBar.getChildren().addAll(paneTitle);
		
		AnchorPane.setLeftAnchor(paneTitle, 5.0);
		AnchorPane.setTopAnchor(paneTitle, 10.0);
		
		titleBar.setPrefWidth(WIDTH);
		
		return titleBar;
	}
	
	private void buildCheckboxList() { //TODO:MODIFY TO FIT CATEGORIES BETTER AND BREAKOUT
		
		checkboxList = new VBox(10);
		checkboxList.setPadding(new Insets(20,0,0,8));
		checkboxList.setAlignment(Pos.CENTER_LEFT);
		checkboxList.setPrefWidth(WIDTH);
		
		List<CheckBox> checkboxes = new ArrayList<CheckBox>();
		List<Color> checkboxColors = new ArrayList<Color>(); //TODO:Implement
		
	    String labels[] = {"School", "Work", "Assignments", "Birthdays", "US Holidays", "Large Projects"};
	    
	    for (int i = 0; i < labels.length; i++) {
	        CheckBox checkbox = new CheckBox(labels[i]);
	        //TODO:ADD COLOR FUNCTIONALITY
	        
	        checkboxes.add(checkbox); //for further use you add it to the list
	        
	    }
	    
	    for(CheckBox box: checkboxes) {
	    	checkboxList.getChildren().add(box);
	    }
	}
	
	private void buildBottomBar() {
		bottomBar = new AnchorPane();
		
		addCat = new Button();
		//addCat.setGraphic(Resources.createImage("add.png", 15, 15));
		addCat.setId("add-button");
		
		bottomBar.getChildren().add(addCat);
		
		AnchorPane.setRightAnchor(addCat, 10.0);
		AnchorPane.setBottomAnchor(addCat, 0.0);
	}

	
	private final class ActionHandler implements EventHandler<ActionEvent> {
		public void handle(ActionEvent e) {
		}
	}

}
