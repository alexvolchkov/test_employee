package ru.job4j.test.domain;

import lombok.Data;

import java.util.Set;

@Data
public class Question {
    private int id;
    private String description;
    private Set<Answer> answers;
    private Answer correctAnswers;
}
