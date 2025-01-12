import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AlgorithmsTest {

    @Test
    public void testFindSecondLargest_ValidInput() {
        assertEquals(5, Algorithms.findSecondLargest(new int[]{1, 5, 3, 6}));
        assertEquals(4, Algorithms.findSecondLargest(new int[]{4, 6, 4, 3}));
    }

    @Test
    public void testFindSecondLargest_SingleElementArray() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                Algorithms.findSecondLargest(new int[]{1})
        );
        assertEquals("Array must have at least two elements", exception.getMessage());
    }

    @Test
    public void testFindSecondLargest_AllEqualElements() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                Algorithms.findSecondLargest(new int[]{5, 5, 5})
        );
        assertEquals("Array must have at least two distinct elements", exception.getMessage());
    }
    @Test
    public void testFindSecondLargest_NullArray() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                Algorithms.findSecondLargest(null)
        );
        assertEquals("Array must have at least two elements", exception.getMessage());
    }

    @Test
    public void testFindSecondLargest_AllSameElements() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                Algorithms.findSecondLargest(new int[]{5, 5, 5, 5})
        );
        assertEquals("Array must have at least two distinct elements", exception.getMessage());
    }

    @Test
    public void testFindSecondLargest_ValidInputWithNegativeNumbers() {
        assertEquals(-2, Algorithms.findSecondLargest(new int[]{-1, -2, -3, -4}));
    }

}
