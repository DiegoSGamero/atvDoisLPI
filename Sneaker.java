public class Sneaker implements Product {
  private String size;
  private String color;
  private double price;

  public Sneaker(String size, String color, double price) {
      this.size = size;
      this.color = color;
      this.price = price;
  }

  @Override
  public double calculatePrice() {
      return price;
  }

  @Override
  public String displayInfo() {
      return "Sneaker: " + color + ", Size: " + size;
  }

  @Override
  public String getProductDetails() {
      return "Price: $" + price;
  }
}
