class ClientUSB {

    public static void main(String[] args) {

        Device photo, video;
        PC pc = new PC();
        USB usb = new USB();
        photo = new PhotoDevice("initialPhotoData");
        video = new VideoDevice("initialVideoData","company");
        usb.transferDeviceToPC(pc, video);
        usb.transferPCToDevice(pc, photo);

        System.out.println(photo.load());
        System.out.println(video.load());
    }
}