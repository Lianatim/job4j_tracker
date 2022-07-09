package ru.job4j.pojo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Sidorov Anton");
        student.setGroup(1123);
        student.setDateReceipt(LocalDate.of(2013, 01, 31));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-YYYY");
        System.out.println(("Student: " + student.getName() + ", studying in a group: "
                + student.getGroup() + ", entered " + student.getDateReceipt().format(formatter)));
    }
}

