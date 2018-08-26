package fr.volchan.learnjava;

public class Demo {
    public static void main(String[] args) {
        Player p1 = new Player();
        System.out.println("Player One name: " + p1.getHandleName());
        p1.setNameAndLevel("Volchan", 5);
        System.out.println("Player One name: " + p1.getHandleName());
        System.out.println("Player One level: " + p1.getLevel());
        p1.setNameAndLevel("Vol", 15);
        System.out.println("Player One name: " + p1.getHandleName());
        System.out.println("Player One level: " + p1.getLevel());
        System.out.println("Player One lives: " + p1.getLives());
        System.out.println("Player One weapon: " + p1.getWeapon().getName());

        Weapon myAxe = new Weapon("Goldshine Axe", 15, 50);
        p1.setWeapon(myAxe);
        System.out.println("Player One weapon: " + p1.getWeapon().getName());

        Player p2 = new Player("Toto", new Weapon("Wood stick", 1, 200));
        System.out.println("Player Two name: " + p2.getHandleName());
        p2.setLevel(5);
        System.out.println("Player Two level: " + p2.getLevel());
        System.out.println("Player Two lives: " + p2.getLives());
        System.out.println("Player Two weapon: " + p2.getWeapon().getName());

        Player p3 = new Player("Tata", 9, new Weapon("Wooden fork", 2, 500));
        System.out.println("Player Three name: " + p3.getHandleName());
        System.out.println("Player Three level: " + p3.getLevel());
        System.out.println("Player Three lives: " + p3.getLives());
        System.out.println("Player Three weapon: " + p3.getWeapon().getName());
    }
}
