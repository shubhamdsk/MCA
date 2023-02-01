import java.awt.*;

public class RegistrationForm extends Frame {

  Label lname, lDOB, lGender, lEmail, lCollege, lDept, lPhoneNo, LHobbies, LSubject;
  TextField txtname, txtdob, txtmail, txtclg, txtphone;
  CheckboxGroup gender = new CheckboxGroup();
  Checkbox male, female;
  Checkbox chkhob1, chkhob2, chkhob3;
  Choice dept = new Choice();
  List sub = new List(4, true);
  Button submit, cancel;

  RegistrationForm () {
    lname = new Label("Enter Your Name : ");
    add(lname);
    lname.setBounds(20, 40, 100, 30);

    txtname = new TextField(15);
    add(txtname);
    txtname.setBounds(140, 40, 250, 30);

    lEmail = new Label("Enter Your Email : ");
    add(lEmail);
    lEmail.setBounds(20, 80, 100, 30);

    txtmail = new TextField(15);
    add(txtmail);
    txtmail.setBounds(140, 80, 250, 30);

    lCollege = new Label("Enter College Name ");
    add(lCollege);
    lCollege.setBounds(20, 120, 120, 30);

    txtclg = new TextField(15);
    add(txtclg);
    txtclg.setBounds(140, 120, 250, 30);

    lPhoneNo = new Label("Enter Phone No : ");
    add(lPhoneNo);
    lPhoneNo.setBounds(20, 160, 100, 30);

    txtphone = new TextField(15);
    add(txtphone);
    txtphone.setBounds(140, 160, 250, 30);

    lDept = new Label("Select Your Department ");
    add(lDept);
    lDept.setBounds(20, 200, 150, 30);
    dept.add("MCA");
    dept.add("MBA");
    dept.add("MSC");
    add(dept);
    dept.setBounds(180, 205, 50, 30);

    LSubject = new Label("Select Subject");
    add(LSubject);
    LSubject.setBounds(20, 240, 150, 30);

    sub.add("Java");
    sub.add("DSA");
    sub.add("NT");
    sub.add("OOSE");
    sub.add("OC1");
    sub.add("OC2");
    sub.add("Soft Skills");
    add(sub);
    sub.setBounds(180, 240, 200, 65);

    LHobbies = new Label("Hobbies : ");
    add(LHobbies);
    LHobbies.setBounds(20, 310, 150, 50);

    chkhob1 = new Checkbox("Dancing");
    add(chkhob1);
    chkhob1.setBounds(180, 310, 100, 50);

    chkhob2 = new Checkbox("Singing");
    add(chkhob2);
    chkhob2.setBounds(300, 310, 100, 50);

    chkhob3 = new Checkbox("Playing");
    add(chkhob3);
    chkhob3.setBounds(420, 310, 100, 50);

    lGender = new Label("Gender : ");
    add(lGender);
    lGender.setBounds(20, 350, 150, 30);

    male = new Checkbox("Male", gender, false);
    add(male);
    male.setBounds(180, 350, 100, 40);

    female = new Checkbox("Female", gender, false);
    add(female);
    female.setBounds(300, 350, 100, 40);

    submit = new Button("Submit");
    add(submit);
    submit.setBounds(120, 420, 100, 30);
    submit.setBackground(Color.CYAN);

    cancel = new Button("Cancel");
    add(cancel);
    cancel.setBounds(280, 420, 100, 30);
    cancel.setBackground(Color.PINK);

    setTitle("Registration Page");
    setSize(520, 500);
    setLayout(null);
    setVisible(true);
  }

  public static void main(String[] args) {
    new RegistrationForm ();
  }
}
