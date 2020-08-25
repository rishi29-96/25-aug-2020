class Person1 {
  String fname = "rahul";
  String lname = "Doe";
  String email = "rahul@doe.com";
  int age = 24;
  
  public static void main(String[] args) {
    Person1 myObj = new Person1();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
  }
}
