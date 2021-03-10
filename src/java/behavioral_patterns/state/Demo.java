package behavioral_patterns.state;

import behavioral_patterns.state.ui.Player;
import behavioral_patterns.state.ui.UI;

/**
 * Demo class. Everything comes together here.
 * 初始化代码
 */
public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}