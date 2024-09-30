package org.example.designPatterns.abstractPattern;

public class MacOsFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new MacOsCheckbox();
    }
}
