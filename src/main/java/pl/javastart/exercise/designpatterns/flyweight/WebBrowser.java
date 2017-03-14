package pl.javastart.exercise.designpatterns.flyweight;

public class WebBrowser {

    private int counter;

    public void loadImage(String image) {
        downloadImage(image);
    }

    private void downloadImage(String image) {
        counter++;
    }

    public int getDownloadCount() {
        return counter;
    }
}
