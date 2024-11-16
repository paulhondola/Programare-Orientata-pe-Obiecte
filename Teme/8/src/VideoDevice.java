class VideoDevice extends Device {

    private String producer;

    public VideoDevice() {
        super();
        producer = "Unknown producer";
    }

    public VideoDevice(String information, String producer) {
        super(information);
        this.producer = producer;
    }

    @Override
    public String load() {
        return producer + " " + super.load();
    }

    public void film() {
        System.out.println("Film...");
//String film = ...
//Se va apela this.store(film) pentru stocarea filmului
    }
}