
import java.util.ArrayList;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

public class RightPane extends VBox {

	final private int WIDTH = 250;
	
	final private Label paneTitle = new Label("Due Dates");
	private HBox addBar;
	private AnchorPane titleBar;
	private ActionHandler actionHandler;
	
	private VBox dueDatesList;
	private Button addCat;
	
	public RightPane() {
		actionHandler = new ActionHandler();
		this.setSpacing(20);
		
		paneTitle.setId("title-text");
		
		this.setPadding(new Insets(10, 5, 10, 5));
		this.setPrefWidth(WIDTH);
		this.setPrefHeight(600);
		
		buildRightPane();
	}
	
	public void buildRightPane() {
		buildTitleBar();
		buildDueDatesList();
		
		VBox title = new VBox();
		title.setPadding(new Insets(0,0,10,0));
		
		title.getChildren().add(titleBar);
		
		this.getChildren().addAll(titleBar, dueDatesList);
	}
	
	
	private void buildTitleBar() {
		titleBar = new AnchorPane();
		
		titleBar.getChildren().addAll(paneTitle);
		
		AnchorPane.setLeftAnchor(paneTitle, 5.0);
		AnchorPane.setTopAnchor(paneTitle, 10.0);
		
		titleBar.setPrefWidth(WIDTH);
	}
	
	
	private void buildDueDatesList() {
		dueDatesList = new VBox(5);
		dueDatesList.setPadding(new Insets(20,0,0,8));
		dueDatesList.setAlignment(Pos.CENTER_LEFT);
		dueDatesList.setPrefWidth(WIDTH);
		
		//List<Events> events = new ArrayList<Events>();
		List<TextFlow> dueButtons = new ArrayList<TextFlow>();
		
		String labels[] = {"School", "Work", "Assignments", "Birthdays", "US Holidays", "Large Projects"}; //PLACEHOLDER
		
		for(int i = 0; i < labels.length; ++i) {
			
			TextFlow flow = new TextFlow();

			Hyperlink text1 = new Hyperlink(labels[i]);
			text1.setId("due-date-title");

			Text text2 = new Text("\n  Tag\n  Due Date");
			text2.setId("due-dates");
		
			flow.getChildren().addAll(text1, text2);
			
			dueButtons.add(flow);
		}
		
		for(TextFlow button: dueButtons) {
			dueDatesList.getChildren().add(button);
	    }
		
	}
	
	
	private final class ActionHandler implements EventHandler<ActionEvent> {
		public void handle(ActionEvent e) {
		}
	}
}
