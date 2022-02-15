import processing.core.PApplet;
public class TryProcessing extends PApplet {
  public static final int H=640;
  public static final int W=480;
  public static final int D=20;
  int x=0;
  int dspeed=0;
  public static void main(String args[]){
    PApplet.main("TryProcessing",args);
  }
  @Override
  public void settings(){
    super.settings();
    size(H,W);
  }
  @Override
  public void draw(){
    //paintWhite();
    drawCircle();
  }
  public void paintWhite(){
    background(255);
  }
  public void drawCircle(){
        int Height=30;
        for(int i=0;i<4;i++){
             Height+=100;
             ellipse(x,Height,D,D);
             x++;
        }

  }
  
}
