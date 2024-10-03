class FileObject {

	private int idIndex = 0;
	private String name;
	private String content;
	private int id;
	private FileObject previousVersion = null;

	FileObject(String name, String content) {
		id = ++idIndex;
		this.name = name;
		this.content = content;
	}
}
