package com.Assignment3;

import java.util.ArrayList;
import java.util.LinkedList;

import java.util.HashMap;

public class Assignment3Q6 {
    private HashMap<String, String> hashtable;

    public Assignment3Q6() {
        hashtable = new HashMap<>();
    }

    // Calculate the hash code for a given key
    public int hash(String key) {
        return key.hashCode() % hashtable.size();
    }

    // Add a key-value pair to the hash table
    public void set(String key, String value) {
        hashtable.put(key, value);
    }

    // Get the value associated with a key in the hash table
    public String get(String key) {
        return hashtable.get(key);
    }

    // Remove a key-value pair from the hash table
    public void remove(String key) {
        hashtable.remove(key);
    }

    // Display the contents of the hash table
    public void display() {
        System.out.println(hashtable);
    }

    public static void main(String[] args) {
    	Assignment3Q6 hashTable = new Assignment3Q6();

        // Add some key-value pairs to the hash table
        hashTable.set("fruit", "banana");
        hashTable.set("movie", "Dhoom");
        hashTable.set("pen", "Black");

        System.out.println("Whole HashTable : ");
        hashTable.display();

        System.out.println("Get Method : ");
        System.out.println(hashTable.get("movie"));

        System.out.println("Remove Method : ");
        hashTable.remove("pen");

        System.out.println("Display Hashtable after deletion");
        hashTable.display();
    }
}

