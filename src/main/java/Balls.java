import processing.core.PApplet;
public class Balls extends Executable{
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;

    public static void main(String[] args){
        PApplet.main("Balls",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        super.drawCircle();
    }

}
