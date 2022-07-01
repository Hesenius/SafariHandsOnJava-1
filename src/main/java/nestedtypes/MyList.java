package nestedtypes;

import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyList<E> implements Iterable<E> {
  private E[] data = (E[])new Object[10];
  private int count = 0;

  private int silly = 0;

  public void add(E e) {
    data[count++] = e;
  }

  @Override
  public String toString() {
    return Stream.of(data)
        .limit(count)
        .map(x -> x.toString())
        .collect(Collectors.joining(", ", "MyList[", "]"));
  }


  private class MyListIterator implements Iterator<E> {
    private int silly = 1;
    // explicit form of passing reference to the enclosing instance
//    private MyListIterator(MyList MyList$this)

    private MyListIterator(){
    }
    private int progress = 0;
    @Override
    public boolean hasNext() {
      return progress < count;
    }

    @Override
    public E next() {
      return data[progress++];
    }

    public void useSilly() {
      System.out.println(this.silly);
      System.out.println(MyList.this.silly); // qualified!
    }
  }
  @Override
  public Iterator<E> iterator() {
    return this.new MyListIterator();
  }

  public static void main(String[] args) {
    MyList<String> mls = new MyList<>();
    mls.add("Fred");
    mls.add("Jim");
    System.out.println("> " + mls);
    mls.add("Sheila");
    System.out.println("> " + mls);

//    mls... hasNext next
    for (String s : mls) {
      System.out.println(">>" + s);
    }

    Iterator<String> i1 = mls.iterator();
    Iterator<String> i2 = mls.iterator();
    System.out.println(i1.next());
    System.out.println("           " + i2.next());
    System.out.println(i1.next());
    System.out.println("           " + i2.next());
    System.out.println("           " + i2.next());
    System.out.println(i1.next());
  }
}
