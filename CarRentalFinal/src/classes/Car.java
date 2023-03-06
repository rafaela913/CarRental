package classes;

import java.io.FileWriter;
import java.io.IOException;

public class Car {
	public String registrationNumber;
	public String model;
	public String brand;
	public int  yearOfManufacture;
	public float dailyRentalPrice;
	public FuelType fuelType;
	
	public Car()
	{
		registrationNumber = "unknown";
		model = "unknown";
		brand = "unknown";
		 yearOfManufacture = 2000;
		dailyRentalPrice = 100;
		fuelType=FuelType.Diesel;
	}
	public Car(String registrationNumber, String model, String brand, int yearOfManufacture, float dailyRentalPrice,FuelType fuelType) {
		
		this.registrationNumber = registrationNumber;
		this.model = model;
		this.brand = brand;
		this. yearOfManufacture = yearOfManufacture;
		this.dailyRentalPrice = dailyRentalPrice;
		this.fuelType=fuelType;
	}
	
	
	
	@Override
	public Object clone() {
		Car copy=new Car();
		copy.registrationNumber = this.registrationNumber;
		copy.model = this.model;
		copy.brand = this.brand;
		copy. yearOfManufacture = this. yearOfManufacture;
		copy.dailyRentalPrice = this.dailyRentalPrice;
		copy.fuelType=this.fuelType;
		return copy;
		
	}
	
	
	
	@Override
	public String toString() {
		return registrationNumber+" "+model + " " + brand 
				+ " " +  yearOfManufacture + "  "+dailyRentalPrice+" "+fuelType;

	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getYearOfManufacture() {
		return  yearOfManufacture;
	}
	public void setYearOfManufacture(int yearOfManufacture) {
		this. yearOfManufacture = yearOfManufacture;
	}
	public float getDailyRentalPrice() {
		return dailyRentalPrice;
	}
	public void setDailyRentalPrice(float dailyRentalPrice) {
		this.dailyRentalPrice = dailyRentalPrice;
	}
	public FuelType getFueltype() {
		return fuelType;
	}
	public void setFueltype(FuelType fuelType) {
		this.fuelType = fuelType;
	}
	
	
	public void saveData()
	{  
	try {
	    FileWriter myWriter = new FileWriter("Car.txt");
	    myWriter.write("Registration Number: "+this.registrationNumber+"\nModel: "+this.model+"\nBrand: "+this.brand
	    		+"\nYear Of Manufacture: "+this.yearOfManufacture+"\nDaily Rental Price: "+this.dailyRentalPrice+"\nFuel Type: "+this.fuelType);
	    myWriter.close();
	    System.out.println("Successfully wrote to the file.");
	  } catch (IOException e) {
	    System.out.println("An error occurred.");
	    e.printStackTrace();
	  }
		
	}

	
	

}

