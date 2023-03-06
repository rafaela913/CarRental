package classes;

import java.io.FileWriter;
import java.io.IOException;

public class Client {
	public String name;
	public String phoneNumber;
	public String nationalIdentificationNumber;
	boolean isNewClient;
	
	public Client() {
		name="unknown";
		phoneNumber="unknown";
		nationalIdentificationNumber="unknown";
		isNewClient=true;
	}
	public Client(String name, String phoneNumber, String nationalIdentificationNumber, boolean isNewClient) {
	
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.nationalIdentificationNumber = nationalIdentificationNumber;
		this.isNewClient = isNewClient;
	}
	
	@Override
	public Object clone() {
		Client copy=new Client();
		copy.name = this.name;
		copy.phoneNumber = this.phoneNumber;
		copy.nationalIdentificationNumber = this.nationalIdentificationNumber;
		copy.isNewClient = this.isNewClient;
		
		return copy;
		
	}
	
	@Override
	public String toString() {
		return this.name+" "+this.phoneNumber+" "+
	this.nationalIdentificationNumber+" "+this.isNewClient;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getNationalIdentificationNumber() {
		return nationalIdentificationNumber;
	}
	public void setnationalIdentificationNumber(String nationalIdentificationNumber) {
		this.nationalIdentificationNumber = nationalIdentificationNumber;
	}
	public boolean getNewClient() {
		return isNewClient;
	}
	public void setNewClient(boolean isNewClient) {
		this.isNewClient = isNewClient;
	}
	
	public void saveData()
	{  
	try {
	    FileWriter myWriter = new FileWriter("Client.txt");
	    myWriter.write("Name: "+this.name+"\nPhone: "+this.phoneNumber+"\nNational Identification Number: "+this.nationalIdentificationNumber
	    		+"\nIs New Client: "+this.isNewClient);
	    myWriter.close();
	    System.out.println("Successfully wrote to the file.");
	  } catch (IOException e) {
	    System.out.println("An error occurred.");
	    e.printStackTrace();
	  }
		
	}

	
	

}

