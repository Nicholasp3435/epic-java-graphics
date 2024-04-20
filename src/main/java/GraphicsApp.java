
import javafx.application.Platform;
import javafx.application.Application;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;


public class GraphicsApp extends Application {

    private Label test;
    private Stage stage;
    private Scene scene;

    public GraphicsApp() {
	this.stage = null;
	this.scene = null;
	this.test = new Label("test");
    } // GraphicsApp

    @Override
    public void init() {
	System.out.println("init() called");
    } // init

    @Override
    public void start(Stage stage) {
        this.stage = stage;
        this.scene = new Scene(this.test);
        this.stage.setOnCloseRequest(event -> Platform.exit());
        this.stage.setTitle("test");
        this.stage.setScene(this.scene);
        this.stage.sizeToScene();
        this.stage.show();
        Platform.runLater(() -> this.stage.setResizable(false));
    } // start

    @Override
    public void stop() {
	System.out.println("stop() called");
    } // stop
} // GraphicsApp
