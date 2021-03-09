package behavioral_patterns.observer;

/**
 * 初始化代码
 */

import behavioral_patterns.observer.editor.Editor;
import behavioral_patterns.observer.listeners.EmailNotificationListener;
import behavioral_patterns.observer.listeners.LogOpenListener;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}