package fr.volchan.learnjava;

public class Demo {
    public static void main(String[] args) {
//        Player p1 = new Player();
//        System.out.println("Player One name: " + p1.getHandleName());
//        p1.setNameAndLevel("Volchan", 5);
//        System.out.println("Player One name: " + p1.getHandleName());
//        System.out.println("Player One level: " + p1.getLevel());
//        p1.setNameAndLevel("Vol", 15);
//        System.out.println("Player One name: " + p1.getHandleName());
//        System.out.println("Player One level: " + p1.getLevel());
//        System.out.println("Player One lives: " + p1.getLives());
//        System.out.println("Player One weapon: " + p1.getWeapon().getName());
//
//        Weapon myAxe = new Weapon("Goldshine Axe", 15, 50);
//        p1.setWeapon(myAxe);
//        System.out.println("Player One weapon: " + p1.getWeapon().getName());
//
//        Loot redPotion = new Loot("Red Potion", LootType.POTION, 7);
//        p1.pickUpLoot(redPotion);
//
//        p1.pickUpLoot(new Loot("Chest Armor +3", LootType.ARMOR, 80));
//        p1.pickUpLoot(new Loot("Ring of Protection +2", LootType.RING, 40));
//        p1.pickUpLoot(new Loot("Invisibility Potion", LootType.POTION, 35));
//
//        p1.showInventory();
//
//        Loot bluePotion = new Loot("Blue Potion", LootType.POTION, 6);
//        boolean wasDeleted = p1.dropLoot(bluePotion);
//        System.out.println(wasDeleted);
//        p1.showInventory();
//
//        boolean redPotionDeleted = p1.dropLoot(redPotion);
//        System.out.println(redPotionDeleted);
//        p1.showInventory();

//        Player p2 = new Player("Toto", new Weapon("Wood stick", 1, 200));
//        System.out.println("Player Two name: " + p2.getHandleName());
//        p2.setLevel(5);
//        System.out.println("Player Two level: " + p2.getLevel());
//        System.out.println("Player Two lives: " + p2.getLives());
//        System.out.println("Player Two weapon: " + p2.getWeapon().getName());
//
//        Player p3 = new Player("Tata", 9, new Weapon("Wooden fork", 2, 500));
//        System.out.println("Player Three name: " + p3.getHandleName());
//        System.out.println("Player Three level: " + p3.getLevel());
//        System.out.println("Player Three lives: " + p3.getLives());
//        System.out.println("Player Three weapon: " + p3.getWeapon().getName());
//        Enemy enemy = new Enemy("Dummy", 10, 3);
//        enemy.showInfo();
//        enemy.takeDamage(3);
//        enemy.showInfo();
//        enemy.takeDamage(7);
//        enemy.showInfo();
        Troll troll = new Troll("Troll");
        troll.showInfo();
        troll.takeDamage(30);

        Vampire vlad = new Vampire("Vald");
        vlad.showInfo();
        vlad.takeDamage(8);
        vlad.showInfo();

        VampireKing dracula = new VampireKing("Dracula");
        dracula.showInfo();
        dracula.takeDamage(40);
        dracula.showInfo();
    }
}
