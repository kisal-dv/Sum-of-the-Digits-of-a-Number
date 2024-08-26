import java.util.Scanner;

class sumofdigitcalculator {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input number : ");
		int num = scanner.nextInt();

		
		int sum=0;

		while( num !=0){
		sum+=num%10;
		num/=10;
		
		}

		System.out.println(" sum is  :"+sum);
	}
}


