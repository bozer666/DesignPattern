package creational_patterns.factory_method.factory;

import creational_patterns.factory_method.buttons.Button;
import creational_patterns.factory_method.buttons.HtmlButton;

/**
 * 具体创建者HtmlDialog
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
