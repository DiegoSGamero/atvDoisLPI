public class Bird implements Animal {
  private String scientificName;
  private double weight;
  private String habitat;

  public Bird(String scientificName, double weight, String habitat) {
      this.scientificName = scientificName;
      this.weight = weight;
      this.habitat = habitat;
  }

  @Override
  public String makeSound() {
      return "Chirp!";
  }

  @Override
  public void move() {
      System.out.println("Flying...");
  }

  @Override
  public void feed() {
      System.out.println("Eating worms...");
  }

  public String getScientificName() {
      return scientificName;
  }

}
