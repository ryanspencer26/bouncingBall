import java.awt.*;

public class Ball {

    private int size;
    private Color color;
    private int xSpeed, ySpeed;
    private int x,y;

    public Ball(int x, int y){

        this.x = x;
        this.y = y;
        size = 20;
        xSpeed = 5;
        ySpeed = 5;
        color = Color.BLUE;

    }

    public void setSize(int size){

        this.size = size;

    }

    public void setSpeed(int xSpeed, int ySpeed){

        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;

    }

    public void setColor(Color color){

        this.color = color;

    }

    public void draw(Graphics g){

        g.setColor(color);
        g.fillOval(x,y,size,size);

    }

    public void move(int width, int height){

        x += xSpeed;
        y += ySpeed;
        if(x >= width - size || x <= 0){
            xSpeed = xSpeed * (-1);
        }
        if(y >= height - size || y<= 0){
            ySpeed = ySpeed * -1;
        }

    }

}
