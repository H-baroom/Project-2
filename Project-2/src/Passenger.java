import java.sql.SQLOutput;

public abstract class Passenger {
    private String name;
    private String ID;
    private Car reserved_car;
    private double trip_cost;

    public Passenger(){}
    public Passenger(String ID, String name){
        this.ID = ID;
        this.name = name;
    }
    public Passenger(String ID, String name, Car reserved_car, double trip_cost) {
        this.ID = ID;
        this.name = name;
        this.reserved_car = reserved_car;
        this.trip_cost = trip_cost;
    }

    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Car getReserved_car() {
        return reserved_car;
    }
    public void setReserved_car(Car reserved_car) {
        this.reserved_car = reserved_car;
    }
    public double getTrip_cost() {
        return trip_cost;
    }
    public void setTrip_cost(double trip_cost) {
        this.trip_cost = trip_cost;
    }


    public abstract void reserve(Car car)throws Exception;

    public void displayInformation(){
        System.out.println("Name : "+name);
        System.out.println("ID : "+ID);
    }



}
