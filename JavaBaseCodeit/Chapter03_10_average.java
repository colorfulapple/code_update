public class JavaBaseCodeit_Chapter03_10_average {
    public static void main(String[] args) {
        int koreanScore = 86;
        int mathScore = 94;
        int scienceScore = 87;
        int computerScore = 100;

        double average = (double) (koreanScore + mathScore + scienceScore + computerScore)/4;
        System.out.println(average);
    }
}
