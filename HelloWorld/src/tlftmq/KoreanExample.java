package tlftmq;

public class KoreanExample {
	public static void main(String[] args) {
		
		Korean k1 = new Korean("박자바","235324-532425");
		System.out.println(k1.nation);
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		
		System.out.println("------------");
		
		Korean k2 = new Korean("감자바","435643-342423");
		System.out.println(k2.nation);
		System.out.println(k2.name);
		System.out.println(k2.ssn);
	}
}
