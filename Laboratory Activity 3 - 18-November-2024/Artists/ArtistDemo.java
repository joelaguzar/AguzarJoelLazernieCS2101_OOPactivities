public class ArtistDemo {
    public static void main(String[] args) {
        // instance of Artist
        Artist artist = new Artist("Olivia Rodrigo", "Filipino - American", 32, "Music");
        artist.displayInfo();

        System.out.println();

        //instance of Singer
        Singer singer = new Singer("Taylor Swift", "American", 34, "Music", Genre.POP);
        singer.displayInfo();
        
        System.out.println();
        
        //instance of Dancer
        Dancer dancer = new Dancer ("Lisa Macuja-Elizalde", "Filipino", 60, "Dance", DanceStyle.BALLET);
        dancer.displayInfo();

        System.out.println();

        //instance of Writer
        Writer writer = new Writer("F. Sionil Jose", "Filipino", 98, "Writing", WritingStyle.POETRY);
        writer.displayInfo();

        System.out.println();

        //instance of Painter
        Painter painter = new Painter ("Benedicto Cabrera", "Filipino", 86, "Painting", Medium.OIL);
        painter.displayInfo();
    }
}