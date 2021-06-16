package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

/**
 * A Controller Class For A Simple Calculator
 * @author Alireza Zare Zeynabadi
 * @since 2021.june.16
 * @version 1.0
 */
public class Controller {

    @FXML
    private Button dotButton;

    @FXML
    private Button oneButton;

    @FXML
    private Button twoButton;

    @FXML
    private Button threeButton;

    @FXML
    private Button fourButton;

    @FXML
    private Button fiveButton;

    @FXML
    private Button sixButton;

    @FXML
    private Button sevenButton;

    @FXML
    private Button eightButton;

    @FXML
    private Button nineButton;

    @FXML
    private Button zeroButton;

    @FXML
    private Button acButton;

    @FXML
    private TextField enterArea;

    @FXML
    private Button divideButton;

    @FXML
    private Button multiplyButton;

    @FXML
    private Button subButton;

    @FXML
    private Button addButton;

    @FXML
    private Button equalButton;


    private String firstNum = "";
    private String secondNum = "";
    private char operation = ' ';
    private boolean anOperationDone = false;
    @FXML
    private void appendDot(ActionEvent e){
        check();
        if (!enterArea.getText().contains(".")){
            if (enterArea.getText().length() == 0){
                enterArea.appendText("0");
            }
            enterArea.appendText(".");
        }
    }

    private void check(){
        if (anOperationDone){
            enterArea.clear();
            anOperationDone = false;
        }
    }
    @FXML
    private void appendZero(ActionEvent e){
        check();
        enterArea.appendText("0");
    }
    @FXML
    private void appendOne(ActionEvent e){
        check();
        enterArea.appendText("1");
    }

    @FXML
    private void appendTwo(ActionEvent e){
        check();
        enterArea.appendText("2");
    }

    @FXML
    private void appendThree(ActionEvent e){
        check();
        enterArea.appendText("3");
    }

    @FXML
    private void appendFour(ActionEvent e){
        check();
        enterArea.appendText("4");
    }

    @FXML
    private void appendFive(ActionEvent e){
        check();
        enterArea.appendText("5");
    }

    @FXML
    private void appendSix(ActionEvent e){
        check();
        enterArea.appendText("6");
    }

    @FXML
    private void appendSeven(ActionEvent e){
        check();
        enterArea.appendText("7");
    }

    @FXML
    private void appendEight(ActionEvent e){
        check();
        enterArea.appendText("8");
    }

    @FXML
    private void appendNine(ActionEvent e){
        check();
        enterArea.appendText("9");
    }

    @FXML
    private void clear(ActionEvent e){
        enterArea.clear();
        operation = ' ';
        anOperationDone = false;
    }

    @FXML
    private void divide(ActionEvent e){
        firstNum = enterArea.getText();
        enterArea.clear();
        operation = '/';
    }

    @FXML
    private void multiply(ActionEvent e){
        firstNum = enterArea.getText();
        enterArea.clear();
        operation = '*';
    }

    @FXML
    private void add(ActionEvent e){
        firstNum = enterArea.getText();
        enterArea.clear();
        operation = '+';
    }

    @FXML
    private void sub(ActionEvent e){
        firstNum = enterArea.getText();
        enterArea.clear();
        operation = '-';
    }

    @FXML
    private void showResult(ActionEvent e){
        secondNum = enterArea.getText();

        if (firstNum.length() != 0 && secondNum.length() != 0){
            String result = doOperation();
            enterArea.setText((result));
            firstNum = "";
            secondNum = "";
            anOperationDone = true;
        }

    }
    private String doOperation(){
        double num1 = Double.parseDouble(firstNum);
        double num2 = Double.parseDouble(secondNum);

        switch (operation) {
            case '+' -> {
                double result = num1 + num2;
                return String.valueOf(result);
            }
            case '-' -> {
                double result = num1 - num2;
                return String.valueOf(result);
            }
            case '*' -> {
                double result = num1 * num2;
                return String.valueOf(result);
            }
            case '/' ->{
                if (num2 == 0) return "DIVIDE BY ZERO";
                else {
                    double result = num1 / num2;
                    return String.valueOf(result);
                }
            }
        }
        return "ERROR";
    }


}
