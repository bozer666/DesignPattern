package creational_patterns.factory_method;

import creational_patterns.factory_method.factory.*;

public class Demo {

    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    /**
     * The concrete abstract_factory.factory is usually chosen depending on configuration or
     * environment options.
     *
     * 根据不同的平台创建对应的工厂
     */
    static void configure() {
        System.out.println(System.getProperty("os.name"));
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /**
     * All of the client code should work with factories and products through
     * abstract interfaces. This way it does not care which abstract_factory.factory it works
     * with and what kind of product it returns.
     *
     * 执行对应工厂创建产品
     */
    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
