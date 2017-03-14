package pl.javastart.exercise.designpatterns.flyweight;

public class WebBrowserUser {

    public static void main(String[] args) {

        WebBrowser webBrowser = new WebBrowser();
        webBrowser.loadImage("a.png");
        webBrowser.loadImage("b.png");
        webBrowser.loadImage("c.png");
        webBrowser.loadImage("d.png");
        webBrowser.loadImage("a.png");
        webBrowser.loadImage("d.png");
        webBrowser.loadImage("c.png");
        webBrowser.loadImage("a.png");
        webBrowser.loadImage("a.png");
        webBrowser.loadImage("a.png");

        System.out.println("W sumie pobrań: " + webBrowser.getDownloadCount());
    }

}
