package BehavioralPattern.IteratorPattern;


/*
이터레이터 패턴
이터레이터란 반복하다라는 의미로 어떠한 객체의 집합을 순서대로 명령을 처리할 수 있게 해주는 디자인패턴이다.
컬렉션 구현 방법을 노출시키지 않으면서도 그 집합체안에 들어있는 모든 항목에 접근할 수 있게 해주는
방법을 제공해 주는 패턴으로 간단하면서도 실제로도 굉장히 많이 쓰고 있는 패턴이다.

1. Iterator : 순서대로 객체를 검색하는 인터페이스를 정한다.

2. ConcreateIterator : Iterator에서의 인터페이스를 구현한다.

3. Aggregate : Iterator의 역할을 만드는 인터페이스를 정한다.

4. ConcreateAggreagate : Aggregate에서의 인터페이스를 구현한다.


 */
public class BookShelfMain {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Baddy-Long-Legs"));

        Iterator it = bookShelf.iterator();

        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }

    }
}
