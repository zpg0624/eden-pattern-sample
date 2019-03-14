package com.eden.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @created by eden
 * @since 2019-03-13 上午 10:51:28
 */

public class DoubleCriteria implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> sourcePersons) {
        return sourcePersons.stream()
                .filter(person -> Objects.equals("a",person.getGender()))
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
