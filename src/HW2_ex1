/*
 *   Задача № 1.
 *   Напишите метод, который на вход получает коллекцию объектов,
 *   а возвращает коллекцию уже без дубликатов.
 *   <T> Collection<T> removeDuplicates(Collection<T> collection)
 */
 
import java.util.*;
 
public class HW2_ex1 {
    public static void main(String[] args) {
        System.out.println("Задача № 1");
        List<Integer> collection = Arrays.asList(1, 8, 1, 8, 7, 23, 8, 9, 1, 4, 6, 7, 1);
        System.out.println("Было:" + collection);
        System.out.println("Стало:" + removeDuplicates(collection));
    }
 
    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        Collection<T> resultCollection = (Collection<T>) new HashSet<>(collection);
        return resultCollection;
    }
}
