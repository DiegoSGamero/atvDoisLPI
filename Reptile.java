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
      System.out.println("Slithering...");
  }

  @Override
  public void feed() {
      System.out.println("Eating insects...");
  }

  public String getSkinType() {
      return skinType;
  }

  public double getBodyTemperature() {
      return bodyTemperature;
  }

  public double getLength() {
      return length;
  }
}
