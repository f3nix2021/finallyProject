package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class Controller {
    public Button button;

    public void click(ActionEvent actionEvent) {
        button.setText("Ты зачем на меня нажал");
    }
}
