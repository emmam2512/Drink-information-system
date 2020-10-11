package sample;

import java.util.Collection;

public class GenericList<F> {
    public individualNode<F> head=null;
    int linkNum = 0;

    public void addElement(F e) {
        individualNode<F> fn = new individualNode<>();
        fn.setContents(e);
        fn.next = head;
        head = fn;
        linkNum ++;
    }

    public void swapNodes(int x, int y){
        F swap=get(x);
        this.set(x,this.get(y));
        this.set(y,swap);
    }

    public int size(){
        return 0;
    }

    public boolean isEmpty(){
        return false;
    }

    public boolean contains(Object e){
        return false;
    }

    public listIterator<F> iterator(){
        return null;
    }

    public Object[] toArray(){
        return new Object[0];
    }


    public <T> T[] toArray(T[] a) {
        return null;
    }

    public boolean add(F f){
        individualNode<F> fn=new individualNode<>();
        fn.setContents(f);
        fn.next=head;
        head=fn;
        linkNum++;
        return true;
    }

    public individualNode getHead() { return  head; }

    public boolean remove(Object o){
        return false;
    }


    public boolean containsAll(Collection<?> c) {
        return false;
    }


    public boolean addAll(Collection<? extends F> c) {
        return false;
    }


    public boolean addAll(int index, Collection<? extends F> c) {
        return false;
    }


    public boolean removeAll(Collection<?> c) {
        return false;
    }


    public boolean retainAll(Collection<?> c) {
        return false;
    }

    public void clear() {
        head=null;
    }


    public F get(int index) {
        individualNode temp = head;
        for(int i = 0; i <index; i++){
            temp = temp.next;
        }
        return (F) temp.getContents();
    }
    public individualNode<F> getNode(int index){
        individualNode temp = head;
        for (int i = 0; i<index; i++){
            temp = temp.next;
        }
        return temp;
    }


    public F set(int index, F element) {
        this.getNode(index).setContents(element);
        return null;
    }


    public void add(int index, F element) {

    }


    public F remove(int index) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }


    public int lastIndexOf(Object o) {
        return 0;
    }


    public listIterator<F> listIterator() {
        return null;
    }


    public listIterator<F> listIterator(int index) {
        return null;
    }


    public GenericList<F> subList(int fromIndex, int toIndex) {
        return null;
    }

}



