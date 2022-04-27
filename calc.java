package basics;

public class calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Area of Sqaure");
		
		int a, areaS;
		a = 55;
		areaS = a*a;
		System.out.println("Area of Square :"+ areaS);
		
		System.out.println("Area and Circumference of Circle:");
		int r = 10;
		double areaC = 0.0f ,circm = 0.0f;
		areaC = 3.14*r*r;
		circm = 2*3.14*r;
		
		System.out.println("Area of Circle is :"+areaC+" and Circumference is: "+circm);
	}

}
