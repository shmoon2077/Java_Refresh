public class ArrayCreate2 {
    public static void main(String[] args) {
        // 배열 변수 선언
        int[] scores;
        // 배열 변수에 배열을 대입
        scores = new int[] { 83, 90, 87};
        int sum1 = 0;
        for(int i = 0; i < scores.length; i++){
            sum1 += scores[i];
        }
        System.out.println("총합 : " + sum1);

        // 배열을 매개값으로 주고, printItem() 메서드 호출
        printItem( new int[] { 83, 90,97 });

    }
    //printItem() 메서드 선언
    public static void printItem(int[] scores){
        //매개변수가 참조하는 배열의 항목을 출력
        for(int i = 0; i < scores.length; i++){
            System.out.println("score[" + i + "]: " + scores[i]);
        }
    }

}
