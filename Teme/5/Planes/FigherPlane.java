class FighterPlane extends Plane {

	public FighterPlane(String planeID, int totalEnginePower) {
		super(planeID, totalEnginePower);
	}

	public void launchMissile() {
		System.out.println(
			planeID +
			" - Initiating missile launch procedure - Aquiring target - Launching missile - Breaking away - Missile launch complete"
		);
	}
}
