package mediatheque;

public class Main {
    public static void main(String[] args) {
        Mediatheque mediatheque = new Mediatheque();
        mediatheque.addItem( new Book("J.R.R. Tolkien", "Le seigneur des anneaux"));
        mediatheque.addItem( new Book("Philip K. Dick", "Le Maître du haut chateau"));
        mediatheque.addItem( new CD(12, "Sergeant Peppers"));

        mediatheque.addItem( new CD(6, "A Tear In The Fabric Of Life"));
        mediatheque.addItem( new Book("Wajdi Mouawad", "Incendies"));
        mediatheque.printCatalog();
        System.out.println(("///////////////"));
        mediatheque.printOnlyBook();
        mediatheque.printOnlyCD();
    }
}
