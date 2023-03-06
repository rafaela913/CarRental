package Main;
import classes.Car;
import classes.Client;
import classes.DataBase;
import classes.FuelType;
import classes.Rental;
public class Main {

	public static void main(String[] args) {
		Car c = new Car();
		
		 System.out.println(c.getYearOfManufacture());
		 System.out.println(c.getBrand());
		 System.out.println(c.getModel()); 
		 System.out.println(c.getRegistrationNumber());
		 System.out.println(c.getDailyRentalPrice());
		 System.out.println(c.getFueltype());
		 

		Car c1 = new Car("ABC 123", "Civic", "Honda", 2020, 75.5f, FuelType.Petrol);
		Car c2 = (Car) c1.clone();
		System.out.println(c2.getYearOfManufacture());
		 System.out.println(c2.getBrand());
		 System.out.println(c2.getModel()); 
		 System.out.println(c2.getRegistrationNumber());
		 System.out.println(c2.getDailyRentalPrice());
		 System.out.println(c2.getFueltype());
		

		Client cl = new Client();
		System.out.println(cl.getNationalIdentificationNumber());
		System.out.println(cl.getPhoneNumber());
		System.out.println(cl.getName());
		System.out.println(cl.getNewClient());

		Client cl2 = new Client("radu", "0767893415", "19999999999", false);
		Client cl1 = (Client) cl2.clone();
		System.out.println(cl1.getNationalIdentificationNumber());
		System.out.println(cl1.getPhoneNumber());
		System.out.println(cl1.getName());
		System.out.println(cl1.getNewClient());
		cl2.setName("mihai");
		System.out.println(cl1.getName());
		System.out.println("============");
		 
		Rental in=new Rental();
		System.out.println(in.getCode());
		System.out.println(in.getCost());
		System.out.println(in.getClient());
		System.out.println(in.getCar());
		System.out.println(in.getDays());
		
		Rental in2=new Rental("1001",cl1,c1,2,true);
		Rental in1=(Rental)in2.clone();
		System.out.println(in1.getCode());
		System.out.println(in1.getCost());
		System.out.println(in1.getDays());
		System.out.println(in1.getClient());
		System.out.println(in1.getCar());
		System.out.println(in1.getReturnWithoutIssues());
		
	    System.out.println("==============");
	    
	    in1.setCode("299");
	    in1.setDays(3);
	    in1.setClient(cl2);
	    in1.setCar(c2);
	    in1.setReturnWithoutIssues(false);
	    
	    System.out.println(in1.getCode());
		System.out.println(in1.getCost());
		System.out.println(in1.getDays());
		System.out.println(in1.getClient());
		System.out.println(in1.getCar());
		System.out.println(in1.getReturnWithoutIssues());
		
		 System.out.println("==========================");

		Car[] md = new Car[] { c1, c2 };
		Car[] mi = new Car[] { c };
		Client[]vc=new Client[] {cl1,cl2};
		Rental[]vi=new Rental[] {in1,in2};
		
		Client [] vc1=new Client[]{cl};
		Rental []vi1=new Rental[] {in};
		
				
		DataBase s = new DataBase(md,vc,vi);
		s.setClients(vc1);
		s.setCars(mi);
		s.setRentals(vi1);
	   
		for(int i=0;i<mi.length;i++) 
		System.out.println(s.getCars()[i]);
		for(int i=0;i<vc1.length;i++) 
		System.out.println(s.getClients()[i]);
		for(int i=0;i<vi1.length;i++)
			System.out.println(s.getRentals()[i]);
		
		/*
		 * s.adaugaMasina(c1); for(int i=0;i<md.length;i++)
		 * System.out.println(s.getMasini()[i]);
		 */
		s.addCar(c1);
		s.deleteCar(c);
		for(int i=0;i<md.length;i++) 
			System.out.println(s.getCars()[i]);
		
		c1.saveData();
		cl2.saveData();
		in2.saveData();
		s.saveData();
			
		
		 

	}

}
