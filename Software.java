public class Software implements Product {
  private String name;
  private String brand;
  private double note;

  public Software(String name, String brand, double note) {
      this.name = name;
      this.brand = brand;
      this.note = note;
  }

  @Override
  public double calculatePrice() {
      return note * 50;
  }

  @Override
  public String displayInfo() {
      return "Software: " + name + ", Brand: " + brand;
  }

  @Override
  public String getProductDetails() {
      return "Note: " + note;
  }
}
