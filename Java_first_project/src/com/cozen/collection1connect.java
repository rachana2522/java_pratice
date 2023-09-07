package com.cozen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class collection1connect {
	
	
	private static List<collection1> collections=new ArrayList<>();
	
	static {
	   collection1 collection = new collection1();
	    collection.setId(12);
		collection.setName("Rachana");
		collection.setPassword("Rachana@123");
		collections.add(collection);
	   
		collection=new collection1();
		collection.setId(13);
		collection.setName("Bishal");
		collection.setPassword("BishL@123");
		collections.add(collection);
		
		collection=new collection1();
		collection.setId(13);
		collection.setName("Tulu");
		collection.setPassword("Kulu@123");
		collections.add(collection);
	
	}

	public static void main(String[] args) {
		System.out.println(collections);

	}

}
