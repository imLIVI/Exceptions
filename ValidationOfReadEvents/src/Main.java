public class Main {

    public static void main(String[] args) {
        for (Event event : getMovies()) {
            validEvent(event);
        }
        for (Event event : getTheatres()) {
            validEvent(event);
        }
        System.out.println("Все события корректны");

    }

    public static Movie[] getMovies() {
        return new Movie[]{
                new Movie("Pirates of the Caribbean", 2003, 12),
                new Movie("Lord of the Rings", 2001, 12),
                new Movie("Harry Potter", 2002, 12),
                new Movie(null, 0, 16)
        };
    }

    public static Theatre[] getTheatres() {
        return new Theatre[]{
                new Theatre("Swan Lake", 1877, 8),
                new Theatre("Notre Dame de Paris", 1998, 14),
                new Theatre("Romeo and Juliet", 1597, 16),
                new Theatre("", 1022, 16)
        };
    }

    public static void validEvent(Event event) {
        if (event.getTitle() == null || event.getReleaseYear() == 0 || event.getAge() == 0) {
            throw new NullPointerException(event.getClass());
        }
    }
}
