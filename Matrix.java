import java.util.Random;
public class Matrix {
    private double[][] matrix;
    private int rows;
    private int cols;
    Random r = new Random();

    // Constructor for creating a matrix with a given number of rows and columns
    public Matrix(int rows, int cols) {
        this.matrix = new double[rows][cols];
        this.rows = rows;
        this.cols = cols;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j] = r.nextDouble(10);
            }
        }
    }

    // Method for adding another matrix to this matrix
    public void add(Matrix other) {
        if (this.rows != other.rows || this.cols != other.cols) {
            throw new IllegalArgumentException("Cannot add matrices with different dimensions");
        }

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                this.matrix[i][j] += other.matrix[i][j];
            }
        }
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                System.out.print(this.matrix[i][j]);
            }
            System.out.println();
        }
    }

    // Method for multiplying this matrix by a scalar value
    public void multiply(double number) {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                this.matrix[i][j] *= number;
            }
        }
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                System.out.print(this.matrix[i][j]);
            }
            System.out.println();
        }
    }

    // Method for printing the matrix
    public void print() {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                System.out.print(this.matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Optional method for multiplying two matrices
    public static Matrix multiply(Matrix m1, Matrix m2) {
        if (m1.cols != m2.rows) {
            throw new IllegalArgumentException("Cannot multiply matrices with incompatible dimensions");
        }

        Matrix result = new Matrix(m1.rows, m2.cols);

        for (int i = 0; i < result.rows; i++) {
            for (int j = 0; j < result.cols; j++) {
                double sum = 0;
                for (int k = 0; k < m1.cols; k++) {
                    sum += m1.matrix[i][k] * m2.matrix[k][j];
                }
                result.matrix[i][j] = sum;
            }
        }

        return result;
    }
}