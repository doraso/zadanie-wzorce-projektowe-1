package pl.javastart.exercise.designpatterns.observer;

public class Button {

    private OnButtonClickListener listener;

    public void click() {
        if(listener != null) {
            listener.buttonClicked();;
        }
    }

    public void setOnButtonClickListener(OnButtonClickListener listener) {
        this.listener = listener;
    }
}
