import java.util.*;
class reverse{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size ");
		int num = sc.nextInt();
		int[] name = new int[num];
		int[] store = new int[num];
		
		System.out.println("Enter the Elements into array");
		for(int i= 0;i<num;i++){
			name[i] =sc.nextInt();
		}
		for(int i =0;i<num;i++){
			store[i] = name[num-i-1] ;
			System.out.print(store[i]);
		}
	}
}
