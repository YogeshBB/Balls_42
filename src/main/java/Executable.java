import processing.core.PApplet;

public class Executable extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    int x=0,y=0,w=0,z=0;
    public void drawCircle() {
        int height=HEIGHT/5;
        ellipse(x, height, 10, 10);
        x++;
        ellipse(y, height*2, 10, 10);
        y+=2;
        ellipse(w, height*3, 10, 10);
        w+=3;
        ellipse(z, height*4, 10, 10);
        z+=4;
    }
}
