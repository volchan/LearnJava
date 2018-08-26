package fr.volchan.learnjava;

import java.util.ArrayList;

public class Player {
    private String handleName;
    private int lives;
    private int level;
    private int score;
    private Weapon weapon;
    private ArrayList<Loot> inventory;

    public Player() {
        this("Unknown player");
    }

    public Player(String handle) {
        this(handle, 1);
    }

    public Player(String handle, int startingLevel) {
        this(handle, startingLevel, new Weapon("Sword", 10, 20));
    }

    public Player(String handle, Weapon weapon) {
        this(handle, 1, weapon);
    }

    public Player(String handle, int startingLevel, Weapon weapon) {
        setHandleName(handle);
        setLives(3);
        setLevel(startingLevel);
        setScore(0);
        setWeapon(weapon);
        this.inventory = new ArrayList<>();
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

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public ArrayList<Loot> getInventory() {
        return inventory;
    }

//    public void setInventory(ArrayList<Loot> inventory) {
//        this.inventory = inventory;
//    }

    public void pickUpLoot(Loot newLoot) {
        inventory.add(newLoot);
    }

    public boolean dropLoot(Loot loot) {
        if (this.inventory.contains(loot)) {
            inventory.remove(loot);
            return true;
        }
        return false;
    }

    public void showInventory() {
        System.out.println("===== " + this.getHandleName() + "'s inventory =====");
        for(Loot item : this.inventory) {
            System.out.println(item.getName());
        }
        System.out.println("===============================");
    }
}
