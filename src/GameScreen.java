import javax.swing.*;

public class GameScreen extends JPanel implements Runnable{

    public Thread thread = new Thread(this);


    public GameScreen(Frame frame) {
        thread.start();
    }

    public GameScreen(GameScreen screen) {

    }

    @Override
    public void run() {
        System.out.println("Success!");
    }
}
