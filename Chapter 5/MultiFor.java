class MultiFor {

	public static void main(String[] args) {

		for (int x = 0; x < 4; x++) {

			if (x == 1) {
				x++;
			}
			
			for (int y = 4; y > 2; y--) {
				System.out.println(x + " " + y);
			}

		}
	}
}