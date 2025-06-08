public class ArrayCopy {
    public static void main(String[] args) {
        // 길이가 3인 배열
        int[] oldArray =  { 1, 2, 3};
        // 길이가 5인 배열
        int[] newArray = new int[5];
        //배열 항목 복사
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        // newArray의 값은 { 1, 2, 3, 0, 0 }
        }
}
