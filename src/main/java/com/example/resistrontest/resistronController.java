package com.example.resistrontest;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

import java.math.BigDecimal;


public class resistronController
{
    //////////////////Button Line 1//////////////////
    @FXML
    private Button buttonblack1;
    @FXML
    private Button buttonbrown1;
    @FXML
    private Button buttonred1;
    @FXML
    private Button buttonorange1;
    @FXML
    private Button buttonyellow1;
    @FXML
    private Button buttongreen1;
    @FXML
    private Button buttonblue1;
    @FXML
    private Button buttonpurple1;
    @FXML
    private Button buttongrey1;
    @FXML
    private Button buttonwhite1;
    //TextField that will welcome our result(the value of resistance)
    @FXML
    private TextField result;
    //Label that will accept the unity of our result
    @FXML
    private Label unite;
    //Label that will accept the chosen tolerance
    @FXML
    private Label tol;
    //The 4 bands of resistance
    @FXML
    private Label band1;
    @FXML
    private Label band2;
    @FXML
    private Label band3;
    @FXML
    private Label band4;
    //The Text to display the value of our buttons
    @FXML
    private Text value1;
    @FXML
    private Text value2;
    @FXML
    private Text multiplier;
    @FXML
    private Text tolerance;
    /**
     * In the method below we declare the 1st button of line 1 named buttonblack1 button + its color "Black" + "line number",
     * all the buttons are named in this way, then the color of this one is repeated at the beginning of the line on the label,
     * moreover the color of the button is also repeated on the diagram of the resistance, at the ring level concerned,
     * finally we declare its value and link it to the "Display();' method, which calculates the value of the resistance,
     * and allows the display of the unit and its tolerance.
     */
    @FXML
    public void onbuttonblack1Action()
    {
        //We color our first ring with the color corresponding to the button we click
        band1.setBackground(Background.fill(Color.BLACK));
        //We assign a value according to the button we click
        Resistroncode.valueline1 =0;
        //The button value is displayed on a Text
        value1.setText(Resistroncode.valueline1 + " ");
        //We call our display method which will do our calculation and display it
        display();
    }
    //Then we do the same for each button with the colors and values that correspond
    @FXML
    public void onbuttonbrown1Action()
    {
        band1.setBackground(Background.fill(Color.BROWN));
        Resistroncode.valueline1 = 10;
        value1.setText(Resistroncode.valueline1 + " ");
        display();
    }
    @FXML
    public void onbuttonred1Action()
    {
        band1.setBackground(Background.fill(Color.RED));
        Resistroncode.valueline1 = 20;
        value1.setText(Resistroncode.valueline1 + " ");
        display();
    }
    @FXML
    public void onbuttonorange1Action()
    {
        band1.setBackground(Background.fill(Color.ORANGE));
        Resistroncode.valueline1 = 30;
        value1.setText(Resistroncode.valueline1 + " ");
        display();
    }
    @FXML
    public void onbuttonyellow1Action()
    {
        band1.setBackground(Background.fill(Color.YELLOW));
        Resistroncode.valueline1 = 40;
        value1.setText(Resistroncode.valueline1 + " ");
        display();
    }
    @FXML
    public void onbuttongreen1Action()
    {
        band1.setBackground(Background.fill(Color.GREEN));
        Resistroncode.valueline1 = 50;
        value1.setText(Resistroncode.valueline1 + " ");
        display();
    }
    @FXML
    public void onbuttonblue1Action()
    {
        band1.setBackground(Background.fill(Color.BLUE));
        Resistroncode.valueline1 = 60;
        value1.setText(Resistroncode.valueline1 + " ");
        display();
    }
    @FXML
    public void onbuttonpurple1Action()
    {
        band1.setBackground(Background.fill(Color.PURPLE));
        Resistroncode.valueline1 = 70;
        value1.setText(Resistroncode.valueline1 + " ");
        display();
    }
    @FXML
    public void onbuttongrey1Action()
    {
        band1.setBackground(Background.fill(Color.GREY));
        Resistroncode.valueline1 = 80;
        value1.setText(Resistroncode.valueline1 + " ");
        display();
    }
    @FXML
    public void onbuttonwhite1Action()
    {
        band1.setBackground(Background.fill(Color.WHITE));
        Resistroncode.valueline1 = 90;
        value1.setText(Resistroncode.valueline1 + " ");
        display();
    }
    //////////////////Bouton Line 2//////////////////
    @FXML
    private Button buttonblack2;
    @FXML
    private Button buttonbrown2;
    @FXML
    private Button buttonred2;
    @FXML
    private Button buttonorange2;
    @FXML
    private Button buttonyellow2;
    @FXML
    private Button buttongreen2;
    @FXML
    private Button buttonblue2;
    @FXML
    private Button buttonpurple2;
    @FXML
    private Button buttongrey2;
    @FXML
    private Button buttonwhite2;
    @FXML
    public void onbuttonblack2Action()
    {
        band2.setBackground(Background.fill(Color.BLACK));
        Resistroncode.valueline2 =0;
        value2.setText(Resistroncode.valueline2 + " ");
        display();
    }
    @FXML
    public void onbuttonbrown2Action()
    {
        band2.setBackground(Background.fill(Color.BROWN));
        Resistroncode.valueline2 = 1;
        value2.setText(Resistroncode.valueline2 + " ");
        display();
    }
    @FXML
    public void onbuttonred2Action()
    {
        band2.setBackground(Background.fill(Color.RED));
        Resistroncode.valueline2 = 2;
        value2.setText(Resistroncode.valueline2 + " ");
        display();
    }
    @FXML
    public void onbuttonorange2Action()
    {
        band2.setBackground(Background.fill(Color.ORANGE));
        Resistroncode.valueline2 = 3;
        value2.setText(Resistroncode.valueline2 + " ");
        display();
    }
    @FXML
    public void onbuttonyellow2Action()
    {
        band2.setBackground(Background.fill(Color.YELLOW));
        Resistroncode.valueline2 = 4;
        value2.setText(Resistroncode.valueline2 + " ");
        display();
    }
    @FXML
    public void onbuttongreen2Action()
    {
        band2.setBackground(Background.fill(Color.GREEN));
        Resistroncode.valueline2 = 5;
        value2.setText(Resistroncode.valueline2 + " ");
        display();
    }
    @FXML
    public void onbuttonblue2Action()
    {
        band2.setBackground(Background.fill(Color.BLUE));
        Resistroncode.valueline2 = 6;
        value2.setText(Resistroncode.valueline2 + " ");
        display();
    }
    @FXML
    public void onbuttonpurple2Action()
    {
        band2.setBackground(Background.fill(Color.PURPLE));
        Resistroncode.valueline2 = 7;
        value2.setText(Resistroncode.valueline2 + " ");
        display();
    }
    @FXML
    public void onbuttongrey2Action()
    {
        band2.setBackground(Background.fill(Color.GREY));
        Resistroncode.valueline2 = 8;
        value2.setText(Resistroncode.valueline2 + " ");
        display();
    }
    @FXML
    public void onbuttonwhite2Action()
    {
        band2.setBackground(Background.fill(Color.WHITE));
        Resistroncode.valueline2 = 9;
        value2.setText(Resistroncode.valueline2 + " ");
        display();
    }

