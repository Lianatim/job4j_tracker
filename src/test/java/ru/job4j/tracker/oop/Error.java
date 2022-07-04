package ru.job4j.tracker.oop;

public class Error {
    boolean active;
    int status;
    String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void print() {
        System.out.println("Наличие ошибки: " + active + "\nСтатус: " + status + "\nТекст ошибки: " + message + "\n");
    }

    public static void main(String[] args) {
        Error notFound = new Error(true, 404, "Не найдено");
        Error notForbidden = new Error();
        notFound.print();
        notForbidden.print();
    }
}
