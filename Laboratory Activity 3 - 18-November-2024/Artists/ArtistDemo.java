public class ArtistDemo {
    public static void main(String[] args) {
        // instance of Artist
        System.out.println();
        Artist artist = new Artist("Olivia Rodrigo", 32, "Music");
        artist.displayInfo();

        System.out.println();

        //instance of Singer
        Singer singer = new Singer("Taylor Swift", 34, "Music", Genre.POP);
        singer.displayInfo();
        
        System.out.println();
        
        //instance of Dancer
        Dancer dancer = new Dancer ("Lisa Macuja-Elizalde", 60, "Dance", DanceStyle.BALLET);
        dancer.displayInfo();

        System.out.println();

        //instance of Writer
        Writer writer = new Writer("F. Sionil Jose", 98, "Writing", WritingStyle.POETRY);
        writer.displayInfo();

        System.out.println();

        //instance of Painter
        Painter painter = new Painter ("Benedicto Cabrera", 86, "Painting", Medium.OIL);
        painter.displayInfo();
    }
}