import java.awt.*;
import java.awt.event.*;

public class DisplayText extends Frame implements ActionListener {

  Label ltext, lresult, caption;
  TextField txtfd, txtfd2;
  Button b1;

  DisplayText() {
    caption = new Label("Display Text");
    add(caption);
    caption.setBounds(100, 40, 150, 30);
    caption.setFont(new Font("serif", Font.BOLD, 15));

    ltext = new Label("Enter Text: ", Label.CENTER);
    add(ltext);
    ltext.setBounds(30, 100, 100, 30);

    txtfd = new TextField(23);
    add(txtfd);
    txtfd.setBounds(150, 100, 100, 30);

    lresult = new Label("Result : ");
    add(lresult);
    lresult.setBounds(50, 150, 100, 30);

    txtfd2 = new TextField(20);
    add(txtfd2);
    txtfd2.setBounds(150, 150, 100, 30);

    b1 = new Button("OK");
    add(b1);
    b1.setBounds(120, 220, 50, 30);
    b1.setForeground(Color.BLACK);
    b1.setBackground(Color.PINK);
    b1.addActionListener(this);

    setTitle("Display Text");
    setSize(300, 300);
    setLayout(null);
    setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    String s = txtfd.getText();
    txtfd2.setText(s);
  }

  public static void main(String[] args) {
    new DisplayText();
  }
}
