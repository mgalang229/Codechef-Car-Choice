import java.util.Scanner;

//change class to 'Main'
public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			double x1 = fs.nextDouble(), x2 = fs.nextDouble(), y1 = fs.nextDouble(), y2 = fs.nextDouble();
			double car1 = y1 / x1;
			double car2 = y2 / x2;
			if (car1 == car2) {
				System.out.println(0);
			} else if (car1 < car2) {
				System.out.println(-1);
			} else {
				System.out.println(1);
			}
		}
		fs.close();
	}
}
