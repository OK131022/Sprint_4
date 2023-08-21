
    import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import pageObject.MainPage;
import pageObject.OrderPage;
import static org.junit.Assert.assertTrue;


    @RunWith(Parameterized.class)
    public class HappyOrderTest extends RulelTest {

        private final String CLIENT_NAME;
        private final String CLIENT_SURNAME;
        private final String CLIENT_ADDRESS;
        private final String CLIENT_PHONE;


        // Конструктор c параметрами данных клиента
        public  HappyOrderTest (String CLIENT_NAME, String CLIENT_SURNAME, String CLIENT_ADDRESS, String CLIENT_PHONE) {
            this.CLIENT_NAME =CLIENT_NAME;
            this.CLIENT_SURNAME = CLIENT_SURNAME;
            this.CLIENT_ADDRESS = CLIENT_ADDRESS;
            this.CLIENT_PHONE = CLIENT_PHONE;
        }

        // Тестовые данные
        @Parameterized.Parameters
        public static Object[][] getData() {
            return new Object[][]{
                    {"Сергей","Семенов", "Мира 7", "+79269875678"},
                    {"Анна","Кружкина", "Дерипаска 8", "+79567665434"},
            };
        }

        //Тест по кнопке "Заказать" наверху
        // создание объекта класса домашней страницы
        // создание объекта класса страницы заказа
        // открыть страницу, убрать куки
        // нажать на кнопку создание заказа
        // вызов метода, который заполняет все поля на странице и нажимает кнопку "Далее"
        // вызов метода, который заполняет все поля на странице и нажимает кнопку "Заказать"
        // вызов метода, который нажимает на кнопку "Да" во всплывающем окне "Хотите оформить заказ?"
        // проверка, что отображается всплывающее окно "Заказ оформлен"

        @Test
        public void checkOrderForm_buttonAtTheTop() {
            MainPage mainPage = new MainPage(driver);
            OrderPage orderPage = new OrderPage(driver);
            mainPage.openPage();
            mainPage.clickCookies();
            mainPage.clickOrderButton();
            orderPage.personalData(CLIENT_NAME, CLIENT_SURNAME, CLIENT_ADDRESS, CLIENT_PHONE);
            orderPage.clickNextButton();
            orderPage.aboutRent();
            orderPage.clickOrder();
            orderPage.clickYes();
            assertTrue(orderPage.isOrderSuccess());
        }

        // Тест по кнопке "Заказать" внизу
        // создание объекта класса домашней страницы
        // создание объекта класса страницы заказа
        // открыть страницу, убрать куки
        // нажать на кнопку создание заказа
        // вызов метода, который заполняет все поля на странице и нажимает кнопку "Далее"
        // вызов метода, который заполняет все поля на странице и нажимает кнопку "Заказать"
        // вызов метода, который нажимает на кнопку "Да" во всплывающем окне "Хотите оформить заказ?"
        // проверка, что отображается всплывающее окно "Заказ оформлен"
        @Test
        public void checkOrderForm_buttonAtTheBottom() {
            MainPage mainPage = new MainPage(driver);
            OrderPage orderPage = new OrderPage(driver);
            mainPage.openPage();
            mainPage.clickCookies();
            mainPage.clickOrderButton2();
            orderPage.personalData(CLIENT_NAME, CLIENT_SURNAME, CLIENT_ADDRESS, CLIENT_PHONE);
            orderPage.clickNextButton();
            orderPage.aboutRent();
            orderPage.clickOrder();
            orderPage.clickYes();
            assertTrue(orderPage.isOrderSuccess());
        }


}
