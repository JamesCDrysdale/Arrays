import org.example.NumberList;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class NumberListTest {
    private NumberList numbers;

    @Before
    public void setUp(){
        ArrayList<Integer> testNumbers = new ArrayList<>();
        testNumbers.add(1);
        testNumbers.add(2);
        testNumbers.add(3);
        testNumbers.add(4);
        numbers = new NumberList(testNumbers);
    }

    @Test
    public void canGetSizeOfArrayList(){
        assertEquals(0, numbers.getNumberCount());
    }

    @Test
    public void canAddNumToArrayList(){
        numbers.addNumber(12);
        assertEquals(1, numbers.getNumberCount());
    }

    @Test
    public void canGetFirstNumberFromArrayList(){
        numbers.addNumber(5);
        assertEquals(5, numbers.getItemAtIndex(0));
    }

    @Test
    public void canGetLastItemFromArrayList(){
        numbers.addNumber(5);
        numbers.addNumber(15);
        numbers.addNumber(25);
        assertEquals(25, numbers.getItemAtIndex(2));
    }

    @Test
    public void canRemoveAllElementsFromArrayList(){
        numbers.addNumber(5);
        numbers.addNumber(15);
        numbers.addNumber(25);
        numbers.clearNumbers();
        assertEquals(0, numbers.getNumberCount());
    }

    @Test
    public void canFindANumberInArrayList(){
        numbers.addNumber(5);
        numbers.addNumber(25);
        numbers.addNumber(55);
        assertTrue(numbers.findNumber(55));
    }

    @Test
    public void doesNotFindNumbersThatAreNotInArrayList(){
        numbers.addNumber(5);
        numbers.addNumber(25);
        numbers.addNumber(55);
        assertFalse(numbers.findNumber(78));
    }

    @Test
    public void removeReturnsTheNumberAtIndex(){
        numbers.addNumber(5);
        numbers.addNumber(25);
        assertEquals(25, numbers.removeFromIndex(1));
    }

    @Test
    public void removeReducesTheNumberOfItemsInArrayList(){
        numbers.addNumber(5);
        numbers.addNumber(25);
        numbers.addNumber(21);
        numbers.removeFromIndex(2);
        assertEquals(2, numbers.getNumberCount());
    }

    @Test
    public void getSumOfNumbersInArrayList(){
        numbers.addNumber(5);
        numbers.addNumber(5);
        numbers.addNumber(5);
        assertEquals(15, numbers.getTotal());
    }


}
