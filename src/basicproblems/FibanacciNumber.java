package basicproblems;

public class FibanacciNumber {

	public static void main(String[] args) {

		int seriesnum = 7, firstnum = 0, secondnum = 1, thirdnum;

		for (int i = 0; i <= seriesnum; i++) {

			thirdnum = firstnum + secondnum;

			System.out.println(firstnum + " " + secondnum);
		
			firstnum = secondnum;

			secondnum = thirdnum;
			
		}

	}

}
