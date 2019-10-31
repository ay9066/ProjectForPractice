package storeRun;

import bussinessMandatory.CustomerService;
import bussinessMandatory.EmployeeService;
import bussinessMandatory.StoreEquipments;

public class PizzaStore extends StoreEquipments implements CustomerService, EmployeeService {

	
	int maxOrder;//class  variable or Global Variable
	private String coupon;//private Variable
	
	
	public int getMaxOrder() {
		return maxOrder;//return type method 
	}

	public void setMaxOrder(int maxOrder) {
		this.maxOrder = maxOrder;
		
	}

	public String getCoupon() {
		return coupon;
	}

	public void setCoupon(String coupon) {//non return type method
		this.coupon = coupon;
	}

	@Override
	public void instoreOrder() {
		System.out.println("Customer can Order in Store");

	}

	@Override
	public void phoneOrder() {
		System.out.println("Customer can Order by Phone");

	}

	@Override
	public void onlineOrder() {
		System.out.println("Customer can Order by Online");
	}

	@Override
	public void employeeSalary() {
		System.out.println("Employee minimum salary must be $20");
	}

	@Override
	public void employeeBenefit() {
		System.out.println("Employee Health Benefit ");

	}

	@Override
	public void tableChair() {
		System.out.println("Store need table chair ");

	}

}
