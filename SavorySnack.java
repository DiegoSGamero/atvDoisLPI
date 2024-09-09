public class SavorySnack implements Product {
  private String name;
  private String flavour;
  private int calories;

  public SavorySnack(String name, String flavour, int calories) {
      this.name = name;
      this.flavour = flavour;
      this.calories = calories;
  }

  @Override
  public double calculatePrice() {
      return calories * 0.1; // Exemplo de cálculo de preço
  }

  @Override
  public String displayInfo() {
      return "Savory Snack: " + name + ", Flavour: " + flavour;
  }

  @Override
  public String getProductDetails() {
      return "Calories: " + calories;
  }
}
