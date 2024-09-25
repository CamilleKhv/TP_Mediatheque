package mediatheque;

public class OnlyBook implements MediaVisitor {

    public void visit(Book book) {
        System.out.println("Détails du livre : " + book.getTitle());
    }


    public void visit(CD cd) {
    }
}
