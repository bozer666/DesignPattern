package creational_patterns.factory_method.factory;

import creational_patterns.factory_method.buttons.Button;

/**
 * 基础创建者
 */
public abstract class Dialog {

    public void renderWindow() {
        // ... other code ...
        Button okButton = createButton();
        okButton.render();
    }

    /**
     * Subclasses will override this method in order to create specific button
     * objects.
     */
    public abstract Button createButton();
}
