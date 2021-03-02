package creational_patterns.factory_method.factory;

import creational_patterns.creative_mode.factory_method.buttons.*;
import creational_patterns.factory_method.buttons.Button;
import creational_patterns.factory_method.buttons.WindowsButton;

/**
 * 具体创建者 WindowsDialog
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
