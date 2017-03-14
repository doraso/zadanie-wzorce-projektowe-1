package pl.javastart.exercise.designpatterns.flyweight;

public class WebBrowser {

    private int counter;

    public Image loadImage(String imageUrl) {
        return downloadImage(imageUrl);
    }

    private Image downloadImage(String imageUrl) {
        counter++;
        return new Image(imageUrl);
    }

    public int getDownloadCount() {
        return counter;
    }
}
