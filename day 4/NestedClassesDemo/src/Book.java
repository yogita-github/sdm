
public class Book {
	private int bkid;
	private String bkname;
	class Lesson{
		private int lid;
		private String lname;
		public void m2() {
			System.out.println("in m2");
			m1();
		}
	}
	Lesson lesson1;
	public void m1() {
		System.out.println("in m1");
	}
	

}
