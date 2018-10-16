package singleton;

public class EagerSingleton {
	// Ŭ������ �ε�Ǵ� ������ �ﰢ ����
	private static EagerSingleton instance = new EagerSingleton();

	/* private���� �����Ͽ� new �������� ����� �����Ͽ�
	 * �߰����� �ν��Ͻ� ������ ���´�.
	 */
	private EagerSingleton() {
		Thread.yield(); // ��Ƽ ������ ������ �����ϰ� �ϱ� ����
		System.out.println("EagerSingleton::constructor called");
	}
	
	// �� Ŭ������ JVM�� �ε��ϱ� ���� �Լ�
	public static void test() {
		System.out.println("EagerSingleton::test called");
	}

	// �̱��� ��ü�� ��� ���� �޼ҵ�
	public static EagerSingleton getInstance() {
		return instance;
	}
	
}


