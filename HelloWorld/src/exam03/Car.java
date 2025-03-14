package exam03;

public class Car {
	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자 선언
	Car(){
		
	}
	
	Car(String model){
		this(model, "null", 0);
	}
	
	Car(String model, String color){
		this.model = model;
		this.color = color;
		this.maxSpeed = 0;
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
}
