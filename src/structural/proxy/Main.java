package structural.proxy;



// unde se foloseste proxy?
 // Spring il foloseste impreuna cu decoratorul la AOP ( aspecte!)
//                                            => Tranzactionabilitate ( pe asta il invatati la JDBC si Hibernate)
//                                            => Caching
//                                            => Securitatea
//                                             =>Logging
public class Main {
    public static void main(String[] args) {

        Image realImage = new RealImage("imagine-reala.jpg");

        System.out.println("First display"); // accesam realImage => vezi constructorul cu metoda loadImage
        realImage.display();

        System.out.println("Second display"); // accesam proxy-ul lui realImage
        realImage.display();

        System.out.println("Third display"); // accesam proxy-ul lui realImage
        realImage.display();
    }
}
