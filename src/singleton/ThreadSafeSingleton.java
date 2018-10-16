package singleton;

public class ThreadSafeSingleton {
	// Ŭ������ �ε� �Ǿ ��ü�� �������� ����
	private static ThreadSafeSingleton instance;
	
	/* private���� �����Ͽ� new �������� ����� �����Ͽ�
	 * �߰����� �ν��Ͻ� ������ ���´�.
	 */
	private ThreadSafeSingleton () {
		Thread.yield(); // ��Ƽ ������ ������ �����ϰ� �ϱ� ����
		System.out.println("ThreadSafeSingleton::constructor called");
	}
	
	/* �̱��� ��ü�� ��� ���� �޼ҵ�
	 * synchronized ������ �̿��Ͽ� Thread-safety ����
	 */
	public static synchronized ThreadSafeSingleton getInstance () {
		if (instance == null) // �޼ҵ尡 ȣ��Ǿ��� ���� �����ϴ� Lazy ������ ���� �ڵ�
			// Thread-safety�� ���� �� �ϳ����� ��ü ����
			instance = new ThreadSafeSingleton();
		return instance;
	}
	
}


