package assignment8_exercises.ncl;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test001"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.String str4 = nodeCachingLinkedList0.toString();
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex(3);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i9 = nodeCachingLinkedList0.get((int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test002"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    int i12 = nodeCachingLinkedList0.getSize();
    int i13 = nodeCachingLinkedList0.getSize();
    int i14 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i16 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i18 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i21 = nodeCachingLinkedList0.getCacheSize();
    int i22 = nodeCachingLinkedList0.getCacheSize();
    int i23 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 20+ "'", i16.equals(20));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 0+ "'", i18.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test003"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    int i6 = nodeCachingLinkedList0.getCacheSize();
    int i7 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)3);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i12 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test004"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((-1));
    int i8 = nodeCachingLinkedList0.getSize();
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    int i11 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex((int)'#');
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str16 = nodeCachingLinkedList0.toString();
    int i17 = nodeCachingLinkedList0.getCacheSize();
    int i18 = nodeCachingLinkedList0.getSize();
    int i19 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[10]"+ "'", str9.equals("[10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[10]"+ "'", str10.equals("[10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[0,10]"+ "'", str16.equals("[0,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test005"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i17 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 0+ "'", i6.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0]"+ "'", str7.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 0+ "'", i9.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 0+ "'", i17.equals(0));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test006"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex((int)(byte)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    int i9 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i11 = nodeCachingLinkedList0.get((int)(byte)0);
    int i12 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i14 = nodeCachingLinkedList0.get(0);
    int i15 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 100+ "'", i11.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 100+ "'", i14.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test007"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getSize();
    int i8 = nodeCachingLinkedList0.getSize();
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i14 = nodeCachingLinkedList0.removeIndex(0);
    int i15 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.String str18 = nodeCachingLinkedList0.toString();
    int i19 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 1+ "'", i14.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[10]"+ "'", str18.equals("[10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test008"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    java.lang.String str15 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[0,20,0,20,10]"+ "'", str14.equals("[0,20,0,20,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[0,20,0,20,10]"+ "'", str15.equals("[0,20,0,20,10]"));

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test009"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i10 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test010"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    int i10 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    int i13 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex(20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i15);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test011"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    int i5 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i10 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i12 = nodeCachingLinkedList0.get(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test012"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i7 = nodeCachingLinkedList0.get(0);
    int i8 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex((int)'4');
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i16 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 1+ "'", i7.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 1+ "'", i16.equals(1));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test013"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    int i10 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    int i12 = nodeCachingLinkedList0.getSize();
    int i13 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i17 = nodeCachingLinkedList0.removeIndex((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[-1]"+ "'", str11.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + (-1)+ "'", i17.equals((-1)));

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test014"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getSize();
    int i8 = nodeCachingLinkedList0.getSize();
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    int i15 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test015"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    int i12 = nodeCachingLinkedList0.getSize();
    int i13 = nodeCachingLinkedList0.getSize();
    int i14 = nodeCachingLinkedList0.getSize();
    java.lang.String str15 = nodeCachingLinkedList0.toString();
    int i16 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i18 = nodeCachingLinkedList0.get((int)(short)0);
    java.lang.Integer i20 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i22 = nodeCachingLinkedList0.removeIndex(0);
    int i23 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[20,0,20,10]"+ "'", str15.equals("[20,0,20,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 20+ "'", i18.equals(20));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 20+ "'", i20.equals(20));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + 0+ "'", i22.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test016"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    java.lang.Integer i9 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i12 = nodeCachingLinkedList0.getSize();
    int i13 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i18 = nodeCachingLinkedList0.get(0);
    java.lang.String str19 = nodeCachingLinkedList0.toString();
    int i20 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 20+ "'", i9.equals(20));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[1,20,10]"+ "'", str14.equals("[1,20,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 0+ "'", i18.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[0,1,20,10]"+ "'", str19.equals("[0,1,20,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test017"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex((int)(byte)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    int i9 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    int i11 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i15 = nodeCachingLinkedList0.get(0);
    java.lang.Integer i17 = nodeCachingLinkedList0.get(0);
    int i18 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i20 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i22 = nodeCachingLinkedList0.removeIndex(6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[-1]"+ "'", str10.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 0+ "'", i15.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 0+ "'", i17.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 0+ "'", i20.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i22);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test018"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i10 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)2);
    int i13 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test019"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)7);
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[7]"+ "'", str9.equals("[7]"));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test020"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    int i1 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(byte)100);
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex(4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test021"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    int i10 = nodeCachingLinkedList0.getCacheSize();
    int i11 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str12 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i15 = nodeCachingLinkedList0.getSize();
    java.lang.String str16 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i20 = nodeCachingLinkedList0.get(0);
    int i21 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[0]"+ "'", str16.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 0+ "'", i20.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test022"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    java.lang.Integer i15 = nodeCachingLinkedList0.get(0);
    int i16 = nodeCachingLinkedList0.getCacheSize();
    int i17 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i19 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str20 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-1)+ "'", i19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[0,0,20,10]"+ "'", str20.equals("[0,0,20,10]"));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test023"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i3 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i10 = nodeCachingLinkedList0.getSize();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i12 = nodeCachingLinkedList0.get((int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 0+ "'", i5.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test024"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i3 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 0+ "'", i5.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test025"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getSize();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex((int)'a');
    int i13 = nodeCachingLinkedList0.getSize();
    int i14 = nodeCachingLinkedList0.getSize();
    int i15 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i17 = nodeCachingLinkedList0.removeIndex((int)(byte)-1);
    int i18 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test026"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    java.lang.Integer i16 = nodeCachingLinkedList0.removeIndex((int)(byte)1);
    java.lang.Integer i18 = nodeCachingLinkedList0.removeIndex((int)(short)10);
    java.lang.Integer i20 = nodeCachingLinkedList0.removeIndex((int)'a');
    java.lang.Integer i22 = nodeCachingLinkedList0.get(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[0,20,0,20,10]"+ "'", str14.equals("[0,20,0,20,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 20+ "'", i16.equals(20));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + 0+ "'", i22.equals(0));

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test027"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i10 = nodeCachingLinkedList0.get((int)(byte)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i13 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i17 = nodeCachingLinkedList0.get(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[100]"+ "'", str6.equals("[100]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 0+ "'", i10.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 0+ "'", i15.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 0+ "'", i17.equals(0));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test028"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getSize();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    int i8 = nodeCachingLinkedList0.getCacheSize();
    int i9 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test029"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    int i4 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test030"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.Integer i3 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i4 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i7 = nodeCachingLinkedList0.getCacheSize();
    int i8 = nodeCachingLinkedList0.getSize();
    int i9 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    int i11 = nodeCachingLinkedList0.getSize();
    int i12 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[0]"+ "'", str10.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test031"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    java.lang.Integer i15 = nodeCachingLinkedList0.get(0);
    int i16 = nodeCachingLinkedList0.getCacheSize();
    int i17 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i19 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    java.lang.String str22 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-1)+ "'", i19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[-1,-1,0,0,20,10]"+ "'", str22.equals("[-1,-1,0,0,20,10]"));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test032"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i4 = nodeCachingLinkedList0.getSize();
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    int i6 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i9 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[1]"+ "'", str5.equals("[1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 2);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test033"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i4 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i7 = nodeCachingLinkedList0.getSize();
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex((int)(byte)10);
    java.lang.Integer i12 = nodeCachingLinkedList0.get(0);
    java.lang.String str13 = nodeCachingLinkedList0.toString();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i15 = nodeCachingLinkedList0.get(4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0,1]"+ "'", str8.equals("[0,1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[0,1]"+ "'", str13.equals("[0,1]"));

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test034"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getSize();
    int i8 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test035"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    int i10 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    int i13 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex(20);
    int i16 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test036"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i3 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getSize();
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    int i9 = nodeCachingLinkedList0.getCacheSize();
    int i10 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i14 = nodeCachingLinkedList0.get((int)(byte)0);
    java.lang.Integer i16 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)6);
    int i19 = nodeCachingLinkedList0.getSize();
    java.lang.String str20 = nodeCachingLinkedList0.toString();
    java.lang.Integer i22 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i24 = nodeCachingLinkedList0.removeIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 0+ "'", i5.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 0+ "'", i14.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 0+ "'", i16.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[6]"+ "'", str20.equals("[6]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + 6+ "'", i22.equals(6));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i24);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test037"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    java.lang.Integer i7 = nodeCachingLinkedList0.get(0);
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 100+ "'", i7.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[100]"+ "'", str8.equals("[100]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[100]"+ "'", str9.equals("[100]"));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test038"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex((int)(short)-1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)5);
    int i14 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test039"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    int i3 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)4);
    int i6 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i8 = nodeCachingLinkedList0.get((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 4+ "'", i8.equals(4));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test040"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getSize();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test041"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.String str4 = nodeCachingLinkedList0.toString();
    int i5 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test042"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)7);
    int i9 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test043"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    int i5 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getSize();
    int i8 = nodeCachingLinkedList0.getSize();
    int i9 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test044"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((-1));
    int i8 = nodeCachingLinkedList0.getSize();
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    int i11 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex((int)'#');
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i17 = nodeCachingLinkedList0.get(0);
    int i18 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[10]"+ "'", str9.equals("[10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[10]"+ "'", str10.equals("[10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 0+ "'", i17.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test045"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    int i1 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex((int)(byte)10);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 100+ "'", i5.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test046"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    java.lang.Integer i13 = nodeCachingLinkedList0.get(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 100+ "'", i13.equals(100));

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test047"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i12 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i14 = nodeCachingLinkedList0.removeIndex((int)(short)10);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    int i17 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test048"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.String str3 = nodeCachingLinkedList0.toString();
    int i4 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i7 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test049"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)'4');
    int i6 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i8 = nodeCachingLinkedList0.get(0);
    int i9 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i12 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i14 = nodeCachingLinkedList0.removeIndex((int)(byte)10);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i17 = nodeCachingLinkedList0.getCacheSize();
    int i18 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10+ "'", i8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test050"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    int i8 = nodeCachingLinkedList0.getSize();
    int i9 = nodeCachingLinkedList0.getSize();
    int i10 = nodeCachingLinkedList0.getSize();
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    int i12 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[20]"+ "'", str7.equals("[20]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[20]"+ "'", str11.equals("[20]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test051"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    int i10 = nodeCachingLinkedList0.getCacheSize();
    int i11 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i14 = nodeCachingLinkedList0.getSize();
    int i15 = nodeCachingLinkedList0.getSize();
    int i16 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i20 = nodeCachingLinkedList0.get(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test052"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    int i1 = nodeCachingLinkedList0.getSize();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(short)-1);
    int i5 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)6);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i14 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)4);
    java.lang.Integer i18 = nodeCachingLinkedList0.get(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[6,1]"+ "'", str10.equals("[6,1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 6+ "'", i12.equals(6));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 1+ "'", i14.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 4+ "'", i18.equals(4));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test053"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    int i4 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    int i10 = nodeCachingLinkedList0.getSize();
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    int i12 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test054"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    int i8 = nodeCachingLinkedList0.getSize();
    int i9 = nodeCachingLinkedList0.getSize();
    int i10 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test055"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((int)(short)1);
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(100);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodeCachingLinkedList0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test056"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    int i12 = nodeCachingLinkedList0.getSize();
    int i13 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex(10);
    int i16 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test057"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    int i4 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex(0);
    int i9 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str12 = nodeCachingLinkedList0.toString();
    java.lang.String str13 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i17 = nodeCachingLinkedList0.removeIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 0+ "'", i8.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 0+ "'", i17.equals(0));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test058"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)'a');
    int i5 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i8 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test059"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getSize();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex((int)'a');
    int i13 = nodeCachingLinkedList0.getSize();
    int i14 = nodeCachingLinkedList0.getCacheSize();
    int i15 = nodeCachingLinkedList0.getCacheSize();
    int i16 = nodeCachingLinkedList0.getCacheSize();
    int i17 = nodeCachingLinkedList0.getSize();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i19 = nodeCachingLinkedList0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test060"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)'4');
    int i6 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i8 = nodeCachingLinkedList0.get(0);
    java.lang.Integer i10 = nodeCachingLinkedList0.get(0);
    int i11 = nodeCachingLinkedList0.getSize();
    int i12 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10+ "'", i8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 10+ "'", i10.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test061"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    int i10 = nodeCachingLinkedList0.getCacheSize();
    int i11 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test062"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    int i8 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    int i11 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i13 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)5);
    int i16 = nodeCachingLinkedList0.getCacheSize();
    int i17 = nodeCachingLinkedList0.getSize();
    int i18 = nodeCachingLinkedList0.getSize();
    int i19 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[20]"+ "'", str7.equals("[20]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 10+ "'", i13.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 3);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test063"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    int i5 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex(0);
    int i8 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test064"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((-1));
    int i8 = nodeCachingLinkedList0.getSize();
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str13 = nodeCachingLinkedList0.toString();
    java.lang.Integer i15 = nodeCachingLinkedList0.get(0);
    int i16 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i18 = nodeCachingLinkedList0.get((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[10]"+ "'", str9.equals("[10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[10]"+ "'", str10.equals("[10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[0,10]"+ "'", str13.equals("[0,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 0+ "'", i15.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 10+ "'", i18.equals(10));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test065"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    int i10 = nodeCachingLinkedList0.getCacheSize();
    int i11 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str12 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i15 = nodeCachingLinkedList0.getSize();
    int i16 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i19 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test066"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    int i5 = nodeCachingLinkedList0.getCacheSize();
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(1);
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex(5);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test067"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(6);
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    int i12 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test068"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    int i5 = nodeCachingLinkedList0.getCacheSize();
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(1);
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex(5);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[0]"+ "'", str14.equals("[0]"));

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test069"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i3 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str4 = nodeCachingLinkedList0.toString();
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    int i6 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[0]"+ "'", str4.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[0]"+ "'", str5.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test070"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    java.lang.Integer i15 = nodeCachingLinkedList0.get(0);
    int i16 = nodeCachingLinkedList0.getCacheSize();
    int i17 = nodeCachingLinkedList0.getCacheSize();
    int i18 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i22 = nodeCachingLinkedList0.removeIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + 0+ "'", i22.equals(0));

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test071"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i4 = nodeCachingLinkedList0.getSize();
    int i5 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[1]"+ "'", str6.equals("[1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[1]"+ "'", str8.equals("[1]"));

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test072"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test073"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i10 = nodeCachingLinkedList0.get((int)(byte)0);
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    int i12 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i14 = nodeCachingLinkedList0.removeIndex(2);
    int i15 = nodeCachingLinkedList0.getSize();
    int i16 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[100]"+ "'", str6.equals("[100]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 0+ "'", i10.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[0,100]"+ "'", str11.equals("[0,100]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test074"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i3 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getSize();
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    int i9 = nodeCachingLinkedList0.getCacheSize();
    int i10 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i13 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    int i15 = nodeCachingLinkedList0.getSize();
    int i16 = nodeCachingLinkedList0.getCacheSize();
    int i17 = nodeCachingLinkedList0.getSize();
    int i18 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 0+ "'", i5.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[0]"+ "'", str14.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test075"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex((int)(byte)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    int i9 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i11 = nodeCachingLinkedList0.get(0);
    java.lang.String str12 = nodeCachingLinkedList0.toString();
    int i13 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)4);
    int i16 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 100+ "'", i11.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[100]"+ "'", str12.equals("[100]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test076"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i5 = nodeCachingLinkedList0.getSize();
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i10 = nodeCachingLinkedList0.get(0);
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex(0);
    int i14 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0,0]"+ "'", str6.equals("[0,0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 0+ "'", i8.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 0+ "'", i10.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[0]"+ "'", str11.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test077"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    int i10 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    java.lang.String str12 = nodeCachingLinkedList0.toString();
    java.lang.String str13 = nodeCachingLinkedList0.toString();
    int i14 = nodeCachingLinkedList0.getSize();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i16 = nodeCachingLinkedList0.get(5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[-1]"+ "'", str11.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[-1]"+ "'", str12.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[-1]"+ "'", str13.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test078"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getSize();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex((int)'a');
    int i13 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)4);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i18 = nodeCachingLinkedList0.getSize();
    int i19 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i21 = nodeCachingLinkedList0.removeIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 0+ "'", i21.equals(0));

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test079"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.String str3 = nodeCachingLinkedList0.toString();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)2);
    int i8 = nodeCachingLinkedList0.getSize();
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex(0);
    int i12 = nodeCachingLinkedList0.getSize();
    java.lang.String str13 = nodeCachingLinkedList0.toString();
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[2]"+ "'", str9.equals("[2]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 2+ "'", i11.equals(2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test080"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i6 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i12 = nodeCachingLinkedList0.get(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test081"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)'4');
    int i6 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i8 = nodeCachingLinkedList0.get(0);
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    int i10 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex(7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10+ "'", i8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[10]"+ "'", str9.equals("[10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[10]"+ "'", str11.equals("[10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i15);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test082"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)'#');
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((int)'#');
    int i8 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i12 = nodeCachingLinkedList0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test083"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)4);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    int i11 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex(20);
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex(5);
    java.lang.Integer i17 = nodeCachingLinkedList0.removeIndex((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[-1]"+ "'", str7.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[4,-1]"+ "'", str10.equals("[4,-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + (-1)+ "'", i17.equals((-1)));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test084"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex((int)(byte)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    int i9 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    int i11 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i17 = nodeCachingLinkedList0.get(0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i19 = nodeCachingLinkedList0.get(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[-1]"+ "'", str10.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 0+ "'", i17.equals(0));

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test085"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)'4');
    int i6 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i8 = nodeCachingLinkedList0.get(0);
    int i9 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)6);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str16 = nodeCachingLinkedList0.toString();
    java.lang.Integer i18 = nodeCachingLinkedList0.get(0);
    java.lang.Integer i20 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)3);
    java.lang.Integer i24 = nodeCachingLinkedList0.removeIndex(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10+ "'", i8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 1+ "'", i15.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[6,10]"+ "'", str16.equals("[6,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 6+ "'", i18.equals(6));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 6+ "'", i20.equals(6));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i24);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test086"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    int i1 = nodeCachingLinkedList0.getSize();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(short)-1);
    int i5 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)6);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex((int)'#');
    int i13 = nodeCachingLinkedList0.getCacheSize();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i15 = nodeCachingLinkedList0.get(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[6,1]"+ "'", str10.equals("[6,1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test087"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getSize();
    int i8 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex((int)'a');
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex(0);
    int i16 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[-1]"+ "'", str11.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test088"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex(20);
    int i9 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str12 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[0]"+ "'", str12.equals("[0]"));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test089"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    java.lang.Integer i12 = nodeCachingLinkedList0.get(0);
    java.lang.String str13 = nodeCachingLinkedList0.toString();
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    java.lang.String str15 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[0]"+ "'", str10.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[0]"+ "'", str13.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[0]"+ "'", str14.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[0]"+ "'", str15.equals("[0]"));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test090"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.String str4 = nodeCachingLinkedList0.toString();
    int i5 = nodeCachingLinkedList0.getSize();
    int i6 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test091"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i3 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str4 = nodeCachingLinkedList0.toString();
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[0]"+ "'", str4.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[0]"+ "'", str5.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0]"+ "'", str6.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0,0]"+ "'", str9.equals("[0,0]"));

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test092"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    int i1 = nodeCachingLinkedList0.getSize();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(short)-1);
    int i5 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)4);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[4,1]"+ "'", str10.equals("[4,1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[4,1]"+ "'", str11.equals("[4,1]"));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test093"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    java.lang.Integer i15 = nodeCachingLinkedList0.get(0);
    int i16 = nodeCachingLinkedList0.getCacheSize();
    int i17 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i19 = nodeCachingLinkedList0.removeIndex(3);
    int i20 = nodeCachingLinkedList0.getCacheSize();
    int i21 = nodeCachingLinkedList0.getSize();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i23 = nodeCachingLinkedList0.get(4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 20+ "'", i19.equals(20));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 4);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test094"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i12 = nodeCachingLinkedList0.getCacheSize();
    int i13 = nodeCachingLinkedList0.getCacheSize();
    int i14 = nodeCachingLinkedList0.getCacheSize();
    int i15 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test095"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i12 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i14 = nodeCachingLinkedList0.get(0);
    java.lang.Integer i16 = nodeCachingLinkedList0.get((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 0+ "'", i14.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 0+ "'", i16.equals(0));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test096"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getSize();
    int i8 = nodeCachingLinkedList0.getSize();
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    int i10 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i18 = nodeCachingLinkedList0.removeIndex((int)'a');
    java.lang.Integer i20 = nodeCachingLinkedList0.removeIndex(0);
    int i21 = nodeCachingLinkedList0.getCacheSize();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i23 = nodeCachingLinkedList0.get(20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 0+ "'", i20.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test097"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(6);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(2);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test098"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i5 = nodeCachingLinkedList0.getSize();
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex(0);
    int i9 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i11 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0,0]"+ "'", str6.equals("[0,0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 0+ "'", i8.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 0+ "'", i11.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[0,0]"+ "'", str14.equals("[0,0]"));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test099"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    java.lang.Integer i9 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i12 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i14 = nodeCachingLinkedList0.removeIndex(3);
    java.lang.String str15 = nodeCachingLinkedList0.toString();
    java.lang.Integer i17 = nodeCachingLinkedList0.removeIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 20+ "'", i9.equals(20));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[1,20,10]"+ "'", str15.equals("[1,20,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 1+ "'", i17.equals(1));

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test100"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i10 = nodeCachingLinkedList0.get((int)(byte)0);
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    int i12 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i14 = nodeCachingLinkedList0.removeIndex(2);
    java.lang.Integer i16 = nodeCachingLinkedList0.get(0);
    int i17 = nodeCachingLinkedList0.getSize();
    int i18 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[100]"+ "'", str6.equals("[100]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 0+ "'", i10.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[0,100]"+ "'", str11.equals("[0,100]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 0+ "'", i16.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test101"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    int i1 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i9 = nodeCachingLinkedList0.get(0);
    int i10 = nodeCachingLinkedList0.getSize();
    int i11 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 0+ "'", i9.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test102"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)'4');
    int i6 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i8 = nodeCachingLinkedList0.get(0);
    java.lang.Integer i10 = nodeCachingLinkedList0.get(0);
    int i11 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10+ "'", i8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 10+ "'", i10.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test103"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 1+ "'", i7.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[0,10]"+ "'", str10.equals("[0,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[0,10]"+ "'", str11.equals("[0,10]"));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test104"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str12 = nodeCachingLinkedList0.toString();
    java.lang.String str13 = nodeCachingLinkedList0.toString();
    int i14 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[0,0,20,10]"+ "'", str12.equals("[0,0,20,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[0,0,20,10]"+ "'", str13.equals("[0,0,20,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test105"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    int i16 = nodeCachingLinkedList0.getSize();
    int i17 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    java.lang.Integer i21 = nodeCachingLinkedList0.removeIndex((int)'4');
    int i22 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 7);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test106"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    int i6 = nodeCachingLinkedList0.getCacheSize();
    int i7 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)3);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i13 = nodeCachingLinkedList0.get(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test107"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    java.lang.Integer i12 = nodeCachingLinkedList0.get(0);
    int i13 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex((int)(byte)-1);
    int i16 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[0]"+ "'", str10.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test108"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)'4');
    int i6 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i13 = nodeCachingLinkedList0.getSize();
    int i14 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10+ "'", i8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test109"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)3);
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(5);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test110"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    int i4 = nodeCachingLinkedList0.getCacheSize();
    int i5 = nodeCachingLinkedList0.getSize();
    int i6 = nodeCachingLinkedList0.getCacheSize();
    int i7 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[0,0]"+ "'", str14.equals("[0,0]"));

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test111"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i5 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((int)(short)-1);
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    java.lang.Integer i10 = nodeCachingLinkedList0.get(0);
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    java.lang.Integer i13 = nodeCachingLinkedList0.get(0);
    int i14 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0,0]"+ "'", str8.equals("[0,0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 0+ "'", i10.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[0,0]"+ "'", str11.equals("[0,0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test112"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    int i8 = nodeCachingLinkedList0.getSize();
    int i9 = nodeCachingLinkedList0.getSize();
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    java.lang.Integer i12 = nodeCachingLinkedList0.get(0);
    java.lang.Integer i14 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    java.lang.Integer i18 = nodeCachingLinkedList0.removeIndex(20);
    java.lang.String str19 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[20]"+ "'", str7.equals("[20]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[20]"+ "'", str10.equals("[20]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 20+ "'", i12.equals(20));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 20+ "'", i14.equals(20));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[100]"+ "'", str19.equals("[100]"));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test113"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    int i6 = nodeCachingLinkedList0.getCacheSize();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i8 = nodeCachingLinkedList0.get((int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test114"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.String str3 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i7 = nodeCachingLinkedList0.get(0);
    java.lang.Integer i9 = nodeCachingLinkedList0.get(0);
    int i10 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 10+ "'", i7.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 10+ "'", i9.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test115"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.String str3 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i7 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str12 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 10+ "'", i7.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[0,100,10]"+ "'", str12.equals("[0,100,10]"));

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test116"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    int i14 = nodeCachingLinkedList0.getCacheSize();
    int i15 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i21 = nodeCachingLinkedList0.get((int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test117"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.Integer i3 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i4 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i7 = nodeCachingLinkedList0.getCacheSize();
    int i8 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    int i11 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0]"+ "'", str9.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[0]"+ "'", str10.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test118"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    int i8 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i10 = nodeCachingLinkedList0.get(0);
    int i11 = nodeCachingLinkedList0.getSize();
    int i12 = nodeCachingLinkedList0.getCacheSize();
    int i13 = nodeCachingLinkedList0.getCacheSize();
    int i14 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[20]"+ "'", str7.equals("[20]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 20+ "'", i10.equals(20));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test119"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex((int)(byte)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)6);
    java.lang.Integer i14 = nodeCachingLinkedList0.removeIndex(0);
    int i15 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 6+ "'", i14.equals(6));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test120"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    int i5 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((int)'4');
    int i8 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test121"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    int i5 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex((int)' ');
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test122"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getSize();
    int i8 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    java.lang.String str12 = nodeCachingLinkedList0.toString();
    int i13 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i15 = nodeCachingLinkedList0.get(0);
    java.lang.Integer i17 = nodeCachingLinkedList0.get(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[0]"+ "'", str11.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[0]"+ "'", str12.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 0+ "'", i15.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 0+ "'", i17.equals(0));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test123"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)3);
    int i8 = nodeCachingLinkedList0.getSize();
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[3]"+ "'", str9.equals("[3]"));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test124"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    java.lang.Integer i15 = nodeCachingLinkedList0.get(0);
    int i16 = nodeCachingLinkedList0.getCacheSize();
    int i17 = nodeCachingLinkedList0.getCacheSize();
    int i18 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i23 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test125"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)3);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i10 = nodeCachingLinkedList0.getSize();
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    int i12 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[0,3]"+ "'", str11.equals("[0,3]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test126"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)3);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i10 = nodeCachingLinkedList0.getSize();
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    java.lang.String str12 = nodeCachingLinkedList0.toString();
    int i13 = nodeCachingLinkedList0.getCacheSize();
    int i14 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[0,3]"+ "'", str11.equals("[0,3]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[0,3]"+ "'", str12.equals("[0,3]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test127"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i4 = nodeCachingLinkedList0.getSize();
    int i5 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getSize();
    int i8 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[1]"+ "'", str6.equals("[1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test128"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex((int)(byte)100);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    java.lang.String str15 = nodeCachingLinkedList0.toString();
    java.lang.Integer i17 = nodeCachingLinkedList0.removeIndex((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[0]"+ "'", str14.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[0]"+ "'", str15.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i17);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test129"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    java.lang.Integer i9 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i12 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i14 = nodeCachingLinkedList0.removeIndex(3);
    java.lang.String str15 = nodeCachingLinkedList0.toString();
    int i16 = nodeCachingLinkedList0.getCacheSize();
    int i17 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    java.lang.Integer i21 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 20+ "'", i9.equals(20));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[1,20,10]"+ "'", str15.equals("[1,20,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + (-1)+ "'", i21.equals((-1)));

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test130"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)4);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    int i11 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i13 = nodeCachingLinkedList0.get(0);
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    java.lang.Integer i16 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i18 = nodeCachingLinkedList0.removeIndex(10);
    int i19 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[-1]"+ "'", str7.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[4,-1]"+ "'", str10.equals("[4,-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 4+ "'", i13.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[4,-1]"+ "'", str14.equals("[4,-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 4+ "'", i16.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test131"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)5);
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[5]"+ "'", str11.equals("[5]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 5+ "'", i13.equals(5));

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test132"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex((int)(byte)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    int i9 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    int i11 = nodeCachingLinkedList0.getCacheSize();
    int i12 = nodeCachingLinkedList0.getSize();
    java.lang.String str13 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[100]"+ "'", str10.equals("[100]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[100]"+ "'", str13.equals("[100]"));

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test133"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    int i8 = nodeCachingLinkedList0.getSize();
    int i9 = nodeCachingLinkedList0.getSize();
    int i10 = nodeCachingLinkedList0.getCacheSize();
    int i11 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i13 = nodeCachingLinkedList0.get(0);
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    int i15 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[20]"+ "'", str7.equals("[20]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 20+ "'", i13.equals(20));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[20]"+ "'", str14.equals("[20]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test134"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)'4');
    int i6 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i14 = nodeCachingLinkedList0.removeIndex(0);
    int i15 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10+ "'", i8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 0+ "'", i14.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test135"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    int i12 = nodeCachingLinkedList0.getSize();
    int i13 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i15 = nodeCachingLinkedList0.get(0);
    java.lang.Integer i17 = nodeCachingLinkedList0.get(0);
    java.lang.Integer i19 = nodeCachingLinkedList0.get(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 20+ "'", i15.equals(20));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 20+ "'", i17.equals(20));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 20+ "'", i19.equals(20));

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test136"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    int i4 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    int i6 = nodeCachingLinkedList0.getCacheSize();
    int i7 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodeCachingLinkedList0.get((int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test137"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    int i5 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    java.lang.Integer i9 = nodeCachingLinkedList0.get(0);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    int i11 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[-1]"+ "'", str10.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test138"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    java.lang.String str12 = nodeCachingLinkedList0.toString();
    java.lang.Integer i14 = nodeCachingLinkedList0.removeIndex(4);
    int i15 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[0,20,10]"+ "'", str10.equals("[0,20,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[0,20,10]"+ "'", str11.equals("[0,20,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[0,20,10]"+ "'", str12.equals("[0,20,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test139"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.Integer i3 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i4 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex(0);
    int i7 = nodeCachingLinkedList0.getCacheSize();
    int i8 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex((int)(byte)10);
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i12);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test140"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)'4');
    int i6 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i8 = nodeCachingLinkedList0.get(0);
    java.lang.Integer i10 = nodeCachingLinkedList0.get(0);
    int i11 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex(0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i15 = nodeCachingLinkedList0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10+ "'", i8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 10+ "'", i10.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 10+ "'", i13.equals(10));

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test141"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    java.lang.Integer i9 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i12 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i14 = nodeCachingLinkedList0.removeIndex(3);
    java.lang.String str15 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i19 = nodeCachingLinkedList0.removeIndex(0);
    int i20 = nodeCachingLinkedList0.getCacheSize();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i22 = nodeCachingLinkedList0.get((int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 20+ "'", i9.equals(20));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[1,20,10]"+ "'", str15.equals("[1,20,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 0+ "'", i19.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test142"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    int i6 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex(0);
    int i9 = nodeCachingLinkedList0.getCacheSize();
    int i10 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 100+ "'", i8.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test143"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex((int)(short)10);
    int i10 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[10]"+ "'", str6.equals("[10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[10]"+ "'", str11.equals("[10]"));

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test144"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodeCachingLinkedList0.get(4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test145"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    int i5 = nodeCachingLinkedList0.getCacheSize();
    int i6 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex((int)(short)100);
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)4);
    int i13 = nodeCachingLinkedList0.getSize();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i15 = nodeCachingLinkedList0.get(5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test146"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex(100);
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex((int)' ');
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i13 = nodeCachingLinkedList0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test147"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)4);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    int i11 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str12 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[-1]"+ "'", str7.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[4,-1]"+ "'", str10.equals("[4,-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[4,-1]"+ "'", str12.equals("[4,-1]"));

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test148"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getSize();
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex(3);
    java.lang.Integer i17 = nodeCachingLinkedList0.removeIndex(0);
    int i18 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 0+ "'", i17.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test149"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getSize();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex(0);
    int i12 = nodeCachingLinkedList0.getSize();
    java.lang.String str13 = nodeCachingLinkedList0.toString();
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex((int)(short)1);
    java.lang.String str16 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)3);
    int i19 = nodeCachingLinkedList0.getSize();
    int i20 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i22 = nodeCachingLinkedList0.removeIndex(0);
    int i23 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str24 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i22 + "' != '" + 3+ "'", i22.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "[]"+ "'", str24.equals("[]"));

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test150"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getSize();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex((int)'a');
    int i13 = nodeCachingLinkedList0.getSize();
    int i14 = nodeCachingLinkedList0.getSize();
    int i15 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i17 = nodeCachingLinkedList0.removeIndex((int)(byte)-1);
    int i18 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i20 = nodeCachingLinkedList0.removeIndex(5);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i20);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test151"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex((int)(byte)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    int i9 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i11 = nodeCachingLinkedList0.get(0);
    java.lang.Integer i13 = nodeCachingLinkedList0.get(0);
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str18 = nodeCachingLinkedList0.toString();
    java.lang.Integer i20 = nodeCachingLinkedList0.removeIndex(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 100+ "'", i11.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 100+ "'", i13.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 100+ "'", i15.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[0]"+ "'", str18.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i20);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test152"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test153"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.Integer i3 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i4 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex(0);
    int i7 = nodeCachingLinkedList0.getSize();
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex(0);
    int i11 = nodeCachingLinkedList0.getCacheSize();
    int i12 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test154"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    int i1 = nodeCachingLinkedList0.getSize();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i3 = nodeCachingLinkedList0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test155"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    int i9 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test156"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((int)(short)1);
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test157"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex((int)(short)-1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test158"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.Integer i3 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i4 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i9 = nodeCachingLinkedList0.getCacheSize();
    int i10 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str13 = nodeCachingLinkedList0.toString();
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    java.lang.String str15 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[0,0]"+ "'", str13.equals("[0,0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[0,0]"+ "'", str14.equals("[0,0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[0,0]"+ "'", str15.equals("[0,0]"));

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test159"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex((-1));
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0,-1]"+ "'", str9.equals("[0,-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test160"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getCacheSize();
    int i8 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)4);
    int i13 = nodeCachingLinkedList0.getCacheSize();
    int i14 = nodeCachingLinkedList0.getSize();
    java.lang.String str15 = nodeCachingLinkedList0.toString();
    int i16 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i18 = nodeCachingLinkedList0.get(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[4]"+ "'", str15.equals("[4]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 4+ "'", i18.equals(4));

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test161"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getSize();
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    int i9 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test162"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)5);
    java.lang.Integer i6 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 5+ "'", i6.equals(5));

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test163"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    int i8 = nodeCachingLinkedList0.getCacheSize();
    int i9 = nodeCachingLinkedList0.getSize();
    int i10 = nodeCachingLinkedList0.getSize();
    int i11 = nodeCachingLinkedList0.getSize();
    int i12 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test164"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)2);
    int i8 = nodeCachingLinkedList0.getSize();
    int i9 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str12 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 2+ "'", i11.equals(2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test165"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i16 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i18 = nodeCachingLinkedList0.get((int)(short)0);
    int i19 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i21 = nodeCachingLinkedList0.get(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 0+ "'", i18.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 0+ "'", i21.equals(0));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test166"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getSize();
    int i8 = nodeCachingLinkedList0.getSize();
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.String str13 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)3);
    java.lang.Integer i17 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i19 = nodeCachingLinkedList0.get(0);
    int i20 = nodeCachingLinkedList0.getSize();
    int i21 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[1]"+ "'", str13.equals("[1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 3+ "'", i17.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 1+ "'", i19.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test167"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.Integer i3 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i4 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex(2);
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[0]"+ "'", str11.equals("[0]"));

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test168"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    int i1 = nodeCachingLinkedList0.getSize();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(short)-1);
    int i5 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)4);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i13 = nodeCachingLinkedList0.get(0);
    int i14 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test169"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i4 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i9 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i11 = nodeCachingLinkedList0.get(0);
    int i12 = nodeCachingLinkedList0.getSize();
    int i13 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex(7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 1+ "'", i6.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 0+ "'", i11.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i15);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test170"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i3 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str4 = nodeCachingLinkedList0.toString();
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    int i6 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[0]"+ "'", str4.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[0]"+ "'", str5.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 0+ "'", i8.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test171"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i8 = nodeCachingLinkedList0.getSize();
    int i9 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i11 = nodeCachingLinkedList0.get(1);
    int i12 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str13 = nodeCachingLinkedList0.toString();
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 100+ "'", i11.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[0,100]"+ "'", str13.equals("[0,100]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[0,100]"+ "'", str14.equals("[0,100]"));

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test172"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getSize();
    int i8 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    java.lang.String str12 = nodeCachingLinkedList0.toString();
    int i13 = nodeCachingLinkedList0.getCacheSize();
    int i14 = nodeCachingLinkedList0.getCacheSize();
    int i15 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[0]"+ "'", str11.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[0]"+ "'", str12.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test173"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    int i11 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[20,20,10]"+ "'", str10.equals("[20,20,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test174"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    int i7 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    int i9 = nodeCachingLinkedList0.getCacheSize();
    int i10 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[-1]"+ "'", str8.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i12);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test175"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    int i1 = nodeCachingLinkedList0.getSize();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(short)-1);
    int i5 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)6);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    int i11 = nodeCachingLinkedList0.getSize();
    java.lang.String str12 = nodeCachingLinkedList0.toString();
    java.lang.Integer i14 = nodeCachingLinkedList0.removeIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[6,1]"+ "'", str10.equals("[6,1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[6,1]"+ "'", str12.equals("[6,1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 6+ "'", i14.equals(6));

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test176"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)3);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i10 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i12 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)7);
    int i15 = nodeCachingLinkedList0.getSize();
    int i16 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test177"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i17 = nodeCachingLinkedList0.get(0);
    int i18 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i20 = nodeCachingLinkedList0.get(0);
    java.lang.String str21 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 0+ "'", i6.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0]"+ "'", str7.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 0+ "'", i9.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 0+ "'", i17.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 0+ "'", i20.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[0]"+ "'", str21.equals("[0]"));

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test178"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i12 = nodeCachingLinkedList0.getCacheSize();
    int i13 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i15 = nodeCachingLinkedList0.get(0);
    java.lang.String str16 = nodeCachingLinkedList0.toString();
    int i17 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str18 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 0+ "'", i15.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[0,0,20,10]"+ "'", str16.equals("[0,0,20,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[0,0,20,10]"+ "'", str18.equals("[0,0,20,10]"));

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test179"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i3 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getSize();
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    int i9 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 0+ "'", i5.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test180"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i4 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i9 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i11 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 1+ "'", i6.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 0+ "'", i11.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[0,0]"+ "'", str14.equals("[0,0]"));

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test181"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i4 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)2);
    int i9 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[2,0,1]"+ "'", str10.equals("[2,0,1]"));

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test182"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    int i10 = nodeCachingLinkedList0.getCacheSize();
    int i11 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i14 = nodeCachingLinkedList0.getSize();
    int i15 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i18 = nodeCachingLinkedList0.getCacheSize();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i20 = nodeCachingLinkedList0.get(8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test183"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    int i5 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex((int)' ');
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str12 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test184"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0,20]"+ "'", str9.equals("[0,20]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[0,20]"+ "'", str10.equals("[0,20]"));

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test185"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    int i1 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    int i4 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 20+ "'", i6.equals(20));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test186"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.Integer i3 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i4 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex(0);
    int i7 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)6);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i14 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test187"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i3 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    int i10 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i15 = nodeCachingLinkedList0.getSize();
    java.lang.String str16 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 0+ "'", i5.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[0,20]"+ "'", str16.equals("[0,20]"));

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test188"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i3 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodeCachingLinkedList0.get((int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 0+ "'", i5.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test189"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.Integer i3 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i4 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i7 = nodeCachingLinkedList0.getCacheSize();
    int i8 = nodeCachingLinkedList0.getCacheSize();
    int i9 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test190"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    int i1 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)6);
    int i7 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i9 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i14 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str15 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 6+ "'", i9.equals(6));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[0,100,6,0]"+ "'", str15.equals("[0,100,6,0]"));

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test191"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.Integer i3 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i4 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex(0);
    int i7 = nodeCachingLinkedList0.getCacheSize();
    int i8 = nodeCachingLinkedList0.getCacheSize();
    int i9 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test192"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    int i1 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)6);
    int i7 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i9 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i13 = nodeCachingLinkedList0.get(0);
    int i14 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 6+ "'", i9.equals(6));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test193"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    int i11 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex((int)'a');
    int i14 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[0]"+ "'", str10.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test194"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex(10);
    int i16 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i20 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str21 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 0+ "'", i6.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0]"+ "'", str7.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 0+ "'", i9.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 0+ "'", i20.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[]"+ "'", str21.equals("[]"));

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test195"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)4);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    int i11 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex(0);
    int i14 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i16 = nodeCachingLinkedList0.removeIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[-1]"+ "'", str7.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[4,-1]"+ "'", str10.equals("[4,-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 4+ "'", i13.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + (-1)+ "'", i16.equals((-1)));

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test196"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    java.lang.Integer i9 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i12 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i14 = nodeCachingLinkedList0.removeIndex(3);
    java.lang.String str15 = nodeCachingLinkedList0.toString();
    java.lang.Integer i17 = nodeCachingLinkedList0.get(0);
    int i18 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i20 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)6);
    int i23 = nodeCachingLinkedList0.getCacheSize();
    int i24 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str25 = nodeCachingLinkedList0.toString();
    int i26 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 20+ "'", i9.equals(20));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[1,20,10]"+ "'", str15.equals("[1,20,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 1+ "'", i17.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 1+ "'", i20.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "[6,1,20,10]"+ "'", str25.equals("[6,1,20,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test197"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((int)(short)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i10 = nodeCachingLinkedList0.getSize();
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    int i12 = nodeCachingLinkedList0.getSize();
    java.lang.String str13 = nodeCachingLinkedList0.toString();
    int i14 = nodeCachingLinkedList0.getSize();
    java.lang.String str15 = nodeCachingLinkedList0.toString();
    java.lang.Integer i17 = nodeCachingLinkedList0.removeIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[0]"+ "'", str11.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[0]"+ "'", str13.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[0]"+ "'", str15.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 0+ "'", i17.equals(0));

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test198"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    int i10 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 20+ "'", i12.equals(20));

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test199"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    int i10 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i16 = nodeCachingLinkedList0.removeIndex((int)(short)-1);
    java.lang.Integer i18 = nodeCachingLinkedList0.get(0);
    int i19 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 0+ "'", i18.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test200"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((int)(short)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i10 = nodeCachingLinkedList0.getSize();
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    int i12 = nodeCachingLinkedList0.getSize();
    int i13 = nodeCachingLinkedList0.getSize();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i15 = nodeCachingLinkedList0.get((int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[0]"+ "'", str11.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test201"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getSize();
    int i8 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)5);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test202"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i10 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test203"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    int i4 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex(0);
    int i9 = nodeCachingLinkedList0.getCacheSize();
    int i10 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex(2);
    int i13 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 0+ "'", i8.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test204"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    int i8 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    int i11 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i13 = nodeCachingLinkedList0.get(0);
    int i14 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str15 = nodeCachingLinkedList0.toString();
    java.lang.String str16 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    java.lang.String str19 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[20]"+ "'", str7.equals("[20]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 10+ "'", i13.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[10,20]"+ "'", str15.equals("[10,20]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[10,20]"+ "'", str16.equals("[10,20]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[100,10,20]"+ "'", str19.equals("[100,10,20]"));

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test205"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    int i6 = nodeCachingLinkedList0.getSize();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[10]"+ "'", str7.equals("[10]"));

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test206"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    int i4 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex(0);
    int i9 = nodeCachingLinkedList0.getCacheSize();
    int i10 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    java.lang.String str12 = nodeCachingLinkedList0.toString();
    int i13 = nodeCachingLinkedList0.getSize();
    int i14 = nodeCachingLinkedList0.getSize();
    int i15 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 0+ "'", i8.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test207"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    int i10 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    java.lang.String str12 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[-1]"+ "'", str11.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[-1]"+ "'", str12.equals("[-1]"));

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test208"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i6 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i13 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 0+ "'", i15.equals(0));

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test209"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((int)(short)1);
    int i8 = nodeCachingLinkedList0.getCacheSize();
    int i9 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex((int)(byte)10);
    int i12 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test210"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getCacheSize();
    int i8 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)4);
    int i13 = nodeCachingLinkedList0.getCacheSize();
    int i14 = nodeCachingLinkedList0.getSize();
    java.lang.String str15 = nodeCachingLinkedList0.toString();
    int i16 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)3);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[4]"+ "'", str15.equals("[4]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test211"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)'4');
    int i6 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i8 = nodeCachingLinkedList0.get(0);
    int i9 = nodeCachingLinkedList0.getCacheSize();
    int i10 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i13 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10+ "'", i8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test212"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    int i9 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex(6);
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex(6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i15);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test213"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getSize();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex(0);
    int i12 = nodeCachingLinkedList0.getSize();
    java.lang.String str13 = nodeCachingLinkedList0.toString();
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex((int)(short)1);
    java.lang.String str16 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i20 = nodeCachingLinkedList0.get((int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test214"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.String str4 = nodeCachingLinkedList0.toString();
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getSize();
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test215"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getSize();
    int i8 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)3);
    int i13 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i15 = nodeCachingLinkedList0.get((int)(byte)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)4);
    java.lang.Integer i19 = nodeCachingLinkedList0.get(0);
    java.lang.Integer i21 = nodeCachingLinkedList0.get(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 3+ "'", i15.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 4+ "'", i19.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 3+ "'", i21.equals(3));

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test216"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    int i11 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex((int)(byte)-1);
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex((int)'#');
    nodeCachingLinkedList0.addFirst((java.lang.Integer)5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 0+ "'", i6.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0]"+ "'", str7.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 0+ "'", i9.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i15);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test217"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i16 = nodeCachingLinkedList0.getSize();
    java.lang.String str17 = nodeCachingLinkedList0.toString();
    int i18 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str19 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i22 = nodeCachingLinkedList0.getCacheSize();
    int i23 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i25 = nodeCachingLinkedList0.get(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[0,0,0,0,20,10]"+ "'", str17.equals("[0,0,0,0,20,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[0,0,0,0,20,10]"+ "'", str19.equals("[0,0,0,0,20,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + 1+ "'", i25.equals(1));

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test218"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getSize();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex((int)'a');
    int i13 = nodeCachingLinkedList0.getSize();
    int i14 = nodeCachingLinkedList0.getCacheSize();
    int i15 = nodeCachingLinkedList0.getCacheSize();
    int i16 = nodeCachingLinkedList0.getCacheSize();
    int i17 = nodeCachingLinkedList0.getSize();
    int i18 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test219"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    int i5 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex((int)' ');
    int i10 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    int i13 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i15 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i19 = nodeCachingLinkedList0.removeIndex(0);
    int i20 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 0+ "'", i19.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test220"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    int i10 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex(0);
    int i13 = nodeCachingLinkedList0.getSize();
    int i14 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test221"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex(20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i11 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test222"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    int i10 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex(0);
    int i13 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i15);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test223"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i7 = nodeCachingLinkedList0.get(10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test224"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    java.lang.Integer i13 = nodeCachingLinkedList0.get(0);
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    int i17 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i19 = nodeCachingLinkedList0.removeIndex(5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[0,20,10]"+ "'", str10.equals("[0,20,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[0,20,10]"+ "'", str11.equals("[0,20,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[0,20,10]"+ "'", str14.equals("[0,20,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i19);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test225"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex((int)(byte)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    int i9 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[-1]"+ "'", str10.equals("[-1]"));

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test226"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getSize();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    int i12 = nodeCachingLinkedList0.getSize();
    int i13 = nodeCachingLinkedList0.getCacheSize();
    int i14 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test227"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    int i6 = nodeCachingLinkedList0.getCacheSize();
    int i7 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test228"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i4 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i9 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i11 = nodeCachingLinkedList0.get(0);
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i16 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 1+ "'", i6.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 0+ "'", i11.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test229"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.String str4 = nodeCachingLinkedList0.toString();
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex(0);
    int i7 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[1]"+ "'", str4.equals("[1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 1+ "'", i6.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test230"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getSize();
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex(3);
    int i16 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test231"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getSize();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex(0);
    int i12 = nodeCachingLinkedList0.getSize();
    java.lang.String str13 = nodeCachingLinkedList0.toString();
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex((int)(short)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i19 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i21 = nodeCachingLinkedList0.removeIndex((int)'4');
    java.lang.Integer i23 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str26 = nodeCachingLinkedList0.toString();
    java.lang.Integer i28 = nodeCachingLinkedList0.get(0);
    java.lang.Integer i30 = nodeCachingLinkedList0.removeIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 0+ "'", i19.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[0]"+ "'", str26.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i28 + "' != '" + 0+ "'", i28.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 0+ "'", i30.equals(0));

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test232"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    int i1 = nodeCachingLinkedList0.getSize();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(short)-1);
    int i5 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)6);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i14 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)4);
    int i17 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str18 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[6,1]"+ "'", str10.equals("[6,1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 6+ "'", i12.equals(6));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 1+ "'", i14.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[4,1]"+ "'", str18.equals("[4,1]"));

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test233"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    int i16 = nodeCachingLinkedList0.getSize();
    int i17 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    java.lang.Integer i21 = nodeCachingLinkedList0.get(2);
    java.lang.Integer i23 = nodeCachingLinkedList0.get((int)(short)0);
    java.lang.Integer i25 = nodeCachingLinkedList0.removeIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 0+ "'", i21.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + 100+ "'", i23.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + 100+ "'", i25.equals(100));

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test234"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)4);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    int i11 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex(0);
    int i14 = nodeCachingLinkedList0.getSize();
    int i15 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i17 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i19 = nodeCachingLinkedList0.removeIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[-1]"+ "'", str7.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[4,-1]"+ "'", str10.equals("[4,-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 4+ "'", i13.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + (-1)+ "'", i17.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i19);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test235"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getSize();
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    int i9 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex(0);
    int i12 = nodeCachingLinkedList0.getSize();
    int i13 = nodeCachingLinkedList0.getSize();
    int i14 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str15 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]"+ "'", str15.equals("[]"));

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test236"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    int i1 = nodeCachingLinkedList0.getSize();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    int i3 = nodeCachingLinkedList0.getCacheSize();
    int i4 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex(0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i10 = nodeCachingLinkedList0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 0+ "'", i8.equals(0));

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test237"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i5 = nodeCachingLinkedList0.getSize();
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i10 = nodeCachingLinkedList0.get(0);
    int i11 = nodeCachingLinkedList0.getCacheSize();
    int i12 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i14 = nodeCachingLinkedList0.get(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0,0]"+ "'", str6.equals("[0,0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 0+ "'", i8.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 0+ "'", i10.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 0+ "'", i14.equals(0));

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test238"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    java.lang.Integer i9 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i13 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str16 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 20+ "'", i9.equals(20));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 1+ "'", i13.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[0,1,20,10]"+ "'", str16.equals("[0,1,20,10]"));

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test239"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.String str4 = nodeCachingLinkedList0.toString();
    int i5 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((int)(short)-1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i11 = nodeCachingLinkedList0.get((int)(short)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 10+ "'", i11.equals(10));

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test240"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)'4');
    int i6 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i8 = nodeCachingLinkedList0.get(0);
    int i9 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex((int)(byte)1);
    java.lang.Integer i15 = nodeCachingLinkedList0.get(0);
    int i16 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10+ "'", i8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 10+ "'", i13.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 0+ "'", i15.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test241"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i12 = nodeCachingLinkedList0.get(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[100]"+ "'", str6.equals("[100]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 0+ "'", i10.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 100+ "'", i12.equals(100));

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test242"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getSize();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str12 = nodeCachingLinkedList0.toString();
    java.lang.String str13 = nodeCachingLinkedList0.toString();
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    int i15 = nodeCachingLinkedList0.getSize();
    int i16 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str17 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]"+ "'", str17.equals("[]"));

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test243"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    int i1 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    java.lang.String str3 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test244"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.Integer i3 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i4 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex(0);
    int i7 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex((int)(byte)100);
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex((int)(byte)1);
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i15);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test245"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i8 = nodeCachingLinkedList0.get(20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[1,10]"+ "'", str6.equals("[1,10]"));

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test246"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    java.lang.Integer i7 = nodeCachingLinkedList0.get(0);
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i11 = nodeCachingLinkedList0.getSize();
    int i12 = nodeCachingLinkedList0.getSize();
    int i13 = nodeCachingLinkedList0.getCacheSize();
    int i14 = nodeCachingLinkedList0.getSize();
    java.lang.String str15 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 100+ "'", i7.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[100]"+ "'", str8.equals("[100]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[0,100]"+ "'", str15.equals("[0,100]"));

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test247"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex(0);
    int i14 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[100]"+ "'", str6.equals("[100]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 0+ "'", i10.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[100]"+ "'", str11.equals("[100]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 100+ "'", i13.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test248"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)'4');
    int i6 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i8 = nodeCachingLinkedList0.get(0);
    int i9 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)6);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i17 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i19 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.String str22 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10+ "'", i8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 0+ "'", i15.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 6+ "'", i17.equals(6));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 10+ "'", i19.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[1,10]"+ "'", str22.equals("[1,10]"));

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test249"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)'4');
    int i6 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i8 = nodeCachingLinkedList0.get(0);
    int i9 = nodeCachingLinkedList0.getCacheSize();
    int i10 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex((int)(byte)10);
    int i13 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10+ "'", i8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test250"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getSize();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex(0);
    int i12 = nodeCachingLinkedList0.getSize();
    java.lang.String str13 = nodeCachingLinkedList0.toString();
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex((int)(short)1);
    java.lang.String str16 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)3);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i20 = nodeCachingLinkedList0.get(1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test251"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex((int)(byte)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    int i9 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 100+ "'", i11.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i13);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test252"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i8 = nodeCachingLinkedList0.getSize();
    int i9 = nodeCachingLinkedList0.getSize();
    int i10 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test253"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getSize();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex((int)'a');
    int i13 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)4);
    java.lang.String str16 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i19 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[4]"+ "'", str16.equals("[4]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test254"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)'4');
    int i6 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i8 = nodeCachingLinkedList0.get(0);
    int i9 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)6);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i21 = nodeCachingLinkedList0.removeIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10+ "'", i8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 0+ "'", i15.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 0+ "'", i21.equals(0));

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test255"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex((int)(byte)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    int i9 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i11 = nodeCachingLinkedList0.get((int)(byte)0);
    java.lang.Integer i13 = nodeCachingLinkedList0.get(0);
    int i14 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i16 = nodeCachingLinkedList0.removeIndex(0);
    int i17 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str18 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 100+ "'", i11.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 100+ "'", i13.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 100+ "'", i16.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]"+ "'", str18.equals("[]"));

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test256"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i5 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((int)(short)-1);
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    java.lang.Integer i10 = nodeCachingLinkedList0.get(0);
    java.lang.Integer i12 = nodeCachingLinkedList0.get(0);
    java.lang.String str13 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0,0]"+ "'", str8.equals("[0,0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 0+ "'", i10.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[0,0]"+ "'", str13.equals("[0,0]"));

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test257"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((-1));
    int i8 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i11 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex(4);
    int i14 = nodeCachingLinkedList0.getCacheSize();
    int i15 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i17 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str18 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 0+ "'", i17.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[10]"+ "'", str18.equals("[10]"));

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test258"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.String str4 = nodeCachingLinkedList0.toString();
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex(0);
    int i7 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    int i11 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test259"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.String str3 = nodeCachingLinkedList0.toString();
    int i4 = nodeCachingLinkedList0.getSize();
    int i5 = nodeCachingLinkedList0.getSize();
    int i6 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i12 = nodeCachingLinkedList0.get(0);
    java.lang.Integer i14 = nodeCachingLinkedList0.removeIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 0+ "'", i14.equals(0));

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test260"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getSize();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex(0);
    int i12 = nodeCachingLinkedList0.getSize();
    java.lang.String str13 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i18 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i20 = nodeCachingLinkedList0.removeIndex((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i20);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test261"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.String str4 = nodeCachingLinkedList0.toString();
    int i5 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((int)(short)-1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i11 = nodeCachingLinkedList0.get((int)(short)0);
    java.lang.String str12 = nodeCachingLinkedList0.toString();
    int i13 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 10+ "'", i11.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[10]"+ "'", str12.equals("[10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test262"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getSize();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex(0);
    int i12 = nodeCachingLinkedList0.getSize();
    java.lang.String str13 = nodeCachingLinkedList0.toString();
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex((int)(short)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i19 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i21 = nodeCachingLinkedList0.removeIndex((int)'4');
    java.lang.Integer i23 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    java.lang.String str26 = nodeCachingLinkedList0.toString();
    java.lang.String str27 = nodeCachingLinkedList0.toString();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i29 = nodeCachingLinkedList0.get(6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 0+ "'", i19.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[20]"+ "'", str26.equals("[20]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "[20]"+ "'", str27.equals("[20]"));

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test263"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i12 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test264"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)6);
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    java.lang.Integer i10 = nodeCachingLinkedList0.get(0);
    int i11 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex(0);
    int i14 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[6,100]"+ "'", str8.equals("[6,100]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 6+ "'", i10.equals(6));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 6+ "'", i13.equals(6));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test265"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getSize();
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex(6);
    int i11 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex(3);
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    java.lang.Integer i16 = nodeCachingLinkedList0.removeIndex((int)'a');
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i18 = nodeCachingLinkedList0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i16);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test266"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex(1);
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex(100);
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    java.lang.String str12 = nodeCachingLinkedList0.toString();
    int i13 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test267"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    int i8 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex(0);
    int i11 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex((int)' ');
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    int i15 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[-1]"+ "'", str7.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + (-1)+ "'", i10.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test268"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    java.lang.Integer i9 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i12 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i14 = nodeCachingLinkedList0.removeIndex(3);
    java.lang.String str15 = nodeCachingLinkedList0.toString();
    java.lang.String str16 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i20 = nodeCachingLinkedList0.get(7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 20+ "'", i9.equals(20));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[1,20,10]"+ "'", str15.equals("[1,20,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[1,20,10]"+ "'", str16.equals("[1,20,10]"));

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test269"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    int i8 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex(0);
    int i11 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex((int)' ');
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    int i15 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i17 = nodeCachingLinkedList0.removeIndex(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[-1]"+ "'", str7.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + (-1)+ "'", i10.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i17);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test270"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test271"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    int i10 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str13 = nodeCachingLinkedList0.toString();
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[0]"+ "'", str13.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[0]"+ "'", str14.equals("[0]"));

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test272"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    int i5 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 0+ "'", i11.equals(0));

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test273"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    java.lang.Integer i15 = nodeCachingLinkedList0.get(0);
    int i16 = nodeCachingLinkedList0.getCacheSize();
    int i17 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i19 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str20 = nodeCachingLinkedList0.toString();
    java.lang.Integer i22 = nodeCachingLinkedList0.removeIndex((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-1)+ "'", i19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[0,0,20,10]"+ "'", str20.equals("[0,0,20,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i22);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test274"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    int i8 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    int i12 = nodeCachingLinkedList0.getSize();
    int i13 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[20]"+ "'", str7.equals("[20]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[10,20]"+ "'", str11.equals("[10,20]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test275"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    int i4 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex(0);
    int i9 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    int i11 = nodeCachingLinkedList0.getSize();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i13 = nodeCachingLinkedList0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 0+ "'", i8.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test276"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i7 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 1+ "'", i7.equals(1));

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test277"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)5);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[5]"+ "'", str10.equals("[5]"));

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test278"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    nodeCachingLinkedList0.addFirst((java.lang.Integer)3);
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex((int)(short)100);
    int i14 = nodeCachingLinkedList0.getSize();
    java.lang.String str15 = nodeCachingLinkedList0.toString();
    java.lang.Integer i17 = nodeCachingLinkedList0.removeIndex((int)(byte)-1);
    java.lang.String str18 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[3,-1]"+ "'", str15.equals("[3,-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[3,-1]"+ "'", str18.equals("[3,-1]"));

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test279"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i6 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i14 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str15 = nodeCachingLinkedList0.toString();
    int i16 = nodeCachingLinkedList0.getCacheSize();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i18 = nodeCachingLinkedList0.get((int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1+ "'", i12.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 0+ "'", i14.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[1,10]"+ "'", str15.equals("[1,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test280"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex(10);
    int i16 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i20 = nodeCachingLinkedList0.removeIndex(0);
    int i21 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 0+ "'", i6.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0]"+ "'", str7.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 0+ "'", i9.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 0+ "'", i20.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test281"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    int i10 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex((int)'#');
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    java.lang.String str16 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[-1]"+ "'", str16.equals("[-1]"));

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test282"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i3 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str4 = nodeCachingLinkedList0.toString();
    int i5 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[0]"+ "'", str4.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0]"+ "'", str6.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test283"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((-1));
    int i8 = nodeCachingLinkedList0.getSize();
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str13 = nodeCachingLinkedList0.toString();
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[10]"+ "'", str9.equals("[10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[10]"+ "'", str10.equals("[10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[0,10]"+ "'", str13.equals("[0,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[0,10]"+ "'", str14.equals("[0,10]"));

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test284"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)4);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    int i11 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i16 = nodeCachingLinkedList0.getCacheSize();
    int i17 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str18 = nodeCachingLinkedList0.toString();
    int i19 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[-1]"+ "'", str7.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[4,-1]"+ "'", str10.equals("[4,-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 4+ "'", i13.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[0,-1]"+ "'", str18.equals("[0,-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test285"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i3 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str4 = nodeCachingLinkedList0.toString();
    int i5 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((int)(short)10);
    int i8 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[0]"+ "'", str4.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test286"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex((int)(byte)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i11 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)7);
    int i14 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test287"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getSize();
    int i8 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex(0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i12 = nodeCachingLinkedList0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test288"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    java.lang.Integer i9 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i12 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i14 = nodeCachingLinkedList0.removeIndex(3);
    java.lang.String str15 = nodeCachingLinkedList0.toString();
    java.lang.String str16 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i20 = nodeCachingLinkedList0.removeIndex(20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 20+ "'", i9.equals(20));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[1,20,10]"+ "'", str15.equals("[1,20,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[1,20,10]"+ "'", str16.equals("[1,20,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i20);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test289"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getSize();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    int i11 = nodeCachingLinkedList0.getSize();
    int i12 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i14 = nodeCachingLinkedList0.removeIndex(0);
    int i15 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test290"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    int i6 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)3);
    int i9 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test291"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getSize();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex(0);
    int i13 = nodeCachingLinkedList0.getSize();
    int i14 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test292"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i6 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i10 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i14 = nodeCachingLinkedList0.get(0);
    int i15 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 0+ "'", i10.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 0+ "'", i14.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test293"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i4 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)2);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex((int)(short)100);
    java.lang.String str13 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[0,2,0,1]"+ "'", str13.equals("[0,2,0,1]"));

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test294"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    int i10 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str13 = nodeCachingLinkedList0.toString();
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    int i15 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[0]"+ "'", str13.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[0]"+ "'", str14.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test295"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i6 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i11 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex(1);
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex(0);
    int i16 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i18 = nodeCachingLinkedList0.removeIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 0+ "'", i15.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 1+ "'", i18.equals(1));

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test296"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)6);
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i13 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    int i16 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 6+ "'", i9.equals(6));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test297"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.Integer i3 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i4 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i7 = nodeCachingLinkedList0.getSize();
    int i8 = nodeCachingLinkedList0.getCacheSize();
    int i9 = nodeCachingLinkedList0.getSize();
    int i10 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test298"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    int i1 = nodeCachingLinkedList0.getSize();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(short)-1);
    int i5 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test299"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)6);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i13 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 20+ "'", i8.equals(20));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 2);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test300"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    int i8 = nodeCachingLinkedList0.getSize();
    int i9 = nodeCachingLinkedList0.getSize();
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test301"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i6 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i13 = nodeCachingLinkedList0.getSize();
    int i14 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i16 = nodeCachingLinkedList0.removeIndex((int)(short)1);
    java.lang.String str17 = nodeCachingLinkedList0.toString();
    java.lang.Integer i19 = nodeCachingLinkedList0.get(0);
    java.lang.String str20 = nodeCachingLinkedList0.toString();
    java.lang.String str21 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 1+ "'", i16.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[0,0,1,10]"+ "'", str17.equals("[0,0,1,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 0+ "'", i19.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[0,0,1,10]"+ "'", str20.equals("[0,0,1,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[0,0,1,10]"+ "'", str21.equals("[0,0,1,10]"));

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test302"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex(6);
    int i8 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[1,10]"+ "'", str9.equals("[1,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 1+ "'", i11.equals(1));

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test303"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex((int)(byte)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    int i9 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)3);
    java.lang.String str12 = nodeCachingLinkedList0.toString();
    java.lang.String str13 = nodeCachingLinkedList0.toString();
    int i14 = nodeCachingLinkedList0.getCacheSize();
    int i15 = nodeCachingLinkedList0.getSize();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i17 = nodeCachingLinkedList0.get(20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[3,-1]"+ "'", str12.equals("[3,-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[3,-1]"+ "'", str13.equals("[3,-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test304"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)'4');
    int i6 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i8 = nodeCachingLinkedList0.get(0);
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10+ "'", i8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[10]"+ "'", str9.equals("[10]"));

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test305"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.String str4 = nodeCachingLinkedList0.toString();
    int i5 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex(2);
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test306"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    int i3 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test307"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex(10);
    int i16 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    java.lang.Integer i20 = nodeCachingLinkedList0.removeIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 0+ "'", i6.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0]"+ "'", str7.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 0+ "'", i9.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 100+ "'", i20.equals(100));

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test308"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i3 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str4 = nodeCachingLinkedList0.toString();
    int i5 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[0]"+ "'", str4.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0]"+ "'", str6.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test309"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i12 = nodeCachingLinkedList0.getCacheSize();
    int i13 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i15 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    java.lang.String str18 = nodeCachingLinkedList0.toString();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i20 = nodeCachingLinkedList0.get((int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 0+ "'", i15.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[-1,0,0,20,10]"+ "'", str18.equals("[-1,0,0,20,10]"));

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test310"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i3 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)4);
    int i8 = nodeCachingLinkedList0.getSize();
    int i9 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex(4);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i17 = nodeCachingLinkedList0.get((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 0+ "'", i5.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 0+ "'", i17.equals(0));

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test311"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i6 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i11 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex(1);
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i17 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 0+ "'", i15.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 1+ "'", i17.equals(1));

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test312"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    java.lang.Integer i9 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i13 = nodeCachingLinkedList0.get(0);
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    int i15 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 20+ "'", i9.equals(20));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 1+ "'", i13.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[1,20,10]"+ "'", str14.equals("[1,20,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test313"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    int i3 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)4);
    int i6 = nodeCachingLinkedList0.getCacheSize();
    int i7 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test314"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i5 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((int)(short)-1);
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i12 = nodeCachingLinkedList0.get(5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0,0]"+ "'", str8.equals("[0,0]"));

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test315"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)4);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    int i11 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i13 = nodeCachingLinkedList0.get(0);
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    java.lang.Integer i16 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i18 = nodeCachingLinkedList0.removeIndex(10);
    int i19 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[-1]"+ "'", str7.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[4,-1]"+ "'", str10.equals("[4,-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 4+ "'", i13.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[4,-1]"+ "'", str14.equals("[4,-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 4+ "'", i16.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test316"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    java.lang.Integer i9 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i12 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i14 = nodeCachingLinkedList0.removeIndex(3);
    java.lang.String str15 = nodeCachingLinkedList0.toString();
    int i16 = nodeCachingLinkedList0.getSize();
    java.lang.String str17 = nodeCachingLinkedList0.toString();
    java.lang.String str18 = nodeCachingLinkedList0.toString();
    int i19 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i21 = nodeCachingLinkedList0.removeIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 20+ "'", i9.equals(20));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[1,20,10]"+ "'", str15.equals("[1,20,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[1,20,10]"+ "'", str17.equals("[1,20,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[1,20,10]"+ "'", str18.equals("[1,20,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + 1+ "'", i21.equals(1));

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test317"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    int i8 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex(0);
    int i11 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex((int)' ');
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    java.lang.String str15 = nodeCachingLinkedList0.toString();
    java.lang.Integer i17 = nodeCachingLinkedList0.removeIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[-1]"+ "'", str7.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + (-1)+ "'", i10.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]"+ "'", str15.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i17);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test318"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)6);
    int i8 = nodeCachingLinkedList0.getSize();
    int i9 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test319"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i16 = nodeCachingLinkedList0.getSize();
    java.lang.String str17 = nodeCachingLinkedList0.toString();
    int i18 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str19 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i22 = nodeCachingLinkedList0.getCacheSize();
    int i23 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i25 = nodeCachingLinkedList0.get(4);
    int i26 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[0,0,0,0,20,10]"+ "'", str17.equals("[0,0,0,0,20,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[0,0,0,0,20,10]"+ "'", str19.equals("[0,0,0,0,20,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + 0+ "'", i25.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 7);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test320"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i3 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex(100);
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex(4);
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex((int)' ');
    int i13 = nodeCachingLinkedList0.getSize();
    int i14 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 0+ "'", i5.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test321"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)'#');
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((int)'#');
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    int i10 = nodeCachingLinkedList0.getCacheSize();
    int i11 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex(2);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)3);
    java.lang.Integer i17 = nodeCachingLinkedList0.get(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 3+ "'", i17.equals(3));

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5.test322"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i3 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str4 = nodeCachingLinkedList0.toString();
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    int i6 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex(0);
    int i9 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[0]"+ "'", str4.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[0]"+ "'", str5.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 0+ "'", i8.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

}
