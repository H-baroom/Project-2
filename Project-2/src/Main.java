import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Route route1 = new Route("Jeddah", "Ryiadh",1000);
        Route route2 = new Route("Makkah","jaizan",850);
        Route route3 = new Route("Makkah","Pakistan",3000);
        Car car1 = new Car("2112233331",route1,4);
        Car car2 = new Car("4384849029",route2,0);
        Car car3 = new Car("9988726332",route3,10);
        ArrayList<Passenger> arr = new ArrayList<>();
        Passenger nonSubscribersPassengers1 = new nonSubscribersPassengers("122131443","Hashim",false);
        Passenger nonSubscribersPassengers2 = new nonSubscribersPassengers("987478793","Baroom",true);
        Passenger subscribersPassengers1 = new subscribersPassengers("5558484323","Ali");
        Passenger subscribersPassengers2 = new subscribersPassengers("9458547457","Faisal");
        try {
            nonSubscribersPassengers1.reserve(car2);
            arr.add(nonSubscribersPassengers1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            nonSubscribersPassengers2.reserve(car1);
            arr.add(nonSubscribersPassengers2);
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
        try {
            subscribersPassengers1.reserve(car2);
            arr.add(subscribersPassengers1);
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
        try {
            subscribersPassengers2.reserve(car3);
            arr.add(subscribersPassengers2);
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
        for (Passenger s:arr){
            s.displayInformation();
        }







    }
}