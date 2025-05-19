package structural.proxy;


//obiect real

public class RealImage implements Image {


    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadImage();
    }


    public void loadImage()
    {
        System.out.println("Loading image from " + filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying  "+filename);
    }
}
