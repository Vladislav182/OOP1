package UPRAJNENIE;

public class Student extends Person {
	private String num;
	public Student() {
		super();
		this.num = "";
		
	}
	public Student(String name, String egn, String num) {
		super(name, egn);
		this.num = num;
	}
	public String getnum() {
		return this.num;
	}
	public void setnum(String num) {
		this.num = num;
		
	}
	public static void printGreeting() {
		System.out.println("Hi");
	}
	public void printnum() {
		System.out.println("My fnum is: " + this.num);
	}

}
