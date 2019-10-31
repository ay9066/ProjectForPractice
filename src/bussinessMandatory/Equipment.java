package bussinessMandatory;

public abstract class Equipment { // 0% abstraction

	public void oven() {
		System.out.println("Store need Refregerator");
	}

	public void refregerator() {
		System.out.println("Store need Refregerator");
	}
	
	Equipment(){
		System.out.println("Store need Range");
	}

}
