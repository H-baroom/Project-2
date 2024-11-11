public class Route {
    private String start_pick_up_address;
    private String destination_address;
    private double trip_price;

    public Route(){}


    public Route(String destination_address, String start_pick_up_address, double trip_price) {
        this.destination_address = destination_address;
        this.start_pick_up_address = start_pick_up_address;
        this.trip_price = trip_price;
    }

    public String getDestination_address() {
        return destination_address;
    }

    public void setDestination_address(String destination_address) {
        this.destination_address = destination_address;
    }

    public String getStart_pick_up_address() {
        return start_pick_up_address;
    }

    public void setStart_pick_up_address(String start_pick_up_address) {
        this.start_pick_up_address = start_pick_up_address;
    }

    public double getTrip_price() {
        return trip_price;
    }

    public void setTrip_price(double trip_price) {
        this.trip_price = trip_price;
    }
}
