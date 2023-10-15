import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Window window = new Window("App", 960, 640);
        window.addLayer(new ExampleLayer("Layer", Color.GRAY));
        window.addLayer(new ExampleLayer("Layer", Color.RED));
    }
}