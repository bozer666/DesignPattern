package creative_mode.factory_method.factory;

import creative_mode.factory_method.buttons.*;

/**
 * 具体创建者 WindowsDialog
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
