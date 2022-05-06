package org.softuni.onlinegrocery.util.constants;

public final class ExceptionMessages {

    private ExceptionMessages() {
    }
    public static final String INCORRECT_USERNAME = "Имя пользователя должно содержать от 3 до 20 символов.";
    public static final String INCORRECT_USERNAME_EMPTY_FIELD_ERROR_MSG = "Не может быть пустым, должно быть не менее 3 символов.";
    public static final String INCORRECT_PASSWORD = "Не может быть пустым, должно быть не менее 3 символов.";
    public static final String INCORRECT_ADDRESS = "Не может быть пустым, должно быть не менее 5 символов.";
    public static final String INCORRECT_EMAIL = "Электронная почта должна быть действительной, соответствующей RFC822.";
    public static final String INVALID_PRODUCT_EX_MSG = "Недопустимый продукт.";
    public static final String USER_NOT_FOUND_EX_MSG = "Имя пользователя не найдено.";
    public static final String CATEGORY_NOT_FOUND_EX_MSG = "Категория не найдена.";
    public static final String ORDER_NOT_FOUND_EX_MSG = "Заказ не найден.";
    public static final String PRODUCT_NOT_FOUND_EX_MSG = "Товар не найден.";
    public static final String PRODUCT_NAME_EXIST_EX_MSG = "Название продукта существует.";
    public static final String PRODUCT_ID_DOESNT_EXIST_EX_MSG = "Товар с указанным идентификатором не найден!";
    public static final String RECEIPT_NAME_EXIST_EX_MSG = "Имя квитанции существует.";
    public static final String THE_FIELDS_MUST_MATCH_EX_MSG = "Поля должны совпадать";
    public static final String PAGE_NOT_FOUND_EX_MSG = "Страница не найдена: ОШИБКА 404!\n" +
            "Эта страница не существует...";

}
