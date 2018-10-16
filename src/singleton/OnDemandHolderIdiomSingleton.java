package singleton;

public class OnDemandHolderIdiomSingleton {
	/* private���� �����Ͽ� new �������� ����� �����Ͽ�
	 * �߰����� �ν��Ͻ� ������ ���´�.
	 */
	private OnDemandHolderIdiomSingleton () {
		Thread.yield(); // ��Ƽ ������ ������ �����ϰ� �ϱ� ����
		System.out.println("OnDemandHolderIdiomSingleton::constructor called");
	}
	
	private static class Singleton {
		/* ���� ����ƽ Ŭ������ �ε� ������ �̿��Ͽ� 
		 * Thread-safety�� �� �� ������ �ν��Ͻ��� �����Ѵ�.
		 */
		private static final OnDemandHolderIdiomSingleton instance 
								= new OnDemandHolderIdiomSingleton();
	}
	
	// �� Ŭ������ JVM�� �ε��ϱ� ���� �Լ� 
	public static void test() {
		System.out.println("OnDemandHolderIdiomSingleton::test called");
	}
	
	// �̱��� ��ü�� ��� ���� �޼ҵ�
	public static OnDemandHolderIdiomSingleton getInstance () {
		return Singleton.instance;
	}
}


