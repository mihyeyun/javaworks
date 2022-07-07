package object;

public class Member {
	public String id;
	public Member(String id) {
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) {
		//매개 값이 member type인지 확인
		if(obj instanceof Member) {
			//member 타입으로 강제 변환하고 id 필드 값이 동일한지 검사한 후, 동일하다면 true를 리턴
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		//매개값이 Member 타입이 아니거나 id 필드값이 다른 경우 false를 리턴
		return false;
	}
	
	
}
