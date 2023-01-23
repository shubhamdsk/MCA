// 14) Create an interface called Player. The interface has an abstract method called play() that displays a message describing the meaning of “play” to the class. Create classes called Child, Musician, and Actor that all implement Player. Create an application that demonstrates the use of the classes(UsePlayer.java)

interface Player {
  void play();
}

class Child implements Player {

  @Override
  public void play() {
    System.out.println("Child plays with Lego.");
  }
}

class Musician implements Player {

  @Override
  public void play() {
    System.out.println("Musician plays a piano.");
  }
}

class Actor implements Player {

  @Override
  public void play() {
    System.out.println("Actor plays in a film.");
  }
}

public class Assignment2Q14 {

  public static void main(String[] args) {
    Child c = new Child();
    c.play();

    Musician m = new Musician();
    m.play();

    Actor a = new Actor();
    a.play();
  }
}
