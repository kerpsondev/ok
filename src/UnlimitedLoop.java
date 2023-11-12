public class UnlimitedLoop {

  public static void main(String[] args) {
    executeA();
  }

  private static executeA() {
    System.out.println("Hej");
    executeB();
  }

  private static executeB() {
    System.out.println("Sara");
    executeA();
  }
}
