/*
Why Encapsulation?
1. To make the interface simpler, we want to hide unnecessary details.
2. To protect the integrity of data on an object, we may hide or restrict access to some of the
data and operations.
 */
public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining Health: "+player.healthRemaining());
//        player.health = 200;
//        player.loseHealth(11);
//        System.out.println("Remaining health: "+player.healthRemaining());

        EnhancedPlayer tim = new EnhancedPlayer("Tim",200,"Sword");
        System.out.println("Initial health: "+tim.healthRemaining());

    }
}