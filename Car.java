public class Car implements Product {
  private String model;
  private String fuelType;
  private double weight;

  public Car(String model, String fuelType, double weight) {
      this.model = model;
      this.fuelType = fuelType;
      this.weight = weight;
  }

  @Override
  public double calculatePrice() {
      return 20000 + weight * 3; 
  }

  @Override
  public String displayInfo() {
      return "Car Model: " + model + ", Fuel: " + fuelType;
  }

  @Override
  public String getProductDetails() {
      return "Weight: " + weight + " kg";
  }
}
