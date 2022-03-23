import java.util.*;
public class binaryreverse {
	public static void main(String[] args) {
		System.out.print("10진수를 하나 입력하렴: ");
		Scanner scan = new Scanner(System.in);
		int x;
		int i = 0;
		int k;
		x = scan.nextInt();
		int[]lee; //c랑 ㅈㄴ헷갈림 아악ㄱ 이진수 배열 이름 lee
		lee = new int[10];
		while(true) //너의 무한루프 조금있다 break할것
		{
			lee[i] = x % 2; //배열 이 자리에 이 데이터 저장
			x = x/2; //이제 니 데이터는 x/2인것이여! 
					i++; //다음 칸으로 
					k=i;
		if(x==0)
			break;
		}
		for (i = 0; i<=k-1 ; i++) //-1 처리는 네가 주의해야 할 점이야
		System.out.print(lee[i]);
}
}
