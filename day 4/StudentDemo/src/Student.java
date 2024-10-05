
public class Student {
		static int min_passing_marks;
		static String degree;
		private static int cnt=1;
		static{
		    min_passing_marks=40;
		    degree="DAC";
		}
		private String sid;
		private String sname;
		private String address;
		private int m1,m2,m3;
		private static String generateCode(String nm,String addr) {
			String code="";
			if(nm!=null && addr!=null)
				code=nm.substring(0,2)+addr.substring(0,2)+cnt;
			else
				code="xx"+"yy"+cnt;
			cnt++;
			return code;
			
		}
		public Student() {
			sid=generateCode(null,null);
			sname=null;
			address=null;
			m1=0;
			m2=0;
			m3=0;
			
		}
		public Student(String name, String address,int m1,int m2,int m3) {
			sid=generateCode(name,address);
			sname=name;
			this.address =address;
			this.m1=m1;
			this.m2=m2;
			this.m3=m3;
		}
		
		public void setSname(String nm) {
			this.sname=nm;
		}
		public void setAddress(String addr) {
			this.address=addr;
		}
		public void setM1(int m1) {
			this.m1=m1;
		}
		public void setM2(int m2) {
			
			this.m2=m2;
		}
		public void setM3(int m3) {
			this.m3=m3;
		}
		public String getSname() {
			return this.sname;
		}
		public String getAddress() {
			return this.address;
		}
		public int getM1(int m1) {
			return this.m1;
		}
		public int getM2(int m2) {
			
			return this.m2;
		}
		public int getM3(int m3) {
			return this.m3;
		}
		
		public String toString() {
			return "Id : "+sid+"\nName : "+sname+"\nAddress: "+address+"\nM1: "+m1+"\nM2: "+m2+"\nM3: "+m3;
		}
		
		
		
		

}
