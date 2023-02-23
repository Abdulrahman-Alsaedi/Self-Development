public class intellectual_heath extends Self_development implements Type {

    private String books;
    private String intellgence_deveopment_gams;

    public intellectual_heath(String books, String intellgence_deveopment_gams, double weight, double height, int age) {
        super(weight, height, age);
        this.books = books;
        this.intellgence_deveopment_gams = intellgence_deveopment_gams;
    }

    public String getBooks() {
        return books;
    }

    public void setBooks(String books) {
        this.books = books;
    }

    public String getIntellgence_deveopment_gams() {
        return intellgence_deveopment_gams;
    }

    public void setIntellgence_deveopment_gams(String intellgence_deveopment_gams) {

        this.intellgence_deveopment_gams = intellgence_deveopment_gams;
    }

    public String type() {
        return "    the setIntellgence_deveopment_gams is very important It is important to explore new ideas and understandings in order to become more mindful and better-rounded. Having an optimal level of intellectual wellness inspires exploration. Intellectual wellness also stimulates curiosity. Curiosity is important because it motivates you to try new things and develop an understanding of how you see the relationship between yourself, others and the environment.    ";

    }

    @Override
    public String toString() {
        return super.toString() + "intellectual heath {" + "books = " + books + ", intellgence deveopment games = "
                + intellgence_deveopment_gams + '}';
    }

}