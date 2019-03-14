package com.eden.filter;

import java.util.List;

/**
 * @created by eden
 * @since 2019-03-13 上午 10:43:56
 */
public interface Criteria {
    List<Person> meetCriteria(List<Person> sourcePersons);
}
