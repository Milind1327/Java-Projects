package bankaccountapp;

public class Savings extends Account {
	//List properties specific to a Savings account
	int safetyDepositBoxID;
	int safetyDepositBoxKey;
		//Constructor to initialize the Savings account properties
	public Savings(String name, String sSN, double initDeposit){
		super(name, sSN, initDeposit);
		accountNumber="1"+accountNumber;
		setSafetyDepositBox();
	}
		//List any methods specific to the Savings account
	
	private void setSafetyDepositBox(){
		safetyDepositBoxID=(int)(Math.random()*Math.pow(10,3));
		safetyDepositBoxKey=(int)(Math.random()*Math.pow(10,4));
	}
	
	public void showInfo(){
		System.out.println("savings.........");
		super.showInfo();
		System.out.println("Your savings account features:"+
		"\n safety deposit box id:"+safetyDepositBoxID+
		"\n safety deposit box key:"+safetyDepositBoxKey);
	}	
	
	@Override
	public void setRate() {
		rate=getBaseRate-0.25;
//		System.out.println("Implement rate for savings");
		
	}
	
	
}
