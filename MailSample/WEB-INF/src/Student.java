

public class Student{
	 	int rollno;
	    String name, address;
	 
	    public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		// Constructor
	    public Student(int rollno, String name,
	                               String address)
	    {
	        this.rollno = rollno;
	        this.name = name;
	        this.address = address;
	    }
	 
	    // Used to print student details in main()
	    public String toString()
	    {
	        return this.rollno + " " + this.name +
	                           " " + this.address;
	    }
}
