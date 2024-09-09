public class TShirt implements Product {
  private String size;
  private String color;
  private double price;
  private double distance;

  public TShirt(String size, String color, double price, double distance) {
      this.size = size;
      this.color = color;
      this.price = price;
      this.distance = distance;
  }

  @Override
  public double calculatePrice() {
      return price * distance * 0.4;
  }

  @Override
  public String displayInfo() {
      return "T-Shirt: " + color + ", Size: " + size;
  }

  @Override
  public String getProductDetails() {
      return "Price: $" + price;
  }
}
