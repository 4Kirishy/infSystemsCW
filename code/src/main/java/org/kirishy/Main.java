package org.kirishy;

public class Main {
    public static void main(String[] args) {

        Dictionary user1 = Dictionary.getInstance();
        Dictionary user2 = Dictionary.getInstance();

        user1.addWord("Singleton");
        user1.addWord("Java");

        user1.readDictionary();

        user2.addWord("java");
        user2.readDictionary();

        user2.addWord("System");
        user1.readDictionary();
    }
}