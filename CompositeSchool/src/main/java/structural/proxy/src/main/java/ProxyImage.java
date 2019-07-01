public class ProxyImage implements Image {

    String fileName;
    Image image;

    public ProxyImage(String fileName) {
        this.fileName = fileName;

    }

    public void displayImage() {
        if(image==null){
            image=new RealImage(fileName);
        }
        image.displayImage();

    }


}
