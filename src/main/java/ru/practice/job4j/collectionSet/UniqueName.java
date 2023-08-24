package ru.practice.job4j.collectionSet;

import java.util.*;

public class UniqueName {
    /**
     *  Метод принимает список пользователей, при этом много пользователей могут иметь одинаковое имя.
     *  Метод определяет количество уникальных имен, которые имеют пользователи.
     * @param users
     * @return
     */
    public static int collectUniqueName(List<User> users) {
        int sum = 0;
        List<User> aList = new ArrayList<>(users);
        Set<User> sList = new HashSet<>(users);
        sum = aList.size() - (aList.size() - sList.size());
        return sum;
    }

    public static class User {
        private int id;
        private String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public String getName() {
            return name;
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
            return Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}
