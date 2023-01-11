package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        int nines = 9;
        for (int i = 1; i <= lengthOfLastNumber; i++) {
            sum += nines;
            nines=nines*10+9;
        }
        System.out.println(sum);
    }
}
