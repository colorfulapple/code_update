public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

/*
첫 줄 : 'HelloWorld라는 이름의 공개된 클래스를 만든다'
    class HelloWorld : HelloWorld라는 클래스 정의
        HelloWorld : 이름
        class : 객체 지향 프로그래밍의 기본 단위! 나중에 자세히 배운다.
    public : 접근 제어자 (어디에서나 접근 가능하다는 뜻을 가진 접근 제어자)
             공적인 이라는 뜻을 가진 단어, 누구나 사용할 수 있는 공적인 클래스

두 번째 줄 :
1. main 메소드가 있다
2. main 메소드는 누구나 접근할 수 있고 (public), 바로 실행할 수 있고 (static), 아무 것도 되돌려주지 않습니다. (void)
3. 나중에 main 메소드에 전달해주고 싶은 값이 있다면, 문자열 형태로 전달해야 하며, main 메소드 안에서 'args' 라는 이름으로 사용할 수 있습니다.
    static : 객체 지향 프로그래밍에 중요한 키워드 (일단 무시), main 앞에 항상 붙음
    main : 메소드(=함수) 이름, 프로그램 실행 시 자바가 메인 메소드를 찾아 실행하므로 반드시 명을 main으로 해야 함.
    String[] args : 파라미터 (args라는 문자열 배열을 파라미터로 받는다), args라는 이름의 문자열 변수가 메소드에 전달된다는 뜻
        String[] : 문자열 의미
        args : 변수 이름
    void : 메소드(함수)의 리턴 값의 자료형을 나타낸다 (void일 경우 리턴 값이 없고, 정수 값이 리턴 값이라면 int 작성)

세 번째 줄 : 'System'이라는 자바에 내장되어 있는 클래스의 'out' 안에 있는 'println' 메소드를 사용해 Hello, World!를 출력하라는 뜻입니다.
    System : 자바에서 미리 직접 만들어둔 클래스. 입력, 출력 등 시스템에 관련된 기능들을 모아둔 클래스
    out : 출력과 관련된 기능이 들어있는 것
    println : 메소드, (ln은 line을 의미, 다음 줄로 넘겨주는 역할)
    "Hello World!" : 파라미터로 문자열 "Hello World!" 넘겨줌

결과 : 콘솔 창에 Hello World 출력
 */
