class Person2 {
  protected String fname = "rohit";
  protected String lname = "Doe";
  protected String email = "rohit@doe.com";
  protected int age = 24;
}

class Student extends Person {
  private int graduationYear = 2019;
  public static void main(String[] args) {
    Student myObj = new Student();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
    System.out.println("Graduation Year: " + myObj.graduationYear);
  }
}
