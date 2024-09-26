public class NumWordPrinter {

    public String printWord(int n, boolean toUpperCase) {
        String result;

        boolean isDivisibleBy2 = n % 2 == 0;
        boolean isDivisibleBy11 = n % 11 == 0;
        boolean isDivisibleBy13 = n % 13 == 0;

        if (isDivisibleBy2 && isDivisibleBy11 && isDivisibleBy13) {
            result = "EvenPrimeLucky";
        } else if (isDivisibleBy2 && isDivisibleBy11) {
            result = "EvenPrimeEleven";
        } else if (isDivisibleBy2) {
            result = "Even";
        } else if (isDivisibleBy11) {
            result = "PrimeEleven";
        } else if (isDivisibleBy13) {
            result = "LuckyThirteen";
        } else {
            result = "OddOneOut";
        }

        return toUpperCase ? result.toUpperCase() : result;
    }
}
