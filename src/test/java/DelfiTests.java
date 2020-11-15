import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DelfiTests {
    @Test
    public void firstTest() {
        System.setProperty("webdriver.chrome.driver", "D:\\Java\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://delfi.lv");
    }
}
