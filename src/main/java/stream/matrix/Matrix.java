package stream.matrix;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;
class Matrix {
    private List<List<Integer>> internalMatrix;
    Matrix(String matrixAsString) {
        internalMatrix = Stream.of(matrixAsString.split("\n"))
                .map( Matrix::splitRow )
                .collect(toList());
    }
    private static List<Integer> splitRow(String s) {
        return Stream.of(s.split(" "))
                .map(Integer::valueOf)
                .collect(toList());
    }
    int[] getRow(int rowNumber) {
        return internalMatrix.get(rowNumber-1).stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
    int[] getColumn(int columnNumber) {
        return internalMatrix.stream()
                .map(row -> row.get(columnNumber-1))
                .mapToInt(Integer::intValue)
                .toArray();
    }
    int getRowsCount() {
        return internalMatrix.size();
    }
    int getColumnsCount() {
        return internalMatrix.stream()
                .findFirst()
                .map(List::size)
                .orElse(0);
    }

    public static  void main(String args[]){
        String matrixAsString = "1 2 3 4\n5 6 7 8\n9 8 7 6";
        int columnIndex = 4;
        int[] expectedColumn = { 4, 8, 6 };
        Matrix matrix = new Matrix(matrixAsString);
        Arrays.stream(matrix.getColumn(columnIndex)).forEach(e->System.out.print(e));
        final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String[] array  = alphabet.chars()
                .mapToObj(c ->  c+"").
                        toArray(String[]::new);
    }
}