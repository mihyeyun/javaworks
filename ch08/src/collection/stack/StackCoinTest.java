package collection.stack;

import java.util.Stack;

public class StackCoinTest {

	public static void main(String[] args) {
		
		//DAO 클래스 - Stack -> vector에서 상속
		Stack<Coin> coinBox = new Stack<>();
		
		//Coin 객체 생성
		Coin coin500 = new Coin(500);	
		Coin coin100 = new Coin(100);	
		Coin coin50 = new Coin(50);		
		Coin coin10 = new Coin(10);		
		
		//동전 넣기
		coinBox.push(coin500);	//0번인덱스
		coinBox.push(coin100);	//1번인덱스
		coinBox.push(coin50);	//2번인덱스
		coinBox.push(coin10);	//3번인덱스
		
		System.out.println("총 객체수: " + coinBox.size());
		System.out.println(coinBox.get(0).getValue());
		
		
		
		//동전을 스택에서 빼기
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();	//코인 꺼내기
			System.out.println("꺼내온 동전: " + coin.getValue() + "원");
		}
		
	}

}
