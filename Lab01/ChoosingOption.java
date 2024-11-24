package OOP.Lab01;
import javax.swing.JOptionPane;


public class ChoosingOption {


    public static void main(String[] args) {
        
        Object[] arr = {"Dong y", "Khong"};


        int option = JOptionPane.showOptionDialog(null, "Do you want to change to first class ticket", null, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, arr, arr[0]);

        JOptionPane.showMessageDialog(null, "You have chosen: " + (option == JOptionPane.YES_OPTION?"Yes":"No"), null, 0);

        System.exit(0);
    }
}
