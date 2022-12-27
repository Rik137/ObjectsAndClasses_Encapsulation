
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//задача№2

        Dimensions dimensions = new Dimensions(130, 120, 30);
        Cargo cargo = new Cargo(dimensions, 100, "Moscow", true,
                "12357rsdc54", false);
        Dimensions dimensions1 = dimensions.setHeight(100);
        Cargo cargo1 = cargo.setDimensions(dimensions1);
        System.out.println(cargo1);

        Cargo cargo2 = cargo.setWeight(50);
        System.out.println(cargo2);

        Cargo cargo3 = cargo1.setDeliveryAddress("Saratov");
        System.out.println(cargo3);
        System.out.println("\n" + "\n");
//===========================================================================================
//задача№1

        Elevator elevator = new Elevator(-3, 26);
        while (true) {
            System.out.print("Введите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
        }
    }
}