package singleton;

public class SingletonAboutTime {

	public static void main(String[] args) {
		try {
			new User().setIndex(0).start();
			new User().setIndex(0).start();
			new User().setIndex(0).start();
			new User().setIndex(0).start();
			new User().setIndex(0).start();
			new User().setIndex(0).start();
			new User().setIndex(0).start();
			new User().setIndex(0).start();
			Thread.sleep(500);
			System.out.println("\n");
			Thread.sleep(500);
			new User().setIndex(1).start();
			new User().setIndex(1).start();
			new User().setIndex(1).start();
			new User().setIndex(1).start();
			new User().setIndex(1).start();
			new User().setIndex(1).start();
			new User().setIndex(1).start();
			new User().setIndex(1).start();	
			Thread.sleep(500);
			System.out.println("\n");
			Thread.sleep(500);
			new User().setIndex(2).start();
			new User().setIndex(2).start();
			new User().setIndex(2).start();
			new User().setIndex(2).start();
			new User().setIndex(2).start();
			new User().setIndex(2).start();
			new User().setIndex(2).start();
			new User().setIndex(2).start();	
			Thread.sleep(500);
			System.out.println("\n");
			Thread.sleep(500);
			new User().setIndex(3).start();
			new User().setIndex(3).start();
			new User().setIndex(3).start();
			new User().setIndex(3).start();
			new User().setIndex(3).start();
			new User().setIndex(3).start();
			new User().setIndex(3).start();
			new User().setIndex(3).start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


