class Concorde extends PassengerPlane {

	public Concorde(String planeID, int totalEnginePower, int maxPassengers) {
		super(planeID, totalEnginePower, maxPassengers);
	}

	public void goSubsonic() {
		System.out.println(getPlaneID() + " - Supersonic mode deactivated");
	}

	public void goSupersonic() {
		System.out.println(getPlaneID() + " - Supersonic mode activated");
	}
}
