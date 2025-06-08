public class EnhancedForLoop {
    public static void main(String[] args) {
        int[] scores = { 95, 71, 84 , 93, 87 };
        int sum = 0;
        // 향상된 for 문
        for (int score : scores) {
            sum = sum + score;
        }
        System.out.println(sum);
    }
}
