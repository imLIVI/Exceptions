public class Event {
    private String title;
    private int releaseYear;
    private int age;

    public Event(String title, int releaseYear, int age) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.age = age;
    }

    public String getTitle() {
        return this.title;
    }

    public int getReleaseYear() {
        return this.releaseYear;
    }

    public int getAge() {
        return this.age;
    }
}
