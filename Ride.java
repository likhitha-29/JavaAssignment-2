package Rents;
import java.util.*;

public class Ride {
    public static void main(String[] args) {
        RentARide rentARide = new RentARide();

        rentARide.addDriver(new Driver('A',"Sedan", 4.0, 500.0,"Noida"));
        rentARide.addDriver(new Driver('B',"HatchBack", 4.3, 1000.0,"Delhi"));
        rentARide.addDriver(new Driver('C',"5 Seater", 4.8, 200.0,"Delhi"));
        rentARide.addDriver(new Driver('D',"Sedan", 4.1, 700.0,"Gurgoan"));
        rentARide.addDriver(new Driver('E',"HatchBack", 4.7, 430.0,"Gurgoan"));
        System.out.print("Will ypu See the Rider details with Predestination ?(Yes/No) ");
        Scanner sc=new Scanner(System.in);
        String flag=sc.next();
        if(flag.equals("Yes") || flag.equals("yes")) {
        
        Driver d;
        for(int i=0;i<5;i++) {
        	d=rentARide.getDriver(i);
        	System.out.print(d.getDriverr()+" "+d.getCarModel()+" "+d.getRating()+" "+d.getDistanceFromCustomer()+" "+d.getPreDestination()+"\n");
        
        }
        }
        else {
        	 Driver d;
             for(int i=0;i<5;i++) {
             	d=rentARide.getDriver(i);
             	System.out.print(d.getDriverr()+" "+d.getCarModel()+" "+d.getRating()+" "+d.getDistanceFromCustomer()+"\n");
             }
        }
        
        
        System.out.print("Enter the requested car model: ");
        String requestedCarModel = sc.next();
        System.out.print("Enter the ride Distance: ");
        double rideDistance = sc.nextDouble();
        double chargePerKm = 8.0;
        String dest=null;
        if(flag.equals("Yes") || flag.equals("yes")) {
        	System.out.println("Enter Destination: ");
        	dest=sc.next();
        }

        List<Driver> filteredDrivers = rentARide.filterDrivers(requestedCarModel);
        Driver closestDriver = rentARide.findClosestDriver(filteredDrivers,dest);
       
        if (closestDriver != null) {
        	
        
         
            System.out.println("Driver " + closestDriver.getCarModel()+"Drvider "+closestDriver.getDriverr() + " will get you to the destination.");

          
            double totalCharge = rideDistance * chargePerKm;
            System.out.println("Your charge will be Rs. " + totalCharge);
        }
        
    }
}
