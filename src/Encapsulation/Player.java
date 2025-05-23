package Encapsulation;

public class Player {

    private String name;
    private int healthPercentage;
    private String weapon;

    public Player(String name) {
        this(name, 100, "Sword");
    }

    public Player(String name, int healthPercentage, String weapon){
        this.name = name;
        this.weapon = weapon;

        if (healthPercentage <= 0 ){
            this.healthPercentage = 1;
        } else if (healthPercentage > 100) {
            this.healthPercentage = 100;
        } else {
            this.healthPercentage = healthPercentage;
        }
    }

    public int healthRemaining(){
        return healthPercentage;
    }

    public void restoreHealth(int extraHealth){
        healthPercentage = healthPercentage + extraHealth;
        if (healthPercentage > 100) {
            System.out.println("Player has regenerated 100% health");
            healthPercentage = 100;
        }
    }

    public void loseHealth(int damage) {
        healthPercentage = healthPercentage - damage;
        if (healthPercentage <= 0) {
            System.out.println("Player knocked out of game");
        }
    }

}
