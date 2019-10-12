import javax.swing.*;
import java.util.*;
import java.io.*;
import java.math.*;

public class Frame extends JFrame {

    public static void main(String[] args) {
        new Frame();
    }

    public Frame() {
        new JFrame();

        this.setSize(1240, 768);
        this.setTitle("Test JFrame");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //Nút X để tắt
        this.setResizable(false); //Không thể resize
        this.setVisible(true);
        this.setLocationRelativeTo(null); //Hiển thị ở trung tâm màn hình

        GameScreen screen = new GameScreen(this);
        this.add(screen);
    }


}
