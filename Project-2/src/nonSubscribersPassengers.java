public class nonSubscribersPassengers extends Passenger {
    private boolean discount_coupon;

    public nonSubscribersPassengers(boolean discount_coupon) {
        this.discount_coupon = discount_coupon;
    }

    public nonSubscribersPassengers(String ID, String name, boolean discount_coupon) {
        super(ID, name);
        this.discount_coupon = discount_coupon;
    }

    public boolean isDiscount_coupon() {
        return discount_coupon;
    }

    public void setDiscount_coupon(boolean discount_coupon) {
        this.discount_coupon = discount_coupon;
    }

    @Override
    public void reserve(Car car) throws Exception {

        if (car.getMax_capacity() !=0){
            setReserved_car(car);
            if (discount_coupon) {
                setTrip_cost(car.getFixed_route().getTrip_price() - (car.getFixed_route().getTrip_price() * 0.1));
            } else {
                setTrip_cost(car.getFixed_route().getTrip_price());
            }
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
