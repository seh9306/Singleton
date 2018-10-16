package singleton;

public class LazySingleton {
	// 클래스가 로드 되어도 객체를 생성하지 않음
	private static LazySingleton instance;
	
	/* private으로 선언하여 new 연산자의 사용을 제한하여
	 * 추가적인 인스턴스 생성을 막는다.
	 */
	private LazySingleton () {
		Thread.yield(); // 멀티 스레드 접근을 원할하게 하기 위함
		System.out.println("LazySingleton::constructor called");
	}
	
	// 본 클래스를 JVM에 로드하기 위한 함수
	public static void test() {
		System.out.println("LazySingleton::test called");
	}
	
	// 싱글톤 객체를 얻기 위한 메소드
	public static LazySingleton getInstance () {
		if ( instance == null ) // 메소드가 호출되었을 때만 생성하는 Lazy 생성을 위한 코드 
			instance = new LazySingleton();
		return instance;
	}
	
}


