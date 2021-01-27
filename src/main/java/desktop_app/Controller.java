package desktop_app;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class Controller {
    Rectangle2D bounds = Screen.getPrimary().getVisualBounds();

    private void set_primarystage(String fxml_name) throws IOException {
        int app_stage_width = 600;
        int app_stage_height = 400;
        Stage primarystage = App.getstage();
        primarystage.hide();
        Parent root = FXMLLoader.load(getClass().getResource(fxml_name));
        primarystage.setScene(new Scene(root, app_stage_width, app_stage_height));
        double x = (bounds.getMaxX() / 2) - 300;
        double y = (bounds.getMaxY() / 2) - 200;
        primarystage.setWidth(app_stage_width);
        primarystage.setHeight(app_stage_height);
        primarystage.setX(x);
        primarystage.setY(y);
        primarystage.show();
    }

    private void set_stage_search() {
        Stage primarystage = App.getstage();
        primarystage.setScene(search_controller.getscene());
        double x = (bounds.getMaxX() / 2) - 640;
        double y = (bounds.getMaxY() / 2) - 384;
        primarystage.setWidth(1280);
        primarystage.setHeight(768);
        primarystage.setX(x);
        primarystage.setY(y);
        primarystage.show();

    }

    private void set_stage_listener() {
        Stage primarystage = App.getstage();
        primarystage.setScene(listener_controller.getscene());
        double x = (bounds.getMaxX() / 2) - 640;
        double y = (bounds.getMaxY() / 2) - 384;
        primarystage.setWidth(1280);
        primarystage.setHeight(768);
        primarystage.setX(x);
        primarystage.setY(y);
        primarystage.show();
    }

    @FXML
    public void open_button_processing() throws IOException {
        System.out.println("button pressed");
        if (App.Is_search_on) {
            set_stage_search();
        } else if (App.Is_listening_on) {
            set_stage_listener();
        } else {
            set_primarystage("app_stage.fxml");
        }
    }

    @FXML
    public void mouse_entered() {
        Stage primarystage = App.getstage();
        double x = bounds.getMaxX() - 80;
        primarystage.setX(x);
    }

    @FXML
    public void mouse_left() {
        Stage primarystage = App.getstage();
        double x = bounds.getMaxX() - 60;
        primarystage.setX(x);
    }

    @FXML
    public void dragging() {
        Stage stage = App.getstage();
        Scene thescene = App.getscene();
        Point p = MouseInfo.getPointerInfo().getLocation();
        stage.setY(p.y);

    }


}
