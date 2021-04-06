import javafx.geometry.NodeOrientation;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class CenterPane extends VBox {

	private ListPane listPane = new ListPane();
	private CalendarPane calPane = new CalendarPane();
	public CenterPane() 
	{
		
		HBox controls = new HBox();
		controls.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
		Button addEvent = new Button("+");
		controls.getChildren().add(addEvent);
		
		TabPane tabView = new TabPane();
		Tab list = new Tab("List");
		list.setClosable(false);
		list.setContent(listPane);
		Tab cal = new Tab("Calendar");
		cal.setClosable(false);
		cal.setContent(calPane);
		tabView.getTabs().add(list);
		tabView.getTabs().add(cal);
		
		this.getChildren().addAll(controls, tabView);
	}

}
