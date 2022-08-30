package ru.job4j.test.domain;

import lombok.Data;

import java.util.Set;

@Data
public class Ticket {
    private int id;
    private String number;
    private Set<Question> questions;
    private boolean enable;
}
