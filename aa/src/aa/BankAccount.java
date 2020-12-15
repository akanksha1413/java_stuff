package aa;
import java.util.Scanner;

public class BankAccount {
	int balance;
	int previoustransaction;
	String customername;
	String customerid;
	BankAccount(String cname, String cid){
		customername= cname;
		customerid= cid;	
	}
	void deposit(int amount) {
		balance=balance+amount;
		previoustransaction=amount;
	}
	void withdraw(int amount) {
		if(amount !=0 && amount<=balance)
		{
		  balance=balance-amount;
		  previoustransaction=-amount;
		}
		else
		{
			System.out.println("Insufficient funds !");
		}
	}
	void getprevioustransaction() {
		if(previoustransaction>0)
		{
			System.out.println("Amount Deposited :"+previoustransaction);
		}
		else if(previoustransaction<0)
		{
			System.out.println("Amount withdraw :"+Math.abs(previoustransaction));
		}
		else
		{
			System.out.println("no transaction occured!!!");
		}
	}
	void showmenu()
	{
		char option='\0';
		Scanner var=new Scanner(System.in);
		System.out.println("WELCOME "+customername);
		System.out.println("Your customer ID is :  "+customerid);
		System.out.println("********************");
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previoustransaction");
		System.out.println("E.EXIT");
		System.out.println("********************");
		do {
			System.out.println("enter your option :");
			option=var.next().charAt(0);
			System.out.println("********************");
			switch(option)
			{
			case 'A':
				System.out.println("BALANCE="+balance);
				break;
			case 'B':
				System.out.println("enter  an amount to deposit :");
				int amount=var.nextInt();
				deposit(amount);
				break;
			case 'C' :
				System.out.println("enter withdraw amount :");
				int amount1=var.nextInt();
				withdraw(amount1);
				break;
			case 'D' :
				getprevioustransaction();
				break;
			case 'E' :
				break;
			default :
				System.out.println("entered wrong choice !!!");
					
			}
			System.out.println("********************");
	
		}while(option!='E');
		
	System.out.println("thanks for using our services!!!");
	}
}
