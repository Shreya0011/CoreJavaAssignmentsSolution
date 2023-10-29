package collectionsFramework;

public class Contacts {

	
		// TODO Auto-generated method stub
		
		
		enum Gender{
			Male, Female;
		}
		
		private String name;
		private String email;
		private Gender gender;
		
		public Contacts(String name, String email, Gender gender) {
			this.name = name;
			this.email = email;
			this.gender = gender;
		}
		
		public String getName() {
			return name;
		}
		public String getEmail() {
			return email;
		}
		public Gender getGender() {
			return gender;
		}
		
		public String toString() {
			return (getName()+" "+getEmail()+" "+getGender()); 
		}
		
	

}
