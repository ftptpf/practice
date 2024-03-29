package ru.practice.job4j.collectionMap;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class RemoveElements {
    /**
     * Метод принимает отображение ключ(id пользователя) - значение (имя пользователя),
     * список id пользователей, список пользователей.
     * И обновляет информацию в отображении следующим образом:
     * 1. Удаляет все пары ключ-значение которые соответствуют каждому id из списка id
     * 2. Удаляет все пары ключ значения, которые соответствуют списку пользователей
     * (тут используются геттеры, чтобы получить доступ к значениям в полях объектов типа User).
     * @param data
     * @param ids
     * @param users
     * @return
     */
    public static Map<Integer, String> removeElement(Map<Integer, String> data, List<Integer> ids, List<User> users) {

        for (Integer i : ids) {
            data.remove(i);
        }
        for (User u : users) {
            data.remove(u.getId(), u.getName());
        }
        return data;
    }

    public static class User {
        private int id;
        private String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return id == user.id && Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }
    }

}
