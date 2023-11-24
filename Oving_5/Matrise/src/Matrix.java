import java.util.Scanner;
public class Matrix {
    private int rowsLength;
    private int numbersOfColumbs;
    private int[][] matrix;


    public Matrix() {

        System.out.println("Number of rows: ");
        rowsLength = Integer.parseInt(new Scanner(System.in).nextLine());

        int[] rows = new int[rowsLength];
        System.out.println("Number of columbs: ");
        numbersOfColumbs = Integer.parseInt(new Scanner(System.in).nextLine());

        //lager en to dimensjonal arrat med ant rader lik rowsLength og kolonner lik numbersOfColumbs
        matrix = new int[rowsLength][numbersOfColumbs];

        for (int i = 0; i < rowsLength; i++) {
            System.out.println("Values of row: " + (i+1));

            for (int j = 0; j < numbersOfColumbs; j++) {
                System.out.println("x_" + (j + 1) + " = ");
                int input = Integer.parseInt(new Scanner(System.in).nextLine());
                matrix[i][j] = input;

            }
        }
        System.out.println("Matrix");
        for (int i = 0; i < rowsLength; i++){
            System.out.print("[");
            for (int j = 0; j < numbersOfColumbs; j++){
                System.out.print(matrix[i][j]);
                if (j < numbersOfColumbs - 1){
                    System.out.print(" ");
                }
            }
            System.out.println("]");
        }
    }
    public int getRowsLength(){return rowsLength;}
    public int getNumbersOfColumbs(){return numbersOfColumbs;}
    public int getElement(int row, int column){return matrix[row][column];}

    public void addMatrix(Matrix newMatrix){
        if(rowsLength == newMatrix.getRowsLength() && numbersOfColumbs == newMatrix.getNumbersOfColumbs()){
            for (int k = 0; k < rowsLength; k++){
                for (int l = 0; l < numbersOfColumbs; l++){
                    matrix[k][l] += newMatrix.getElement(k,l);
                }
            }
            //Skriver ut den adderte matrisen
            System.out.println("Addition matrix result: ");
            for(int i = 0; i < rowsLength; i++){
                System.out.print("[ ");
                for (int j = 0; j < numbersOfColumbs; j++){
                    System.out.print(matrix[i][j]);
                    if (j < numbersOfColumbs - 1){
                        System.out.print(" ");
                    }
                }
                System.out.println(" ]");
            }
        } else {
            System.out.println("Matrix must have same dimensions");
        }

    }
    public void multiplyMatrix(Matrix newMatrix) {

        if (numbersOfColumbs == newMatrix.getRowsLength()) {
            int[][] resultMatrix = new int[rowsLength][newMatrix.getNumbersOfColumbs()];

            for (int i = 0; i < rowsLength; i++) {
                for (int j = 0; j < newMatrix.getNumbersOfColumbs(); j++) {
                    for (int k = 0; k < numbersOfColumbs; k++) {
                        resultMatrix[i][j] += matrix[i][k] * newMatrix.getElement(k, j);
                    }
                }
            }
            matrix = resultMatrix;

            System.out.println("Multiplied matrix result: ");
            for (int i = 0; i < rowsLength; i++) {
                System.out.print("[ ");
                for (int j = 0; j < getNumbersOfColumbs(); j++) {
                    System.out.print(matrix[i][j]);
                    if (j < newMatrix.getNumbersOfColumbs() - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.println(" ]");

            }
        } else {
            System.out.println("Multiplication: matrix must have same dimensions");
        }
    }
    public int[][] matrixTransformation(){
        int [][] transportedMatrix = new int[numbersOfColumbs][rowsLength];
        System.out.println("Transported matrix");

        for (int i = 0; i < rowsLength; i++){
            for (int j = 0; j < numbersOfColumbs; j++){
                transportedMatrix[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < numbersOfColumbs; i++){
            System.out.print("[ ");
            for (int j = 0; j < rowsLength; j++){
                System.out.print(transportedMatrix[i][j]);
                if (j < rowsLength -1){
                    System.out.print(" ");
                }
            }
            System.out.println("]");
        }
        return transportedMatrix;
    }
}