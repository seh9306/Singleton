package singleton;

public class ThreadSafeSingleton {
	// 클래스가 로드 되어도 객체를 생성하지 않음
	private static ThreadSafeSingleton instance;
	
	/* private으로 선언하여 new 연산자의 사용을 제한하여
	 * 추가적인 인스턴스 생성을 막는다.
	 */
	private ThreadSafeSingleton () {
		Thread.yield(); // 멀티 스레드 접근을 원할하게 하기 위함
		System.out.println("ThreadSafeSingleton::constructor called");
	}
	
	/* 싱글톤 객체를 얻기 위한 메소드
	 * synchronized 구문을 이용하여 Thread-safety 보장
	 */
	public static synchronized ThreadSafeSingleton getInstance () {
		if (instance == null) // 메소드가 호출되었을 때만 생성하는 Lazy 생성을 위한 코드
			// Thread-safety를 통한 단 하나만의 객체 생성
			instance = new ThreadSafeSingleton();
		return instance;
	}
	
}


