/*
class jPanelGradient extends JPanel {
        protected void paintComponent(Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            int largura = getWidth();
            int altura = getHeight();
            
            Color c1 = new Color(0,255,102);
            Color c2 = new Color(0,255,102);
            GradientPaint gp = new GradientPaint(0, 0, c1, 180, altura, c2);
            g2d.setPaint(gp);
            g2d.fillRect(0, 0, largura, altura);
        }
    }