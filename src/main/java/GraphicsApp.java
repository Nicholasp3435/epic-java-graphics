
import javafx.application.Platform;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class GraphicsApp extends Application {

    private Canvas canvas;
    private Label inLbl;
    private TextField inField;
    private HBox inBox;
    private Button inBtn;
    private VBox root;
    private Stage stage;
    private Scene scene;

    public GraphicsApp() {
	this.stage = null;
	this.scene = null;
	this.canvas = new Canvas(512, 256);
	this.root = new VBox();
	this.inBox = new HBox(5);
	this.inLbl = new Label("Enter any string and press enter");
	this.inField = new TextField("Nic");
	this.inBtn = new Button("Click me to continue");
    } // GraphicsApp

    @Override
    public void init() {
	System.out.println("init() called");
	connectNodes();
    } // init

    @Override
    public void start(Stage stage) {
        this.stage = stage;
        this.scene = new Scene(this.root);
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

    public void connectNodes() {
	this.inBox.getChildren().addAll(this.inLbl, this.inField, this.inBtn);

	this.root.getChildren().addAll(this.inBox, this.canvas);
    } // connectNodes
} // GraphicsApp
