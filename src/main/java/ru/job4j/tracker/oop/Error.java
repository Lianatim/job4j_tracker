package ru.job4j.tracker.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void print() {
        System.out.println("Наличие ошибки: " + active + System.lineSeparator() + "Статус: " + status + System.lineSeparator() + "Текст ошибки: " + message + System.lineSeparator());
    }

    public static void main(String[] args) {
        Error notFound = new Error(true, 404, "Не найдено");
        Error notForbidden = new Error();
        notFound.print();
        notForbidden.print();
    }
}
