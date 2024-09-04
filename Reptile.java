public class Reptile implements Animal {
  private String skinType;
  private double bodyTemperature;
  private double length;

  public Reptile(String skinType, double bodyTemperature, double length) {
      this.skinType = skinType;
      this.bodyTemperature = bodyTemperature;
      this.length = length;
  }

  @Override
  public String makeSound() {
      return "Hiss!";
  }

  @Override
  public void move() {
      System.out.println("Crawling...");
  }

  @Override
  public void feed() {
      System.out.println("Eating insects...");
  }
}
