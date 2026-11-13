import java.util.Scanner;

interface Vehicle {
    void changeGear(int newGear);
    void speedUp(int increment);
    void applyBrakes(int decrement);
}

class Truck implements Vehicle {
    int speed = 0;
    int gear = 0;

    public void changeGear(int newGear) { gear = newGear; }
    public void speedUp(int increment) { speed += increment; }
    public void applyBrakes(int decrement) { speed -= decrement; }

    public void printStates() {
        System.out.println("Truck present state -> Speed: " + speed + ", Gear: " + gear);
    }
}

class Bike implements Vehicle {
    int speed = 0;
    int gear = 0;

    public void changeGear(int newGear) { gear = newGear; }
    public void speedUp(int increment) { speed += increment; }
    public void applyBrakes(int decrement) { speed -= decrement; }

    public void printStates() {
        System.out.println("Bike present state -> Speed: " + speed + ", Gear: " + gear);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Truck Operations
        Truck truck = new Truck();
        System.out.println("--- Truck ---");
        System.out.print("Enter gear: ");
        truck.changeGear(scanner.nextInt());
        System.out.print("Enter speed increase: ");
        truck.speedUp(scanner.nextInt());
        System.out.print("Enter brake decrease: ");
        truck.applyBrakes(scanner.nextInt());
        truck.printStates();

        // Bike Operations
        Bike bike = new Bike();
        System.out.println("\n--- Bike ---");
        System.out.print("Enter gear: ");
        bike.changeGear(scanner.nextInt());
        System.out.print("Enter speed increase: ");
        bike.speedUp(scanner.nextInt());
        System.out.print("Enter brake decrease: ");
        bike.applyBrakes(scanner.nextInt());
        bike.printStates();

        scanner.close();
    }
}