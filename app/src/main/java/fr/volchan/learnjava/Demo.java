package fr.volchan.learnjava;

public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        System.out.println(player.getHandleName());
        player.setHandleName("Volchan");
        System.out.println(player.getHandleName());
    }
}
