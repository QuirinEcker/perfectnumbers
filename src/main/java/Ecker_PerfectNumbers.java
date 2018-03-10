public class Ecker_PerfectNumbers {

    public static void main(String[] args) {
        int ts = 0;

        for (int i = 1; i <= 10000; i++) {
            ts = teilersumme(i);
            if (ts == i){
                System.out.println(ts);
            }
        }
    }

    private static int teilersumme(int number) {
        int sum = 0;
        int devisor = 1;

        while (devisor < number) {
            if (number % devisor == 0) {
                sum += devisor;
            }
            devisor++;
        }
        return sum;
    }
}
