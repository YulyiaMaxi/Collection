public class NotRegisteredException extends RuntimeException {// пишем класс

    public NotRegisteredException(String playerName) { //пишем метод, принимающий ответ "Игрок не зарегистрирован"
        super("Игрок с именем" + playerName + "не зарегистрирован");
    }

}
