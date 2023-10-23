package ChapterFour;

import chapter_4.UserTriangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTriangleTest {
    @Test
    public void testForShapeOfATriangle(){
        int length = UserTriangle.displayTriangle(7);
        assertEquals(length, 7);
    }
    @Test
    public void testTheLengthOfATriangle(){
        int length = UserTriangle.displayTriangle(10);
        assertEquals(10, length);
    }
}
