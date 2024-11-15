class Device {

    private String information;

    public Device() {
        information = "";
    }
    public Device(String information) {
        this.information = information;
    }

    public void store(String information) {
        this.information = information;
    }

    public String load() {
        return information;
    }
}