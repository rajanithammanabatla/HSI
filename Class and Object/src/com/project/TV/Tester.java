package com.project.TV;

public class Tester {
public static void main(String[] args) {
	TV lgtv=new TV();
	lgtv.serialnumber="43432524";
	lgtv.modelname="32fsgdgg";
	lgtv.size=32;
	lgtv.actualprice=32000.50;
	System.out.println("serial number " +lgtv.serialnumber);
	System.out.println("model name " +lgtv.modelname);
	System.out.println("size of the tv "+lgtv.size);
	lgtv.Documentation();
	lgtv.MRP();
	lgtv.Discountprice();
	
	System.out.println("***************************************************");
	
	TV samsungtv=new TV();
	lgtv.serialnumber="43534534";
	lgtv.modelname="40dsgdgfdg";
	lgtv.size=40;
	lgtv.actualprice=45000.50;
	System.out.println("serial number " +lgtv.serialnumber);
	System.out.println("model name " +lgtv.modelname);
	System.out.println("size of the tv "+lgtv.size);
	lgtv.Documentation();
	lgtv.MRP();
	lgtv.Discountprice();
	
System.out.println("***************************************************");
	
	TV sonytv=new TV();
	lgtv.serialnumber="325346546";
	lgtv.modelname="45fdgdfgfdg";
	lgtv.size=45;
	lgtv.actualprice=53000.50;
	System.out.println("serial number " +lgtv.serialnumber);
	System.out.println("model name " +lgtv.modelname);
	System.out.println("size of the tv "+lgtv.size);
	lgtv.Documentation();
	lgtv.MRP();
	lgtv.Discountprice();
	
}
}
