import java.util.*;

class Phonebook {
    public static void main(String[] args) {
        // Создаем объект HashMap
        HashMap<String, List<String>> phonebook = new HashMap<>();

        // Добавляем записи в телефонную книгу
        phonebook.put("Иван Иванов", Arrays.asList("123-456-7890", "098-765-4321"));
        phonebook.put("Петр Петров", Arrays.asList("987-654-3210", "123-987-6543"));
        phonebook.put("Мария Сидорова", Arrays.asList("456-789-0123", "567-890-1234"));
        phonebook.put("Иван Иванов", Arrays.asList("234-567-8901")); // Повторяющееся имя

        // Подсчитываем количество телефонов для каждого человека
        Map<String, Integer> phoneCounts = new HashMap<>();
        for (Map.Entry<String, List<String>> entry : phonebook.entrySet()) {
            phoneCounts.put(entry.getKey(), entry.getValue().size());
        }

        // Сортируем по убыванию количества телефонов
        List<Map.Entry<String, Integer>> sortedPhoneCounts = new ArrayList<>(phoneCounts.entrySet());
        sortedPhoneCounts.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));

        // Выводим результат
        for (Map.Entry<String, Integer> entry : sortedPhoneCounts) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
