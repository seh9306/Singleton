package singleton;

public class LazySingleton {
	// Ŭ������ �ε� �Ǿ ��ü�� �������� ����
	private static LazySingleton instance;
	
	/* private���� �����Ͽ� new �������� ����� �����Ͽ�
	 * �߰����� �ν��Ͻ� ������ ���´�.
	 */
	private LazySingleton () {
		Thread.yield(); // ��Ƽ ������ ������ �����ϰ� �ϱ� ����
		System.out.println("LazySingleton::constructor called");
	}
	
	// �� Ŭ������ JVM�� �ε��ϱ� ���� �Լ�
	public static void test() {
		System.out.println("LazySingleton::test called");
	}
	
	// �̱��� ��ü�� ��� ���� �޼ҵ�
	public static LazySingleton getInstance () {
		if ( instance == null ) // �޼ҵ尡 ȣ��Ǿ��� ���� �����ϴ� Lazy ������ ���� �ڵ� 
			instance = new LazySingleton();
		return instance;
	}
	
}


