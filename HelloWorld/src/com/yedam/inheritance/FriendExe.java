package com.yedam.inheritance;
/*
 *  상속.
 *  친구1 : 이름, 연락처
 *  친구2 : 이름, 연락처, 학교, 학과
 *  친구3 : 이름, 연락처, 회사, 부서
 */
public class FriendExe {
	public static void main(String [] args) {
		Friend[] friends = new Friend[10];
		
//		// instance
		Friend f1 = new Friend();
		f1.setName("홍길동");
		f1.setTel("010-1111-2222");
//		System.out.println(f1.toString());
		
		UnivFriend f2 = new UnivFriend();
		f2.setName("김자식");
		f2.setTel("010-1111-1111");
		f2.setUnivName("우리학교");
		f2.setMajor("역사학과");
//		System.out.println(f2.toString());
		
		CompanyFriend f3 = new CompanyFriend("김영식", "010-2323-2323", "아마존", "IT");


		
		// 부모 클래스의 변수에 자식인스턴스 대입 가능.
		friends[0] = f1;
		friends[1] = f2;
		friends[2] = f3;
		
		// Friend[] => toString()
		for(int i=0; i<friends.length; i++) {
			if(friends[i] != null) {
				System.out.println(friends[i].toString());
			}
		}
		
		// 형변환
		int num = 20;
		double num2 = num; // 내부적으로 자동 형변환됌. (프로모션) 
		num = (int) num2; // 큰형태의 데이터를 작은형태로 넣으려하면 강제형변환 (캐스팅)
		
		// 대입 = (자식클래스에 부모클래스 대입) 오른쪽 값 왼쪽값 데이터유형 같아야함.
		Friend f4 = new CompanyFriend("김무열", "010-1231-1231", "자회사", "인사팀");
		
		// 반대 ( 부모와 자식간의 경우일경우만 캐스팅 가능 )
		CompanyFriend cf = (CompanyFriend) f4; // 부모(큰값) 클래스의 변수를 자식클래스(작은값) 에 대입
		Friend f5 = new Friend ("박성길", "010-2314-1234");
		if(f4 instanceof CompanyFriend) {
			cf = (CompanyFriend) f4;
			System.out.println(cf.getCompany());
		}else {
			System.out.println("Casting 할 수 없습니다");		}
		}
	
	} // end of main.