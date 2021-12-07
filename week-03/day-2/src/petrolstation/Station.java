package petrolstation;

public class Station {
    int gasAmount;

    public Station(int gasAmount) {
        this.gasAmount = gasAmount;
    }

    public void refill(Car car) {
        System.out.println("current gas amount in car: " + car.gasAmount);
        System.out.println("current gas amount on station is: " + gasAmount);
        System.out.println("refilling the gas...\n\n");
        gasAmount -= car.capacity;
        car.gasAmount += car.capacity;
        System.out.println("current gas amount in car: " + car.gasAmount);
        System.out.println("current gas amount on station is: " + gasAmount);

    }

    public static void main(String[] args) {
        Station omv = new Station(1000);
        Car car = new Car();

        omv.refill(car);
    }
}
