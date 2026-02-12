package com.nit.electricity;

public class ElectricityBillGenerator {
	
	int unitsConsumed;
	double  ratePerUnit;
	
	public void setUnitsConsumed(int unitsConsumed) {
		this.unitsConsumed = unitsConsumed;
	}
	
	public void setRatePerUnit(double ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}
	
	public double generateBill()
	{
		return unitsConsumed*ratePerUnit;
	}
	


}
