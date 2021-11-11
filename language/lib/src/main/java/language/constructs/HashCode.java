package language.constructs;

public class HashCode {
	
	public HashCode(int i) {
		this.i = i;
	}
	
	private int i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1: 1131316523
		//2: 495792375
		//HashCode obj4 = new HashCode(5);
		HashCode obj1 = new HashCode(3);
		HashCode obj2 = new HashCode(4);
		HashCode obj3 = obj2;
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
	}

}
