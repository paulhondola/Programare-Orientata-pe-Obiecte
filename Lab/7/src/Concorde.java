class Concorde extends PassagerPlane {

	public Concorde(String planeID, int totalEnginePower, int maxPassagers) {
		super(planeID, totalEnginePower, maxPassagers);
	}

	public void goSubsonic() {
		System.out.println(planeID + " - Supersonic mode deactivated");
	}

	public void goSupersonic() {
		System.out.println(planeID + " - Supersonic mode activated");
	}
}
