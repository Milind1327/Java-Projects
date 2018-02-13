package bankaccountapp;

public class Checking extends Account{

	//List properties specific to a checking account
	int debitCardNumber;
	int debitCardPIN;
	//Constructor to initialize the checking account properties
	public Checking(String name,String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber="2"+accountNumber;
		setDebitCardNumber();
	}
	
	//List any methods specific to the checking account
	
	private void setDebitCardNumber(){
		debitCardNumber=(int)(Math.random()*Math.pow(10,12));
		debitCardPIN=(int)(Math.random()*Math.pow(10,4));
	}
	
	public void showInfo(){
		System.out.println("checking......");
		super.showInfo();
		System.out.println("Your checking account features:"+
				"\n debit card number:"+debitCardNumber+
				"\n debit card pin:"+debitCardPIN);
			}
	@Override
	public void setRate() {
		rate=getBaseRate*.15;
	//	System.out.println("Implement rate for checking");
		
	}
		
	}
