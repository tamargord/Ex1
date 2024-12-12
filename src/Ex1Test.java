import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

        public class Ex1Test {
        @Test
        void computeNumberTest() {
            String s2 = "1011b2";
            int v = Ex1.number2Int(s2);
            assertEquals(v, 11);
            String s10 = "1011bA";
            v = Ex1.number2Int(s10);
            s2 = Ex1.int2Number(v, 2);
            int v2 = Ex1.number2Int(s2);
            assertEquals(v, v2);
            assertTrue(Ex1.equals(s10, s2));
        }

        @Test
        void isBasisNumberTest() {
            String[] good = {"1", "1b2", "01b2", "123bA", "ABbG", "0bA"};
            for (int i = 0; i < good.length; i = i + 1) {
                boolean ok = Ex1.isNumber(good[i]);
                assertTrue(ok);
            }
            String[] not_good = {"b2", "2b2", "1G3bG", " BbG", "0bbA", "abB", "!@b2", "A", "1bb2"};
            for (int i = 0; i < not_good.length; i = i + 1) {
                boolean not_ok = Ex1.isNumber(not_good[i]);
                assertFalse(not_ok);
            }
        }

        @Test
        void int2NumberTest() {
            String[] good = {"1010b2", "FbG", "255", "8b9", "0"};
            for (int i = 0; i < good.length; i++) {
                boolean ok = Ex1.isNumber(good[i]);
                assertTrue(ok);
            }
            String[] bad = {"Fb16", "255b10"};
            for (int i = 0; i < bad.length; i++) {
                boolean not_ok = Ex1.isNumber(bad[i]);
                assertFalse(not_ok);

            }
        }

        @Test
        void maxIndexTest() {
            String[] arr1 = {"1011b2", "FFbG", "255", "7b8"};
            assertEquals(1, Ex1.maxIndex(arr1));
            String[] arr2 = {};
            assertEquals(-1, Ex1.maxIndex(arr2));
            String[] arr3 = {"10101b2","AbG","98736","0"};
            assertEquals(2, Ex1.maxIndex(arr3));
            String[] arr4 = {"8b9","5b6","7b8","4"};
            assertEquals(0, Ex1.maxIndex(arr4));
            String[] arr5 = {"7","5b6","15","35"};
            assertEquals(3, Ex1.maxIndex(arr5));
            String[] arr6 = {"2","3b8","5b7","6b7"};
            assertEquals(3, Ex1.maxIndex(arr6));

        }
        @Test
        public void testEquals() {
            assertTrue(Ex1.equals("6b8", "6b9"));
            assertTrue(Ex1.equals("7b8", "7"));
            assertFalse(Ex1.equals("7b8", "8bG"));
            assertFalse(Ex1.equals("123", "124"));
        }

        @Test
        public void testValueOfNumber() {
            assertEquals(3, Ex1.valueOfNumber('3'));
            assertEquals(12, Ex1.valueOfNumber('C'));
            assertEquals(16,Ex1.valueOfNumber('G'));
            assertEquals(-1,Ex1.valueOfNumber('I'));
        }
        @Test
        public void testCompareBaseNum() {
            assertTrue(Ex1.compareBaseNum("101","2"));
            assertFalse(Ex1.compareBaseNum("9","18"));
            assertFalse(Ex1.compareBaseNum("102", "2"));
            assertFalse(Ex1.compareBaseNum("100","1"));
            assertFalse(Ex1.compareBaseNum("18","H"));

        }
    }


