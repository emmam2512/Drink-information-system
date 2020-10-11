package sample;

import java.util.Iterator;

public class listIterator<K> implements Iterator<K> {
    private individualNode<K> pos;
    public listIterator(individualNode<K> inode) { pos=inode; }
    @Override
    public boolean hasNext() {
        return pos!=null;
    }
    @Override
    public K next() {
        individualNode<K> temp=pos;
        pos=pos.next;
        return temp.getContents();
    }
}


