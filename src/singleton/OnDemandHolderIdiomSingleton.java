package singleton;

public class OnDemandHolderIdiomSingleton {
	/* private으로 선언하여 new 연산자의 사용을 제한하여
	 * 추가적인 인스턴스 생성을 막는다.
	 */
	private OnDemandHolderIdiomSingleton () {
		Thread.yield(); // 멀티 스레드 접근을 원할하게 하기 위함
		System.out.println("OnDemandHolderIdiomSingleton::constructor called");
	}
	
	private static class Singleton {
		/* 내부 스태틱 클래스의 로드 시점을 이용하여 
		 * Thread-safety와 단 한 개만의 인스턴스를 보장한다.
		 */
		private static final OnDemandHolderIdiomSingleton instance 
								= new OnDemandHolderIdiomSingleton();
	}
	
	// 본 클래스를 JVM에 로드하기 위한 함수 
	public static void test() {
		System.out.println("OnDemandHolderIdiomSingleton::test called");
	}
	
	// 싱글톤 객체를 얻기 위한 메소드
	public static OnDemandHolderIdiomSingleton getInstance () {
		return Singleton.instance;
	}
}


