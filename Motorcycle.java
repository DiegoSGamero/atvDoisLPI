public class Motorcycle implements Vehicle {
  private double engineDisplacement;
  private String fuelType;
  private double weight;

  public Motorcycle(double engineDisplacement, String fuelType, double weight) {
      this.engineDisplacement = engineDisplacement;
      this.fuelType = fuelType;
      this.weight = weight;
  }

  @Override
  public void accelerate() {
      System.out.println("Motorcycle accelerating...");
  }

  @Override
  public void brake() {
      System.out.println("Motorcycle braking...");
  }

  @Override
  public void refuel() {
      System.out.println("Refueling motorcycle...");
  }
} 
