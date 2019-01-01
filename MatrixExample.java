class MatrixExample {
	public static void main(String[] args) {
		int matrix1[][]={
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		int matrix2[][]={
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		
		System.out.println("행렬1");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(matrix1[i][j]+" ");
				if(j==2){
					System.out.println();
				}
			}
		}
		System.out.println("행렬2");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(matrix2[i][j]+" ");
				if(j==2){
					System.out.println();
				}
			}
		}
		int[][] sum=new int[3][3];
		int[][] dif=new int[3][3];
		int[][] mul=new int[3][3];
		
		System.out.println("행렬1+행렬2");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				sum[i][j]=matrix1[i][j]+matrix2[i][j];
				System.out.print(sum[i][j]+" ");
				if(j==2){
					System.out.println();
				}
			}
		}
		
		System.out.println("행렬1-행렬2");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				dif[i][j]=matrix1[i][j]-matrix2[i][j];
				System.out.print(dif[i][j]+" ");
				if(j==2){
					System.out.println();
				}
			}
		}
		
		System.out.println("행렬1*행렬2");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				for(int k=0;k<3;k++){
					mul[i][j]+=matrix1[i][k]*matrix2[k][j];
				}
				System.out.print(mul[i][j]+" ");
				if(j==2){
					System.out.println();
				}
			}
		}
	}
}