import java.util.Arrays;
import java.util.Random;
import java.util.Scanner; 

public class Main {
		static int segSum(int start, int end, int[] data) { //start���� end������ �ִ�, �ּ� ���ϱ�
			int total = 0;
			int min = data[0];
			int max = data[0];
		
			for (int i = start; i < end; i++) { 
				//Arrays.sort(data[i]); �̰� ���� ������ ������ �𸣰ڽ��ϴ� �̤� 
				if(max<data[i]){
					max = data[i];
					}
				if(min>data[i]){
					min = data[i];
					}
				total = min + max;
			}
			//System.out.println(total);
			System.out.println("�ּ� : " + min);
			System.out.println("�ִ� : " + max);
			return total;
	    
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		System.out.println("N �Է� : "); //N�� ���� 10, 100, 1.000, 10.000, 100.000���� �����غ���
		int size = sc.nextInt();
		int max, min, total; 
		
		int[] arr = new int[size];
	
		Random rand = new Random();
		
		for(int i = 0; i<size; i++) { //size
			arr[i] = rand.nextInt(100)+1; 
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		//System.out.println("���� a,b �Է� : ");
		int tmp = 0;
		
		long t = System.currentTimeMillis();
		for(int k = 1; k<100001; k++) {
			System.out.println();
			int a = rand.nextInt(size)+1;
			int b = rand.nextInt(size)+1;	
			
			
			if(a>b) {
				a = tmp;
				b = a;
				tmp = b;
			}
			System.out.println("���� " + a + "~" + b + "��");
			System.out.print("�ּҰ� + �ִ밪 �հ� = ");
			System.out.print(segSum(a, b, arr));
			System.out.println();
			
			
		}
		t = System.currentTimeMillis() - t;
		
		System.out.println("");
		System.out.println("elapsed time : " + t + "ms");
		
	} 
	
}


