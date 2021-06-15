/*
 *   Задача № 2.
 *   Напишите метод, который получает на вход Map<K, V> и возвращает Map,
 *   где ключи и значения поменяны местами.
 *   Так как значения могут совпадать, то тип значения в Map
 *   будет уже не K, а Collection<K>: Map<V, Collection<K>>
 */
 
import java.util.*;
 
public class HW2_ex2 {
    public static void main(String[] args) {
        System.out.println("Задача № 2");
 
        Map<Integer, String> simpleMap = new HashMap<>() {{
            put(100, "легковой авто");
            put(200, "грузовой авто");
            put(300, "пассажирский транспорт");
            put(400, "тяжелая техника(краны)");
            put(500, "тяжелая техника(краны)");
            put(600, "грузовой авто");
            put(700, "грузовой авто");
            put(800, "пассажирский транспорт");
        }};
 
        System.out.println("Было:" + simpleMap);
        System.out.println("Стало:" + flip(simpleMap));
    }
 
    public static <K, V> Map<V, Collection<K>> flip(Map<K, V> map) {
        Map<V, Collection<K>> flipMap = new HashMap<>();
        Set<K> keys = map.keySet();
 
        for (K key : keys) {
            V value = map.get(key);
 
            flipMap.compute(value, (v, new_key) -> {
                if (new_key == null) {
                    new_key = new TreeSet<>();
                }
                new_key.add(key);
                return new_key;
            });
        }
        return flipMap;
    }
}
