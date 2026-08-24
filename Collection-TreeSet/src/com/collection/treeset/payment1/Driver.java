package com.collection.treeset.payment1;

import java.util.Iterator;
import java.util.TreeSet;

class Payment implements Comparable<Payment>
{
    String refId;
     Payment(String id)
     { 
    	 this.refId = id;
     }
	 @Override
	 public int compareTo(Payment obj) {
	 Payment pay = (Payment) obj;
		return this.refId.compareTo(pay.refId);
	 }
    
}

public class Driver {

	public static void main(String[] args) 
	{
		
		TreeSet<Payment> payset = new TreeSet<Payment>();
		
		Payment payment1 = new Payment("452ekere");
		Payment payment2 = new Payment("452fjery");
		Payment payment3 = new Payment("452dfhsdg");
		Payment payment4 = new Payment("452gdffeS");
		Payment payment5 = new Payment("452cfaftas");
		
       payset.add(payment1);
       payset.add(payment2);
       payset.add(payment3);
       payset.add(payment4);
       payset.add(payment5);
       
       //System.out.println(payset.size());
       
       
		
       //for each loop
	  for( Payment pay : payset) {
		  
		  
		  System.out.println(pay.refId);
		  System.out.println(pay.hashCode());
		  System.out.println();

	  }
	  //iterator looping
	  
	  Iterator<Payment> itr = payset.iterator();
	  
	  while(itr.hasNext()) { //until the elements inside the next of iterator
		  
		  Payment paym = itr.next();
		  
		  System.out.println(paym.refId);
	  }
	  
	  
	  
	  
	}

}
