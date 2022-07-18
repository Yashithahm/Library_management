//login page 
package My_Library;

	import java.awt.GridBagConstraints;
	import java.awt.GridBagLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
	import javax.swing.JTextField;

	public class lib_loginpage {

	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        JFrame frame = new JFrame();
	        frame.setSize(500, 500);
	        frame.setTitle("USER LOGIN");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	        JPanel pane = new JPanel (new GridBagLayout());
	        GridBagConstraints c = new GridBagConstraints();

	        JLabel label = new JLabel("UserName: ");
	        c.gridx = 0;
	        c.gridy = 1;
	        pane.add(label,c);

	        JTextField uname = new JTextField(20);
	        c.gridx = 1;
	        c.gridy = 1;
	        pane.add(uname,c);

	        JLabel label1 = new JLabel("Password: ");
	        c.gridx = 0;
	        c.gridy = 2;
	        pane.add(label1,c);

	        JTextField pssd = new JTextField(20);
	        c.gridx = 1;
	        c.gridy = 2;
	        pane.add(pssd,c);

	        JButton submit = new JButton("Login");
	        ActionListener al = new ActionListener() {
	            public void actionPerformed(ActionEvent e) {

	                String user = uname.getText();
	                String pass = pssd.getText();

//	                System.out.println("Your user name is: "+uname.getText());
//	                System.out.println("your password is:"+pssd.getText());

	                if (user.equals("Yashitha") && pass.equals("yashitha12345")) 
	                {
	                	 JOptionPane.showMessageDialog (frame, "you are sucessfully logined");
	                	
//                       uname.setEnabled(false);
//	                    System.out.println("your user name is incorrect ");
//	                    pssd.setEnabled(false);
//	                    System.out.println("your password is incorrect");

	                }
	                else {
	                	JOptionPane.showMessageDialog (frame, "Invalid username or password");
	                }
	                
	                
	                // class linking
	               new_reg link= new new_reg();
	                link.setVisible(true);
	                
//	                JOptionPane.showMessageDialog (frame, "you are sucessfully logined");
//	                JOptionPane.showMessageDialog (frame, "Invalid username or password");
	               // btnLogin.setBounds (171, 197, 89, 23);
	                frame.getContentPane().add (submit);
	    }
	    };

	        submit.addActionListener(al);
	        c.gridx = 1;
	        c.gridy = 9;
	        c.gridwidth = 5;
	        c.fill = GridBagConstraints.HORIZONTAL;
	        pane.add(submit, c);

	        frame.add(pane);
	        frame.pack();
	        submit.addActionListener(al);
	        frame.setVisible(true);
	    }

		protected void setVisible(boolean b) {
			// TODO Auto-generated method stub
			
		}

	}


