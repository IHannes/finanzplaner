import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class currencyframe extends JFrame implements ActionListener{

String[] currencies = {"$", "€"};
JComboBox selectBox = new JComboBox(currencies);


    currencyframe(int lang){
        String CurrencyName;
        String Title;
        String Button;
        switch(lang){ 
            default:{ CurrencyName = "Select your currency(ies)";
                     Title = "Select currency";
                     Button = "Enter";
                    }
                     break;
            case 1: {CurrencyName = "Wählen Sie ihre Währung(en)";
                    Title = "Währungsauswahl";}
                    break;
            case 2: {CurrencyName = "Veuillez saisir votre/vos monnaie(s)";
                    Title = "Saisi de la monnaie";}
                    break;
        
        }

        
        JFrame cf = new JFrame();
        //this.setSize(100, 100);
        this.setTitle(Title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.WHITE);
        //this.getContentPane().setLayout(new CardLayout(10,10));
        CurrencyName(CurrencyName);
        String a = CurrencySelect();
        this.setVisible(true);
    }
     
    void CurrencyName(String CurrencyName){
        JPanel currencynm = new JPanel();
        JLabel currencyName = new JLabel(CurrencyName);
        currencyName.setFont(new Font("JetBrains Mono", Font.BOLD, 20));
        currencynm.add(currencyName);
       currencynm.setBounds(0, 0, 500, 500);
        this.add(currencynm);
    }

   String CurrencySelect(){
     //   ActionListener al = new ActionListener();


        selectBox.setEditable(false);
        selectBox.addActionListener(this);
        selectBox.setLocation(80, 30);
        this.add(selectBox);
        return "$";
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==selectBox) {
            System.out.println(selectBox.getSelectedItem());
        }
    }
}