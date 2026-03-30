package pages;

import org.openqa.selenium.WebDriver;

public class HomePage {

    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchByUrl(String term) {
        String formatted = term.replace(" ", "+");
        driver.get("https://blog.agibank.com.br/?s=" + formatted);
    }
}