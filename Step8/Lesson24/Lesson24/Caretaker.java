package Lesson24;

import java.util.Stack;
import java.util.Map;
import java.util.HashMap;

public class Caretaker {
    private Stack<PlayerMemento> history = new Stack<>();
    private Map<String, PlayerMemento> labelMap = new HashMap<>();

    // Save with a label; Player creates the Memento with its internal comment
    public void save(Player player, String label) {
        PlayerMemento memento = player.save(label);  // no comment here
        history.push(memento);
        labelMap.put(label, memento);
        System.out.println("Saving the current state... (Label: \"" + label + "\")");
    }

    // Undo the last saved state
    public void undo(Player player) {
        if (!history.isEmpty()) {
            PlayerMemento memento = history.pop();
            System.out.println("Restoring the last saved state...");
            player.load(memento);
        } else {
            System.out.println("No more saved states!");
        }
    }

    // Load by label
    public void loadByLabel(Player player, String label) {
        PlayerMemento memento = labelMap.get(label);
        if (memento != null) {
            System.out.println("Restoring the state labeled: \"" + label + "\"");
            player.load(memento);
        } else {
            System.out.println("No save found with label: " + label);
        }
    }

    // Show saved labels with comments (for convenience)
    public void showSavedLabels() {
        System.out.println("Saved States:");
        for (Map.Entry<String, PlayerMemento> entry : labelMap.entrySet()) {
            PlayerMemento m = entry.getValue();
            System.out.println("- " + entry.getKey() + ": Level=" + m.getLevel() + ", HP=" + m.getHp() + ", Comment=" + m.getComment());
        }
    }
}