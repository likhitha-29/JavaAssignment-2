package Rents;

import java.util.ArrayList;
import java.util.List;

class RentARide {
    private List<Driver> drivers;

    public RentARide() {
        drivers = new ArrayList<>();
    }

    public void addDriver(Driver driver) {
        drivers.add(driver);
    }
    public Driver getDriver(int i) {
    	return drivers.get(i);
    }

    public List<Driver> filterDrivers(String requestedCarModel) {
        List<Driver> filteredDrivers = new ArrayList<>();
        for (Driver driver : drivers) {
            if (driver.getRating() >= 4) {
                if (requestedCarModel.isEmpty() || driver.getCarModel().equals(requestedCarModel)) {
                    filteredDrivers.add(driver);
                }
            }
        }
        return filteredDrivers;
    }

    public Driver findClosestDriver(List<Driver> filteredDrivers,String dest) {
        Driver closestDriver = null;
        double minDistance = Double.MAX_VALUE;
        if(dest!=null) {
        for (Driver driver : filteredDrivers) {
            if (driver.getDistanceFromCustomer() < minDistance && driver.getPreDestination().equals(dest)) {
                closestDriver = driver;
                minDistance = driver.getDistanceFromCustomer();
            	}
        	}
        }
         else {
        	 for (Driver driver : filteredDrivers) {
            		if(driver.getDistanceFromCustomer()<minDistance) {
            		closestDriver = driver;
                    minDistance = driver.getDistanceFromCustomer();
            	}
            }
        }
        return closestDriver;
    }
}
