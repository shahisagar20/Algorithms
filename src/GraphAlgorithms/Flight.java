package GraphAlgorithms;

public class Flight implements Comparable {

    private String origin, destination;
    private int departureTime, arrivalTime;
    private double fare;

    public Flight(String origin, String destination, int departure, int arrival, double fare){
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departure;
        this. arrivalTime = arrival;
        this.fare = fare;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(int departureTime) {
        this.departureTime = departureTime;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    @Override
    public int compareTo(Object o) {
        Flight anotherFlight = (Flight) o;
        if (this.origin.equals(anotherFlight.origin) && this.destination.equals(anotherFlight.destination)){
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Flight{}";
    }
}
