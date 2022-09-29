package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int sumOfDigits = number / 1000 + number%10 + (number%100)/10 + (number%1000)/100;
        System.out.println(sumOfDigits);
    }
}
