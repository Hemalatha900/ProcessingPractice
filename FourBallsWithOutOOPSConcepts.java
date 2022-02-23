import processing.core.PApplet;

public class TryProcessing extends PApplet {
    public static final int Height = 900;
    public static final int Width = 700;
    public static final int Diameter = 20;
    int height1 = (Height * 1) / 7;
    int height2 = (Height * 2) / 7;
    int height3 = (Height * 3) / 7;
    int height4 = (Height * 4) / 7;
    int speed1 = 0;
    int speed2 = 0;
    int speed3 = 0;
    int speed4 = 0;

    public static void main(String[] args) { PApplet.main("TryProcessing",args);}

    @Override
    public void settings(){
        super.settings();
        size(Height,Width);
    }
    @Override
    public void setup(){}
    @Override
    public void draw(){
        drawCircle(speed1,height1);
        drawCircle(speed2,height2);
        drawCircle(speed3,height3);
        drawCircle(speed4,height4);
        speed1+=1;
        speed2+=2;
        speed3+=3;
        speed4+=4;
    }
    public void drawCircle(int speed,int height){
         ellipse(speed,height,Diameter,Diameter);
    }


}
