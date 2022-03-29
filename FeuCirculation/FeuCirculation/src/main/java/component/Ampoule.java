package component;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Ampoule extends JPanel{
    private static final Color COULEUR_ETEINTE = Color.LIGHT_GRAY;
    private static final Color COULEUR_BORDURE = Color.DARK_GRAY;
    
    private Color couleurAllumee;
    private boolean allumee = false;

    public Ampoule() {
        this(Color.BLUE);
    }
    
    

    public Ampoule(Color couleurAllumee) {
        this.couleurAllumee = couleurAllumee;
    }
    
    public void allumer(){
        allumee = true;
        repaint();
    }
    
    public void eteindre(){
        allumee = false;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(allumee?couleurAllumee:COULEUR_ETEINTE);
        g.fillOval(0, 0, getWidth(), getHeight());
        g.setColor(COULEUR_BORDURE);
        g.drawOval(0, 0, getWidth(), getHeight());
    }
    
    
}
