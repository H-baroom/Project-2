public class subscribersPassengers extends Passenger{
    public subscribersPassengers() {
    }

    public subscribersPassengers(String ID, String name) {
        super(ID, name);
    }

    @Override
    public void reserve(Car car) throws Exception {
        if (car.getMax_capacity() != 0){
            setReserved_car(car);
            setTrip_cost(car.getFixed_route().getTrip_price() / 2);
        }else{
            throw new Exception("No available capacity in the car.");
        }
    }

    public void displayInformation(){

            System.out.println("********************************************************");
            System.out.println("ID : " + super.getID());
            System.out.println("Name : " + super.getName());
            System.out.println("Reserved Car Code : " + super.getReserved_car().getCode());
            System.out.println("Car Start pick up address : " + super.getReserved_car().getFixed_route().getStart_pick_up_address());
            System.out.println("Car Destination address : " + super.getReserved_car().getFixed_route().getDestination_address());
            System.out.println("Reserved Car Available Capacity: " + super.getReserved_car().getMax_capacity());
            System.out.println("Trip Cost : " + super.getTrip_cost());
            System.out.println("********************************************************");
            super.getReserved_car().setMax_capacity(getReserved_car().getMax_capacity() - 1);

    }

}
