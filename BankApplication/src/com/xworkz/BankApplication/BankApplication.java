package com.xworkz.BankApplication;

public class BankApplication {
	
	String bankName;
	int year;
	String bankApp;
	boolean isNationalized;

	public static void main(String a[])
	
	{

	BankApplication bank=new BankApplication();
	bank.bankName="HDFC Bank";
	bank.year=1997;
	bank.bankApp="Google Pay";
	bank.isNationalized=true;
	System.out.println(bank.bankName+" "+bank.year+" "+bank.bankApp+" "+bank.isNationalized);


	BankApplication app=new BankApplication();
	app.bankName="State Bank of India";
	app.year=1956;
	app.bankApp="Yono SBI";
	app.isNationalized=true;
	System.out.println(app.bankName+" "+app.year+" "+app.bankApp+" "+app.isNationalized);

	BankApplication acc=new BankApplication();
	acc.bankName="Corporation Bank";
	acc.year=2001;
	acc.bankApp="Corp India";
	acc.isNationalized=false;
	System.out.println(acc.bankName+" "+acc.year+" "+acc.bankApp+" "+acc.isNationalized);

}
