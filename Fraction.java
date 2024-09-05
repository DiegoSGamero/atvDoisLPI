public class Fraction {
  private int numerator;
  private int denominator;

  // Construtor
  public Fraction(int numerator, int denominator) {
      if (denominator == 0) {
          throw new IllegalArgumentException("Denominator cannot be zero.");
      }
      this.numerator = numerator;
      this.denominator = denominator;
      simplify();
  }

  // Simplificar a fração
  private void simplify() {
      int gcd = gcd(numerator, denominator);
      numerator /= gcd;
      denominator /= gcd;
      // Garantir que o denominador seja positivo
      if (denominator < 0) {
          numerator = -numerator;
          denominator = -denominator;
      }
  }

  // Calcular o Máximo Divisor Comum
  private int gcd(int a, int b) {
      while (b != 0) {
          int temp = b;
          b = a % b;
          a = temp;
      }
      return a;
  }

  // Soma de frações
  public Fraction add(Fraction other) {
      int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
      int newDenominator = this.denominator * other.denominator;
      return new Fraction(newNumerator, newDenominator);
  }

  // Subtração de frações
  public Fraction subtract(Fraction other) {
      int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
      int newDenominator = this.denominator * other.denominator;
      return new Fraction(newNumerator, newDenominator);
  }

  // Multiplicação de frações
  public Fraction multiply(Fraction other) {
      int newNumerator = this.numerator * other.numerator;
      int newDenominator = this.denominator * other.denominator;
      return new Fraction(newNumerator, newDenominator);
  }

  // Divisão de frações
  public Fraction divide(Fraction other) {
      if (other.numerator == 0) {
          throw new ArithmeticException("Cannot divide by zero.");
      }
      int newNumerator = this.numerator * other.denominator;
      int newDenominator = this.denominator * other.numerator;
      return new Fraction(newNumerator, newDenominator);
  }

  // Representação da fração como string
  @Override
  public String toString() {
      return numerator + "/" + denominator;
  }

  // Método principal para teste
  public static void main(String[] args) {
      Fraction f1 = new Fraction(1, 2);
      Fraction f2 = new Fraction(3, 4);

      System.out.println("f1 = " + f1);
      System.out.println("f2 = " + f2);
      System.out.println("f1 + f2 = " + f1.add(f2));
      System.out.println("f1 - f2 = " + f1.subtract(f2));
      System.out.println("f1 * f2 = " + f1.multiply(f2));
      System.out.println("f1 / f2 = " + f1.divide(f2));
  }
}
