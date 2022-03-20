import java.util.Scanner;
public class firstweek2884 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int H, M;
		H= scan.nextInt();
		M= scan.nextInt();
		
		if (M<45)
		{
			H--;
			M = (60- (45-M));
			if (H <0)
			{
				H=23;
			}
			System.out.print(H+" "+M);
		}
		else
		{
			System.out.print(H+" "+(M-45));
		}

	}

}
