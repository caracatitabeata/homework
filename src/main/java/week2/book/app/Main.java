package week2.book.app;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Am creat un ArrayList de obiecte, reference type: Book.
        List<Book> listA = new ArrayList<>();

        //Am adăugat două obiecte moștenite.
        Novel novel1 = new Novel("Simion liftnicul", 321, "Roman psihologic");
        listA.add(novel1);
        listA.add(new Novel("Levantul", 256, "Istorie, mister, supranatural"));
        listA.add(new ArtAlbum("Istoria frumuseții", 728, "Mohawk Superfine"));

        //Am scos un obiect din elementele listei, folosind metoda remove din clasa List.
        listA.remove(1);

        //Inheritance check.
        novel1.setName("Orbitor");
        novel1.setType("Psihologic, confesiune");

        //Am iterat lista printr-un for-each loop, pentru a printa obiectele.
        for (Book nextBook : listA){
            System.out.println(nextBook);
        }
    }
}
