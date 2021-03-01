package creative_mode.abstract_factory.factories;

import creative_mode.abstract_factory.buttons.Button;
import creative_mode.abstract_factory.checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}