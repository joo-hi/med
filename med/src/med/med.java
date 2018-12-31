package med;
import java.util.Scanner;
import java.util.Arrays;

public class med {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("세 수를 입력하시오: ");
	Scanner scan = new Scanner(System.in);
	
	int arr[];
	arr = new int[3];
	
	for(int i=0; i<3; i++)
		arr[i] = scan.nextInt();
	
	Arrays.sort(arr);
	
	if(true) {
	if((arr[0]==arr[1])) {
		if(arr[0] > arr[2])
			System.out.println(+arr[2]);
		else System.out.println(+arr[0]);
			System.exit(0);
		}
	if((arr[1]==arr[2])) {
		if(arr[0] > arr[1]) 
			System.out.println(+arr[1]);
		else System.out.println(+arr[0]);
			System.exit(0);
		}
	else
		System.out.println(arr[1]);
	}
	/*
	if((a == b) && (b == c))
		System.out.println(+a);
	else if((a>b) && (b>c))	
		System.out.println(+b);
	else if((a<b) && (b<c))
		System.out.println(+b);
	else if((a>c) && (b<c))
		System.out.println(+c);
	else if((a>c) && (b>c))
		System.out.println(+a);
	else if((a<c) && (b<c))
		System.out.println(+a);
	else if((a<c) && (b>c))
		System.out.println(+c);
	else if((a==b) && (b>c))
		System.out.println(+c);
	else if((a==b) && (b<c))
		System.out.println(+a);
	else if((a==c) && (b>c))
		System.out.println(+c);
	else if((a==c) && (b<c))
		System.out.println(+b);
	else if((b==c) && (a>b))
		System.out.println(+b);
	else if((b==c) && (a<b))
		System.out.println(+a);
	*/
	
	}

}
