package exercises.numbers;

import java.util.stream.IntStream;

class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        return (int) Math.pow(IntStream.rangeClosed(0, input)
                .sum(),2);
    }

    int computeSumOfSquaresTo(int input) {
        return IntStream.rangeClosed(0, input)
                .map(v->(int) Math.pow(v,2))
                .sum();
    }

    int computeDifferenceOfSquares(int input) {
       return  computeSquareOfSumTo(input)-computeSumOfSquaresTo(input);
    }

    public static void main(String [] args){
        DifferenceOfSquaresCalculator f=new DifferenceOfSquaresCalculator();
        System.out.println(f.computeSquareOfSumTo(10));
    }

}