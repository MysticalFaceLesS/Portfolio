
public class LessonDz2 {

	public static void main(String[] args) {

//		int[][] matrix = {{5,1,2},
//			           	  {6,2,8},
//				          {1,9,4}};
//		
//		System.out.print(matrix[1][0]);
		
		int[][] Matrix = {
			{-9,1,0},
			{4,1,1},
			{-2,2,-1}
		};		

		for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
            	        System.out.print(Matrix[i][j] + "\t");
                    }
                    System.out.println();
                }
	}
}