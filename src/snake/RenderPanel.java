package snake;
import javax.swing.JPanel;
import java.awt.*;

public class RenderPanel extends JPanel {

    public static Color purple = new Color(16070136);

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(0,0,800,600);
        Snake snake = Snake.snake;
        g.setColor(Color.BLUE);
        for (Point point : snake.snakeParts) {
            g.fillRect(point.x * Snake.SCALE, point.y * Snake.SCALE, Snake.SCALE, Snake.SCALE);
        }
        g.fillRect(snake.head.x * Snake.SCALE, snake.head.y * Snake.SCALE, Snake.SCALE, Snake.SCALE);
        g.setColor(Color.RED);
        g.fillRect(snake.cherry.x * Snake.SCALE, snake.cherry.y * Snake.SCALE, Snake.SCALE, Snake.SCALE);

    }
}
