package methods;

public class FibanocciSeriesMethod {

	public static void main(String[] args) {
		
		int series = 2;
		
		fibonacciSeries(series);
		System.out.println(" ");
		
		fibonacciSeries(10);
		System.out.println(" ");
		
		fibonacciSeries(15);
		System.out.println(" ");
		
		fibonacciSeries(23);
		System.out.println(" ");

	}
	public static void fibonacciSeries(int series) {
	
	int	firstnum = 0, secondnum = 1, thirdnum;

		for (int i = 0; i <= series; i++) {

			thirdnum = firstnum + secondnum;

			System.out.println(firstnum + " " + secondnum);

			firstnum = secondnum;

			secondnum = thirdnum;
		}
	}

}
