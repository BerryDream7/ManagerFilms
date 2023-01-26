import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerFilmsTest {

    @Test
    public void test() {
        ManagerFilms manager = new ManagerFilms();

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        manager.addFilm("Film 4");
        manager.addFilm("Film 5");
        manager.addFilm("Film 6");
        manager.addFilm("Film 7");
        manager.addFilm("Film 8");
        manager.addFilm("Film 9");
        manager.addFilm("Film 10");
        manager.addFilm("Film 11");
        manager.addFilm("Film 12");
        manager.addFilm("Film 13");
        manager.addFilm("Film 14");
        manager.addFilm("Film 15");

        String[] expected = { "Film 1", "Film 2", "Film 3", "Film 4","Film 5", "Film 6","Film 7","Film 8","Film 9","Film 10", "Film 11","Film 12","Film 13","Film 14","Film 15" };
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test1() {
        ManagerFilms manager = new ManagerFilms();

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        manager.addFilm("Film 4");
        manager.addFilm("Film 5");
        manager.addFilm("Film 6");
        manager.addFilm("Film 7");
        manager.addFilm("Film 8");
        manager.addFilm("Film 9");
        manager.addFilm("Film 10");
        manager.addFilm("Film 11");
        manager.addFilm("Film 12");
        manager.addFilm("Film 13");
        manager.addFilm("Film 14");
        manager.addFilm("Film 15");

        String[] expected = { "Film 15", "Film 14", "Film 13", "Film 12","Film 11","Film 10","Film 9","Film 8","Film 7","Film 6" };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        ManagerFilms manager = new ManagerFilms(5);

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        manager.addFilm("Film 4");
        manager.addFilm("Film 5");
        manager.addFilm("Film 6");
        manager.addFilm("Film 7");
        manager.addFilm("Film 8");
        manager.addFilm("Film 9");
        manager.addFilm("Film 10");
        manager.addFilm("Film 11");
        manager.addFilm("Film 12");
        manager.addFilm("Film 13");
        manager.addFilm("Film 14");
        manager.addFilm("Film 15");

        String[] expected = { "Film 15", "Film 14", "Film 13", "Film 12","Film 11"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        ManagerFilms manager = new ManagerFilms(9);

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        manager.addFilm("Film 4");

        String[] expected = { "Film 4","Film 3", "Film 2", "Film 1" };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
