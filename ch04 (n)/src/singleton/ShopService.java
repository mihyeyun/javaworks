package singleton;

public class ShopService {
	public static ShopService shopservice = new ShopService();
	
	static ShopService getInstance() {
		return shopservice;
	}
	
	
}
