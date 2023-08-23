import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Cat extends JFrame implements ActionListener{

    JLabel jL1 = new JLabel("Nom: ");
    JTextField jT1 = new JTextField(12);
    JButton jB1 = new JButton("Add");
    JButton jB2 = new JButton("Supprimer");
    List liste1 = new List();
    List liste2 = new List();
    public Cat(){
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLayout(new BorderLayout());
        JPanel jpl = new JPanel();
        jpl.setLayout(new FlowLayout());
        jpl.add(jL1);
        jpl.add(jT1);
        jpl.add(jB1);
        jpl.add(jB2);
        this.add(jpl, BorderLayout.NORTH);

        JPanel jp2 = new JPanel();
        jp2.setLayout(new GridLayout());
        jp2.add(liste1);
        jp2.add(liste2);

        jB1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = jT1.getText();
                liste1.add(s);
                jT1.setText("");
            }
        });
        jB2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = liste1.getSelectedIndex();
                liste1.remove(num);
            }
        });




        this.add(jp2, BorderLayout.CENTER);
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setVisible(true);
    }

    public static void main(String[] args){
        new Cat();
    }

    @Override
    public void actionPerformed(ActionEvent e){

    }



}
