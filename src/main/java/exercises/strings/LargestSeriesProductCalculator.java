package exercises.strings;

class LargestSeriesProductCalculator {

    private char[] number;
    LargestSeriesProductCalculator(String inputNumber) {
        this.number = inputNumber.toCharArray();

    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) {
        long product=1l,max_product=0l;

        if(numberOfDigits>number.length){
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
        }
        if(numberOfDigits<0){
            throw new IllegalArgumentException("Series length must be non-negative.");
        }
        for(int i=0;i<=number.length-numberOfDigits;i++){
            product=1l;
            for(int j=i;j<i+numberOfDigits;j++){
                product=product*Character.getNumericValue(number[j]);
            }
            if(product>max_product){
                max_product=product;
            }
        }
        return max_product;
    }

    public static void main(String args[]){
        LargestSeriesProductCalculator calculator=new LargestSeriesProductCalculator("1027839564");
        System.out.println(calculator.calculateLargestProductForSeriesLength(3));
    }
}
