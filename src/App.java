public class App {
    public static void main(String[] args) throws Exception {
        
        
        Car myCar = new Car("BMW", "4 Series", 2016);
        Car bobCar = new Car("Porshe", "911", 2021);

        // myCar = bobCar; // pointing to the same location in memory 
        bobCar.copy(myCar);  // two different addresses in memory but values has been copied

        Car car2 = new Car(myCar);

        System.out.println("First car: " + myCar.getMake());
        bobCar.setYear(1965);
        System.out.println("Second car: " + bobCar.getMake() + " from " + bobCar.getYear());
        System.out.println("Car coppied: "+ car2.getMake());

        System.out.println(myCar);
        System.out.println(bobCar);
        System.out.println(car2);


    }
}
