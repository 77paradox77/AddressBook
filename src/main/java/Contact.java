import java.util.ArrayList;

public class Contact {
  private String mFirstName;
  private String mLastName;
  private String mBirthMonth;
  private ArrayList<Phone> phoneNumbers = new ArrayList<Phone>();
  private ArrayList<Email> emailAddresses = new ArrayList<Email>();
  private static ArrayList<Contact> instances = new ArrayList<Contact>();

      public Contact (String firstName, String lastName, String birthMonth){
        mFirstName = firstName;
        mLastName = lastName;
        mBirthMonth = birthMonth;
        instances.add(this);
      }

      public String getName() {
        return mFirstName;
      }

      public String getLastName() {
        return mLastName;
      }

      public String getBirthDate() {
        return mBirthMonth;
      }

      static ArrayList all() {
        return instances;
      }

      public void addNumber(Phone number){
        phoneNumbers.add(number);
      }

      public ArrayList getNumbersArray(){
        return phoneNumbers;
      }

      public void addEmail(Email emailAddress){
        emailAddresses.add(emailAddress);
      }

      public ArrayList getEmailsArray(){
        return emailAddresses;
      }
}
