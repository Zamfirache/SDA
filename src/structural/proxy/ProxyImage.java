package structural.proxy;

// obiect proxy
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(RealImage image, String fileName) {
        this.realImage = image;
        this.fileName = fileName;
    }

    @Override
    public void display() { // o sa folosim LAZY LOADING pe post de proxy!!!

        if(realImage == null)
        {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
