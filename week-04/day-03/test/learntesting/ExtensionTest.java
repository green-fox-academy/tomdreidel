package learntesting;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by aze on 2017.04.04..
 */
class ExtensionTest {

  Extension extension = new Extension();

  @Test
  void testAdd_2and3is5() {
    assertEquals(5, extension.add(2, 3));
  }

  @Test
  void testAdd_2and3is5_a() {
    assertEquals(2, extension.add(1, 1));
  }

  @Test
  void testAdd_1and4is5() {
    assertEquals(5, extension.add(1, 4));
  }

  @Test
  void testAdd_1and4is5_a() {
    assertEquals(4, extension.add(6, -2));
  }

  @Test
  void testMaxOfThree_first() {
    assertEquals(5, extension.maxOfThree(5, 4, 3));
  }

  @Test
  void testMaxOfThree_first_a() {
    assertEquals(4, extension.maxOfThree(4, 4, 3));
  }

  @Test
  void testMaxOfThree_third() {
    assertEquals(5, extension.maxOfThree(3, 4, 5));
  }

  @Test
  void testMaxOfThree_third_a() {
    assertEquals(4, extension.maxOfThree(1, 4, 3));
  }

  @Test
  void testMedian_four() {

    System.out.println(extension.median(Arrays.asList(7,5,3,5)));

    assertEquals(5, extension.median(Arrays.asList(7,5,3,5)));

  }

  @Test
  void testMedian_four_a() {
    assertEquals(4, extension.median(Arrays.asList(7,2,3,5)));
  }

  @Test
  void testMedian_five() {
    assertEquals(3, extension.median(Arrays.asList(1,2,3,4,5)));
  }

  @Test
  void testMedian_five_a() {
    System.out.println(extension.median(Arrays.asList(1,3,2,6,7)));
    assertEquals(3, extension.median(Arrays.asList(1,3,2,6,7)));
  }

  @Test
  void testIsVowel_a() {
    assertTrue(extension.isVowel('a'));
  }

  @Test
  void testIsVowel_a_a() {
    assertTrue(extension.isVowel('A'));
  }

  @Test
  void testIsVowel_u() {
    assertTrue(extension.isVowel('u'));
  }

  @Test
  void testIsVowel_u_a() {
    assertFalse(extension.isVowel('v'));
  }

  @Test
  void testTranslate_bemutatkozik() {
    assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
  }
  @Test
  void testTranslate_bemutatkozik_a() {
    assertEquals("teve", extension.translate("te"));
  }

  @Test
  void testTranslate_kolbice() {
    assertEquals("lavagovopuvus", extension.translate("lagopus"));
  }

  @Test
  void testTranslate_kolbice_a() {
    assertEquals("iviszivik", extension.translate("iszik"));
  }
}