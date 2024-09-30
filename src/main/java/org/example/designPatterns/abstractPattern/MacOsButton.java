package org.example.designPatterns.abstractPattern;

public class MacOsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering MacOS Button");
    }
}
