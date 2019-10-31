package bussinessMandatory;

public abstract class StoreEquipments extends Equipment { //partial abstraction
	
	//by default all method will come from Equipment Class
	
	public void register() {
		System.out.println("Store need register");
	}
	
	public abstract void tableChair();
		
	

}
