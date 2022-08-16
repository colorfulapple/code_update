public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

/*
class HelloWorld : HelloWorld라는 클래스 정의
public : 접근 제어자 (어디에서나 접근 가능하다는 뜻을 가진 접근 제어자)

static : 객체 지향 프로그래밍에 중요한 키워드 (일단 무시)
main : 메소드(=함수) 이름,
       프로그램 실행 시 자바가 메인 메소드를 찾아 실행하므로 반드시 명을 main으로 해야 함.
String[] args : 파라미터 (args라는 문자열 배열을 파라미터로 받는다)
void : 메소드(함수)의 리턴 값의 자료형을 나타낸다 (void일 경우 리턴 값이 없고, 정수 값이 리턴 값이라면 int 작성)

System : System이라는 클래스의
out : out이라는 변수의
println : println이라는 메소드 호출
"Hello World!" : 파라미터로 문자열 "Hello World!" 넘겨줌

결론 : 콘솔 창에 Hello World 출력
 */
