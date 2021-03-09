package behavioral_patterns.memento.commands;

/**
 * 基础命令类
 */
public interface Command {
    String getName();
    void execute();
}