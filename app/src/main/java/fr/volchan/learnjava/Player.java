package fr.volchan.learnjava;

public class Player {
    private String handleName;
    private int lives;
    private int level;
    private int score;

    public Player() {
        this("Unknown player");
    }

    public Player(String handle) {
        this(handle, 1);
    }

    public Player(String handle, int startingLevel) {
        setHandleName(handle);
        setLevel(3);
        setLevel(startingLevel);
        setScore(0);
    }

    public String getHandleName() {
        return handleName;
    }

    public int getLevel() {
        return level;
    }

    public int getLives() {
        return lives;
    }

    public int getScore() {
        return score;
    }

    public void setHandleName(String handle) {
        if (handle.length() < 4) {
            System.out.println("The name " + handle + " is too short, must be 4 characters or more!");
            return;
        }
        this.handleName = handle;
    }

    public void setNameAndLevel(String name, int level) {
        setHandleName(name);
        setLevel(level);
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
