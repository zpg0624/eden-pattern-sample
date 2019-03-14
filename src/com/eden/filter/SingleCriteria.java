package com.eden.filter;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @created by eden
 * @since 2019-03-13 上午 10:48:58
 */

public class SingleCriteria implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> sourcePersons) {
        return sourcePersons.stream()
                .filter(person -> Objects.equals("single",person.getName()))
                .collect(Collectors.toList());
    }
}
