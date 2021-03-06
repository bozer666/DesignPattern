package behavioral_patterns.mediator.mediator;

import behavioral_patterns.mediator.components.Component;

import javax.swing.*;

/**
 * Common mediator interface.
 * 定义通用的中介者接口
 */
public interface Mediator {
    void addNewNote(Note note);
    void deleteNote();
    void getInfoFromList(Note note);
    void saveChanges();
    void markNote();
    void clear();
    void sendToFilter(ListModel listModel);
    void setElementsList(ListModel list);
    void registerComponent(Component component);
    void hideElements(boolean flag);
    void createGUI();
}