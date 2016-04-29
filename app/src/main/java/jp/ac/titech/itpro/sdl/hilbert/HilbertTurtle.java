package jp.ac.titech.itpro.sdl.hilbert;

public class HilbertTurtle extends Turtle {

    public HilbertTurtle(Drawer drawer) {
        super(drawer);
    }

    public void draw(int n, double step, double turn) {
        if (n > 0) {
            rotate(- turn);
            draw(n - 1, step, - turn);
            forward(step);
            rotate(turn);
            draw(n - 1, step, turn);
            forward(step);
            draw(n - 1, step, turn);
            rotate(turn);
            forward(step);
            draw(n - 1, step, - turn);
            rotate(- turn);
        }
    }
}