    //////////////////Button Line 3 (Multiplier)//////////////////
    @FXML
    private Button mbuttonblack;
    @FXML
    private Button mbuttonbrown;
    @FXML
    private Button mbuttonred;
    @FXML
    private Button mbuttonorange;
    @FXML
    private Button mbuttonyellow;
    @FXML
    private Button mbuttongreen;
    @FXML
    private Button mbuttonblue;
    @FXML
    private Button mbuttonpurple;
    @FXML
    private Button mbuttongrey;
    @FXML
    private Button mbuttonwhite;
    @FXML
    private Button mbuttongold;
    @FXML
    private Button mbuttonsilver;
    /**
     * m = multiplier, button for Button and its color
     */
    @FXML
    public void monbuttonblackAction()
    {
        band3.setBackground(Background.fill(Color.BLACK));
        Resistroncode.valueline3 = 1;
        multiplier.setText(Resistroncode.valueline3 + " ");
        display();
    }
    @FXML
    public void monbuttonbrownAction()
    {
        band3.setBackground(Background.fill(Color.BROWN));
        Resistroncode.valueline3 = 10;
        multiplier.setText(Resistroncode.valueline3 + " ");
        display();
    }
    @FXML
    public void monbuttonredAction()
    {
        band3.setBackground(Background.fill(Color.RED));
        Resistroncode.valueline3 = 100;
        multiplier.setText(Resistroncode.valueline3 + " ");
        display();
    }
    @FXML
    public void monbuttonorangeAction()
    {
        band3.setBackground(Background.fill(Color.ORANGE));
        Resistroncode.valueline3 = 1000;
        multiplier.setText(Resistroncode.valueline3 + " ");
        display();
    }
    @FXML
    public void monbuttonyellowAction()
    {
        band3.setBackground(Background.fill(Color.YELLOW));
        Resistroncode.valueline3 = 10000;
        multiplier.setText(Resistroncode.valueline3 + " ");
        display();
    }
    @FXML
    public void monbuttongreenAction()
    {
        band3.setBackground(Background.fill(Color.GREEN));
        Resistroncode.valueline3 = 100000;
        multiplier.setText(Resistroncode.valueline3 + " ");
        display();
    }
    @FXML
    public void monbuttonblueAction()
    {
        band3.setBackground(Background.fill(Color.BLUE));
        Resistroncode.valueline3 = 1000000;
        multiplier.setText(Resistroncode.valueline3 + " ");
        display();
    }
    @FXML
    public void monbuttonpurpleAction()
    {
        band3.setBackground(Background.fill(Color.PURPLE));
        Resistroncode.valueline3 = 10000000;
        multiplier.setText(Resistroncode.valueline3 + " ");
        display();
    }
    @FXML
    public void monbuttongreyAction()
    {
        band3.setBackground(Background.fill(Color.GREY));
        Resistroncode.valueline3 = 100000000;
        multiplier.setText(Resistroncode.valueline3 + " ");
        display();
    }
    @FXML
    public void monbuttonwhiteAction()
    {
        band3.setBackground(Background.fill(Color.WHITE));
        Resistroncode.valueline3 = 1000000000;
        multiplier.setText(Resistroncode.valueline3 + " ");
        display();
    }
    @FXML
    public void monbuttongoldAction()
    {
        band3.setBackground(Background.fill(Color.GOLD));
        Resistroncode.valueline3 = 0.1;
        multiplier.setText(Resistroncode.valueline3 + " ");
        display();
    }
    @FXML
    public void monbuttonsilverAction()
    {
        band3.setBackground(Background.fill(Color.SILVER));
        Resistroncode.valueline3 = 0.01;
        multiplier.setText(Resistroncode.valueline3 + " ");
        display();
    }
    //////////////////Button Line 4 (Tolerance)//////////////////
    @FXML
    private Button tbuttonbrown;
    @FXML
    private Button tbuttonred;
    @FXML
    private Button tbuttongreen;
    @FXML
    private Button tbuttonblue;
    @FXML
    private Button tbuttonpurple;
    @FXML
    private Button tbuttongrey;
    @FXML
    private Button tbuttongold;
    @FXML
    private Button tbuttonsilver;
    /**
     * t = tolerance, button for Button and its color
     */
    @FXML
    public void tonbuttonbrownAction()
    {
        band4.setBackground(Background.fill(Color.BROWN));
        Resistroncode.valueline4 = 1;
        tolerance.setText(Resistroncode.valueline4 + " ");
        display();
    }
    @FXML
    public void tonbuttonredAction()
    {
        band4.setBackground(Background.fill(Color.RED));
        Resistroncode.valueline4 = 2;
        tolerance.setText(Resistroncode.valueline4 + " ");
        display();
    }
    @FXML
    public void tonbuttongreenAction()
    {
        band4.setBackground(Background.fill(Color.GREEN));
        Resistroncode.valueline4 = 0.5;
        tolerance.setText(Resistroncode.valueline4 + " ");
        display();
    }
    @FXML
    public void tonbuttonblueAction()
    {
        band4.setBackground(Background.fill(Color.BLUE));
        Resistroncode.valueline4 = 0.25;
        tolerance.setText(Resistroncode.valueline4 + " ");
        display();
    }
    @FXML
    public void tonbuttonpurpleAction()
    {
        band4.setBackground(Background.fill(Color.PURPLE));
        Resistroncode.valueline4 = 0.10;
        tolerance.setText(Resistroncode.valueline4 + " ");
        display();
    }
    @FXML
    public void tonbuttongreyAction()
    {
        band4.setBackground(Background.fill(Color.GREY));
        Resistroncode.valueline4 = 0.05;
        tolerance.setText(Resistroncode.valueline4 + " ");
        display();
    }
    @FXML
    public void tonbuttongoldAction()
    {
        band4.setBackground(Background.fill(Color.GOLD));
        Resistroncode.valueline4 = 5;
        tolerance.setText(Resistroncode.valueline4 + " ");
        display();
    }
    @FXML
    public void tonbuttonsilverAction()
    {
        band4.setBackground(Background.fill(Color.SILVER));
        Resistroncode.valueline4 = 10;
        tolerance.setText(Resistroncode.valueline4 + " ");
        display();
    }
    /**
     * This method calculates the value of the resistance with a BigDecimal, and then displays it in the result field of the program,
     * with the unit and tolerance displayed in their respective fields. * Each ring is declared in this method, as well as the unit, with an "if/else if" loop,
     * in order to determine if it is Ohms, KOhms, MOhms or GOhms. * Moreover, once the value of the resistance, the unit and the tolerance are displayed, the text fields cannot be modified by the user,
     * but he can make a copy/paste.
     **/
    @FXML
    public void display()
    {
        //Calculation of the resistance value
        BigDecimal resvalue = BigDecimal.valueOf(Resistroncode.valueline1 +Resistroncode.valueline2).multiply(BigDecimal.valueOf(Resistroncode.valueline3));

        //double value = (Resistroncode.valueline1 +Resistroncode.valueline2)*Resistroncode.valueline3;
        String txtvalue;
        String txttol = "±" + Resistroncode.valueline4 + "%";

        //Unit variable
        String txtunit;
        String ohms = " Ω";
        String kohms = " kΩ";
        String mohms = " MΩ";
        String gohms = " GΩ";

        //Unit Converter
        if(resvalue.doubleValue()<1000){
            txtvalue = resvalue+" ";
            txtunit = ohms;
        }else if(resvalue.doubleValue()<1000000){
            resvalue = resvalue.divide(BigDecimal.valueOf(1000));
            txtvalue = resvalue+" ";
            txtunit = kohms;
        }else if(resvalue.doubleValue()<1000000000){
            resvalue = resvalue.divide(BigDecimal.valueOf(1000000));
            txtvalue = resvalue + " ";
            txtunit = mohms;
        }else{
            resvalue = resvalue.divide(BigDecimal.valueOf(1000000000));
            txtvalue = resvalue + " ";
            txtunit = gohms;
        }
        //The TextField is read-only and cannot be edited
        result.setEditable(false);

        //We display the value of our resistance, its unity and the tolerance chosen.
        result.setText(" Result : " + txtvalue);
        unite.setText(txtunit);
        tol.setText(txttol);
    }
}
