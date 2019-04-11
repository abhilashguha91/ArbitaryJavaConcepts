package javaprep.demo.markerinterfacedemo;

import javaprep.demo.markerinterfacedemo.exception.InvalidBusinessObjectException;

public class MarkerInterfaceExecutioner {

	// Marker Interfaces are interfaces without any abstract methods or value declarations
	// It is just a way for the coding logic to ensure only it's subclasses/ implemented classes
	// can behave in a particular way
	
	public static void main(String[] args) {
		
		BusinessService businessService = new BusinessService();
		BusinessObject obj = new BusinessObject();
		
		try {
			businessService.businessService(obj);
		} catch (InvalidBusinessObjectException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
