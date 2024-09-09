public class Motorcycle implements Product {
  private String model;
  private String fuelType;
  private double weight;

  public Motorcycle(String model, String fuelType, double weight) {
      this.model = model;
      this.fuelType = fuelType;
      this.weight = weight;
  }

  @Override
  public double calculatePrice() {
      return 10000 + weight * 2; 
  }

  @Override
  public String displayInfo() {
      return "Motorcycle Model: " + model + ", Fuel: " + fuelType;
  }

  @Override
  public String getProductDetails() {
      return "Weight: " + weight + " kg";
  }
}
