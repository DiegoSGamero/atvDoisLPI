public class Main {
  public static void main(String[] args) {
      // Instância de Bird
      Bird bird = new Bird("Falco peregrinus", 1.5, "Coastal areas");
      System.out.println("Bird - Scientific Name: " + bird.getScientificName());
      System.out.println("Bird - Sound: " + bird.makeSound());
      bird.move();
      bird.feed();

      // Instância de Reptile
      Reptile reptile = new Reptile("Scales", 30.0, 2.0);
      System.out.println("Reptile - Skin Type: " + reptile.getSkinType());
      reptile.move();

      // Instância de Feline
      Feline feline = new Feline("Tiger", "Orange", 60.0);
      System.out.println("Feline - Species: " + feline.getSpecies());
      feline.feed();

      // Instância de TShirt
      TShirt tshirt = new TShirt("M", "Blue", 19.99, 150.55);
      System.out.println(tshirt.displayInfo());
      System.out.println(tshirt.getProductDetails());

      // Instância de Sneaker
      Sneaker sneaker = new Sneaker("42", "Red", 49.99);
      System.out.println(sneaker.displayInfo());
      System.out.println(sneaker.getProductDetails());

      // Instância de Motorcycle
      Motorcycle motorcycle = new Motorcycle("Harley", "Gas", 300.0);
      System.out.println(motorcycle.displayInfo());
      System.out.println(motorcycle.getProductDetails());

      // Instância de Car
      Car car = new Car("Tesla Model S", "Electric", 2200.0);
      System.out.println(car.displayInfo());
      System.out.println(car.getProductDetails());

      // Instância de SavorySnack
      SavorySnack savorySnack = new SavorySnack("Chips", "Sour Cream", 150);
      System.out.println(savorySnack.displayInfo());
      System.out.println(savorySnack.getProductDetails());

      // Instância de Snack
      Snack snack = new Snack("Chocolate Bar", "Milk Chocolate", 200);
      System.out.println(snack.displayInfo());
      System.out.println(snack.getProductDetails());

      // Instância de Software
      Software software = new Software("Photoshop", "Adobe", 9.5);
      System.out.println(software.displayInfo());
      System.out.println(software.getProductDetails());
      System.out.println("Price: " + software.calculatePrice());
  }
}
