package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultsPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    private final By articleTitles = By.cssSelector("article h2, article h3, .entry-title");
    private final By body = By.tagName("body");

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public boolean hasResults() {
        wait.until(d -> d.findElement(body).isDisplayed());
        List<WebElement> results = driver.findElements(articleTitles);
        return !results.isEmpty();
    }

    public boolean containsText(String text) {
        wait.until(d -> d.findElement(body).isDisplayed());
        return driver.findElement(body).getText().toLowerCase().contains(text.toLowerCase());
    }
}