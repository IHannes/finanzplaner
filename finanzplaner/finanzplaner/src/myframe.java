import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.math.*;
import java.awt.event.*;
import java.awt.*;

public class myframe extends JFrame implements ActionListener{
    myframe(int lang){
 
        JFrame frame = new JFrame();
        System.out.print(lang);
        //GET AND SET SCREEN SIZE:
        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = screensize.height;
        int width = screensize.width;
        this.setSize((int) Math.ceil(height/1.5),(int) Math.ceil(width/1.5));

        //SET TITLE
        this.setTitle("Finanzplaner");

        //SET CLOSE OPERATIOM
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon("p0.jpg");
        this.setIconImage(icon.getImage());

        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        this.getContentPane().setLayout(null);
        int a = init(lang);
        System.out.println(a);
        this.setVisible(true);
    }
        
    

    


    /*void mylabel(int width, int height){
        Border blackline = BorderFactory.createLineBorder(Color.BLUE, 3);
        JLabel label = new JLabel();
        ImageIcon image = new ImageIcon("p0.jpg");
        //label.setIcon(image);
        label.setText("Hallo");
        label.setSize(width/2, height/2);
        //label.setHorizontalTextPosition(JLabel.CENTER);
        //label.setVerticalTextPosition(JLabel.TOP);
        label.setBackground(Color.BLACK);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));
        //label.setIconTextGap(20);
        label.setOpaque(true);
        label.setBorder(blackline);
        //label.setVerticalAlignment(JLabel.CENTER);
        //label.setHorizontalAlignment(JLabel.CENTER);
        //label.setBounds(60,0, 123, 145);
        this.setLayout(null);
        this.pack();
        this.add(label);
    }*/
    void mypanel(){
        this.setLayout(null);

        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.RED);
        redpanel.setBounds(0, 0, 900, 210);
        mylabel label = new mylabel();
        redpanel.add(label);

        /*JPanel bluepanel = new JPanel();
        bluepanel.setBackground(Color.BLUE);
        bluepanel.setBounds(400,400,300,300);
        this.add(redpanel);
        this.add(bluepanel);*/
        this.add(redpanel);
    }
    String currency(){
        JPanel currency = new JPanel();
        JLabel choose = new JLabel("");

        JComboBox c = new JComboBox();
        return "eins";
    }
    int init(int lang){
        int time = 0;
        int totalassets = 0;
        String welcome;
        String assets;
        switch(lang){         
            case 0 : welcome = "Welcome to your finance Calculator!";
                     assets = "As of " + time +  " your total assets are:" + totalassets;
            case 1 : welcome = "Wilkommen in ihrem Finanzrechner";
                     assets = "Am " + time + "beträgt ihr Vermögen:" + totalassets;
            case 2 : welcome = "Bienvenue dans votre calculatrice de finances personelles";
                     assets = "Le" + time + "vos avoirs sont de" + totalassets;

        }
        JPanel init = new JPanel();

        JLabel nit = new JLabel("This is a label");
        //Set font and font size
        nit.setFont(new Font("JetBrains Mono", Font.BOLD, 6));
        init.add(nit);
        //Set position and size of Panel
        init.setBounds(100, 100, 100, 100);
        init.setBorder(new LineBorder(Color.BLACK, 5, true));
        this.add(init);
        //this.setLocationRelativeTo(null);
        //this.setSize(400,400);
        //this.setLocationRelativeTo(null);
        return 0;
    }
   /* int fixrevenue(){
        JPanel revenue = new JPanel();
        revenue.setB
        return 0;
    }*/
}