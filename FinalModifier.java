public class FinalModifier {
  final int x = 10;
  final double PI = 3.14;

  public static void main(String[] args) {
    FinalModifier myObj = new FinalModifier();
    myObj.x = 50; // will generate an error
    myObj.PI = 25; // will generate an error
    System.out.println(myObj.x); 
  }
}
