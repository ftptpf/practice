package ru.practice.job4j.sort;

import java.util.Comparator;
import java.util.Objects;

public class ThenComparingMethod {
    public static class User implements Comparable<User> {

        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            User user = (User) o;
            return age == user.age && Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        @Override
        public int compareTo(User o) {
            int rsl = name.compareTo(o.name); // сравниваем два имени
            if (name.equals(o.name)) { // если имена равны
                rsl = Integer.compare(o.age, age); // сравниваем возраст в обратном порядке
            }
            return rsl;
        }
    }

    /**
     * Метод упорядочивает пользователей сначала по возрастанию по имени, а потом по убыванию по возрасту.
     * @return
     */
    public static Comparator<User> thenComparing() {
        return ascByName().thenComparing(descByAge());
    }

    /**
     * Метод упорядочивает пользователей по имени по возрастанию.
     * @return
     */
    public static Comparator<User> ascByName() {
        return Comparator.naturalOrder();
    }

    /**
     * Метод упорядочивает пользователей по возрасту по убыванию.
     * @return
     */
    public static Comparator<User> descByAge() {
        return Comparator.reverseOrder();
    }
}
