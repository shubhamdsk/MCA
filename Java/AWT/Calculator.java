import java.awt.*;

public class Calculator extends Frame {
    TextField txt;
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9,bd,BADD, BSUB, BMULT, BDIV, CAL;

    Calculator() {
        txt = new TextField(10);
        add(txt);
        txt.setBounds(20, 30, 260, 40);

        b1 = new Button("1");
        add(b1);
        b1.setBounds(20, 80, 50, 30);
        b1.setBackground(Color.PINK);

        b2 = new Button("2");
        add(b2);
        b2.setBounds(90, 80, 50, 30);
        b2.setBackground(Color.PINK);

        b3 = new Button("3");
        add(b3);
        b3.setBounds(160, 80, 50, 30);
        b3.setBackground(Color.PINK);

        BDIV = new Button("/");
        add(BDIV);
        BDIV.setBounds(230, 80, 50, 30);
        BDIV.setBackground(Color.CYAN);

        b4 = new Button("4");
        add(b4);
        b4.setBounds(20, 130, 50, 30);
        b4.setBackground(Color.PINK);

        b5 = new Button("5");
        add(b5);
        b5.setBounds(90, 130, 50, 30);
        b5.setBackground(Color.PINK);

        b6 = new Button("6");
        add(b6);
        b6.setBounds(160, 130, 50, 30);
        b6.setBackground(Color.PINK);

        BMULT = new Button("*");
        add(BMULT);
        BMULT.setBounds(230, 130, 50, 30);
        BMULT.setBackground(Color.CYAN);

        b7 = new Button("7");
        add(b7);
        b7.setBounds(20, 180, 50, 30);
        b7.setBackground(Color.PINK);

        b8 = new Button("8");
        add(b8);
        b8.setBounds(90, 180, 50, 30);
        b8.setBackground(Color.PINK);

        b9 = new Button("9");
        add(b9);
        b9.setBounds(160, 180, 50, 30);
        b9.setBackground(Color.PINK);

        BSUB = new Button("-");
        add(BSUB);
        BSUB.setBounds(230, 180, 50, 30);
        BSUB.setBackground(Color.CYAN);

        b0 = new Button("0");
        add(b0);
        b0.setBounds(20, 230, 50, 30);
        b0.setBackground(Color.PINK);

        bd = new Button(".");
        add(bd);
        bd.setBounds(90, 230, 50, 30);
        bd.setBackground(Color.PINK);

        CAL = new Button("=");
        add(CAL);
        CAL.setBounds(160, 230, 50, 30);
        CAL.setBackground(Color.ORANGE);

        BADD = new Button("+");
        add(BADD);
        BADD.setBounds(230, 230, 50, 30);
        BADD.setBackground(Color.CYAN);


        setTitle("Calculator");
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}