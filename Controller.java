package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controller {

    public Button btn0;
    public Button btn1;
    public Button btn2;
    public Button btn3;
    public Button btn4;
    public Button btn5;
    public Button btn6;
    public Button btn7;
    public Button btn8;
    public Button btn9;
    public Button btn10;
    public Button btn11;
    public Button btn12;
    public Button btn13;
    public Button btn14;
    public Button btn15;
    public Button btnnewgame;
    public Button btnendgame;
    public Button btnrestartgame;

    public void clickBtn0(ActionEvent actionEvent) {
        System.out.println(((Button)actionEvent.getSource()).getId());
        String temp = ((Button)actionEvent.getSource()).getId().substring(3);
        int value = Integer.parseInt(temp);
        //game.nextMove(value);

    }
    public void rePaint(){
        /*Tile[][] arr=game.getField().getArr();
        if (arr==null)
            return;
        btn0.setText(arr[][].isValue()?"X":"O");*/
    }

    public void clickNewGame(ActionEvent actionEvent) {
        // game.startgame
        btnnewgame.setDisable(true);
        btnendgame.setDisable(false);
        btnrestartgame.setDisable(false);
    }

    public void clickEndGame(ActionEvent actionEvent) {
        Stage stage =(Stage) btnendgame.getScene().getWindow();
        stage.close();
    }

    public void clickRestartGame(ActionEvent actionEvent) {

      //  game.resetGame();

        btnrestartgame.setDisable(true);
        btnnewgame.setDisable(false);
    }
}
