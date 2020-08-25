public class Person {
  private String fname = "rishi";
  private String lname = "dadhich";
  private String email = "rishidadhich26@gmail.com";
  private int age = 24;
  
  public static void main(String[] args) {
    Person myObj = new Person();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
  }
}
