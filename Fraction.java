import java.util.Scanner;

public class Fraction {
    private int numerador;
    private int denominador;

    // Construtor
    public Fraction(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("O denominador não pode ser zero.");
        }
        this.numerador = numerador;
        this.denominador = denominador;
    }

    // Soma
    public Fraction sum(Fraction other) {
        int num = this.numerador * other.denominador + other.numerador * this.denominador;
        int denom = this.denominador * other.denominador;
        return new Fraction(num, denom);
    }

    // Subtração
    public Fraction subtract(Fraction other) {
        int num = this.numerador * other.denominador - other.numerador * this.denominador;
        int denom = this.denominador * other.denominador;
        return new Fraction(num, denom);
    }

    // Multiplicação
    public Fraction multiply(Fraction other) {
        int num = this.numerador * other.numerador;
        int denom = this.denominador * other.denominador;
        return new Fraction(num, denom);
    }

    // Divisão
    public Fraction divide(Fraction other) {
        if (other.numerador == 0) {
            throw new ArithmeticException("Divisão por zero.");
        }
        int num = this.numerador * other.denominador;
        int denom = this.denominador * other.numerador;
        return new Fraction(num, denom);
    }

    // Simplificar fração
    private String simplify() {
        int gcd = gcd(numerador, denominador);
        int num = numerador / gcd;
        int denom = denominador / gcd;
        if (denom < 0) {
            num = -num;
            denom = -denom;
        }
        return num + "/" + denom;
    }

    // Calcula o GCD
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    @Override
    public String toString() {
        return simplify();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("=== Menu de Operações com Frações ===");
            System.out.println("1. Somar frações");
            System.out.println("2. Subtrair frações");
            System.out.println("3. Multiplicar frações");
            System.out.println("4. Dividir frações");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.next();
                System.out.print("Escolha uma opção: ");
            }

            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Saindo...");
                running = false;
                continue;
            }

            System.out.print("Digite o numerador da primeira fração: ");
            int num1 = scanner.nextInt();
            System.out.print("Digite o denominador da primeira fração: ");
            int denom1 = scanner.nextInt();
            Fraction fraction1 = new Fraction(num1, denom1);

            System.out.print("Digite o numerador da segunda fração: ");
            int num2 = scanner.nextInt();
            System.out.print("Digite o denominador da segunda fração: ");
            int denom2 = scanner.nextInt();
            Fraction fraction2 = new Fraction(num2, denom2);

            try {
                Fraction result = null;
                switch (choice) {
                    case 1:
                        result = fraction1.sum(fraction2);
                        System.out.println("Resultado da soma: " + result);
                        break;
                    case 2:
                        result = fraction1.subtract(fraction2);
                        System.out.println("Resultado da subtração: " + result);
                        break;
                    case 3:
                        result = fraction1.multiply(fraction2);
                        System.out.println("Resultado da multiplicação: " + result);
                        break;
                    case 4:
                        result = fraction1.divide(fraction2);
                        System.out.println("Resultado da divisão: " + result);
                        break;
                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                        break;
                }
            } catch (ArithmeticException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
