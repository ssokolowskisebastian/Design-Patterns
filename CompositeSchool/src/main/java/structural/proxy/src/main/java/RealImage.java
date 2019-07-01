public class RealImage implements Image {

    String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("loading image from disk..."+fileName);
    }

    public void displayImage() {
        System.out.println("displaying image..."+fileName);

    }
}
