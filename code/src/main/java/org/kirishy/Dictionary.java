package org.kirishy;
// Singleton class

public class Dictionary {
    private static Dictionary instance;
    private static String dictionary = "Dictionary:\n"; // для наглядної реалізації використовую стрінг, хоча в ідеалі було б погратися з файлами

    // synchronized для вирішення проблеми багатопоточності
    public static Dictionary getInstance() {
        if (instance == null) {
            synchronized (Dictionary.class) {
                if (instance == null) {
                    instance = new Dictionary();
                }
            }
        }
        return instance;
    }
    private Dictionary(){}


    public void addWord(String word) {
        String[] words = dictionary.split("\n");
        boolean isExist = false;

        for (int i = 0; i < words.length; i++) {

            if (words[i].toLowerCase().equals(word.toLowerCase())) {
                isExist = true;
                break;
            }

        }

        if(!isExist) {
            dictionary += word + "\n";
        } else {
            System.out.println("Oops, the word was already added\n");
        }

    }
    public void readDictionary() {
        System.out.println(dictionary);
    }

}
