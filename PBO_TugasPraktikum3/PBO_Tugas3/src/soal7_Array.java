
public class soal7_Array {

	public static void main(String[] args) {
        //Array satu dimensi
        int[] firstArray = {2, 5, 3};
        int[] secondArray = {9, 5, 3};
        int[] thirdArray = {2, 4, 9};
        int[] fourthArray = {10, 11, 12};
        int[] fifthArray = {13, 14, 15};
        int[] sixthArray = {16, 17, 18};
        int[] seventhArray = {19, 20, 21};
        int[] eighthArray = {22, 23, 24};
        int[] ninthArray = {25, 26, 27};
        
        //Array dua dimensi
        int[][] twoDimensionalArray1 = {firstArray, secondArray, thirdArray};
        int[][] twoDimensionalArray2 = {fourthArray, fifthArray, sixthArray};
        int[][] twoDimensionalArray3 = {seventhArray, eighthArray, ninthArray};
        
        //Array tiga dimensi
        int[][][] threeDimensionalArray = {twoDimensionalArray1,twoDimensionalArray2, twoDimensionalArray3};
        
        for(int x=0; x<threeDimensionalArray.length; x++){
            System.out.print("{");
            for(int y=0; y<threeDimensionalArray[x].length; y++){
                System.out.print("{");
                for(int z=0; z<threeDimensionalArray[x][y].length; z++){
                    System.out.print(threeDimensionalArray[x][y][z] + " ");
                }
                System.out.print("} ");
            }
            System.out.print("}");
            System.out.println();
        }          

	}

}
