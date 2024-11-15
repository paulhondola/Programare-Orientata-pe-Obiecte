class PhotoDevice extends Device {

    public PhotoDevice(String information) {
        super(information);
    }

    public void takePicture() {
        System.out.println("TakePicture...");
//String picture = ...
//Se va apela this.store(picture) pentru stocarea pozei
    }
}