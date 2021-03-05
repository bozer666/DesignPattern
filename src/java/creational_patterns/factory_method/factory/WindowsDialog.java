package creational_patterns.factory_method.factory;

import creational_patterns.factory_method.buttons.*;

/**
 * 具体创建者 WindowsDialog
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
