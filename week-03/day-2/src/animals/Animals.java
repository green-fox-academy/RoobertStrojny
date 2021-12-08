package animals;

public class Animals {
    String name;
    int hunger = 50;
    int thirst = 50;

    public Animals(String name){
        this.name = name;
    }

    public void eat(){
        hunger--;
        System.out.println("Hunger decreased by one. Current hunger: " + hunger);
    }

    public void drink(){
        thirst--;
        System.out.println("Thirst decreased by one. Current thirst: " + thirst);
    }

    public void play(){
        hunger++;
        thirst++;
        System.out.println("Hunger and thirst increased by one. Current hunger : " + hunger + ", thirst : " +thirst);
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", hunger=" + hunger +
                '}';
    }
}
