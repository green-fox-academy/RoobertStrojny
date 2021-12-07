package counter;

public class Counter {
    int counter = 0;
    public int counterSet;

    public Counter(int counter) {
        this.counter = counter;
        counterSet = counter;
    }

    public Counter() {
    }

    public int baseCounter(int counter){
        this.counter = counter;
        return counter;
    }

    public void add(int number) {
        counter += number;
    }

    public void add() {
        counter++;
    }

    public int get() {
        return counter;
    }

    public void reset() {
        counter = 0;
        counter += counterSet;
    }

    public int getCounter() {
        return counter;
    }
}
