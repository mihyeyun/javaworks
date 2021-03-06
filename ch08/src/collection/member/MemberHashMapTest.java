package collection.member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		
		MemberHashMap memberHashMap = new MemberHashMap(); 
		
		//회원 삽입 (키값은 중복이 안되고, 벨류값은 최근 수정한 값으로 바뀜)
		memberHashMap.addMember(new Member(1001, "삼성전자"));
		memberHashMap.addMember(new Member(1002, "LG전자"));
		memberHashMap.addMember(new Member(1003, "네이버"));
		memberHashMap.addMember(new Member(1004, "카카오"));
		memberHashMap.addMember(new Member(1002, "현대자동차"));
		
		//목록 보기
		memberHashMap.showAllMember();
		System.out.println("============================");
		
		//회원 삭제
		memberHashMap.removeMember(1003);
		memberHashMap.showAllMember();
		
		
		
	}

}
