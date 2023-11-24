package FileScanner;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.*;

class GUIskeleton extends JFrame implements ActionListener {
    GUIskeleton(ArrayList<File> Images) throws IOException {
        setTitle ("252-2022: A4");
        setBounds(200,100,800,600); //x, y, width, height)
        setLayout(new GridLayout(0,4)); // rows, columns
        for (File s: Images) {
            JButton btext = new JButton(s.getAbsolutePath());
            JLabel label = new JLabel();
            BufferedImage img = ImageIO.read(s);
            ImageIcon imgThisImg = new ImageIcon(img);
            label.setIcon(imgThisImg);

            btext.addActionListener(this);
            add(btext);
            add(label);
        }
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object so = e.getSource();
        if (so instanceof JButton) {
            JButton sj = (JButton) so;
            String sjt = sj.getText();
            Desktop dt = Desktop.getDesktop();
            try {
                dt.open(new File(sjt));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
