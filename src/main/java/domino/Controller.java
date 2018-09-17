package domino;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TableView personTable;
    @FXML
    private TableColumn<String, String> firstNameColumn;
    @FXML
    private TableColumn<String, String> lastNameColumn;

    @FXML
    public void initialize(){

    }
}
