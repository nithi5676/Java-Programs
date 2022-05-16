import java.util.*;
class reversenext{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number ");
		int num = sc.nextInt();
		int org = num;
		int rev =0;
		while(num!=0){
			rev = rev *10+ num%10;
			num = num/10;
		}
		if(org == rev){
			System.out.println(org+" Is a Palindrome");
		}
		else
			System.out.println(org+" is not a Palindrome");
	}
}