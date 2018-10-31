package ru.ak;


public final class Resource {

    //=====================================================SELECTORS====================================================

//    /** xPath*/
//    public static final String CORNER_BTN_OPEN_CHAT = "//*[@id=\"content\"]/div/div/a[2]";

    /** xPath*/
    public static final String CORNER_BTN_OPEN_CHAT = "//*[@id=\"content\"]/div/div/a[2]/img";


    /** xPath*/
    public static final String CHAT_MSG_AREA = "//*[@id=\"webim_chat\"]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[3]/div[2]";

    /** xPath*/
    public static final String CHAT_BTN_SEND_MSG = "//*[@id=\"webim_chat\"]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[3]/button[2]";

    /** xPath*/
    public static final String CHAT_FILE_UPLOAD_INPUT = "//*[@id=\"webim_chat\"]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/ul/li[2]/label/input";

    /** xPath*/
    public static final String CHAT_BTN_SHOW_ICONS = "//*[@id=\"webim_chat\"]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[3]/button[1]/span";

    /** xPath*/
    public static final String CHAT_BTN_RATE_OPERATOR = "//*[@id=\"webim_chat\"]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/ul/li[4]";

    /** xPath*/
    public static final String CHAT_RATE_BLOCK_OVERLAY = "//*[@id=\"webim_chat\"]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div";

    /** xPath*/
    public static final String CHAT_RATE_BLOCK_BTN_CLOSE = "//*[@id=\"webim_chat\"]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div/div[1]/div/span";

    /** xPath*/
    public static final String CHAT_RATE_BLOCK_BTN_1STAR = "//*[@id=\"webim_chat\"]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div/div[2]/div/ul/li[1]";

    /** xPath*/
    public static final String CHAT_RATE_BLOCK_BTN_2STAR = "//*[@id=\"webim_chat\"]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div/div[2]/div/ul/li[2]";

    /** xPath*/
    public static final String CHAT_RATE_BLOCK_BTN_3STAR = "//*[@id=\"webim_chat\"]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div/div[2]/div/ul/li[3]";

    /** xPath*/
    public static final String CHAT_RATE_BLOCK_BTN_4STAR = "//*[@id=\"webim_chat\"]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div/div[2]/div/ul/li[4]";

    /** xPath*/
    public static final String CHAT_RATE_BLOCK_BTN_5STAR = "//*[@id=\"webim_chat\"]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div/div[2]/div/ul/li[5]";

    /** xPath*/
    public static final String CHAT_BTN_CLOSE = "//*[@id=\"webim_chat\"]/div[1]/div/div[1]";

    /** classNAme*/
    public static final String CHAT_WINDOW = "webim-root";

    /** classNAme*/
    public static final String CHAT_VISITOR_MSG = "webim-visitor-message";

    /** classNAme*/
    public static final String CHAT_VISITOR_FILE_MSG = "webim-file_visitor-message";

    /** classNAme*/
    public static final String CHAT_NO_OPERATOR = "webim-rate-error";


    //=====================================================RANDOM-TEXT==================================================
    private static final String ALPHA_NUMERIC_STRING = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    public static String randomText(int count) {
        StringBuilder builder = new StringBuilder();
        while (count-- != 0) {
            int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(character));
        }
        return builder.toString();
    }
}
