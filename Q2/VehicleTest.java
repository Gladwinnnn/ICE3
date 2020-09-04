public class VehicleTest{
    public static void main(String[] args){
        Motorcycle motorcycle = new Motorcycle(1000);
        Car car = new Car(1000);

        System.out.println(motorcycle.toString());
        System.out.println(car.toString());
    }
}