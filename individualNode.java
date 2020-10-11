package sample;
public class individualNode<N> {
    public individualNode<N> next=null;
    private N contents;

    public N getContents()
    { return contents; }

    public void setContents(N c)
    { contents=c; }
}