import processing.core.PApplet;

interface OnRecieved {
    void onReceive(String packet);
}

class ReaderThread extends Thread{

}

public class Program extends PApplet{

    @Override
    public void settings() {
        size(1000,600);
    }

    @Override
    public void draw() {
        background(0);
    }

    @Override
    public void setup() {
        background(0);
    }
    public static void main(String[] args) {
        PApplet.main("Program");
    }
}
