enum WritingStyle {
    FICTION,
    NONFICTION,
    POETRY,
    DRAMA,
}

class Writer extends Artist {
    private WritingStyle writingStyle;

    public Writer(String name, int age, String specialty, WritingStyle writingStyle) {
        super(name, age, specialty);
        this.writingStyle = writingStyle;
    }

    public WritingStyle getGenre() {
        return writingStyle;
    }

    public void setGenre(WritingStyle writingStyle) {
        this.writingStyle = writingStyle;
    }

    @Override
    public void displayInfo() {
        System.out.println("Writer's Info:");
        super.displayInfo();
        System.out.println("Writing Style: " + writingStyle);
    }
}
