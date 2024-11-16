abstract class Device {

    private String information;

    public Device() {
        information = "No information on this device";
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