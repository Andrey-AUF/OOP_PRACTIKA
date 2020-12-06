import java.util.StringJoiner;

public class Matrix {
    private final double[][] mnMatrix;
    private final int n;
    private final int m;

    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        mnMatrix = new double[n][m];
    }
    public double getAt(int n, int m) {
        return mnMatrix[n][m];
    }
    public void setAt(int n, int m, double values) {
        mnMatrix[n][m] = values;
    }

    @Override
    public String toString() {
        StringJoiner columnMatrix = new StringJoiner(";\n");
        StringJoiner lineMatrix = new StringJoiner(",");
        for (double[] lineArray : mnMatrix) {
            for (double element : lineArray) {
                lineMatrix.add(element + "");
            }
            columnMatrix.add(lineMatrix.toString());
            lineMatrix = new StringJoiner(",");
        }
        return columnMatrix.toString() + ";";
    }

}
