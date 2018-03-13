package view.screens;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author adrianoabrantesdeandrade
 */
public class Screen1Controller implements Initializable, ControlledScreen {

    ScreensController myController;
    @FXML
    private Button Buttton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void headleButtonEvent(ActionEvent event) {
        myController.setScreen(ScreensFramework.screen2ID);
    }

    @Override
    public void setScreenParent(ScreensController screenPage) {
        myController = screenPage;
    }

}
