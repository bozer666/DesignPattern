package creative_mode.abstract_factory.app;

import creative_mode.abstract_factory.buttons.Button;
import creative_mode.abstract_factory.checkboxes.Checkbox;
import creative_mode.abstract_factory.factories.GUIFactory;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {

    private final Button button;
    private final Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}