package com.yedam.inheritance;
/*
 *  친구1 : 이름, 연락처
 */
public class Friend extends Object{ // extends Object : 오브젝트라고하는 클래스가 가지고 있는
	// 필드.
	private String name;
	private String tel;
	
	// 생성자.
	public Friend() {}
	public Friend(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
		
	@Override
	public String toString() {
		return "이름은 " + getName() + ", 연락처는 " + getTel();
	}
	
	
	
	//getter, setter.
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
}
