package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        int sumOfDigits = 0;
        t = Math.abs(t);
        int lengthOfT = String.valueOf(t).length();
        for (int i = 0; i < lengthOfT; i++) {
            sumOfDigits += t % 10;
            t /= 10;
        }
        System.out.println(sumOfDigits);
    }
}
