package Lesson24;

public class Player {
    private int level;
    private int hp;

    public Player(int level, int hp) {
        this.level = level;
        this.hp = hp;
    }

    public void showStatus() {
        System.out.println("[Player] Level=" + level + ", HP=" + hp);
    }

    public void fight() {
        level += 1;
        hp -= 20;
    }

    public PlayerMemento save(String label) {
        return new PlayerMemento(level, hp, label, "Saved at Level " + level);
    }

    public void load(PlayerMemento memento) {
        this.level = memento.getLevel();
        this.hp = memento.getHp();
    }
}