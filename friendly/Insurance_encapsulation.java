package friendly;

public class Insurance_encapsulation {

	
	Address_encap addr = null;
	

		public Address_encap getAddr() {
				return addr;
			}


		public void setAddr(Address_encap addr) {
				this.addr = addr;
			}
	
	
	personalDetails_encap pDetails = null;
	
	
		public personalDetails_encap getpDetails() {
			return pDetails;
		}
	
	
		public void setpDetails(personalDetails_encap pDetails) {
			this.pDetails = pDetails;
		}


	public static void main(String[] args) {
		Insurance_encapsulation coverage = new Insurance_encapsulation();
		
		Address_encap address = new Address_encap();
		
			address.setLine("14 Washington road");
			address.setLine1("building 2");
			address.setCity("NJ");
		
		personalDetails_encap personal = new personalDetails_encap();
		
			personal.setfName("Revanth");
			personal.setlName("Adonis");
			personal.setMobile("1234567890");
			personal.setPolicy("A1234");
		
		coverage.setAddr(address);
	
		coverage.setpDetails(personal);
	
		coverage.print(coverage);
		
	}

	
	public void print(Insurance_encapsulation print)
	{
		
		System.out.println(print.getpDetails().getfName() + " is from " + print.getAddr().getCity() + " stays in " + print.getAddr().getLine() + " holding the policy number " + print.getpDetails().getPolicy() + " and the mobile number " + print.getpDetails().getMobile() + " .");
			
	}
}
