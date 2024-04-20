import javafx.application.Application;

import javafx.stage.Stage;

public class GraphicsApp extends Application {
    public GraphicsApp() {

    } // GraphicsApp

    @Override
    public void init() {
	System.out.println("init() called");
    } // init

    @Override
    public void start(Stage stage) {
	
    } // start

    @Override
    public void stop() {
	System.out.println("stop() called");
    } // stop
} // GraphicsApp
