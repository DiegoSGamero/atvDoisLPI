public class Sneaker implements Clothing {
  private String brand;
  private String soleType;
  private double weight;
  private double price;

  public Sneaker(String brand, String soleType, double weight, double price) {
      this.brand = brand;
      this.soleType = soleType;
      this.weight = weight;
      this.price = price;
  }

  @Override
  public void wear() {
      System.out.println("Wearing sneakers...");
  }

  @Override
  public void clean() {
      System.out.println("Cleaning sneakers...");
  }

  @Override
  public void repair() {
      System.out.println("Repairing sneakers...");
  }

  @Override
  public void applyDiscount(double discount) {
      price -= discount;
  }

  @Override
  public String displayInfo() {
      return "Brand: " + brand + ", Sole Type: " + soleType + ", Weight: " + weight + " kg, Price: $" + price;
  }

  @Override
  public double calculateShipping(double distance) {
      return distance * 0.5; // Example shipping cost calculation
  }
}
