import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DelfiTests {
    @Test
  //  annotation
    public void firstTest() {
        System.setProperty("webdriver.chrome.driver", "D://Java//chromedriver.exe");
  //      String text = "";
        WebDriver driver = new ChromeDriver();
  //      WebDriver anotherdriver = new ChromeDriver();
        driver.get("http://delfi.lv");
  //      anotherdriver.get("http://facebook.com");
    }
}
