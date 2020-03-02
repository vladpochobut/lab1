import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mainform {
    private JPanel App;
    private JButton button1;
    private JTextField textField2;
    private JTextField textField1;
    private JTextField textField3;
    private JLabel answer;

    public Mainform() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double d;
                Double a = Double.parseDouble(textField1.getText());
                Double b = Double.parseDouble(textField2.getText());
                Double c = Double.parseDouble(textField3.getText());
                d = (a > b)? ( (a > c)? a : c ) : ( (b > c)? b : c );
                answer.setText(String.valueOf(d));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mainform");
        frame.setContentPane(new Mainform().App);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }



}
