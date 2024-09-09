import java.util.Scanner;

public class TestaClasse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        // Instanciando cada classe
        Bird bird = new Bird("Falco peregrinus", 1.5, "Coastal areas");
        Reptile reptile = new Reptile("Scales", 30.0, 2.0);
        Feline feline = new Feline("Tiger", "Orange", 60.0);
        TShirt tshirt = new TShirt("M", "Blue", 19.99, 150);
        Sneaker sneaker = new Sneaker("42", "Red", 49.99);
        Motorcycle motorcycle = new Motorcycle("Harley", "Gas", 300.0);
        Car car = new Car("Tesla Model S", "Electric", 2200.0);
        SavorySnack savorySnack = new SavorySnack("Chips", "Sour Cream", 150);
        Snack snack = new Snack("Chocolate Bar", "Milk Chocolate", 200);
        Software software = new Software("Photoshop", "Adobe", 9.5);

        // Menu
        while (running) {
            System.out.println("=== Menu de Teste ===");
            System.out.println("1. Testar Bird");
            System.out.println("2. Testar Reptile");
            System.out.println("3. Testar Feline");
            System.out.println("4. Testar TShirt");
            System.out.println("5. Testar Sneaker");
            System.out.println("6. Testar Motorcycle");
            System.out.println("7. Testar Car");
            System.out.println("8. Testar SavorySnack");
            System.out.println("9. Testar Snack");
            System.out.println("10. Testar Software");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            // Verifica se a entrada número
            while (!scanner.hasNextInt()) {
              System.out.println("Entrada inválida. Por favor, digite um número.");
              scanner.next();
              System.out.print("Escolha uma opção: ");
            }

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("=== Testando Bird ===");
                    bird.feed();
                    System.out.println("Som: " + bird.makeSound());
                    break;
                case 2:
                    System.out.println("== Testando Reptile ===");
                    reptile.move();
                    reptile.feed();
                    break;
                case 3:
                    System.out.println("=== Testando Feline ===");
                    feline.move();
                    feline.feed();
                    break;
                case 4:
                    System.out.println("=== Testando TShirt ===");
                    System.out.println("Preço: " + tshirt.calculatePrice());
                    System.out.println(tshirt.displayInfo());
                    break;
                case 5:
                    System.out.println("=== Testando Sneaker ===");
                    System.out.println(sneaker.displayInfo());
                    System.out.println(sneaker.getProductDetails());
                    break;
                case 6:
                    System.out.println("=== Testando Motorcycle ===");
                    System.out.println(motorcycle.displayInfo());
                    System.out.println("Price: " + motorcycle.calculatePrice());
                    break;
                case 7:
                    System.out.println("=== Testando Car ===");
                    System.out.println(car.displayInfo());
                    System.out.println("Price: " + car.calculatePrice());

                    break;
                case 8:
                    System.out.println("=== Testando SavorySnack ===");
                    System.out.println(savorySnack.displayInfo());
                    System.out.println(savorySnack.getProductDetails());
                    break;
                case 9:
                    System.out.println("=== Testando Snack ===");
                    System.out.println(snack.displayInfo());
                    System.out.println(snack.getProductDetails());
                    break;
                case 10:
                    System.out.println("=== Testando Software ===");
                    System.out.println(software.displayInfo());
                    System.out.println(software.getProductDetails());
                    break;
                case 0:
                    System.out.println("Saindo...");
                    running = false;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}
