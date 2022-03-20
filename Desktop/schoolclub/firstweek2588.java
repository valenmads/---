import java.util.Scanner;
public class firstweek2588 {
	public static void main(String[] args) {
		int a, b, i, j, k;
		Scanner scan = new Scanner(System.in);
		a= scan.nextInt();
		b= scan.nextInt();
		
		i= a * (b%10);
		j= a * (b/10%10);
		k= a * (b/100%100);
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(i + 10*j + 100*k);
	}

}
