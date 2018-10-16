package singleton;

public class EagerSingleton {
	// 클래스가 로드되는 시점에 즉각 생성
	private static EagerSingleton instance = new EagerSingleton();

	/* private으로 선언하여 new 연산자의 사용을 제한하여
	 * 추가적인 인스턴스 생성을 막는다.
	 */
	private EagerSingleton() {
		Thread.yield(); // 멀티 스레드 접근을 원할하게 하기 위함
		System.out.println("EagerSingleton::constructor called");
	}
	
	// 본 클래스를 JVM에 로드하기 위한 함수
	public static void test() {
		System.out.println("EagerSingleton::test called");
	}

	// 싱글톤 객체를 얻기 위한 메소드
	public static EagerSingleton getInstance() {
		return instance;
	}
	
}


