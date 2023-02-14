public class OnlinerPage {
    public static final String URL_ONLINER = "https://www.onliner.by/";
    public static  final String COPYRIGHT_XPATH = "//div[@class ='footer-style__copy']";
    public static String copyrightText = "© 2001—2023 Onlíner";
    public static final String ONLINER_ENTER_BTN = "//div[@class='auth-bar__item auth-bar__item--text']";
    public static final String ONLINER_FORM_ENTER_BTN = "//button[contains(text(),'Войти')]";
    public static final String ONLINER_LOGIN_ERR = "//div[contains(text(),'Укажите ник или e-mail')]";
    public static final String ONLINER_PASSWORD_ERR = "//div[contains(text(),'Укажите пароль')]";
    public static  String loginErrText = "Укажите ник или e-mail";
    public static  String PasswordTextErr = "Укажите пароль";
    public static final String EMAIL_ENTRANCE_WINDOW = "//*[@placeholder='Ник или e-mail']";
    public static final String PASSWORD_ENTRANCE_WINDOW = "//*[@type='password']";
}
