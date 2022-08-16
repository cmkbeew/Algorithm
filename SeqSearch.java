package chap3;

import java.util.Scanner;

// p.100.3-1: ���� �˻�
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
		
		System.out.print("��ڼ�: ");
		int num = sn.nextInt();
		int[] x = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"]: ");
			x[i] = sn.nextInt();
		}
		
		System.out.print("�˻��� ��: ");
		int ky = sn.nextInt();
		
		int idx = seqSearch(x, num, ky);
		
		if(idx == -1) {
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		}else {
			System.out.println("�� ���� x["+idx+"]�� �ֽ��ϴ�.");
		}
	}
}
