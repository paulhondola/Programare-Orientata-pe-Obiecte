class Main {

	public static void main(String[] args) {
		Plane boeing = new Boeing("BOEING", 1200, 200);
		Plane concorde = new Concorde("CONCORDE", 1500, 100);
		Plane mig = new Mig("MIG", 2000);
		Plane tomcat = new TomCat("TOMCAT", 2500);

		System.out.println(boeing);
		System.out.println(concorde);
		System.out.println(mig);
		System.out.println(tomcat);

		// Passenger Plane Test

		((Concorde) concorde).goSupersonic();
		((Concorde) concorde).goSubsonic();

		// Fighter Plane Test

		((FighterPlane)tomcat).launchMissile();
		((TomCat) tomcat).refuel();
		((FighterPlane) mig).launchMissile();
		((Mig) mig).normalGeometry();
		((Mig) mig).highSpeedGeometry();
	}
}
