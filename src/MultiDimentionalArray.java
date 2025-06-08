public class MultiDimentionalArray {
    public static void main(String[] args) {
        //2 차원 배열 생성
        int[][] scores = {
                {80, 90 , 96}, // 첫번째 반
                {76, 88} // 두번째
        };
        //배열의 길이
        System.out.println("1차원 배열의 길이(반의 수) : " + scores.length);
        System.out.println("2차원 배열의 길이(첫번째 반의 학생 수) : " + scores[0].length);
        System.out.println("2차원 배열의 길이(번째 반의 학생 수) : " + scores[1].length);


        int class1Sum = 0;
        for(int i = 0; i < scores[0].length; i++){
            class1Sum += scores[0][i];
        }
        double class1Avg = class1Sum / scores[0].length;
        System.out.println("첫 번째 반의 평균 점수 : " + class1Avg);

        int class2Sum = 0;
        for(int k =0; k < scores[1].length; k++) {
            class2Sum += scores[1][k];
        }
        double class2Avg = class2Sum / scores[1].length;
        System.out.println("두번째 반의 평균 점수  : " + class2Avg);

        //전체 학생의 평균 구하기 (2차원 배열 연산)
        int totalStudent = 0;
        int totalSum = 0;
        for (int i=0; i < scores.length; i++) { // 반의 수만큼 반복
            totalStudent += scores[i].length;  // 반의 학생 수 합산
            for(int k=0; k < scores[i].length; k++){ // 해당 반의 학생 수만큼 반복
                totalSum += scores[i][k];  // 학생 점수 합
            }
        }
        double totalAvg = (double)totalSum / totalStudent;
        System.out.println("전체 학생의 평균 점 : " + totalAvg);
    }
}
