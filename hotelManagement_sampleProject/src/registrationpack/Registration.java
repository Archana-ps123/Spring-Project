package registrationpack;

import customerpackage.Customer;

public class Registration {
Customer customer = new Customer();
private String email;
static int regId = 0;
static int ind = 0;

static String[] cusname = new String[25];
static int[] id = new int[25];

static String[] emailarr = new String[25]; 
static int index=0;
	
	public void register(String firstName,String middleName,String lastName,String email,String phone,String address,String prooftype,String proofId)
	{
		
	       customer.setFirstName(firstName);
	       customer.setMiddleName(middleName);
	       customer.setLastName(lastName);
	       customer.setEmail(email);
	       customer.setPhone(phone);
	       customer.setAddress(address);
	       customer.setProoftype(prooftype);
	       customer.setProofId(proofId);
	       System.out.println("Thank You for Registering");
	       System.out.println("Your details are:");
	       this.display();
	       
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Your Name is: "+customer.getFirstName()+" "+customer.getMiddleName()+" "+customer.getLastName());
		System.out.println("Your Email-id is: "+customer.getEmail());
		System.out.println("Your Phone number is: "+customer.getPhone());
		System.out.println("Your Address is: "+customer.getAddress());
		System.out.println("Prooftype: "+customer.getProoftype());
	    System.out.println("ProofId: "+customer.getProofId());
        System.out.print("Your Registration id is ");
       
        
        cusname[++index] = customer.getFirstName();
        emailarr[regId]= customer.getEmail();
       // id[index]= regId;
		
	}
public int  registerId() {
	++regId;
	id[regId]= regId;
	return regId;
}
	public void UpdateEmail(int cusId, String email) {
		for(int i = 1;i <= regId;i++)
		{
			if(cusId == i)
			{
				emailarr[i] = email;
				//this.email = email;
				System.out.println("Updated email:"+emailarr[i]);
			}
		}
	}
	

	public void viewCustomers() {
	for(int k = 1;k <= regId;k++)
		{
			System.out.println(id[k] +"		"+cusname[k]);
		 
		}
		System.out.println("Thank You!!!\n");
		
	}

	
	

}
