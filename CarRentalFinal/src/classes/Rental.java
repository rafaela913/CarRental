package classes;

import java.io.FileWriter;
import java.io.IOException;

public class Rental {

 private String code;
 private Client client;
 private Car car;
 private int days;
 private float cost;
 private boolean returnWithoutIssues;
 
 public Rental()
 {
	 code="is not available";
	 client=null;
	 car=null;
	 days=0;
	 cost=0;
	 returnWithoutIssues=true; }
 
 public Rental(String code,Client client,Car car,int days,boolean
	 returnWithoutIssues) 
 {   this.code=code;
     this.client=client;
     this.car=car;
     this.days=days;
     this.cost=(this.days)*(car.getDailyRentalPrice());
     this.returnWithoutIssues=returnWithoutIssues;
      
	  }

@Override
public Object clone(){
	Rental copy = new Rental();
	 copy.code=this.code;
     copy.client=this.client;
     copy.car=this.car;
     copy.days=this.days;
     copy.cost=this.cost;
     copy.returnWithoutIssues=this.returnWithoutIssues;
	return copy;
}



@Override
public String toString() {
	return code+" \nThe client is: "
			+client+" \nThe car is: "+car+" "
			+days+" "+cost+" "+returnWithoutIssues;
}

public String getCode() {
	return code;
}

public void setCode(String code) {
	this.code = code;
}

public Client getClient() {
	return client;
}

public void setClient(Client client) {
	this.client = client;
}

public Car getCar() {
	return car;
}

public void setCar(Car car) {
	this.car = car;
}
public int getDays()
{
	return days;
}
public void setDays(int days)
{
	this.days=days;
	
}

public float getCost() {
	if(car!=null)
	
		return this.getDays()*this.car.getDailyRentalPrice();
	else 
		return 0;
	
}


public boolean getReturnWithoutIssues() {
	return returnWithoutIssues;
}

public void setReturnWithoutIssues(boolean returnWithoutIssues) {
	this.returnWithoutIssues = returnWithoutIssues;
}

public void saveData()
{  
try {
    FileWriter myWriter = new FileWriter("Rental.txt");
    myWriter.write("Code: "+this.code+"\nClient: "+this.client+"\nCar: "+this.car
    		+"\nDays: "+this.days+"\nCost: "+this.cost+"\nReturn Without Issues: "+this.returnWithoutIssues);
    myWriter.close();
    System.out.println("Successfully wrote to the file.");
  } catch (IOException e) {
    System.out.println("An error occurred.");
    e.printStackTrace();
  }
	
}
	
}
