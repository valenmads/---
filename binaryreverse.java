import java.util.*;
public class binaryreverse {
	public static void main(String[] args) {
		System.out.print("10������ �ϳ� �Է��Ϸ�: ");
		Scanner scan = new Scanner(System.in);
		int x;
		int i = 0;
		int k;
		x = scan.nextInt();
		int[]lee; //c�� �����򰥸� �ƾǤ� ������ �迭 �̸� lee
		lee = new int[10];
		while(true) //���� ���ѷ��� �����ִ� break�Ұ�
		{
			lee[i] = x % 2; //�迭 �� �ڸ��� �� ������ ����
			x = x/2; //���� �� �����ʹ� x/2�ΰ��̿�! 
					i++; //���� ĭ���� 
					k=i;
		if(x==0)
			break;
		}
		for (i = 0; i<=k-1 ; i++) //-1 ó���� �װ� �����ؾ� �� ���̾�
		System.out.print(lee[i]);
}
}
