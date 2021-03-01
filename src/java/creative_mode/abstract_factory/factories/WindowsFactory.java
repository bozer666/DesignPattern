package creative_mode.abstract_factory.factories;

import creative_mode.abstract_factory.buttons.*;
import creative_mode.abstract_factory.checkboxes.Checkbox;
import creative_mode.abstract_factory.checkboxes.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
