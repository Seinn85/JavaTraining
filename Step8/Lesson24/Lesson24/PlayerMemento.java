package Lesson24;

public class PlayerMemento {
    private final int level;
    private final int hp;
    private final String label;
    private final String comment;

    public PlayerMemento(int level, int hp, String label, String comment) {
        this.level = level;
        this.hp = hp;
        this.label = label;
        this.comment = comment;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public String getLabel() {
        return label;
    }

    public String getComment() {
        return comment;
    }
}