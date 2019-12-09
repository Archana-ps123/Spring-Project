package registration;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Registration {
	
	static String fname;
	static String lname;
	static String user1;
	static String password;
	static String confirmation;
	static String mobno;
	static String emailid;
	
	public static void main( String[] args) {
		
		
		JFrame f = new JFrame("REGISTRATION");
		JButton bs = new JButton("Save");
        bs.setBounds(100, 400, 100, 50);
      
        
        
        
		JButton bsubmit = new JButton("Submit");
		bsubmit.setBounds(100, 500, 100, 50);
		////////////////////////////////
		JTextField tfn, tln, tuser, tpswd, tconfirm, tmob, temail;
		JLabel fn , ln , user, pswd, mob, email,confirm;
		fn = new JLabel("First Name :");
		fn.setBounds(10, 50, 100, 50);
		ln = new JLabel("Last Name :");
		ln.setBounds(10, 100, 100, 50);
		user = new JLabel("User Name:");
		user.setBounds(10, 140, 100, 50);
		pswd = new JLabel("Password :");
		pswd.setBounds(10, 180, 100, 50);
        confirm = new JLabel("Confirm Password :");
		confirm.setBounds(10, 220, 100, 50);
		mob = new JLabel("Mobile Number :");
		mob.setBounds(10, 260, 100, 50);
		email = new JLabel("email-id :");
		email.setBounds(10,300, 100, 50);
		////////////////////////////////
		
		tfn = new JTextField();
		tfn.setBounds(150,60, 250, 30);
		
		tln = new JTextField();
		tln.setBounds(150,110, 250, 30);
		
		
		tuser = new JTextField();
		tuser.setBounds(150,160, 250, 30);
		
		tpswd = new JTextField();
		tpswd.setBounds(150,210, 250, 30);
		
		tconfirm = new JTextField();
		tconfirm.setBounds(150,260, 250, 30);
		
		tmob = new JTextField();
		tmob.setBounds(150,310, 250, 30);
		
		temail = new JTextField();
		temail.setBounds(150,310, 250, 30);
		/////////////////////////////////
		  bs.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e)
	        	{
	        		fname = tfn.getText();
	        		tfn.setText(fname);

	        		lname = tln.getText();
	        		tln.setText(lname);

	        		user1 = tuser.getText();
	        		tuser.setText(user1);

	        		password = tpswd.getText();
	        		tpswd.setText(password);

	        		confirmation = tconfirm.getText();
	        		tconfirm.setText(confirmation);

	        		mobno = tmob.getText();
	        		tmob.setText(mobno);
	        		

	        		emailid = temail.getText();
	        		temail.setText(emailid);
	        			
	        	}
	        	
	        }
	        );
		
		  bsubmit.addActionListener(new ActionListener()
				  {
			  public void actionPerformed(ActionEvent e)
			  {
				  JFrame f2 = new JFrame("REGISTRATION");
				  
				  fn.setText(fname);
				  ln.setText(lname);
				  user.setText(lname);
				  pswd.setText(password);
				  confirm.setText(confirmation);
				  mob.setText(mobno);
				  email.setText(emailid);
				  f2.add(fn);
                   f2.add(ln);
                   f2.add(user);
                   f2.add(pswd);
                   f2.add(confirm);
                   f2.add(mob);
                   f2.add(email);
				  f2.setSize(400,500);
				  f2.setLayout(null);
				  
				  f2.setVisible(true);
				  f.setVisible(false);
				  
				  
	        			
				//  f2.add();
				  
				 
				  
				  
			  }
				  });
		
		///////////////////////////////////TextField
	    f.add(fn);
		f.add(ln);
		f.add(user);
		f.add(pswd);
		f.add(mob);
		f.add(email);
		f.add(confirm);
		/////////////////////
		f.add(tfn);
		f.add(tln);
		f.add(tuser);
		f.add(tpswd);
		f.add(tconfirm);
		f.add(temail);
		///////////////////////
		f.add(bs);
		f.add(bsubmit);
		
		////////////////////
		//fname = tfn.getText();
		
		
		
		//////////////////////
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);

	}

}
