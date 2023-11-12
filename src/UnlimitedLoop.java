public class UnlimitedLoop {

  public static void main(String[] args) {
    executeA();
  }

  private static void executeA() {
    System.out.println("Hej");
    executeB();
  }

  private static void executeB() {
    System.out.println("Sara");
    executeA();
  }
}
