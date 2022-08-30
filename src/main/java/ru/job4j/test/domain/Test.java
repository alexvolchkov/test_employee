package ru.job4j.test.domain;

import lombok.Data;

import java.time.LocalDate;
import java.util.Map;

@Data
public class Test {
    private int id;
    private Employee employee;
    private Ticket ticket;
    private LocalDate dateExam;
    private Map<Integer, Integer> answer;
}
