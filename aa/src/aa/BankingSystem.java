package aa;
import java.util.Scanner;
public class BankingSystem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("********NEW ACCOUNT ENTRY*********");
		System.out.println("ENTER ACCOUNT HOLDER NAME :");
		String st=sc.nextLine();
		System.out.println("ENTER ACCOUNT HOLDER id :");
		String id=sc.nextLine();
		BankAccount obj=new BankAccount(st,id);
		System.out.println("ACCOUNT CREATED SUCCESSFULLY!!");
		System.out.println("*********");
		obj.showmenu();
		
	}

}

