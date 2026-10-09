import java.util.Scanner;
class Example7{
	public static void main(String[] args) {
		
		int[][] matrixs1={{1,2},{3,4}};
		int[][] matrixs2={{5,6},{7,8}};

		int[][] matrics3=new int[2][2];
		for(int i=0; i<2;i++){
			for(int j=0;j<2;j++){
				matrics3[i][j]=matrixs1[i][j]+matrixs2[i][j];
			}
		}

		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.print(matrics3[i][j]);
			}
			System.out.println();
		}
		
	}
}