import java.util.Scanner;
public class firstweek2530 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int H, M, S, T;
		H= scan.nextInt();
		M= scan.nextInt();
		S= scan.nextInt();
		T= scan.nextInt();
		
		S += T;
		M+=S/60;
		H+=M/60;
		
		S%=60;
		M%=60;
		H%=24;
		
		System.out.println(H + " " + M + " " + S);
		
	}

}
