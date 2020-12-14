// N 개의 데이터 랜덤 생성, K 개의 구간 랜덤 생성
import java.util.*;

public class Main {
		static long Merge(int start, int end, int[] data) { //start부터 end에서의 구간합 구하기
			
			int min = data[start]; 
			int max = data[start]; 
			long total = 0; 
			
			for(int i = start; i < end; i++) {
				if(min > data[i]) min = data[i];
				if(max < data[i]) max = data[i];
				total += data[i];
			} 
			
			System.out.println("최소값 : " + min);
			System.out.println("최대값 : " + max);

			return total;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rand = new Random(1000);
		System.out.println("N 입력 : "); // N의 개수 100, 1000, 10000, 100000, 1000000으로 변경해보기
		int N = sc.nextInt();
		System.out.println("K 입력 : "); // K의 개수 100, 1000, 10000, 100000, 1000000으로 변경해보기 
		int K = sc.nextInt();
		System.out.println();
		
		int[] arr = new int[N];
	
		// 난수 발생기
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
			System.out.println("합계 :" + Merge(a, b, arr));
			System.out.println("["+"구간 " + a + "~" + b + "]");
			System.out.println();
		}
		
		System.out.println("");
		System.out.println("elapsed time : " + (System.currentTimeMillis() - t) + "ms");
	}
}


