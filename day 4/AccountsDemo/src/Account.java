
public class Account {
	private static int cnt;
	public static float int_rate;
	public static float min_balance;
	static {
		cnt=1;
		int_rate=0.04f;
		min_balance=20000;
	}
	private String acid;
	private String name;
	private double balance;
	private String type;
	
	
	public Account() {
		this.acid=this.acid=generatecode(null);
		cnt++;
		name=null;
		type=null;
		balance=0;
		
	}
	
	private static String generatecode(String name) {
		String code="";
		if(name!=null)
			 code= name.substring(0, 3)+cnt;
		else
			code= "xxx"+cnt;
		cnt++;
		return code;
		
	}
	public Account(String name,double balance,String type) {
		this.acid=generatecode(name);
		cnt++;
		this.name=name;
		this.balance=balance;
		this.type=type;
	}
	
	public void setName(String nm) {
		this.name=nm;
	
	}
	public void setType(String ty) {
		this.type=ty;
		
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	
	public String getAcid() {
		return acid;
	}
	public String getName() {
		return this.name;
	
	}
	public String getType() {
		return this.type;
		
	}
	public double getBalance() {
		return this.balance;
	}
	public String toString() {
		return "AcId: "+acid+"\nName: "+name+"Balance: "+balance+"type: "+type;
	}
	
}
