import java.util.Scanner;

public class FindLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int [7];
		int max;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements");
		for(int i=0; i<7; i++){
			arr[i]= sc.nextInt();

		}
		max = arr[0];
		for(int i=1; i<7; i++) {
			if(arr[i]>max) {
				max =arr[i];
			}
		}
		System.out.println("Maximum Element is " + max);

	}

}
