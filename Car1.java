public class Car1 {
int modelyear;
String modelname;
    private String modelYear;

public Car1(int year,String name){
    modelYear = year;
    modelname = name;
    }
public static void main(String[] args){
    Car1 myCar1 = new Car1(1996, "BMW");
    System.out.println(myCar1.modelYear + " " +myCar1.modelname);
}
    
}
output is not coming.