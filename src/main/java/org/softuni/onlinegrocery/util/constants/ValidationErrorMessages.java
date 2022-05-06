package org.softuni.onlinegrocery.util.constants;

public final class ValidationErrorMessages {

    private ValidationErrorMessages() {
    }

    public static final String ROLE_USER = "ROLE_USER";
    public static final String ROLE_MODERATOR = "ROLE_MODERATOR";
    public static final String ROOT_ADMIN = "ROOT_ADMIN";
    public static final String ROLE_ADMIN = "ROLE_ADMIN";
    public static final String DEFAULT_USER_NOT_FOUND_EX_MSG = "Имя пользователя не найдено.";
    public static final String DEFAULT_NOT_AUTHORIZE_EX_MSG = "У вас нет прав для обновления роли ROOT_ADMIN.";

    public static final String PASSWORDS_DOES_NOT_MATCH_ERROR_MSG = "Пароли не совпадают.";

    public static final String CATEGORY_NAME_EMPTY_FIELD_ERROR_MSG = "Название категории не может быть пустым.";
    public static final String CATEGORY_NAME_MAX_LENGTH_ERROR_MSG = "Название категории должно содержать не более 20 символов.";

    public static final String PRODUCT_NAME_EMPTY_FIELD_ERROR_MSG = "Название продукта не может быть пустым.";
    public static final String PRODUCT_NAME_LENGTH = "Название продукта должно содержать от 3 до 20 символов!";
    public static final String PRODUCT_DESCRIPTION_MAX_LENGTH_ERROR_MSG = "Описание товара должно быть не более 50 символов.";
    public static final String PRODUCT_DESCRIPTION_EMPTY_FIELD_ERROR_MSG = "Описание товара не может быть пустым.";
    public static final String PRODUCT_PRICE_EMPTY_FIELD_ERROR_MSG = "Укажите цену товара. Должно быть не менее 0.";
    public static final String PRODUCT_IMAGE_EMPTY_FIELD_ERROR_MSG = "Загрузить изображение товара.";
    public static final String PRODUCT_CATEGORIES_EMPTY_FIELD_ERROR_MSG = "Выберите хотя бы одну категорию.";

    /**
     * Regex for validating e-mails. It's totally compliant with RFC822
     * and accepts IP address and server names (for intranet purposes)
     *
     * john@somewhere.com // valid
     * john.foo@somewhere.com // valid
     * john.foo+label@somewhere.com // valid (with +label - Gmail accepts it!)
     * john@192.168.1.10 // valid (with IP addresses)
     * john+label@192.168.1.10 // valid (with +label and IP address)
     * john.foo@someserver // valid (with no first domain level)
     * JOHN.FOO@somewhere.com // valid (case insensitive)
     * @someserver // invalid
     * @someserver.com // invalid
     * john@. // invalid
     * .@somewhere.com // invalid
     */
    public static final String VALID_EMAIL_ADDRESS_REGEX = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?";

    /** PASSWORD_VALIDATION_REGEX =>
     * ^                 # start-of-string
     * (?=.*[0-9])       # a digit must occur at least once
     * (?=.*[a-z])       # a lower case letter must occur at least once
     * (?=.*[A-Z])       # an upper case letter must occur at least once
     * (?=.*[@#$%^&+=])  # a special character must occur at least once
     * (?=\S+$)          # no whitespace allowed in the entire string
     * .{8,}             # anything, at least eight places though
     * $                 # end-of-string
     */
    public static final String PASSWORD_VALIDATION_REGEX = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";

}
