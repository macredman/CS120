import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

/*Mackenzie Redman
 * 3/22/2016
 * youtube.com/thenewboston
 */

public class Frame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	String print = "";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the frame.
	 */
	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 156);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setForeground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblPressAButton = new JLabel("Press a button to demonstrate recursion:");
		lblPressAButton.setFont(new Font("Tahoma", Font.PLAIN, 19));
		contentPane.add(lblPressAButton);
		
		//run factorial method from Main
		JButton btnNewButton = new JButton("Factorial");
		btnNewButton.setBackground(new Color(135, 206, 235));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Main.partOne();
			}
		});
		contentPane.add(btnNewButton);
		
		//run permutation method from Main
		JButton btnNewButton_1 = new JButton("Permutation");
		btnNewButton_1.setBackground(new Color(0, 191, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.partThree();
			}
		});
		
		JButton btnNewButton_2 = new JButton("Print String");
		btnNewButton_2.setBackground(new Color(100, 149, 237));
		
		//runs print method from Main
		contentPane.add(btnNewButton_2);
		contentPane.add(btnNewButton_1);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Main srr = new Main();
			        System.out.println("Result: "+srr.printString("Recursion"));
			}
		});
	}

}
