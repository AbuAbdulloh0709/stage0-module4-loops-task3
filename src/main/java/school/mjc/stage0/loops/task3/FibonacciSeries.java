package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {

        int first = 0;
        int second = 1;
        System.out.println(first);
        System.out.println(second);
        for (int i = 2; i <= lastFibonacci; i++) {
            second += first;
            first = second - first;
            System.out.println(second);
        }

    }
}
