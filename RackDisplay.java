
import java.awt.FlowLayout;
import java.awt.*;       // Using AWT containers and components
import java.awt.event.*; // Using AWT events and listener interfaces
import javax.swing.*;    // Using Swing components and containers

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RackDisplay extends JFrame {
	
	 private JTextField tfCount;  
	  private int count = 0;
	
	public RackDisplay(){
		Container cp = getContentPane();
	     cp.setLayout(new FlowLayout());
	     cp.add(new JLabel("Counter"));
	     tfCount = new JTextField("0", 10);
	     tfCount.setEditable(false);
	     cp.add(tfCount);
	 
	     JButton btnCount = new JButton("Count");
	     cp.add(btnCount);
	     // Allocate an anonymous instance of an anonymous inner class that
	      //  implements ActionListener as ActionEvent listener
	      btnCount.addActionListener(new ActionListener() {
	         @Override
	         public void actionPerformed(ActionEvent e) {
	            ++count;
	            tfCount.setText(count + "");
	         }
	      });
	 
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Exit program if close-window button clicked
	      setTitle("Swing Counter"); // "this" JFrame sets title
	      setSize(300, 100);         // "this" JFrame sets initial size
	      setVisible(true);          // "this" JFrame shows
		
	}
	

}
