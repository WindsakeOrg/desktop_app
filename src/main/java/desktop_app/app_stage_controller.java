package desktop_app;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

public class app_stage_controller {
    Rectangle2D bounds = Screen.getPrimary().getVisualBounds();

    @FXML
    public void exit_button_processing() {
        System.exit(0);
    }

    @FXML
    public void toSide_button_processing() throws IOException {
        int base_width=100;
        int base_height=30;
        Stage stage = App.getstage();
        Parent root = FXMLLoader.load(getClass().getResource("base.fxml"));
        stage.setScene(new Scene(root, base_width, base_height));
        double x = bounds.getMaxX() - 60;
        double y = bounds.getMaxY() / 1.5;
        stage.setWidth(base_width);
        stage.setHeight(base_height);
        stage.setX(x);
        stage.setY(y);
        stage.show();
    }

    @FXML
    public void search_button_processing() throws IOException {
        Stage primarystage = App.getstage();
        Parent root = FXMLLoader.load(getClass().getResource("search_stage.fxml"));
        primarystage.setScene(new Scene(root, 600, 400));
        double x = (bounds.getMaxX() / 2) - 300;
        double y = (bounds.getMaxY() / 2) - 200;
        primarystage.setX(x);
        primarystage.setY(y);
        primarystage.show();
    }

    @FXML
    public void mouse_listener_button_processing() throws IOException {
        Stage primarystage = App.getstage();
        Parent root = FXMLLoader.load(getClass().getResource("listener_stage.fxml"));
        primarystage.setScene(new Scene(root, 600, 400));
        double x = (bounds.getMaxX() / 2) - 300;
        double y = (bounds.getMaxY() / 2) - 200;
        primarystage.setX(x);
        primarystage.setY(y);
        primarystage.show();
    }
}
