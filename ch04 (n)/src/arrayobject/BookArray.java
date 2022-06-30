package arrayobject;

public class BookArray {

	public static void main(String[] args) {
		
		int[] arr = new int[3];
		//0, 0, 0
		
		Book[] library = new Book[3];
		
		//배열 생성전 출력 - null로 초기화 됨
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		
		System.out.println("================");
		
		library[0] = new Book("혼공 자바", "신용권");
		library[1] = new Book("반응형 웹", "조혜경");
		library[2] = new Book("스프링부트", "채규태");
		
		library[0].showInfo();
		
		System.out.println("================");
		
		//전체 출력
		for(int i = 0; i < library.length; i++) {
			library[i].showInfo();
		}
		
		System.out.println("================");
		
		//System.out.println(library[0].bookName);
		//데이터 수정
		library[0].setBookName("혼자 공부하는 Java"); 
		library[1].setAuthor("김광수");
		
		//향상 for
				for(Book book : library)
					book.showInfo();

	}

}
