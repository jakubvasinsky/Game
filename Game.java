package sample;


import static sample.State.READY;
import static sample.State.RUNNING;

public class Game {
    private Field field;
    private State state;

    public Game() {
        state = READY;
    }
    public void startgame() {
        if (state == READY) {
            state = State.RUNNING;
            field = new Field();
        }
    }
    public void endgame() {
        if (state == RUNNING) {
            state = State.FINISHED;
            field = null;
        }
    }
    public void resetgame() {
        if(state != READY) {
            state = READY;
            field = null;
        }
    }

    public Field getField() {
        return field;
    }

    public void nextMove(int code) {
        if(state == RUNNING) {
            field.toggleTiles(code);

            if(field.isWinner()) {
                endgame();
            }
        }
    }
}
