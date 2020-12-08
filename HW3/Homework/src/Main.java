import java.util.Scanner;
public class Main {
	
	static int max(int a , int b) {
		if(a>=b) return a ; 
		else return b;
	}
	
	static int min(int a, int b) {
		if(a>=b) return b; 
		else return a;
	}
	
	
	static int histo(int[] v, int a, int b) {
		if(a==b) return v[a];
		int mid = (a+b)/2;
		int ans = max(histo(a,b), histo(mid + 1, b));
		
		int low = mid;
		int high = mid + 1;
		int height = min(v[low], v[high]);
		ans = max(ans, height*2);
		/*
		while (a<low || high <b) {
			if(high<b && ((low==a) || v[low -1] < v[high+1])) {
				high++;
				height = min(height, v[high]);
			}
			else {
				low--;
				height = min(height, v[low]);
			}
			ans = max(ans, height*(high-low +1));
		}
		*/
		return ans;
	}
	
	//	히스토그램에서 최대의 직사각형 넓이를 계산해서 출력하는 함수
	//	v : 히스토그램의 샘플들의 도수들의 배열 (0 이상의 자연수)
	//	n : 샘플의 갯수
	static int histo(int[] v, int n) {
		//	v[0..n-1] 구간의 넓이를 구해서 그 값을 반환합니다.
		return histo(v, 0, n-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] v = new int[n];
		for(int i = 0; i < n; i++) {
			v[i] = sc.nextInt();
		}
		
		
		int r = histo(v, n);
		System.out.println(r);
	}
}
