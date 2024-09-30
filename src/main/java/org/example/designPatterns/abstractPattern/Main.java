package org.example.designPatterns.abstractPattern;

public class Main {

    private Button button;
    private CheckBox checkbox;

    public Main(UIFactory factory) {

        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void renderUI() {

        button.render();
        checkbox.render();
    }

    public static void main(String[] args) {

        UIFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("win")) {
            factory = new WindowsFactory();
        } else if (osName.contains("mac")) {
            factory = new MacOsFactory();
        } else {
            throw new UnsupportedOperationException("Unsupported operating system");
        }


        Main app = new Main(factory);
        app.renderUI();
    }
}

