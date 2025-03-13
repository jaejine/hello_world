package com.yedam.variable;

import java.util.Scanner;

// 추가, 수정, 삭제, 목록 출력하기

public class VarExe7 {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		// Member 값을 저장.
		Member[] storage = new Member[100]; // {null, null, .....}
		storage[0] = new Member("홍길동", 83);
		storage[1] = new Member("김민혁", 86);
		storage[2] = new Member("한수아", 90);
		
		while(run) {
			System.out.println("1.등록 2.수정 3.삭제 4.출력 5.평균 6.종료");
			System.out.print("선택 => ");
			int menu = Integer.parseInt(scn.nextLine()); // 1 엔터.  integer.parseint() => 문자형(입력값) 을 정수로 변환 (엔터까지 처리해줌)

			switch(menu) {
			case 1: // 등록.
				System.out.print("이름을 입력하세요 => ");
				String name = scn.nextLine();
				System.out.print("점수를 입력하세요 => ");
				int score = Integer.parseInt(scn.nextLine());
				Member member = new Member(); // 인스턴스 생성
				member.setMember(name,score);
				// 빈 공간에 값을 할당.
				for(int i=0; i<storage.length; i++) {
					if(storage[i] == null) {
					   storage[i] = member;
					   break; // for 반복문 종료.
					}
				}
				break; // case 1 에 대한 종료.
			case 2: // 수정.
				System.out.print("변경할 이름은 : ");
				String uname = scn.nextLine();
				boolean found = false; // 이름을 찾았는지 확인할 변수
				for (int i = 0; i < storage.length; i++) {
				    // storage[i]가 null이 아니고, 이름이 일치하는지 확인
				    if (storage[i] != null && storage[i].name.equals(uname)) {
				        System.out.print("새 이름을 입력하세요 => ");
				        uname = scn.nextLine();  // 새로운 이름 입력
				        System.out.print("새 점수를 입력하세요 => ");
				        int uscore = Integer.parseInt(scn.nextLine());  // 새로운 점수 입력

				        // Member 객체 수정
				        storage[i].name = uname;
				        storage[i].score = uscore;

				        System.out.println("수정 완료되었습니다.");
				        found = true;  // 이름을 찾았으므로 found를 true로 설정
				        break;  // 수정 후 더 이상 반복문을 진행할 필요 없으므로 종료
				    }
				}
				if (!found) {
					System.out.println("찾는 이름이 없습니다");
				}
				break;
//			    System.out.print("변경할 이름은 : ");
//			    String uname = scn.nextLine();
//			    for(int i=0; i<storage.length; i++) {
//			    	if(storage[i].name.equals(uname)) {
//			    		System.out.print("이름을 입력하세요 => ");
//						uname = scn.nextLine();
//						System.out.print("점수를 입력하세요 => ");
//						int uscore = Integer.parseInt(scn.nextLine());
//						Member umember = new Member(); // 인스턴스 생성
//						umember.name = uname;
//						umember.score = uscore;
//						for(int j=0; j<storage.length; j++) {
//							if(storage[i] == null) {
//							   storage[i] = umember;
//							   System.out.print("수정 완료 되었습니다.");
//							   break;
//			    		}
//			    }
//			    	}
//			    }
			case 3: // 삭제. 이름입력 받고 그 위치의 값을 지워주면됨 기존값 => null 대입
				System.out.print("삭제할 이름을 입력하시오 : ");
				name = scn.nextLine();
				for(int i=0; i<storage.length; i++) {
					if(storage != null && storage[i].getName().equals(name)) { // name 이 프라이빗으로 잠겨서 getName 변경
						storage[i] = null;
						System.out.println("삭제 되었습니다");
						break;
					}
				}
				break;
				
			case 4: // 목록 출력.
				for(int i=0; i<storage.length; i++) {
					if(storage[i] != null) {
						System.out.println(storage[i].name + " " + storage[i].score);
					}
				}
				break;
				
			case 5: // 평균
				// 학생들의 점수 합을 구하고 학생수만큼 나누면 평균
				int sum = 0, count = 0;
				for(int i=0; i<storage.length; i++) {
					if(storage[i] != null){
						sum += storage[i].getScore();
						count++;
					}
				}
				double avg = sum * 1.0 / count; // 실수로 변환 *1.0
				System.out.println("평균의 값은 : " + avg + "입니다");
				break;
				
			case 6: // 종료
				run = false;
			}			
		}
		System.out.println("end of prog.");
	} // end of main().
}
