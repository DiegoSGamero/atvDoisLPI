public class Snack implements Product {
  private String name;
  private String flavour;
  private int calories;

  public Snack(String name, String flavour, int calories) {
      this.name = name;
      this.flavour = flavour;
      this.calories = calories;
  }

  @Override
  public double calculatePrice() {
      return calories * 0.2; // Exemplo de cálculo de preço
  }

  @Override
  public String displayInfo() {
      return "Snack: " + name + ", Flavour: " + flavour;
  }

  @Override
  public String getProductDetails() {
      return "Calories: " + calories;
  }
}
