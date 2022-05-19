import javax.swing.*;
public class lang {
    static int lang(){
        ImageIcon icon = new ImageIcon();
        String[] responses = {"ENGLISH","DEUTSCH","FRANCAIS"};
        int answer = JOptionPane.showOptionDialog(
          null,
          "Which language would you like to use?", 
          "Select language", 
          JOptionPane.DEFAULT_OPTION, 
          0, 
          icon, 
          responses, 
          responses[0]);
        return answer;
        }
}
  