package catcafe;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CatCafeTest {

    @Test
    void addCat_whenAddingOneCat_thenCountIsOne() {
        CatCafe cafe = new CatCafe();

        cafe.addCat(new FelineOverLord("Luna", 3));

        assertEquals(1, cafe.getCatCount());
    }

    @Test
    void addCat_whenAddingMultipleCats_thenCountMatches() {
        CatCafe cafe = new CatCafe();

        cafe.addCat(new FelineOverLord("Luna", 3));
        cafe.addCat(new FelineOverLord("Milo", 5));
        cafe.addCat(new FelineOverLord("Nala", 2));

        assertEquals(3, cafe.getCatCount());
    }

    @Test
    void getCatByName_whenCatExists_thenReturnsCorrectCat() {
        CatCafe cafe = new CatCafe();
        FelineOverLord cat = new FelineOverLord("Luna", 3);

        cafe.addCat(cat);

        assertEquals(cat, cafe.getCatByName("Luna"));
    }

    @Test
    void getCatByName_whenCatDoesNotExist_thenReturnsNull() {
        CatCafe cafe = new CatCafe();

        assertNull(cafe.getCatByName("Ghost"));
    }

    @Test
    void getCatByName_whenNameIsNull_thenReturnsNull() {
        CatCafe cafe = new CatCafe();

        assertNull(cafe.getCatByName(null));
    }

    @Test
    void getCatByWeight_whenWeightMatches_thenReturnsCat() {
        CatCafe cafe = new CatCafe();
        FelineOverLord cat = new FelineOverLord("Milo", 5);

        cafe.addCat(cat);

        assertEquals(cat, cafe.getCatByWeight(4, 6));
    }

    @Test
    void getCatByWeight_whenWeightDoesNotMatch_thenReturnsNull() {
        CatCafe cafe = new CatCafe();

        cafe.addCat(new FelineOverLord("Luna", 3));

        assertNull(cafe.getCatByWeight(5, 10));
    }

    @Test
    void getCatByWeight_whenMinWeightIsNegative_thenReturnsNull() {
        CatCafe cafe = new CatCafe();

        assertNull(cafe.getCatByWeight(-1, 5));
    }

    @Test
    void getCatByWeight_whenMaxWeightIsSmallerThanMinWeight_thenReturnsNull() {
        CatCafe cafe = new CatCafe();

        assertNull(cafe.getCatByWeight(10, 5));
    }

    @Test
    void addCat_whenAddingNull_thenThrowsException() {
        CatCafe cafe = new CatCafe();

        assertThrows(NullPointerException.class, () -> cafe.addCat(null));
    }
}
