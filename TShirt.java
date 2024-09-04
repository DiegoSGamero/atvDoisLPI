public class TShirt implements Clothing {
  private String size;
  private String color;
  private String material;
  private double price;

  public TShirt(String size, String color, String material, double price) {
      this.size = size;
      this.color = color;
      this.material = material;
      this.price = price;
  }

  @Override
  public void wear() {
      System.out.println("Wearing t-shirt...");
  }

  @Override
  public void clean() {
      System.out.println("Cleaning t-shirt...");
  }

  @Override
  public void repair() {
      System.out.println("Repairing t-shirt...");
  }

  @Override
  public void applyDiscount(double discount) {
      price -= discount;
  }

  @Override
  public String displayInfo() {
      return "Size: " + size + ", Color: " + color + ", Material: " + material + ", Price: $" + price;
  }

  @Override
  public double calculateShipping(double distance) {
      return distance * 0.3; // Example shipping cost calculation
  }
}
