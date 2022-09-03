import java.util.Scanner;

public class ATM {

	public void pins() {
		System.out.println("Enter a new PIN");
		Scanner s9 = new Scanner(System.in);
		int w = s9.nextInt();
		int count3 = 0;
		while (w > 0) {
			w = (w / 10);
			count3++;
		}
		if (count3 == 4) {
			System.out.println("Your PIN number RESET Succesfully");
		} else {
			System.out.println("Enter a 4 digit valid pin number");
			this.pins();
		}
	}

	public void number() {
		Scanner s10 = new Scanner(System.in);
		System.out.println("Enter your 10 digit mobile number");
		long bb = s10.nextLong();
		int count = 0;
		while (bb > 0) {
			bb = (bb / 10);
			count++;
		}
		if (count == 10) {
			this.pins();
		} else if (count < 10 || count > 10) {
			// System.out.println(count);
			System.out.println("Entered number is wrong");
			this.number();
		}
	}

	public void WITHDRAW() {
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Enter the amount");
		int amount = sc3.nextInt();
		System.out.println("Collect your Amount : " + amount);
	}

	public void BALANCE() {
		System.out.println("Your available balance is 5000");
		Scanner sc3 = new Scanner(System.in);
		System.out.println("If you want receipt press 1");
		System.out.println("If you want Exit press 2");
		int balance = sc3.nextInt();
		if (balance == 1) {
			System.out.println("Tour balance is 5000");
		}
	}

	public void STATEMENT() {
		System.out.println("Enter your mail ID");
		System.out.println("Statement will be sent to your mail ID");
		Scanner sc6 = new Scanner(System.in);
		String S = sc6.next();
		System.out.println("Statement succesfully sent your mail ID : " + S);
	}

	public void servises() {
		System.out.println("*******Press 1 for Forgot PIN*******");
		System.out.println("*******Press 2 for CASH WITHDRAW*******");
		System.out.println("*******Press 3 for CHECK BALANCE*******");
		System.out.println("*******Press 4 for STATEMENT*******");
		Scanner sc2 = new Scanner(System.in);
		int Q = sc2.nextInt();
		switch (Q) {
		case 1: {
			this.number();
			break;
		}
		case 2: {
			this.WITHDRAW();
			break;
		}
		case 3: {
			this.BALANCE();
			break;
		}
		case 4: {
			this.STATEMENT();
			break;
		}
		default:
			break;
		}
	}

	public void pin() {
		System.out.println("Enter a Valid PIN number");
		Scanner sc1 = new Scanner(System.in);
		int b = sc1.nextInt();
		int count = 0;
		while (b > 0) {
			b = (b / 10);
			count++;
		}
		if (count == 4) 
		{
			System.out.println("Entered pin number is valid");
			this.servises();
		} else 
		{
			System.out.println("Pin number is not valid");
			this.pin();
		}
	}

	public static void main(String[] args) 
{
		ATM obj = new ATM();
		Scanner sc = new Scanner(System.in);
		System.out
				.println("===========================Welcome to Tamilnadu Mercantile Bank===========================");
		System.out.println("Please insert your card");
		System.out.println("Executing the process******Plz wait");
		obj.pin();
	}

}
