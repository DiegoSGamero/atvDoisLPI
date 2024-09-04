public class Snack implements Food {
  private String flavor;
  private String crunchiness;
  private String packageSize;

  public Snack(String flavor, String crunchiness, String packageSize) {
      this.flavor = flavor;
      this.crunchiness = crunchiness;
      this.packageSize = packageSize;
  }

  @Override
  public void prepare() {
      System.out.println("Preparing snack...");
  }

  @Override
  public void serve() {
      System.out.println("Serving snack...");
  }

  @Override
  public double calculateNutritionalValue() {
      return 150.0; // Example nutritional value
  }
}
