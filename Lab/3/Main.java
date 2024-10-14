class VersionedFile {

	// fields
	private String filename;
	private String content;
	private int numberOfConcatenations = 0;
	private int ID;

	// reference to the previous version
	private VersionedFile previousVersion;

	// constructor for the initial file version
	public VersionedFile(String filename, String content) {
		this.filename = filename;
		this.content = content;
		this.previousVersion = null;
		this.ID = hashCode();
	}

	// backup constructor
	public VersionedFile saveVersion() {
		VersionedFile backup = new VersionedFile(this.filename + ".bak", this.content);
		backup.previousVersion = this.previousVersion;
		this.previousVersion = backup;
		return backup;
	}

	public void concatFile(VersionedFile file) {
		VersionedFile backup = this.saveVersion();
		this.content += file.content;
		this.numberOfConcatenations++;
		this.previousVersion = backup;
	}

	public String toString() {
		return this.filename + " " + this.content;
	}

	public int getNumberOfConcatenations() {
		return this.numberOfConcatenations;
	}

	public int getID() {
		return ID;
	}

	public VersionedFile getPreviousVersion() {
		return this.previousVersion;
	}
}

class Main {

	public static void main(String[] args) {
		VersionedFile vf1 = new VersionedFile("test1.txt", "Hello");
		VersionedFile vf2 = new VersionedFile("test2.txt", "World");
		VersionedFile vf3 = new VersionedFile("test3.txt", "blablabla");

		System.out.println(vf1);
		System.out.println(vf2);

		System.out.println(vf1.getNumberOfConcatenations());

		vf1.concatFile(vf2);
		vf1.concatFile(vf3);

		VersionedFile backup_vf1 = vf1.getPreviousVersion();

		System.out.println(vf1);

		System.out.println(backup_vf1);

		System.out.println(vf1.getNumberOfConcatenations());

		System.out.println(vf1.getID());
		System.out.println(backup_vf1.getID());
		System.out.println(vf2.getID());
	}
}
