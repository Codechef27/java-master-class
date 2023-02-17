public class Encapsulation {

    public static void main(String[] args) {


        Player player = new Player();
//
//        player.fullName = "Tim";
//        player.health = 20;
//        player.weapon = "Nun Chucks";
//
//        int damage = 10;
//        player.looseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//        player.looseHealth(11);
//        System.out.println("Remaining health = " + player.healthRemaining());


        EnhancedPlayer tim = new EnhancedPlayer("Tim");

        System.out.println(" Starting health = " + tim.healthRemaining());

    }
}


