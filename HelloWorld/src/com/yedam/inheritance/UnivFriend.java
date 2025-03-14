package com.yedam.inheritance;
/*
 *  Friend 클래스를 상속받는. ( extends 클래스명 )
 */
public class UnivFriend extends Friend {
		
		private String univName;
		private String major;
		
		public UnivFriend() {
			super();
		}
		
		public UnivFriend(String name, String tel, String univName, String major) {
			super(name, tel); // 부모생성자.
			this.univName = univName;
			this.major = major;
		}
		
		// 부모의 메소드를 => 자식이 재정의. overriding.
		@Override
		public String toString() {
			return super.toString() + ", 학교는 " + univName + ", 학과는 " + major; // super 부모클래스
		}
		
		@Override
		public String getName() {
			return super.getName(); // super 부모클래스
		}
		
		public String getUnivName() {
			return univName;
		}
		
		public void setUnivName(String univName) {
			this.univName = univName;
		}
		
		public String getMajor() {
			return major;
		}
		
		public void setMajor(String major) {
			this.major = major;
		}
			
}
