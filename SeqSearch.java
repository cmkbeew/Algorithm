package chap3;

import java.util.Scanner;

// p.100.3-1: 선형 검색
public class SeqSearch {
	static int seqSearch(int[] a, int n, int key) {
		int i = 0;
		
		while(true) {
			if(i == n)
				return -1;
			if(a[i] == key)
				return i;
			i++;
		}
	}

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = sn.nextInt();
		int[] x = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"]: ");
			x[i] = sn.nextInt();
		}
		
		System.out.print("검색할 값: ");
		int ky = sn.nextInt();
		
		int idx = seqSearch(x, num, ky);
		
		if(idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		}else {
			System.out.println("그 값은 x["+idx+"]에 있습니다.");
		}
	}
}
