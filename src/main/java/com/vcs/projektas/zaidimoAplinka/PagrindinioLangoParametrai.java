package com.vcs.projektas.zaidimoAplinka;

import javax.swing.*;
import java.awt.*;

public class PagrindinioLangoParametrai extends JPanel {


    public PagrindinioLangoParametrai() {
        setBorder(BorderFactory.createLineBorder(Color.yellow));
    }

        public Dimension getPreferredSize() {
        return new Dimension(800,600);
    }

        public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw Text
        g.drawString("ŽAIDIMAS",20,40);
        
    }
    }
