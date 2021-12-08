package pirates;

import java.util.Random;

public class Pirate {
    int pirateIntoxication = 0;
    boolean isDead = false;

    public Pirate() {
    }

    public void drinkSomeRum() {
        if (!isDead()) {
            pirateIntoxication++;
        } else {
            printDeadMessage();
        }
    }

    public void howsItGoingMate() {
        if (isDead()) {
            printDeadMessage();
            return;
        }

        if (pirateIntoxication < 4) {
            System.out.println("Pour me anudder!");
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            System.out.println("Pirate just passed out...");
            passOut();
        }
    }

    public void passOut() {
        pirateIntoxication = 0;
    }

    public void brawl(Pirate pirate) {
        Random random = new Random();
        int chance = random.nextInt(0, 3);

        if (this.isDead) {
            printDeadMessage();
            return;
        }

        if (pirate.isDead) {
            System.out.println("You can't fight a dead pirate!");
            return;
        }

        switch (chance) {
            case (0): {
                this.die();
                System.out.println("You won! Other pirate is dead... RIP");
                break;
            }
            case (1): {
                pirate.die();
                System.out.println("Your pirate died... RIP");
                break;
            }
            case (2): {
                this.passOut();
                pirate.passOut();
                System.out.println("They both passed out!");
                break;
            }
        }
    }

    public void die() {
        isDead = true;
    }

    public boolean isDead() {
        return isDead;
    }

    private void printDeadMessage() {
        System.out.println("he's dead...");
    }


    public static void main(String[] args) {
        Pirate pirate1 = new Pirate();
        Pirate pirate2 = new Pirate();
        Pirate pirate3 = new Pirate();
        Pirate pirate4 = new Pirate();
        Pirate pirate5 = new Pirate();

        pirate1.die();
        pirate1.drinkSomeRum();

        pirate3.brawl(pirate2);
    }


}
