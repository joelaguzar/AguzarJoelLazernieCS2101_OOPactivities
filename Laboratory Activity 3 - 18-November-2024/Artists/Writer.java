enum WritingStyle {
    FICTION,
    NONFICTION,
    POETRY,
    DRAMA,
}

class Writer extends Artist {
    private WritingStyle writingStyle;

    public Writer(String name, String nationality, int age, String specialty, WritingStyle writingStyle) {
        super(name, nationality, age, specialty);
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
        System.out.println("== Writer Info ==");
        super.displayInfo();
        System.out.println("Writing Style: " + writingStyle);
    }
}
