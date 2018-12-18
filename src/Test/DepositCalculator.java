package Test;

/*
 * Import required libraries
 */
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import javax.swing.*;

	/*
	 * Main class
	 */

public class DepositCalculator extends JFrame {
	
	private static final long serialVersionUID = -5787657378963183348L;
		static JTextField[] pane= new JTextField[3];
		static JButton btn1= new JButton();
		static JButton btn2= new JButton();
		static JLabel[] label= new JLabel[3];
		static DecimalFormat df = new DecimalFormat("#.####");
	
		/*
		 * Frame setup method
		 */
	
		public DepositCalculator(){
			super("Deposit Calculator");
			setSize(400,400);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setLocationRelativeTo(null);
			setLayout(new GridLayout(4,2));
			add(pane[0]= new JTextField());
			add(label[0] = new JLabel("Deposit"));
			add(pane[1]= new JTextField());
			add(label[1] = new JLabel("Percent"));
			add(pane[2]= new JTextField());
			add(label[2] = new JLabel("Term"));
			add(btn1= new JButton("Calculate"));
			for (int i=0;i<pane.length;i++) {
				pane[i].addKeyListener(new KeyAdapter() { //KeyListener tuning
					public void keyTyped(KeyEvent e) {
						char c = e.getKeyChar();
						if ( ((c < '0') || (c > '9')) &&((int)c!= KeyEvent.VK_PERIOD)){
							e.consume();
						}
					}
				});
			}
			btn1.addActionListener(new ActionListener() {	//Button 1 action
				public void actionPerformed(ActionEvent e) {
					if ((pane[0].getText().trim().length()==0)||(pane[1].getText().trim().length()==0)||(pane[2].getText().trim().length()==0)) {
						JOptionPane.showMessageDialog(null,"Wrong number", "Error", JOptionPane.ERROR_MESSAGE);
					}
					else {
						double a=Double.valueOf(pane[0].getText());
						double b=Double.valueOf(pane[1].getText());
						int c=Integer.valueOf(pane[2].getText());	
						JOptionPane.showMessageDialog(null,df.format(Deposit(a,b,c)), "Result", JOptionPane.PLAIN_MESSAGE);
						pane[0].setText("");
						pane[1].setText("");
						pane[2].setText("");
					}
				}
			});
			add(btn2= new JButton("Close")); //Button 2 action
			btn2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(1);
				}
			});
		}
		
		/*
		 * Main method
		 * that runs the frame 
	 	*/
		
		public static void main(String[] args) {
			DepositCalculator Window = new DepositCalculator();
			Window.setVisible(true);
		}
		
		/*
		* Basic calculation method
	 	* a - deposit amount
	 	* b - percent
	 	* c - Term of contribution in years
	 	*/
		
		public double Deposit(double a, double b, int c) {
			for (int i =0;i<c;i++)
			{
				a=a*((b/100)+1);
			}
			return a;
		}
	}	