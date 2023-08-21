package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderPage {

    // Локатор для поля "Имя"
    private static final By NAME = By.xpath(".//input[@placeholder='* Имя']");

    // Локатор для поля  "Фамилия"
    private static final By SURNAME = By.xpath(".//input[@placeholder='* Фамилия']");

    // Локатор для поля "Адрес"
    private static final By ADDRESS = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");

    // Локатор для поля "Станция метро"
    private static final By METRO = By.xpath(".//div[@class='select-search__value']");

    // Локатор для выбора из списка Станция
    private static final By STATION = By.xpath(".//div[@class='Order_Text__2broi']");

    // Локатор для поля "Телефон"
    private static final By PHONE = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");

    // Локатор для кнопки "Далее"
    private static final By NEXT = By.xpath(".//button[text()='Далее']");

    // Локатор для поля "Когда привезти самокат"
    private static final By WHEN = By.xpath(".//input[@placeholder='* Когда привезти самокат']");

    // Локатор для даты когда привезти самокат
    private static final By DATE = By.xpath(".//div[@class='react-datepicker__month-container']//div[contains(@class, 'selected')]");

    // Локатор для поля "Срок аренды"
    private static final By RENTS = By.xpath(".//div[text()='* Срок аренды']");

    // Локатор для выбора срока аренды
    private static final By DAY = By.xpath(".//div[text()='двое суток']");

    // Локатор для кнопки "Заказать на странице про аренду"
    private static final By ORDER = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    // Локатор для кнопки "Да"
    private static final By YES = By.xpath(".//button[text()='Да']");

    // Локатор для окно заказа
    private static final By CREATE_ORDER = By.xpath(".//div[text()='Заказ оформлен']");

    private WebDriver driver;

    // Конструктор
    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }


    // Метод ввода имени
    public void inputName(String CLIENT_NAME) {
        WebElement name = driver.findElement(NAME);
        name.clear();
        name.sendKeys(CLIENT_NAME);
    }
    // Метод ввода фамилии
    public void inputSurname(String CLIENT_SURNAME) {
        WebElement surname = driver.findElement(SURNAME);
        surname.clear();
        surname.sendKeys(CLIENT_SURNAME);
    }
    // Метод ввода адреса
    public void inputAddress(String CLIENT_ADDRESS) {
        WebElement surname = driver.findElement(ADDRESS);
        surname.clear();
        surname.sendKeys(CLIENT_ADDRESS);
    }
    // Метод нажатия на список станции метро
    public void clickMetroList() {
        driver.findElement(METRO).click();
    }
    // Метод выбора станции метро
    public void clickMetro() {
        driver.findElement(STATION).click();
    }
    // Метод ввода телефона
    public void inputPhone(String CLIENT_PHONE) {
        WebElement surname = driver.findElement(PHONE);
        surname.clear();
        surname.sendKeys(CLIENT_PHONE);
    }
    // Метод нажатия на кнопку Далее
    public void clickNextButton() {
        driver.findElement(NEXT).click();
    }
    // Метод нажатия на поле когда привезти самокат
    public void clickDateWhen() {
        driver.findElement(WHEN).click();
    }

    public void clickDate() {
        driver.findElement(DATE).click();
    }

    public void clickListRents() {
        driver.findElement(RENTS).click();
    }

    public void clickRentsDay() {
        driver.findElement(DAY).click();
    }

    public void clickOrder() {
        driver.findElement(ORDER).click();
    }

    public void clickYes() {
        driver.findElement(YES).click();
    }
 // Проверка успешности создания заказа
    public boolean isOrderSuccess() {
        return driver.findElement(CREATE_ORDER).isEnabled();
    }

    public void personalData(String CLIENT_NAME, String CLIENT_SURNAME, String CLIENT_ADDRESS, String CLIENT_PHONE) {
        inputName(CLIENT_NAME);
        inputSurname(CLIENT_SURNAME);
        inputAddress(CLIENT_ADDRESS);
        clickMetroList();
        clickMetro();
        inputPhone(CLIENT_PHONE);

    }

    public void aboutRent(){
        clickDateWhen();
        clickDate();
        clickListRents();
        clickRentsDay();

    }

}
