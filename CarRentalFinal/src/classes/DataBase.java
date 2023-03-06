package classes;

import java.io.FileWriter;
import java.io.IOException;

public class DataBase{
	private Car[] cars;
	private Client[] clients;
	private Rental[] rentals;
	
	
	public DataBase()
	{
	this.cars=new Car[1];
	cars[0]=new Car();
	this.clients=new Client[1];
	clients[0]=new Client();
	this.rentals=new Rental[1];
	rentals[0]=new Rental();
	
	}
	
	
	public DataBase(Car[] cars, Client[] clients, Rental[] rentals) {
		this.cars =new Car[cars.length];
		for(int i=0;i<cars.length;i++)
			this.cars[i]=cars[i];
		this.clients =new Client[clients.length];
		for(int i=0;i<clients.length;i++)
			this.clients[i]=clients[i];
		this.rentals =new Rental[rentals.length];
		for(int i=0;i<rentals.length;i++)
			this.rentals[i]=rentals[i];
		
	}



	@Override
	public Object clone() {
		DataBase copy=new DataBase();
		copy.cars =new Car[cars.length];
		for(int i=0;i<cars.length;i++)
			copy.cars[i]=cars[i];
		copy.clients =new Client[clients.length];
		for(int i=0;i<clients.length;i++)
			copy.clients[i]=clients[i];
		copy.rentals =new Rental[rentals.length];
		for(int i=0;i<rentals.length;i++)
			copy.rentals[i]=rentals[i];
		return copy;
		
	}
	
	
	

	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("Cars:\n");
	    for (Car car : cars) {
	        sb.append(car.toString()).append("\n");
	    }
	    sb.append("Clients:\n");
	    for (Client client : clients) {
	        sb.append(client.toString()).append("\n");
	    }
	    sb.append("Rentals:\n");
	    for (Rental rental : rentals) {
	        sb.append(rental.toString()).append("\n");
	    }
	    return sb.toString();
	}


	public Car[] getCars() {
		
		return cars;
	}
	
	public void setCars(Car[] cars) {
		this.cars=new Car[cars.length];
		for(int i=0;i<cars.length;i++)
			this.cars[i]=cars[i];
	}
	public Client[] getClients() {
		return clients;
	}
public void setClients(Client[] clients) {
		this.clients=new Client[clients.length];
		for(int i=0;i<clients.length;i++)
			this.clients[i]=clients[i];
	}
public Rental[] getRentals()
{
	return rentals;
}
public void setRentals(Rental[] rentals)
{
	this.rentals=new Rental[rentals.length];
	for(int i=0;i<rentals.length;i++)
		this.rentals[i]=rentals[i];
}

public void addCar(Car car)
{ 
	Car []copy=new Car[this.cars.length];
	for(int i=0;i<cars.length;i++)
		copy[i]=cars[i];
	this.cars=new Car[cars.length+1];
	int n=cars.length;
	for(int i=0;i<copy.length;i++)
		cars[i]=copy[i];
	cars[n-1]=car;
	
}

public void deleteCar(Car car)
{
	Car []copy=new Car[this.cars.length];
	int j=0;
	for(int i=0;i<cars.length;i++)
	{	if(cars[i]!=car)
			{copy[j]=cars[i];
			j++;}}
	this.cars=copy;
	
	
}

public void addClient(Client client)
{
	Client []copy=new Client[this.clients.length];
	for(int i=0;i<clients.length;i++)
		copy[i]=clients[i];
	this.clients=new Client[clients.length+1];
	int n=clients.length;
	for(int i=0;i<copy.length;i++)
		clients[i]=copy[i];
	clients[n-1]=client;
}
	
public void addRental(Rental rental)
{
	Rental []copy=new Rental[this.rentals.length];
	for(int i=0;i<rentals.length;i++)
		copy[i]=rentals[i];
	this.rentals=new Rental[rentals.length+1];
	int n=rentals.length;
	for(int i=0;i<copy.length;i++)
		rentals[i]=copy[i];
	rentals[n-1]=rental;
	
}

public void saveData()
{  
try {
    FileWriter myWriter = new FileWriter("DataBase.txt");
    myWriter.write("Cars: \n");
    for(int i=0;i<this.cars.length;i++)
    	myWriter.write("\n\n"+this.cars[i]);
    myWriter.write("Clients: \n");
    for(int i=0;i<this.clients.length;i++)
    	myWriter.write("\n\n"+this.clients[i]);
    myWriter.write("Rentals: \n");
    for(int i=0;i<this.rentals.length;i++)
    	myWriter.write("\n\n"+this.rentals[i]);
    myWriter.close();
    System.out.println("Successfully wrote to the file.");
  } catch (IOException e) {
    System.out.println("An error occurred.");
    e.printStackTrace();
  }
	
}
}

