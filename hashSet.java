package sample;

public class hashSet<E> {
    GenericList<E>[] hashTable;

    @SuppressWarnings("unchecked")
    public hashSet(int size) {
        hashTable = (GenericList<E>[]) new GenericList[size];
        for (int i = 0; i < hashTable.length; i++)
            hashTable[i] = new GenericList<>();
    }

    public void displayHashTable() {
        int num = 1;
        for (GenericList<E> lis : hashTable) {
            System.out.println("Chain " + num++);
            System.out.println("===========");

        }
    }

    public int hashFunction(E obj) {
        return obj.hashCode() % hashTable.length;
    }

    public int hashFunction2(int key) {
        return key % hashTable.length;
    }

    public void add(E item) {
        hashTable[hashFunction(item)].add(item);
    }

    public void add(E item, int key) {
        hashTable[hashFunction2(key)].add(item);
    }
}