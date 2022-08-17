package chap3.pracQ;

import java.util.Scanner;

// p.114.Q3: 
public class SearchIndex {
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int count = 0;
		
		for(int i=0; i<n; i++) {
			if(a[i] == key) {
				idx[count++] = i;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.print("��ڼ�: ");
		int num = sn.nextInt();
		int[] x = new int[num];
		int[] y = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"]: ");
			x[i] = sn.nextInt();
		}
		
		System.out.print("�˻� ��: ");
		int ky = sn.nextInt();
		
		int count = searchIdx(x, num, ky, y);
		
		if(count == 0) {
			System.out.println("�� ���� �����ϴ�.");
		}else {
			for(int i=0; i<count; i++) {
				System.out.println("�� ���� x["+y[i]+"]�� �ֽ��ϴ�.");
			}
		}
	}

}
