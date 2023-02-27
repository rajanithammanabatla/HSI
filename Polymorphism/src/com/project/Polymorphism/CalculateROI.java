package com.project.Polymorphism;

public class CalculateROI {
	public static void main(String[] args) {
		RBIPolymorphism r=new RBIPolymorphism();
		r.ROI(5000);
		SBIPolymorphism s=new SBIPolymorphism();
		s.ROI(5000);
		RBIPolymorphism rs=new SBIPolymorphism();
		rs.ROI(5000);
	}

}
