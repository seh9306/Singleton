package singleton;

public class SingletonAboutLoading {

	public static void main(String[] args) {
		
		System.out.println("\n");
		System.out.println("######### EagerSingleton #########");
		System.out.println("call EagerSingleton.test()");
		EagerSingleton.test();
		System.out.println("call EagerSingleton.getInstance()");
		EagerSingleton.getInstance();
		System.out.println("\n");

		System.out.println("######### LazySingleton #########");
		System.out.println("call LazySingleton.test()");
		LazySingleton.test();
		System.out.println("call LazySingleton.getInstance()");
		LazySingleton.getInstance();
		System.out.println("\n");
		
		System.out.println("######### OnDemandHolderIdiomSingleton #########");
		System.out.println("call OnDemandHolderIdiomSingleton.test()");
		OnDemandHolderIdiomSingleton.test();
		System.out.println("call OnDemandHolderIdiomSingleton.getInstance()");
		OnDemandHolderIdiomSingleton.getInstance();
		System.out.println("\n\n");
		
	}

}


