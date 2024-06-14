import javax.swing.*;

public class Frame{
  public static void main(String[] args) {
    JFrame f1 = new JFrame("FPS Control Loop");
    GamePanel game = new GamePanel();
    f1.add(game);
    game.startGame();
    f1.setVisible(true);
    f1.setResizable(false);
    f1.setSize(500,500);
    f1.setLocationRelativeTo(null);
    f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
