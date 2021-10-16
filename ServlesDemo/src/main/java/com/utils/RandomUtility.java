package com.utils;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

public class RandomUtility {

	 private static AtomicLong atomicCounter = new AtomicLong();

	    public static long createId() {

	      //  String currentCounter = String.valueOf(atomicCounter.getAndIncrement());
	      //  String uniqueId = UUID.randomUUID().toString();
	    	
	    	  Random random = new Random();
	          long randomInt = random.nextInt(9999);
	         // System.out.println("Generated : " + randomInt);

	        return randomInt;
	    }
	public static void main(String[] args) {
		
		//System.out.println(createId());

	}


}
