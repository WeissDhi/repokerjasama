import java.util.Scanner;

public class Assessment {

	public static void main(final String[] args) {
		
		Scanner input = new Scanner(System.in);
		int angka = input.nextInt();
		int[][] matriks = new int[angka][angka];

		for(int i = 0; i < angka; i++){
			for(int j = 0; j < angka; j++){
				matriks[i][j] = input.nextInt();
			}
		}

		for(int i = 0; i < angka; i++){
			for(int j = 0; j < angka; j++){
				for(int k = i+1; k < angka; k++){
					if(matriks[k][j] < matriks [i][j]){
						int temp = matriks[i][j];
						matriks [i][j] = matriks[k][j];
						matriks[k][j] = temp;
					}
					for(int l = j + 1; l < angka; l++){
						if(matriks[i][l] < matriks[i][j]){
							int temp = matriks[i][j];
							matriks[i][j] = matriks[i][l];
							matriks[i][l] = temp;
						}
					}
				}
			}
		}

		for(int i = 0; i < angka; i++){
			for(int j = 0; j < angka; j++){
				for(int k = j+1; k < angka; k++){
					if(matriks[i][k] < matriks[i][j]){
						int temp = matriks[i][j];
						matriks [i][j] = matriks[i][k];
						matriks[i][k] = temp;
					}
				}
			}
		}

		for(int i = 0; i < angka; i++){
			for(int j = 0; j < angka; j++){
				System.out.print(matriks[i][j]);
				if(j < (angka-1)){
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}