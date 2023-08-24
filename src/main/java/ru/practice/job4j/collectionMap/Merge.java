package ru.practice.job4j.collectionMap;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Merge {
    /**
     * Метод объединяет значение Map с другим.
     * Метод принимает отображение - число(id пользователя) - строка(имя пользователя), а также список пользователей.
     * Проблема - данные в отображении хранились так долго и ранее не было предусмотрено,
     * что помимо имени необходимо хранить еще и фамилию. Обновляем информацию - если такой пользователь уже существует
     * (проверяем по ключу) - к имени добавляем фамилию, если нет - то сначала добавляем пользователя - ключ id,
     * значение - имя пользователя, а потом только обновляем и добавляем фамилию.
     * @param names
     * @param users
     * @return
     */
    public static Map<Integer, String> collectData(Map<Integer, String> names, List<User> users) {
        for (int i = 0; i < users.size(); i++) {
            int z = i;
            names.computeIfAbsent(z + 1, (key) -> users.get(z).name);
            names.merge(z + 1, users.get(z).surname, (oldV, newV) -> oldV + " " + newV);
        }
        return names;
    }

    public static class User {
        private int id;
        private String name;
        private String surname;

        public User(int id, String name, String surname) {
            this.id = id;
            this.name = name;
            this.surname = surname;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return id == user.id;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
    }
}
