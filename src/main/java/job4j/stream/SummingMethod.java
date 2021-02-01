package job4j.stream;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class SummingMethod {
    public static class User {
        private String name;
        private List<Bill> bills = new ArrayList<>();

        public User(String name, List<Bill> bills) {
            this.name = name;
            this.bills = bills;
        }
        public String getName() {
            return name;
        }
        public List<Bill> getBills() {
            return bills;
        }
    }

    public static class Bill {
        private int balance;

        public Bill(int balance) {
            this.balance = balance;
        }
        public int getBalance() {
            return balance;
        }
    }

    private static class Pair {
        private User user;
        private Bill bill;

        public Pair(User user, Bill bill) {
            this.user = user;
            this.bill = bill;
        }
        public User getUser() {
            return user;
        }
        public Bill getBill() {
            return bill;
        }
    }

    public static Map<String, Integer> summing(List<User> users) {

        //Function<User, String> userName = User::getName;


        //Function<User, Integer> userBalance = x -> x.getBills().forEach(Pair::getBill);
/*        return users.stream().
                collect(Collectors.groupingBy(
                        User::getName,
                        Collectors.summingInt(x -> x.getBills().stream().mapToInt())));*/
        return new Map<String, Integer>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean containsKey(Object key) {
                return false;
            }

            @Override
            public boolean containsValue(Object value) {
                return false;
            }

            @Override
            public Integer get(Object key) {
                return null;
            }

            @Override
            public Integer put(String key, Integer value) {
                return null;
            }

            @Override
            public Integer remove(Object key) {
                return null;
            }

            @Override
            public void putAll(Map<? extends String, ? extends Integer> m) {

            }

            @Override
            public void clear() {

            }

            @Override
            public Set<String> keySet() {
                return null;
            }

            @Override
            public Collection<Integer> values() {
                return null;
            }

            @Override
            public Set<Entry<String, Integer>> entrySet() {
                return null;
            }
        };

    }

}
