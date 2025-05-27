public class CompareExample {
    public static void main(String[] args) {
        int[] arr1;
        int[] arr2;
        int[] arr3;

        arr1 = new int[] {1,2,3};
        arr2 = new int[] {1,2,3};
        arr3 = arr2;

        System.out.println(arr1 == arr2);
        System.out.println(arr2 == arr3);
        // arr1 과 arr2 는 같은 값을 가진 배열이라 비교연산자를 통해 true가 나올 것이라 생각하기 쉬우나,
        // 서로 다른 heap영역에 저장된 서로 다른 객체로 인식되기 때문에 arr1 과 aar2는 같지 않다
    }
}
