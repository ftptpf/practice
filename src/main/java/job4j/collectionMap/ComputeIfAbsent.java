package job4j.collectionMap;

import java.util.*;

public class ComputeIfAbsent {
    /**
     * Метод принимает отображение в котором содержатся пары ключ(число) - значение(строка),
     * при этом строка - это имя пользователя(в отображении они представлены пустой строкой), ключ - его id.
     * Также в качестве аргумента метод принимает список пользователей.
     * Метод производит ассоциацию id и name пользователя в отображении.
     * При этом:
     * Если такой ключ уже есть в отображении - метод должен обновить ассоциацию(используем computeIfPresent()).
     * Если такого ключа нет - метод должен добавить ассоциацию(используем computeIfAbsent()).
     * @param names
     * @param users
     * @return
     */
    public static Map<Integer, String> collectData(Map<Integer, String> names, List<User> users) {
        for (int i = 0; i < users.size(); i++) {
            int z = i;
            names.computeIfPresent(i + 1, (key, value) ->users.get(z).getName());
            names.computeIfAbsent(i + 1, (key) -> users.get(z).getName());
        }
    return names;
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
            ComputeIfAbsent.User user = (ComputeIfAbsent.User) o;
            return Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}
