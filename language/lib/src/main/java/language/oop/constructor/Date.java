package language.oop.constructor;

//calling another constructor within the same class using 'this'
public class Date {

	private int day;
	private int month;
	private int year;
	private String event;
	
	public Date() {
		day = 0;
		month = 0;
		year = 0;
	}
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public Date(int day, int month, int year, String event) {
		//calling another constructor within the same class using 'this'
		this(day, month, year);
		this.event = event;
	}
	
	public void printDate() {
		System.out.println(String.format("%d/%d/%d : %s",
				this.day, this.month, this.year, this.event));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date dateAny = new Date(30, 12, 2021);
		dateAny.printDate();
		Date dateNewYear = new Date(31, 12, 2021, "New Year 2022");
		dateNewYear.printDate();
	}

}
