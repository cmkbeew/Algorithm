package chap3.pracQ;

import java.util.Scanner;

// p.113.Q1: 3-3 seqSearchSen 메서드를 while문 -> for문으로 수정
public class SeqSearchSenFor {
	static int seqSearchSen(int[] a, int n, int key) {
		int i = 0;
		
		a[n] = key;		// 보초 추가
		
//		while(true) {
//			if(a[i] == key)
//				break;
//			i++; 
//		}
		for(i=0; a[i] != key; i++ ) {
			;
		}
		return i == n ? -1 : i;
	}

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = sn.nextInt();
		int[] x = new int[num + 1];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"]: ");
			x[i] = sn.nextInt();
		}
		
		System.out.print("검색할 값: ");
		int ky = sn.nextInt();
		
		int idx = seqSearchSen(x, num, ky);
		
		if(idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		}else {
			System.out.println("그 값은 x["+idx+"]에 있습니다.");
		}
	}
}
