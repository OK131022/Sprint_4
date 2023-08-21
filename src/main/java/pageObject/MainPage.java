package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {

    // Страница приложения
    private static final String PAGE_URL = "https://qa-scooter.praktikum-services.ru/";

    // Кнопка "Куки"
    private static final By COOKIES = By.xpath(".//button[@class='App_CookieButton__3cvqF']");

    // Картинка с самокатом
    private static final By IMAGE = By.xpath(".//img[@src='/assets/blueprint.png']");


    // Список "Вопросы о важном"
    private static final By IMPORTANT = By.xpath(".//div[text()='Вопросы о важном']");

    // Кнопка "Заказать" наверху
    private static final By ORDER1 = By.xpath(".//button[@class='Button_Button__ra12g']");

    // Кнопка "Заказать" внизу
    private static final By ORDER2 = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    // Вопросы из раздела Вопросы о важном
    public static final By QUESTION0 = By.id("accordion__heading-0");
    public static final By QUESTION1 = By.id("accordion__heading-1");
    public static final By QUESTION2 = By.id("accordion__heading-2");
    public static final By QUESTION3 = By.id("accordion__heading-3");
    public static final By QUESTION4 = By.id("accordion__heading-4");
    public static final By QUESTION5 = By.id("accordion__heading-5");
    public static final By QUESTION6 = By.id("accordion__heading-6");
    public static final By QUESTION7 = By.id("accordion__heading-7");

    // Ответы при развороте каждого вопроса из раздела Вопросы о важном
    public static final By ANSWER0 = By.xpath(".//div[@id='accordion__panel-0']");
    public static final By ANSWER1 = By.xpath(".//div[@id='accordion__panel-1']");
    public static final By ANSWER2 = By.xpath(".//div[@id='accordion__panel-2']");
    public static final By ANSWER3 = By.xpath(".//div[@id='accordion__panel-3']");
    public static final By ANSWER4 = By.xpath(".//div[@id='accordion__panel-4']");
    public static final By ANSWER5 = By.xpath(".//div[@id='accordion__panel-5']");
    public static final By ANSWER6 = By.xpath(".//div[@id='accordion__panel-6']");
    public static final By ANSWER7 = By.xpath(".//div[@id='accordion__panel-7']");



    private WebDriver driver;

    // Конструктор
    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    // Метод открытия страницы
    public void openPage() {
        driver.get(PAGE_URL);
    }

    // Метод для клика чтобы убрать куки
    public void clickCookies() {
        driver.findElement(COOKIES).click();
    }

    // Ожидание зкагрузки страницы по элементу
    public void waitImage() {
        new WebDriverWait(driver, Duration.ofSeconds(25))
                .until(ExpectedConditions.visibilityOfElementLocated(IMAGE));


    }

    // Кликнуть на кнопку "Заказать наверху"
    public void clickOrderButton() {
        driver.findElement(ORDER1).click();
    }

    // Кликнуть на кнопку "Заказать внизу"
    public void clickOrderButton2() {
        driver.findElement(ORDER2).click();
    }

    // Скрол до раздела Вопросы о важном
    public void scrollList() {
       WebElement element = driver.findElement(IMPORTANT);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        // скрол до конца страницы
       // driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
    }

    //Кликнуть на выпадающий вопрос
    public void clickButtonList(By QUESTION) {
        driver.findElement(QUESTION).click();
    }




}
