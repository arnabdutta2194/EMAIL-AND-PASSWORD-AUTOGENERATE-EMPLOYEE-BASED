package EmailApp;
import java.util.Scanner;


public class email {
	
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxcapacity=500;
	private String alternateemail;
	private int defaultpasswordlength=10;
	private String email;
	private String companySuffix="bcrec.com";
	


public email(String firstName,String lastName) {
	this.firstName=firstName;
	this.lastName=lastName;
	System.out.println("Email Created="+this.firstName+" "+this.lastName);
	this.department=setDepartment();
	System.out.println("Department:"+this.department);
	this.password=randomPassword(defaultpasswordlength);
	System.out.println("Your Password is="+this.password);
	email=firstName.toLowerCase()+lastName.toLowerCase()+"@"+department+"."+companySuffix;
	System.out.println("Your email is : "+email);
}

private String setDepartment() {
	System.out.println(firstName+"You are Requested to enter your department\n"
			+ "1 For Sales\n 2 for Developement \n 3 for Accounting \n 0 for None");
	System.out.println("Enter Department Code");
	Scanner sc=new Scanner(System.in);
	int choicedept=sc.nextInt();
	if(choicedept==1) {
		return "sales";
	}
	else if(choicedept==2) {
		return "dev";
	}
	else if(choicedept==3) {
		return "acc";
	}
	else {
		return "";
	}
	
}
	
private String randomPassword(int length) {
	String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*_+";
	char [] password=new char[length];
	for(int i=0;i<length;i++) {
		int rand=(int)(Math.random()*passwordSet.length());
		password[i]=passwordSet.charAt(rand);
		
	}
	return new String(password);
	
}

public void setmailboxcapacity(int Capacity) {
	this.mailboxcapacity=Capacity;
}
public void setalternateemail(String alternate) {
	this.alternateemail=alternate;
}
public void setchangepassword(String password) {
	this.password=password;
}

public int getmailboxcapacity() {
	return mailboxcapacity;
}
public String getalternateemail() {
	return alternateemail;
}
public String getchangepassword() {
	return password;
}

public String showInfo() {
	return "Display Name:"+firstName+" "+lastName+"\nCOMPANYEMAIL:"+email+"\nMAIL BOX CAPACITY"+mailboxcapacity+"mb";
	
	
}


}
