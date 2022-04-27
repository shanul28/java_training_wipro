package basics;

import java.util.Scanner;
public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name,address;
		int cus_id;
		long cont_no;
		
		short age;
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Your Details:");
		System.out.println("====================");
		
		System.out.println("enter address:");
		address = sc.nextLine();
		System.out.println("Enter customer name:");
		name = sc.nextLine();
		
		System.out.println("enter customer Id:");
		cus_id = sc.nextInt();
		
		System.out.println("enter customer contact no:");
		cont_no = sc.nextLong();
		
		System.out.println("enter age:");
		age = sc.nextShort();
		 
		
		
		System.out.println("==============");
		System.out.println("The details are: ");
		System.out.println("===============");
		
		System.out.println("Name:"+name);
		System.out.println("customer id:"+cus_id);
		System.out.println("Contact no:"+cont_no);
		System.out.println("Age:"+age);
		System.out.println("Address: "+ address);
		
	}

}
