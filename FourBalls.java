import processing.core.PApplet;

public class FourBalls extends PApplet {
    public int height=680;
    public int width=680;
    public static int x_axis=0;
    public Balls ball_one=new Balls(x_axis,100,1,this);
    public Balls ball_two=new Balls(x_axis,200,3,this);
    public Balls ball_three=new Balls(x_axis,300,5,this);
    public Balls ball_four=new Balls(x_axis,400,10,this);
    public static void main(String args[]){
        PApplet.main("FourBalls",args);
    }
    @Override
    public void settings(){
        super.settings();
        size(height,width);

    }
    @Override
    public void setup(){
    }
    @Override
    public void draw(){

       ball_one.DrawBall();
       ball_two.DrawBall();
       ball_three.DrawBall();
       ball_four.DrawBall();
    }

}

class Balls {

    public  int x_axis;
    public  int y_axis;
    public  int speed;
    public  int diameter=20;
    public PApplet Papplet ;
    public Balls(int x_axis, int y_axis, int speed, PApplet Papplet){
        this.x_axis=x_axis;
        this.y_axis=y_axis;
        this.speed=speed;
        this.Papplet=Papplet;
    }
    public void DrawBall(){
        Papplet.ellipse(x_axis,y_axis,diameter,diameter);
        IncreaseSpeedofBall();

    }

    private void IncreaseSpeedofBall() {
        x_axis += speed;

    }
}
