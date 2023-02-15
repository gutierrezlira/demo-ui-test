public class AmazonPage {
    public static final String URL_AMAZON = "https://www.amazon.com/";
    public static final String NAV_FOOTER_LINE = "//span[contains(text(),'1996-2023')]";
    public static String footer_Text = "© 1996-2023, Amazon.com, Inc. or its affiliates";
    public static final String AMAZON_CART = "//*[@id='nav-cart']";
    public static final String CART_IS_EMPTY = "//div[@id='sc-active-cart']//h2";
    public static String CartEmptyText ="Your Amazon Cart is empty";
    public static final String SIGN_IN_BTN = "//*[@id='a-autoid-0-announce']";
    public static final String SIGH_IN_TXT = "//div[@class='a-box']//h1";
    public static final String SIGH_IN_ERR_TXT = "//div[contains(text(),'Enter your email')]";
}
