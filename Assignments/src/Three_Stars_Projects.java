
public class Three_Stars_Projects {

	public static void main(String[] args) {
		
		int n = 15;

		System.out.println("Display Project 3 ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (i+j<=(n-1)/2 || j-i>=(n-1)/2 ||
						j==0 || j==n-1 || i==n-1) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("Display Project 4 ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (i-j>=(n-1)/2 || i+j>= (n-1) + (n-1)/2
						|| i==n-2) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.println();
		}

		System.out.println("Display Project 5  ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (i+j<= (n-1)/2 || i==0 || i==n-1
						|| i-j>=(n-1)/2) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
