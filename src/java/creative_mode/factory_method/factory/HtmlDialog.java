package creative_mode.factory_method.factory;

import creative_mode.factory_method.buttons.Button;
import creative_mode.factory_method.buttons.HtmlButton;

/**
 * 具体创建者HtmlDialog
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
