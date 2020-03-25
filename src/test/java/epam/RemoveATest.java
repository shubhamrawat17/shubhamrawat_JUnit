package epam;


import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


/*
    Test case
    case 1. Empty char : ""=>"";
    case 2.  1 char : A=> "";
    case 3.  2 chars : AA=> "";
    case 4.  A is First Char : ABCD => BCD;
    case 5.  A is second char : BACD => BCD;
    case 6.  A is present at first 2 chars : AABC => BC
    case 7 . A is not in first 2 chars: BBAA => BBAA
    case 8.  N chars : AABAA => BAA
*/

public class RemoveATest {
    @Test
    public void testEmptyChar()
    {
        RemoveA obj= new RemoveA();
        String result = obj.remove("");
        assertEquals("",result);
    }
    @Test
    public void test1Char()
    {
        RemoveA obj = new RemoveA();
        String result = obj.remove("A");
        assertEquals("",result);
    }
    @Test
    public void test2Char()
    {
        RemoveA obj = new RemoveA();
        String result = obj.remove("AA");
        assertEquals("",result);
    }
    @Test
    public void testFirstCharIsA()
    {
        RemoveA obj = new RemoveA();
        String result = obj.remove("ABCD");
        assertEquals("BCD",result);
    }
    @Test
   public void testSecondCharIsA()
    {
        RemoveA obj = new RemoveA();
        String result = obj.remove("BACD");
        assertEquals("BCD",result);
    }
    @Test
    public void testFirstTwoCharsAreA()
    {
        RemoveA obj = new RemoveA();
        String result = obj.remove("AABC");
        assertEquals("BC",result);
    }

    @Test
    public void testFirst2CharsAreNotA()
    {
        RemoveA obj = new RemoveA();
        String result = obj.remove("BBAA");
        assertEquals("BBAA",result);
    }
    @Test
    public void testNChars()
    {
        RemoveA obj = new RemoveA();
        String result = obj.remove("AABBAA");
        assertEquals("BBAA",result);
    }


}
