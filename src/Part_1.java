public class Part_1 {
    public static void main(String[] args) {
        int intOperandA = 1;
        int intOperandB = 5;
        int intSum = 13;
        int intProduct = 17;
        int intDifference = 21;
        int intQuotient = 24;
        int intModulo = 27;
        double doubleOperandA = 3.50;
        double doubleOperandB = 5.25;
        double doubleSum = 6.15;
        double doubleProduct = 7.50;
        double doubleDifference = 9.25;
        double doubleQuotient = 10.15;
        double doubleModulo = 11.33;
            intSum = intOperandA + intOperandB;
                System.out.println( "The sum using ints of " + intOperandA + " and " + intOperandB + " is " + intSum );
            intProduct = intOperandA * intOperandB;
                System.out.println( "The product using ints of " + intOperandA + " and " + intOperandB + " is " + intProduct );
            intDifference = intOperandA - intOperandB;
                System.out.println( "The difference using ints of " + intOperandA + " and " + intOperandB + " is " + intDifference );
            intQuotient = intOperandA / intOperandB;
                System.out.println( "The quotient using ints of " + intOperandA + " and " + intOperandB + " is " + intQuotient );
            intModulo = intOperandA % intOperandB;
                System.out.println( "The remainder using ints of " + intOperandA + " and " + intOperandB + " is " + intModulo );
            doubleSum = doubleOperandA + doubleOperandB;
                System.out.println( "The sum using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum );
            doubleProduct = doubleOperandA * doubleOperandB;
                System.out.println( "The product using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct );
            doubleDifference = doubleOperandA - doubleOperandB;
                System.out.println( "The difference using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference );
            doubleQuotient = doubleOperandA / doubleOperandB;
                System.out.println( "The quotient using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient );
            doubleModulo = doubleOperandA % doubleOperandB;
                System.out.println( "The remainder using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleModulo );
    }
}