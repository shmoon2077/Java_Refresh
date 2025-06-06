public class AboutString {
    public static void main(String[] args) {
        // String은 일반 자료 타입이 아닌 문자가 모인 문자"열" 참조 자료타입이다.

        String name;
        name = "홍길동";
        String hobby = "Travel";


        String name1 = "Moon";
        String name2 = "Moon";

        System.out.println(name1 == name2);  // true

        String name3 = new String("Moon");
        String name4 = new String("Moon"); //같은 값을 가진 서로 다른 객체 2개

        System.out.println(name3 == name4);  // false

        boolean result = name3.equals(name4);  // true
        System.out.println(result);

        // String 객체 비교에 있어서는 equals를 쓰는 것이 서로 객체 연관성을 생각하지 않고 비교할 수 있는 방법이다.
    }
}
