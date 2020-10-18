package job4j.collectionMap;

import java.util.Map;
import java.util.Objects;

public class PutIfAbsent {
    private final Map<Integer, User> users;

    public PutIfAbsent(Map<Integer, User> users) {
        this.users = users;
    }

    /**
     * Метод осуществит добавление нового элемента только при условии, что такого ключа в отображении еще нет.
     * При этом метод возращает булево значение - для этого проверяет содержит ли отображение значение u.
     * В отображении ключом является id пользователя, значением - объект типа User.
     * @param u
     * @return
     */
    public boolean addNewElement(User u) {
        users.putIfAbsent(u.getId(), u);
        return users.containsValue(u);
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

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}
