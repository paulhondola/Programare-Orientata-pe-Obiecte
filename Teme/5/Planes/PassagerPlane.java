class PassagerPlane extends Plane {

	private int maxPassengers;

	public PassagerPlane(String planeID, int totalEnginePower, int maxPassengers) {
		super(planeID, totalEnginePower);
		this.maxPassengers = maxPassengers;
	}

	public int getMaxPassengers() {
		return maxPassengers;
	}
}
