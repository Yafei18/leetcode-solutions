import java.util.*;

class rotateMatrix {
	public static void main(String[] args){
		rotateMatrix instance = new rotateMatrix();
		int M[][] = { {1, 2, 3}, 
					{5, 6, 7},     
					{9, 10, 11}}; 
		instance.printM(instance.rorate(M, 1));
		System.out.println();
		instance.printM(instance.rorate(M, 2));
		System.out.println();
		instance.printM(instance.rorate(M, 3));
	}

	public int[][] rorate(int[][] M, int n){
		if(n == 1){
			// rotate 90
			int[][] res = rotate90(M);
			return res;
		}
		else if(n == 2){
			// rotate 180
			int[][] res = rotate180(M);
			return res;
		}
		else if(n == 3){
			// rotate 270
			int[][] res = rotate270(M);
			return res;
		}
		else{
			System.out.print("invalid n value");
			return new int[0][0];
		}
	}

	public int[][] rotate90(int[][] M){
		int n = M.length;
		int[][] res = new int[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(i + j == n - 1 || j == i){
					// diagonal and anti-diagonal
					res[i][j] = M[i][j];
				}
				else{
					res[j][n - 1 - i] = M[i][j];
				}
			}
		}
		return res;
	}

	public int[][] rotate180(int[][] M){
		int n = M.length;
		int[][] res = new int[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(i + j == n - 1 || j == i){
					// diagonal and anti-diagonal
					res[i][j] = M[i][j];
				}
				else{
					res[n - 1 - i][n - 1 - j] = M[i][j];
				}
			}
		}
		return res;
	}

	public int[][] rotate270(int[][] M){
		int n = M.length;
		int[][] res = new int[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(i + j == n - 1 || j == i){
					// diagonal and anti-diagonal
					res[i][j] = M[i][j];
				}
				else{
					res[n - 1 - j][i] = M[i][j];
				}
			}
		}
		return res;
	}

	public void printM(int[][] M){
		for(int i = 0; i < M.length; i++){
			for(int j = 0; j < M[0].length; j++){
				System.out.print(M[i][j] + " ");
			}
			System.out.println();
		}
	}
}