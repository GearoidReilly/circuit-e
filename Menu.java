package circuit_e;

//Import classes for program, you will need the JRE system library and the JavaFX SDK
import javafx.application.*;
import javafx.collections.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import java.util.*;

//Extend the Application class
public class Menu extends Application{
	//Overrides the start function from Application
	@Override
	public void start(Stage primaryStage) throws Exception {
		//Create a new gridpane
		GridPane mainGridPane = new GridPane();
		
		//Set the horizontal and vertical gap
		mainGridPane.setHgap(10);
		mainGridPane.setVgap(10);
		//Set padding between elements
		mainGridPane.setPadding(new Insets(10,10,10,10));
		//Set the gridpane alignment to top center
		mainGridPane.setAlignment(Pos.TOP_CENTER);
		
		//Create an observable list of fruit
		ObservableList<Fruit> objectList = FXCollections.observableArrayList();
		//Create a new listview for fruit linking the object list to it
		ListView<Fruit> listViewOfFruit = new ListView<>(objectList);
		
		//Set the cell factory of the list view
		listViewOfFruit.setCellFactory(param ->{
			//Create a new List cell for fruit
			ListCell<Fruit> cell = new ListCell<Fruit>() {
				//Override the update item function
				@Override
				protected void updateItem(Fruit item, boolean empty) {
					//Call the update item from the parent class
					super.updateItem(item, empty);
					
					//Check if the list cell is empty or if the object is null
					if(empty || item == null) {
						//Set the text to be blank
						setText(null);
					}
					else {
						//Print out the item values in the list cell
						setText(item.getName() + ", " + item.getColour() + ", " + item.getIdCode());
					}
				}				
			};
			//Add a click event listener
			cell.setOnMouseClicked(e ->{
				if(!cell.isEmpty()) {
					//Print the item name if the cell is not empty
					System.out.println(cell.getItem().getName());
				}
			});
			//Return the cell
			return cell;
		});
		
		//Create array list of fruit
		List<Fruit> fruits = new ArrayList<Fruit>();
		
		//Add fruit to the array list
		fruits.add(new Fruit("Apple","Red",1));
		fruits.add(new Fruit("Orange","Orange",2));
		fruits.add(new Fruit("Lemon","Yellow",3));
		fruits.add(new Fruit("Lime","Green",4));
		
		//Add arraylist objects to the list view
		listViewOfFruit.getItems().addAll(fruits);
		
		//Add the listview to the gridpane
		mainGridPane.add(listViewOfFruit, 0, 0, 3, 1);
		
		//Create a new scene setting the content to be the gridpane, define the height and width of the window
		Scene mainScene = new Scene(mainGridPane,500,400);
		
		//Set the stage title
		primaryStage.setTitle("JavaFX List Object Test");
		//Set the stage scene
		primaryStage.setScene(mainScene);
		//Show the stage content
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		//Launch the javafx app
		launch();
	}
}
