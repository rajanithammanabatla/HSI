package com.project.TV;

public class TV {
	 int size;
	 String serialnumber;
	 String modelname;
	 double actualprice;
	 double discountprice;
	

public void Documentation() {
	System.out.println("Details About Tv");
}

public void MRP() {
	System.out.println("Actual price" + actualprice);
}
public void Discountprice() {
	discountprice=actualprice-(actualprice*0.2);
	System.out.println("discounted price " + discountprice);
}
}
