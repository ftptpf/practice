package ru.practice.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountingMethod {

    public static class Company {

        private String name;

        public Company(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static class Worker {

        private int age;
        private Company company;

        public Worker(int age, Company company) {
            this.age = age;
            this.company = company;
        }

        public int getAge() {
            return age;
        }

        public Company getCompany() {
            return company;
        }
    }

    /**
     * Метод считаем количество работников для каждой компании.
     * @param workers
     * @return
     */
    public static Map<String, Long> groupAndCount(List<Worker> workers) {
        Function<Worker, String> convertToName = x-> x.getCompany().getName();
        return workers.stream()
                .collect(Collectors.groupingBy(convertToName, Collectors.counting()));
    }
}
