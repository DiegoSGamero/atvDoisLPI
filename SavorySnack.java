public class SavorySnack implements Food {
  private String doughType;
  private String filling;
  private String size;

  public SavorySnack(String doughType, String filling, String size) {
      this.doughType = doughType;
      this.filling = filling;
      this.size = size;
  }

  @Override
  public void prepare() {
      System.out.println("Preparing savory snack...");
  }

  @Override
  public void serve() {
      System.out.println("Serving savory snack...");
  }

  @Override
  public double calculateNutritionalValue() {
      return 300.0; // Example nutritional value
  }
}
