package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controller{
    private Game game;
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


    public Controller(){
        game = new Game();
    }
    public void clickBtn0(ActionEvent actionEvent) {
        System.out.println(((Button)actionEvent.getSource()).getId());
        String temp = ((Button)actionEvent.getSource()).getId().substring(3);
        int value = Integer.parseInt(temp);
        game.nextMove(value);
        rePaint();
    }
    public void rePaint(){
        Tile[][] arr = game.getField().getArr();


        btn0.setText(arr[0][0].isValue()?"X":"O");
        btn1.setText(arr[1][0].isValue()?"X":"O");
        btn2.setText(arr[2][0].isValue()?"X":"O");
        btn3.setText(arr[3][0].isValue()?"X":"O");

        btn4.setText(arr[0][1].isValue()?"X":"O");
        btn5.setText(arr[1][1].isValue()?"X":"O");
        btn6.setText(arr[2][1].isValue()?"X":"O");
        btn7.setText(arr[3][1].isValue()?"X":"O");

        btn8.setText(arr[0][2].isValue()?"X":"O");
        btn9.setText(arr[1][2].isValue()?"X":"O");
        btn10.setText(arr[2][2].isValue()?"X":"O");
        btn11.setText(arr[3][2].isValue()?"X":"O");

        btn12.setText(arr[0][3].isValue()?"X":"O");
        btn13.setText(arr[1][3].isValue()?"X":"O");
        btn14.setText(arr[2][3].isValue()?"X":"O");
        btn15.setText(arr[3][3].isValue()?"X":"O");
    }

    public void clickNewGame(ActionEvent actionEvent) {
        game.startgame();
        btnnewgame.setDisable(true);
        btnendgame.setDisable(false);
        btnrestartgame.setDisable(false);
    }

    public void clickEndGame(ActionEvent actionEvent) {
        Stage stage =(Stage) btnendgame.getScene().getWindow();
        stage.close();
    }

    public void clickRestartGame(ActionEvent actionEvent) {

        game.resetgame();

        btnrestartgame.setDisable(true);
        btnnewgame.setDisable(false);
    }
}
