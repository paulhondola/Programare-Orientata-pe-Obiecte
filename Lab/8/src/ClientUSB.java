class ClientUSB {

    public static void main(String[] args) {

        Device photo, video;
        PC pc;
        USB usb;
        photo = new PhotoDevice("initialPhotoData");
        video = new VideoDevice("initialVideoData","company");
        pc = new PC();
        usb = new USB();
        usb.transferPCToDevice(pc, photo);
        usb.transferDeviceToPC(pc, video);
    }
}