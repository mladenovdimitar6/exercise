package exer;

public class readerprofile {
	
	   private String firstName;
	   private String lastName;
	   private String paralelka;
	   private book[] takenBooks;
	   private int Grade;
	   private long phoneNumber;

	   public String getFirstName() {
	      return this.firstName;
	   }

	   public String getLastName() {
	      return this.lastName;
	   }

	   public int getGrade() {
	      return this.Grade;
	   }

	   public String getParalelka() {
	      return this.paralelka;
	   }

	   public long getPhoneNumber() {
	      return this.phoneNumber;
	   }

	   public void setFirstName(String firstName) {
	      this.firstName = firstName;
	   }

	   public void setLastName(String lastName) {
	      this.lastName = lastName;
	   }

	   public void setGrade(int Grade) {
	      this.Grade = Grade;
	   }

	   public void setParalka(String paralelka) {
	      this.paralelka = paralelka;
	   }

	   public void setPhoneNumber(long phoneNumber) {
	      this.phoneNumber = phoneNumber;
	   }

	   public readerprofile(String firstName, String lastName, int Grade, String paralelka, long phoneNumber) {
	      this.firstName = firstName;
	      this.lastName = lastName;
	      this.Grade = Grade;
	      this.paralelka = paralelka;
	      this.phoneNumber = phoneNumber;
	   }

	   public readerprofile(book a) {
	      this.takenBooks[0] = a;
	   }

	   public void printTakenBooks() {
	      book[] var4;
	      int var3 = (var4 = this.takenBooks).length;

	      for(int var2 = 0; var2 < var3; ++var2) {
	         book book = var4[var2];
	         if (book != null) {
	            System.out.println(book);
	         }
	      }

	   }

	   public String toString() {
	      return String.format("Ime: %s %s \nGrade: %d \nParalelka: %s \nPhoneNumber: %d \nTakenBooks:", this.firstName, this.lastName, this.Grade, this.paralelka, this.phoneNumber);
	   }
	}