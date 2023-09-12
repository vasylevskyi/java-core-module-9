package ua.goit;

/*
put(Object key, Object value) додає пару ключ + значення
remove(Object key) видаляє пару за ключем
clear() очищає колекцію
size() повертає розмір колекції
get(Object key) повертає значення (Object value) за ключем*/

import java.security.InvalidKeyException;

public class MyHashMap<K, V> {
    private static final int DEFAULT_SIZE = 8;
    private int bucketCount[] = new int[DEFAULT_SIZE];
    private Entry<K, V>[] entries = new Entry[DEFAULT_SIZE];

    public void put(K key, V value) {
        int index = getBucketIndex(key);
        Entry<K, V> entry = new Entry<>(key, value);
        Entry<K, V> currentEntry = entries[index];
        Entry<K, V> previousEntry = entries[index];
        if (entries[index] == null) {
            entries[index] = entry;
            bucketCount[index]++;
        } else {
            int counter = bucketCount[index];
            for (int i = 0; i < counter; i++ ) {
                if (i == 0 && (currentEntry.hash == entry.hash && (currentEntry.key == entry.key || currentEntry.key.equals(entry.key)))) {
                    entry.next = entries[index].next;
                    entries[index] = entry;
                    return;
                } else if (i != 0 && (currentEntry.hash == entry.hash && (currentEntry.key == entry.key || currentEntry.key.equals(entry.key)))) {
                    previousEntry.next = entry;
                    entry.next = currentEntry.next;
                    return;
                }
                if (currentEntry.next == null) {
                    currentEntry.next = entry;
                    bucketCount[index]++;
                }
                previousEntry = currentEntry;
            }
        }
    }

    public void remove(K key) {
        int index = getBucketIndex(key);
        Entry<K, V> currentEntry = entries[index];
        Entry<K, V> previousEntry = null;
        if (entries[index] == null) {
                throw new NullPointerException("Key not found");
        } else {
            while (!currentEntry.getKey().equals(key)) {
                previousEntry = currentEntry;
                currentEntry = currentEntry.next;
            }
            if (previousEntry == null) {
                entries[index] = null;
                bucketCount[index]--;
                return;
            }
            if (currentEntry.next == null) {
                previousEntry.next = null;
                currentEntry = null;
                bucketCount[index]--;
                return;
            }
            previousEntry.next = currentEntry.next;
            bucketCount[index]--;
        }

    }

    public V get(K key) throws NullPointerException {
        int index = getBucketIndex(key);
        if (bucketCount[index] == 0) {
            return null;
        }
        int counter = bucketCount[index];
        Entry<K, V> nextEntry = entries[index].next;
        if (entries[index].getKey().equals(key)) {
            return entries[index].value;
        } else {
            for (int i = 1; i < counter; i++) {
                if (nextEntry != null && nextEntry.getKey().equals(key)) {
                    return nextEntry.value;
                }
                nextEntry = nextEntry.next;
            }
        }
        return null;
    }

    public void clear () {
        bucketCount = new int[DEFAULT_SIZE];
        entries = new Entry[DEFAULT_SIZE];
    }
    public int size() {
        int hashMapSize = 0;
        for (int j : bucketCount) {
            hashMapSize += j;
        }
        return hashMapSize;
    }

    private int getBucketIndex(K key) {
        return Math.abs(key.hashCode()) % entries.length;
    }

    private static class Entry<K, V> {
        private int hash;
        private K key;
        private V value;
        private Entry<K, V> next;

        public Entry(K key, V value) {
            this.hash = key.hashCode();
            this.key = key;
            this.value = value;
            this.next = null;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public Entry<K, V> getNext() {
            return next;
        }
    }
}
