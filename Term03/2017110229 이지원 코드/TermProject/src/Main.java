// N ���� ������ ���� ����, K ���� ���� ���� ����
import java.util.*;

public class Main {
		static long Merge(int start, int end, int[] data) { //start���� end������ ������ ���ϱ�
			
			int min = data[start]; 
			int max = data[start]; 
			long total = 0; 
			
			for(int i = start; i < end; i++) {
				if(min > data[i]) min = data[i];
				if(max < data[i]) max = data[i];
				total += data[i];
			} 
			
			System.out.println("�ּҰ� : " + min);
			System.out.println("�ִ밪 : " + max);

			return total;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rand = new Random(1000);
		System.out.println("N �Է� : "); // N�� ���� 100, 1000, 10000, 100000, 1000000���� �����غ���
		int N = sc.nextInt();
		System.out.println("K �Է� : "); // K�� ���� 100, 1000, 10000, 100000, 1000000���� �����غ��� 
		int K = sc.nextInt();
		System.out.println();
		
		int[] arr = new int[N];
	
		// ���� �߻���
		for(int i = 0; i<N; i++) arr[i] = rand.nextInt();

		int tmp = 0;
		long t = System.currentTimeMillis();
		for(int i = 0; i<=K; i++) {
			int a = rand.nextInt(N);
			int b = rand.nextInt(N);
			if(a>b) {
				a = tmp;
				b = a;
				tmp = b;
			}
			System.out.println("�հ� :" + Merge(a, b, arr));
			System.out.println("["+"���� " + a + "~" + b + "]");
			System.out.println();
		}
		
		System.out.println("");
		System.out.println("elapsed time : " + (System.currentTimeMillis() - t) + "ms");
	}
}


