package pl.javastart.exercise.designpatterns.flyweight;

public class WebBrowserUser {

    public static void main(String[] args) {

        WebBrowser webBrowser = new WebBrowser();
        Image image1 = webBrowser.loadImage("a.png");
        Image image2 = webBrowser.loadImage("b.png");
        Image image3 = webBrowser.loadImage("c.png");
        Image image4 = webBrowser.loadImage("d.png");
        Image image5 = webBrowser.loadImage("a.png");
        Image image6 = webBrowser.loadImage("d.png");
        Image image7 = webBrowser.loadImage("c.png");
        Image image8 = webBrowser.loadImage("a.png");
        Image image9 = webBrowser.loadImage("a.png");
        Image image10 = webBrowser.loadImage("a.png");

        System.out.println("W sumie pobrań: " + webBrowser.getDownloadCount());
    }

}
