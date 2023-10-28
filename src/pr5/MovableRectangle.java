package pr5;

public class MovableRectangle extends MovablePoint implements Movable  {
    private MovablePoint upLeft;
    private MovablePoint downRight;

    public MovableRectangle(int x, int y, int xSpeed, int ySpeed) {
        super(x, y, xSpeed, ySpeed);
    }

    public boolean checkSpeed(double xSpeed, double ySpeed)
    {
        if(xSpeed==ySpeed) {
            return true;
        }
        else {
            return false;
        }
    }
    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveRight() {

    }
    @Override
    public String toString() {
        return "MovableRectangle: up left point "+this.upLeft +"down right "+this.downRight;
    }
}
