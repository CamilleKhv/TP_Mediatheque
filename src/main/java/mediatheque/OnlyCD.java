package mediatheque;

public class OnlyCD implements MediaVisitor {

    public void visit(Book book) {
    }


    public void visit(CD cd) {
        System.out.println("Détails du CD : " + cd.getNumberOfTracks() + " / " + cd.getTitle());
    }

}
