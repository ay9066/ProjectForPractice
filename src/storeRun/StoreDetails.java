package storeRun;

public class StoreDetails {

	// Default Constructor
	public StoreDetails() {
		System.out.println(".....WellCome To .....");

	}

	// One parameter Constructor
	public StoreDetails(String storeName) {
		System.out.println(storeName);

	}

	// Two parameter Constructor
	public StoreDetails(String address,int zipCode) {
		System.out.println(address);
		System.out.println(zipCode);
	}

}
