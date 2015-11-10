import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class SeleniumBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd=new FirefoxDriver();	
		wd.get("http://www.gmail.com"); //open the web page.	
	}

}
