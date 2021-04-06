import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application
{
	private ArrayList<Category> categoryList = new ArrayList<Category>();

	private LeftPane leftPane = new LeftPane();
	private CenterPane centerPane = new CenterPane();
	private RightPane rightPane = new RightPane();
	private String currentFile;

	public void start(Stage primaryStage) throws Exception
	{
		VBox root = new VBox();

		MenuBar menuBar = createMenuBar();
		SplitPane mainView = new SplitPane();
		mainView.getItems().add(leftPane);
		mainView.getItems().add(centerPane);
		mainView.getItems().add(rightPane);
		
		root.getChildren().add(menuBar);
		root.getChildren().add(mainView);
		Scene scene = new Scene(root, 800, 800);
		scene.getStylesheets().add("style.css"); 

		primaryStage.setScene(scene);
		primaryStage.show();
	}


	private void writeToFile(String filePath)
	{

	}

	private void readFromFile(String filePath)
	{

	}

	private void exportToFile(String filePath)
	{

	}

	private void importFromFile(String filePath)
	{

	}

	//    private void addCategory(Category category)
	//    {
		//        categoryList.add(category);
		//    }

	private ArrayList<Category> getCategories(String filePath)
	{
		return categoryList;
	}

	private MenuBar createMenuBar()
	{
		MenuBar menuBar = new MenuBar();
		Menu file = new Menu("File");
		MenuItem newf = new MenuItem("New");
		MenuItem open = new MenuItem("Open...");
		Menu recent = new Menu("Open Recent");
		
		MenuItem save = new MenuItem("Save");
		MenuItem saveAs = new MenuItem("Save As");
		
		MenuItem impor = new MenuItem("Import");
		MenuItem export = new MenuItem("Export");
		
		MenuItem quit = new MenuItem("Quit");

		file.getItems().addAll(newf, open, recent);
		file.getItems().add(new SeparatorMenuItem());
		file.getItems().addAll(save, saveAs);
		file.getItems().add(new SeparatorMenuItem());
		file.getItems().addAll(impor, export);
		file.getItems().add(new SeparatorMenuItem());
		file.getItems().add(quit);
		
		menuBar.getMenus().add(file);
		
		return menuBar;
	}

	public static void main(String args[]) 
	{
		launch(args);
	}


}
