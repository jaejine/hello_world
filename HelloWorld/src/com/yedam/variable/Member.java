package com.yedam.variable;

public class Member { // public (다른 클래스에서 접근가능) <=> private (다른 클래스 에서 접근불가능)
	// 클래스 에 값을 담아놓기 위한 필드 or 용도 값을 저장
	public String name;
	public int score;
	
	// 클래스 : 생성자(실체생성)
	// 따로정의 안할시 - 컴파일러가 기본생성자를 생성
	// 생성자 overloading.
	public Member() {
		
	}
	public Member(String name, int score) {
		this.name = name;
		this.score = score;
	}
	// 클래스 : 메소드 (기능) 함수 안에 객체들 / 메소드 = 반환값, 메소드명 (매개값)
	public void showInfo() { // void : 메소드 실행했을때 반환하는값이 업습니다
		System.out.println("이름은 " + name + ", 점수는 " + score);
	}
	// 매개값을 가지는 메소드
	public void setMember(String name, int score) {
		this.name = name; // this 붙히면 name 이라는 필드 를 가르킴
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	// score 필드의 값을 지정.
	public void setScore(int score) {
		if(score < 0 || score > 100) {
			System.out.println("적정 값을 입력하세요.");
			return; // 메소드의 종료 다음 아래 코드 작동안됌
		}
		this.score = score;
	}
	public void setName(String name) {
		this.name = name;
	}
}
