import org.junit.*;
import static org.junit.Assert.*;

public class ContactTest {

  @Test
    public void contact_instantiatesCorrectly_true() {
    Contact testContact = new Contact("Luca", "Quatela", "may 87");
    assertEquals(true, testContact instanceof Contact);
    }


  @Test
    public void contact_returnCorrectlyName_name() {
    Contact testContact = new Contact("Luca", "Quatela", "may 87");
    assertEquals("Luca", testContact.getName());
    }

  @Test
    public void contact_returnCorrectlyLastName_lastName() {
    Contact testContact = new Contact("Luca", "Quatela", "may 87");
    assertEquals("Quatela", testContact.getLastName());
  }

  @Test
    public void contact_returnCorrectlyBirthDate_birthDate() {
    Contact testContact = new Contact("Luca", "Quatela", "may 87");
    assertEquals("may 87", testContact.getBirthDate());
  }

  @Test
    public void contact_returnCorrectlyContactArray_instances() {
    Contact testContact = new Contact("Luca", "Quatela", "may 87");
    Contact testContact2 = new Contact("Reed", "Reed", "Somewhere in time");
    assertTrue(Contact.all().contains(testContact2));
  }

  @Test
    public void contact_canAddANumberToTheContact_number(){
      Contact testContact = new Contact("Luca", "Quatela", "may 87");
      Phone testPhone = new Phone("(360)", "834-1894", "Home");
      testContact.addNumber(testPhone);
      assertTrue(testContact.getNumbersArray().contains(testPhone));
    }

  @Test
    public void contact_canAddEmailAddressToTheContact_emailAddress(){
      Contact testContact = new Contact("Luca", "Quatela", "may 87");
      Email testEmail = new Email("xxx@gmail.com", "home");
      testContact.addEmail(testEmail);
      assertTrue(testContact.getEmailsArray().contains(testEmail));
    }


}
