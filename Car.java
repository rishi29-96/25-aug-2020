public class Car {
    public void fullThrottle(){
        System.out.println("the car is going fast as it can");
        
    }
    public void speed(int maxSpeed){
        System.out.println("Max speeed is : "+maxSpeed);
        }
    public static void main(String[] args){
    Car myCar = new Car();
    myCar.fullThrottle();
    myCar.speed(200);
}
}
