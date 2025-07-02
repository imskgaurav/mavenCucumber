import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorPractice {

    static WebDriver driver ;
    public static void main(String[] args) {

    }

    public  void doClick(By locator){
          getElement(locator).click();
    }

    public static WebElement getElement(By locator) {
      return  driver.findElement(locator);

    }
}
