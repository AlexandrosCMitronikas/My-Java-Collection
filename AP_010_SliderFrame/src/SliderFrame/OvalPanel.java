package SliderFrame;

import java.awt.Graphics;
import java.awt.Dimension;
import javax.swing.JPanel;


public class OvalPanel extends JPanel{
        private int diameter = 10;
        
        public void paintComponent(Graphics g)
        {
                super.paintComponent(g);
                
                g.fillOval(10, 10, diameter, diameter); // draw circle
        }  // end of method paintComponent
        
        public void setDiameter(int newDiameter)
        {
                diameter = (newDiameter >= 0 ? newDiameter : 10);
                repaint(); //repaint panel
        }
        
        public Dimension getPreferredSize()
        {
                return new Dimension(200, 200);
                
        } // end method getPrefferedSize
        
        public Dimension getMinimumSize()
        {
                return getPreferredSize();
                                
        } // end of getPreferredSize
        

}
