public class StringPlus {
    public static void main(String[] args) {
        //문자 추출 = String은 문자"열"이다.
        String subject = "자바 프로그래밍";
        char charValue = subject.charAt(3);
        System.out.println(charValue);

        //문자열의 길이
        int length = subject.length();
        System.out.println(length);

        //문자열 대체

        String oldStr = "자바 프로그래밍";
        String newStr = oldStr.replace("자바" , "JAVA");
        System.out.println(newStr);

    }
}
