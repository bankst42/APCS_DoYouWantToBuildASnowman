/* BasicFrame.java

  This is a really simple graphics program.
  It opens a frame on the screen with a single
  line drawn across it.

  It's not very polished, but it demonstrates
  a graphical program as simply as possible.mag-27Apr2008
*/

// Import the basic graphics classes.
import java.awt.*;
import javax.swing.*;

public class BasicJPanel extends JPanel{

    // Create a constructor method
    public BasicJPanel(){
        super();
    }

    // The following methods are instance methods.

    /* Create a paintComponent() method to override the one in
      JPanel.This is where the drawing happens. We don't have
      to call it in our program, it gets called automatically
      whenever the panel needs to be redrawn, like when it is
      made visible or moved or whatever.
    */
    public void paintComponent(Graphics g){
        g.drawLine(120, 200, 210, 220); // Draw a line from (10,10) to (150,150)
        g.drawLine(260, 220, 350, 200);
        g.drawOval(200, 200, 70, 50); //body
        g.drawOval(205, 125, 60, 75); //head
        g.drawOval(175, 250, 120, 100); //bottom
        g.drawOval(230, 220, 10, 10); //button
        g.drawOval(230, 270, 10, 10); //button
        g.drawOval(230, 300, 10, 10); //button
        g.drawOval(230, 330, 10, 10); //button
        g.drawOval(220, 150, 10, 10); //eye
            }

    public static void main(String arg[]){
        JFrame frame = new JFrame("BasicJPanel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);

        // Create a new identifier for a BasicJPanel called "panel",
        // then create a new BasicJPanel object for it to refer to.
        BasicJPanel panel = new BasicJPanel();

        // Make the panel object the content pane of the JFrame.
        // This puts it into the drawable area of frame, and now
        // we do all our drawing to panel, using paintComponent(), above.
        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}