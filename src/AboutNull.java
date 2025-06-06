public class AboutNull {
    public static void main(String[] args) {
        String refVar = "자바";  // 힙 영역에 메모리를 할당 받음
        String refVar2 = null;  // 힙 영역에 메모리 할당이 없음

        //NullpointException은 참조 변수를 사용할 때 가장 많이 나오는 오류 중 하나다.
        System.out.println(refVar == null);
        System.out.println(refVar2 == null);


        // int[] intArrray = null;
        // intArrray[0] = 10; // NullPointException 발생

        String hobby = "Travel";
        hobby = null;
        //String hobby는 힙 영역에 메모리를 할당 받아 객체가 되었지만 Null이 대입되면 쓰레기 객체가 된다.

        String kind1 = "Car";
        String kind2 = kind1;
        kind1 = null;
        System.out.println("kind2 :" + kind2);



    }
}
