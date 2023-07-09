package Rents;

class Driver {
    private String carModel;
    private double rating;
    private double distanceFromCustomer;
    private String predestination;
    private char ch;

    public Driver(char ch,String carModel, double rating, double distanceFromCustomer,String PreDestination) {
    	this.ch=ch;
        this.carModel = carModel;
        this.rating = rating;
        this.distanceFromCustomer = distanceFromCustomer;
        this.predestination=PreDestination;
    }
    public char getDriverr() {
    	return ch;
    }

    public String getCarModel() {
        return carModel;
    }

    public double getRating() {
        return rating;
    }

    public double getDistanceFromCustomer() {
        return distanceFromCustomer;
    }
    public String getPreDestination() {
    	return predestination;
    }
}
