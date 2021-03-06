import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JComponent;
public class DrawEclipse
{
    public static void drawEclipse(Graphics g)
    {
        final int width = 100;
        g.setColor(Color.BLUE);
        
        int x = 50;
        int y = 50;
        g.fillOval(x,y,width+50,width);
    }
    public static void main()
    {
        JFrame frame = new JFrame();
        final int FRAME_WIDTH = 400;
        final int FRAME_HEIGHT = 400;
        
        frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JComponent component = new JComponent()
        {
            public void paintComponent(Graphics graph)
            {
                drawEclipse(graph);
            }
        };
        frame.add(component);
        frame.setVisible(true);
    }
}
