package com.eden.filter;

import java.util.Arrays;
import java.util.List;

/**
 * @created by eden
 * @since 2019-03-13 上午 10:53:01
 */

public class AndCriteria implements Criteria {

    Criteria criteria;

    Criteria andCriteria;



    @Override
    public List<Person> meetCriteria(List<Person> sourcePersons) {
        List<Person> people1 = andCriteria.meetCriteria(criteria.meetCriteria(sourcePersons));
        return people1;
    }

    public static void main(String[] args) {

        Criteria c = new AndCriteria();
        List<Person> people = c.meetCriteria(Arrays.asList(new Person()));

        System.out.println(people);


    }
}
