package algorithmsfilter.movie;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VideoThequeTest {

    @Test
    void testGetHighlyRatedMoviesByCategory() {
        VideoTheque videoTheque = new VideoTheque();
        videoTheque.addMovie(new Movie("The Thing", Category.HORROR, 5));
        videoTheque.addMovie(new Movie("Titanic", Category.ROMANTIC, 5));
        videoTheque.addMovie(new Movie("Paranormal Activity", Category.HORROR, 3));
        videoTheque.addMovie(new Movie("The Fly", Category.HORROR, 4));
        videoTheque.addMovie(new Movie("The Room", Category.DRAMA, 2));
        List<Movie> filtered = Arrays.asList(videoTheque.getMovies().get(0), videoTheque.getMovies().get(3));
        assertEquals(filtered, videoTheque.getHighlyRatedMoviesByCategory(Category.HORROR));
    }
}
