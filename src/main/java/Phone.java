import java.util.ArrayList;

public class Phone {
private String mAreaCode;
private String mNumber;
private String mType;

public Phone (String areaCode, String number, String type) {
  mAreaCode = areaCode;
  mNumber = number;
  mType = type;
  }

  public String areaCode() {
    return mAreaCode;
  }

  public String number() {
    return mNumber;
  }

  public String type() {
    return mType;
  }
}
