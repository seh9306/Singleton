package singleton;

public class User extends Thread {
	
	private int index;
	
	public User setIndex(int index) {
		this.index = index;
		return this;
	}
	
	@Override
	public void run() {
		switch(index) {
		case 0:
			System.out.println(EagerSingleton.getInstance().toString());
			break;
		case 1:
			System.out.println(LazySingleton.getInstance().toString());
			break;
		case 2:
			System.out.println(ThreadSafeSingleton.getInstance().toString());
			break;
		case 3:
			System.out.println(OnDemandHolderIdiomSingleton.getInstance().toString());
			break;
		}
	}
}
