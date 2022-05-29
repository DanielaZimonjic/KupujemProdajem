import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Domaći: Otići na kupujemprodajem.com, u pretragu ukucati iphone 13, kliknuti na prvi rezultat.
Proveriti da je naslov oglasa onaj koji smo uočili i tokom manuelnog izvođenja kejsa.
 */
public class Iphone13 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();


        driver.navigate().to("http://kupujemprodajem.com/");
        WebElement element= driver.findElement(By.xpath(" //*[@id=\"bodyTag\"]/div[9]/div/div[2]"));
        element.click();
        WebElement searchField= driver.findElement(By.id("searchKeywordsInput"));
        searchField.sendKeys("iphone13");
        WebElement trazi= driver.findElement(By.xpath("//*[@id=\"searchFormHolder\"]/div/div/div[2]/div[2]/div[2]/div[1]/input"));
        trazi.click();
        WebElement iphone13=driver.findElement(By.xpath("//*[@id=\"adDescription103865646\"]/div/section[1]/div/div/a/div/img"));
        iphone13.click();

        String actual= iphone13.getText();
        String expected ="iPhone13 mini/13 Pro Max/13/13 Pro/iPhone 11/12/12 Pro/Xr";

        System.out.println(actual.equals(expected));

        driver.close();





    }
}
