package basics;

import java.util.Scanner;
public class product_data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int p_id; 
		float price;
		String pname;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Product Id:");
		
		p_id = s.nextInt();
		
		System.out.println("Enter the product Name:");
		pname = s.next();
		
		System.out.println("Enter the Product Price");
		price = s.nextFloat();
		
		System.out.println("=============");
		System.out.println("Product details:");
		System.out.println("=============");
		System.out.println("product id:"+ p_id);
		System.out.println("product name:"+pname);
		System.out.println("product price:"+price);
		
		
	}

}
