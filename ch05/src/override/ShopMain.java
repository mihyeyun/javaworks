package override;

public class ShopMain {

	public static void main(String[] args) {
		HeadShop headshop = new HeadShop();
		headshop.sellDoenjangJJige();
		headshop.sellkimchiJJige();
		headshop.sellbibimBap();
		
		System.out.println("==================");
		
		//shop1 클래스의 객체 생성
		Shop1 shop1 = new Shop1();
		
		shop1.sellDoenjangJJige();
		shop1.sellkimchiJJige();
		shop1.sellbibimBap();
		
		System.out.println("==================");
		
		Shop2 shop2 = new Shop2();
		shop2.sellkimchiJJige();
		shop2.sellbibimBap();
		shop2.sellDoenjangJJige();
	}

}
