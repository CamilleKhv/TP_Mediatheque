package mediatheque;

public class Catalog implements MediaVisitor {

    public void visit(Book book) {
        System.out.println("Détails du livre : " + book.getTitle());
    }


    public void visit(CD cd) {
        System.out.println("Détails du CD : " + cd.getNumberOfTracks() + " / " + cd.getTitle());
    }
}
