package com.veinik.dictionary;
/*
Создать класс словаря, который для каждого слова возвращает его текстовое объяснение.
Инициализировать словарь несколькими словами.
*/
public class DictionaryDeRU {
    public static void main(String[] args) {

        Dictionary deRU = new Dictionary("Das neueste Wörterbuch", "Deutsch-Russisch");

        deRU.addWord("Hallo", "Привет, здравствуй");
        deRU.addWord("Guten Morgen", "Доброе утро");
        deRU.addWord("Guten Tag", "Добрый день");
        deRU.addWord("Guten Abend", "Добрый вечер");
        deRU.addWord("Gute Nacht!", "Спокойной ночи!");
        deRU.addWord("Die Arbeit", "Работа");
        deRU.addWord("Der Entwickler", "Разработчик");
        deRU.addWord("Wunderbar!", "Чудесный(-о),удивительный(-о)");
        deRU.addWord("Danke", "Спасибо");
        deRU.addWord("Bitte", "Пожалуйста");

        deRU.addWord("benutzen","использовать"); // add new word

        System.out.println(deRU.findWordDe("benutzen"));  // check word de
        System.out.println(deRU.findWordRu("использовать")); // check word ru

        deRU.delWord("Danke"); // del new word
        System.out.println(deRU.findWordDe("Danke")); // check after the removal

        System.out.println(deRU.findWordDe("Bitte"));
        System.out.println(deRU.findWordRu("Работа"));
    }
}