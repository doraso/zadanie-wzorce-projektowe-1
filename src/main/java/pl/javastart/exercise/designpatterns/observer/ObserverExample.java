package pl.javastart.exercise.designpatterns.observer;

public class ObserverExample {

    public static void main(String[] args) {

        Button button = new Button();

        button.setOnButtonClickListener(new OnButtonClickListener() {

            @Override public void buttonClicked() {
                System.out.println("Button was clicked!");
            }
        });

        button.click();
        button.click();
        button.click();

    }

}
