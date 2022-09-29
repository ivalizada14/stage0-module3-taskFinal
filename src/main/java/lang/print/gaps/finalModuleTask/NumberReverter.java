package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int reversedNumber = 0;
        reversedNumber = (number%10) * 100 + (number/100) + (number%100)/10*10;
        System.out.println(reversedNumber);
    }
}
