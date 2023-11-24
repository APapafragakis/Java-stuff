import javax.swing.JOptionPane;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.Line2D;
import java.awt.geom.QuadCurve2D;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

class Ask1 {

    static void File_Draw(int L){
        PrintWriter writer;
        try {
            writer = new PrintWriter("E.html", "UTF-8");
            writer.println("<!DOCTYPE html>");
            writer.println("<html>");
            writer.println("<head>");
            writer.println("<meta http-equiv=\"content-type\" content=\"text/html;charset=utf-8\"/>");
            writer.println("</head>");
            writer.println("<body><font size=\"" + L + "\">E with font size =" + L + "</font></body>");
            writer.println("</html>");
            writer.close();
        } catch (Exception e) {
            System.out.println("Ππόβλημα: "+e);
        }
    }
    static String Window_Draw(int L){
        String E = "";
        for (int i=0;i<L ;i++ )
        {
            for (int j=0;j<L ;j++ )
            {
                if (i==0 || i==L-1 || i==L/2 || j==0)
                {
                    E = E + "* ";
                }
                else
                {
                    E = E + "  ";
                }
            }
            E = E + "\n";
        }
        return E;
    }
    static void Console_Draw(int L){
        for (int i=0;i<L ;i++ )
        {
            for (int j=0;j<L ;j++ )
            {
                if (i==0 || i==L-1 || i==L/2 || j==0)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    static void Graphics_Draw(int L) {
        Frame f = new Frame("Ζωγραφίζοντας το Ε") {
            public void paint (Graphics g){
                Graphics2D g2 = (Graphics2D) g;
                CubicCurve2D c = new CubicCurve2D.Double();
                g2.draw(new Line2D.Double(50, 300, 200, 300));
                g2.draw(new Line2D.Double(50, 180, 200, 180));
                g2.draw(new Line2D.Double(50, 75, 200, 75));
                g2.draw(new Line2D.Double(50, 75, 50, 300));
                g2.draw(c);
            }
        };
        f.setSize(400,400);
        f.setVisible(true);
    }


    public static void main(String[] args){
        Ask1 A11 = new Ask1();
        String M = args[0];
        int L = Integer.parseInt(args[1]);
        Scanner in = new Scanner(System.in);
        while(L>=5 && L<=20) {
            if ((M.equals("c") || M.equals("w") || M.equals("f") || M.equals("g"))) {
                if (M.equals("c")) {
                    A11.Console_Draw(L);
                } else if (M.equals("w")) {
                    String E = Window_Draw(L);
                    JOptionPane.showMessageDialog(null, E,
                            "Παράθυρο Εξόδου", JOptionPane.INFORMATION_MESSAGE);
                } else if (M.equals("f")) {
                    File_Draw(L);
                } else if (M.equals("g")) {
                    A11.Graphics_Draw(L);
                }
            } else {
                throw new IllegalArgumentException("Wrong inputs");
            }
            L = L-1;
            args[1] = String.valueOf(L);
            main(args);
            if(!M.equals("w")) {
                L = in.nextInt();
            }else{
                L = Integer.parseInt(JOptionPane.showInputDialog( "Give me a number ",5));
            }
        }
        if(L<5 || L>20){
            throw new IllegalArgumentException("Wrong inputs");
        }
    }
}


