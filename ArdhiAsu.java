import java.util.Scanner;
public class ArdhiAsu {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner input = new Scanner(System.in);

		int angka = input.nextInt();
		int total = input.nextInt();

		String hasil = "";

		int[] arrAmsyong = new int[angka];
		String[] arrHasil = new String[angka];

		for (int i = 0; i < angka; i++) {
			arrAmsyong[i] = input.nextInt();
		}

		for (int i = 0; i < arrAmsyong.length; i++) {
			int angka1 = arrAmsyong[i];

			for (int j = i + 1; j < arrAmsyong.length; j++) {
				int angka2 = arrAmsyong[j];

				int x = i + 1;
				int y = j + 1;

				if (angka1 + angka2 == total) {
					hasil = x + " " + y;
				}
			}
			arrHasil[i] = hasil;

		}
        input.close();
		System.out.println(arrHasil[arrHasil.length -1]);
	}
}
