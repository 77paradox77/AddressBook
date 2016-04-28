import org.junit.*;
import static org.junit.Assert.*;

public class EmailTest {

  @Test
  public void Email_instantiatesCorrectly_true(){
    Email testEmail = new Email("xxx@gmail.com", "home");
    assertTrue(testEmail instanceof Email);
  }

  @Test
  public void Email_returnAddressCorrectly_address(){
    Email testEmail = new Email("xxx@gmail.com", "home");
    assertEquals("xxx@gmail.com", testEmail.getAddress());
  }

  @Test
  public void Email_returnTypeCorrectly_type(){
    Email testEmail = new Email("xxx@gmail.com", "home");
    assertEquals("home", testEmail.getType());
  }
}
