package sec01;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
			switch(problemLocation) {
				case 1:
					System.out.println("앞왼쪽 HankookTire 교체");
//					car.frontLeftTire = new HankookTire("앞왼쪽", 15)
				case 2:
				case 3:
				case 4:
			}
		}
	}
}
