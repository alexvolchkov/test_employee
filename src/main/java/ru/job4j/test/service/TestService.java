package ru.job4j.test.service;

import ru.job4j.test.domain.Employee;
import ru.job4j.test.domain.Test;
import ru.job4j.test.domain.Ticket;

import java.util.*;

public interface TestService {

    List<Ticket> findAll();

    Test startExam(Employee employee);

    boolean fixExam(Test test);

    boolean endExam(Test test);
}
