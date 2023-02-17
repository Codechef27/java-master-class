public class Player {

    public String fullName;
    public int health;
    public String weapon;


    public void looseHealth(int damage) {
        health = health - damage;
        if(health <= 0) {
            System.out.println("Player is knocked out of the game!");
        }
    }

    public int healthRemaining() {
        return health;
    }

    public void restoreHealth(int extraHealth) {

        health = health + extraHealth;

        if(health > 100) {
            System.out.println("Players health restored");
            health = 100;
        }
    }
}
