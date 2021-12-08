package pirates;

import java.util.Random;

public class Pirate {
    int pirateIntoxication = 0;
    boolean isDead = false;
    boolean isPassedOut = false;

    public Pirate() {
    }

    public void drinkSomeRum() {
        if (!this.isDead()) {
            pirateIntoxication++;
        } else {
            this.isDead();
        }
    }

    public void howsItGoingMate() {
        if (!this.isDead()) {
            if (pirateIntoxication < 4) {
                System.out.println("Pour me anudder!");
            } else {
                System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
                System.out.println("Pirate just passed out...");
                pirateIntoxication = 0;
                isPassedOut = true;
            }
        } else {
            this.isDead();
        }
    }

    public void brawl(Pirate pirate) {
        Random random = new Random();
        float chance = random.nextFloat(100);

        if (pirate.isDead != true && this.isDead != true) {
            if (chance < 33.33) {
                this.isDead = true;
                System.out.println(this + " dies.");
            } else if (chance < 66.66 && chance > 33.33) {
                pirate.isDead = true;
                System.out.println(pirate + "dies.");
            } else {
                this.isPassedOut = true;
                pirate.isPassedOut = true;
                System.out.println("they both passed out!");
            }
        } else {
            this.isDead();
        }


    }

    public void die() {
        this.isDead = true;
    }

    private boolean isDead() {
        if (this.isDead == true) {
            System.out.println("he's dead...");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Pirate{}";
    }

    public static void main(String[] args) {
        Pirate pirate1 = new Pirate();
        Pirate pirate2 = new Pirate();
        Pirate pirate3 = new Pirate();
        Pirate pirate4 = new Pirate();
        Pirate pirate5 = new Pirate();

        pirate1.die();
        pirate1.drinkSomeRum();

        pirate1.brawl(pirate2);
    }
}
