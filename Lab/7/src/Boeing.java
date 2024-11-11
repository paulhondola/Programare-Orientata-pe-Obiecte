class Boeing extends PassagerPlane {

	public Boeing(String planeID, int totalEnginePower, int maxPassagers) {
		super(planeID, totalEnginePower, maxPassagers);
	}

	public void fly() {
		System.out.println("Boeing is flying");
	}
}
