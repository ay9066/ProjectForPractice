package storeRun;

import bussinessMandatory.EmployeeService;
import productCollect.MenuList;
import productCollect.OrderPizza;

public class TestStore {

	public static void main(String[] args) {

		new StoreDetails(); // run time Polymorphism concept
		new StoreDetails("Hot Pizza Sore");
		new StoreDetails("Jamaica,NY", 11423);

		System.out.println("*************************************");

		PizzaStore ps = new PizzaStore();
		ps.refregerator();
		ps.oven();
		ps.register();
		ps.tableChair();

		System.out.println("No.of Employee: " + EmployeeService.minEmployee);// Static Variable From Interface call by
																				// ClassName
		ps.employeeSalary();
		ps.employeeBenefit();
		ps.instoreOrder();
		ps.onlineOrder();
		ps.phoneOrder();
		ps.setMaxOrder(100);
		System.out.println("Customer can order maximum :" + ps.getMaxOrder());
		ps.setCoupon("10% Discount");
		System.out.println("Customer will get " + ps.getCoupon());

		// Hierarchical Inheritance Concept
		MenuList menu = new MenuList();
		menu.inventorySystem();
		menu.productName();

		OrderPizza or = new OrderPizza();
		or.inventorySystem();
		or.productName();
		or.productPrice();

	}

}
