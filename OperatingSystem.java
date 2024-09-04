public class OperatingSystem implements Software {
  private String kernelType;
  private String architecture;
  private String license;

  public OperatingSystem(String kernelType, String architecture, String license) {
      this.kernelType = kernelType;
      this.architecture = architecture;
      this.license = license;
  }

  @Override
  public void install() {
      System.out.println("Installing operating system...");
  }

  @Override
  public void run() {
      System.out.println("Running operating system...");
  }

  @Override
  public void update() {
      System.out.println("Updating operating system...");
  }
}
