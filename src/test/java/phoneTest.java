import org.junit.*;
import static org.junit.Assert.*;

public class phoneTest {

  @Test
    public void number_makingSurePhoneInsantiates_true() {
      Phone testPhone = new Phone("(360)", "834-1894", "Home");
      assertEquals(true, testPhone instanceof Phone);
    }

  @Test
  public void areaCode_makingAreaCodeNotPrivate_true() {
    Phone testPhone = new Phone("(360)", "834-1894", "Home");
    assertEquals("(360)", testPhone.areaCode());
  }

  @Test
  public void number_MakingNumberNotPrivate() {
    Phone testPhone = new Phone("(360)", "834-1894", "Home");
    assertEquals("834-1894", testPhone.number());
  }

  @Test
  public void type_MakingTypeNotPrivate() {
    Phone testPhone = new Phone("(360)", "834-1894", "Home");
    assertEquals("Home", testPhone.type());
  }
}
