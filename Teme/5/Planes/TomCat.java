class TomCat extends FighterPlane {

	public TomCat(String planeID, int totalEnginePower) {
		super(planeID, totalEnginePower);
	}

	public void refuel() {
		System.out.println(
			planeID +
			" - Initiating refueling procedure - Locating refueller - Catching up - Refueling - Refueling complete"
		);
	}
}
