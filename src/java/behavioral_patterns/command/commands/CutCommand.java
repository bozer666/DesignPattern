package behavioral_patterns.command.commands;

/**
 * 将文字剪切到剪贴板
 */
import behavioral_patterns.command.editor.Editor;

import java.util.Objects;

public class CutCommand extends Command {

    public CutCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (Objects.isNull(editor.textField.getSelectedText())) return false;

        backup();
        String source = editor.textField.getText();
        editor.clipboard = editor.textField.getSelectedText();
        editor.textField.setText(cutString(source));
        return true;
    }

    private String cutString(String source) {
        String start = source.substring(0, editor.textField.getSelectionStart());
        String end = source.substring(editor.textField.getSelectionEnd());
        return start + end;
    }
}