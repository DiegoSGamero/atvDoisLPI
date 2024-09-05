import java.util.Scanner;

public class TestaClasse {
    public static void main(String[] args) {
        // Criação dos objetos
        Bird bird = new Bird("Red", 2.5, "Curved");
        Feline feline = new Feline("Lion", "Golden", 80.0);
        Reptile reptile = new Reptile("Scales", 30.0, 1.2);
        Motorcycle motorcycle = new Motorcycle(600.0, "Petrol", 200.0);
        SavorySnack savorySnack = new SavorySnack("Wheat", "Cheese", "Large");
        Snack snack = new Snack("Salted", "Crispy", "Medium");
        OperatingSystem os = new OperatingSystem("Linux", "x86_64", "Open Source");
        Sneaker sneaker = new Sneaker("Nike", "Rubber", 0.5, 100.0);
        TShirt tShirt = new TShirt("M", "Blue", "Cotton", 20.0);

        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            // Menu
            System.out.println("Menu:");
            System.out.println("1. Test Bird");
            System.out.println("2. Test Feline");
            System.out.println("3. Test Reptile");
            System.out.println("4. Test Motorcycle");
            System.out.println("5. Test Savory Snack");
            System.out.println("6. Test Snack");
            System.out.println("7. Test Operating System");
            System.out.println("8. Test Sneaker");
            System.out.println("9. Test T-Shirt");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Bird Sound: " + bird.makeSound());
                    bird.move();
                    bird.feed();
                    break;
                case 2:
                    System.out.println("Feline Sound: " + feline.makeSound());
                    feline.move();
                    feline.feed();
                    break;
                case 3:
                    System.out.println("Reptile Sound: " + reptile.makeSound());
                    reptile.move();
                    reptile.feed();
                    break;
                case 4:
                    motorcycle.accelerate();
                    motorcycle.refuel();
                    break;
                case 5:
                    savorySnack.prepare();
                    System.out.println("Savory Snack Nutritional Value: " + savorySnack.calculateNutritionalValue());
                    break;
                case 6:
                    snack.prepare();
                    System.out.println("Snack Nutritional Value: " + snack.calculateNutritionalValue());
                    break;
                case 7:
                    os.install();
                    os.update();
                    break;
                case 8:
                    sneaker.wear();
                    System.out.println("Sneaker Info: " + sneaker.displayInfo());
                    break;
                case 9:
                    tShirt.wear();
                    System.out.println("T-Shirt Info: " + tShirt.displayInfo());
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }

        } while (option != 0);

        scanner.close();
    }
}
