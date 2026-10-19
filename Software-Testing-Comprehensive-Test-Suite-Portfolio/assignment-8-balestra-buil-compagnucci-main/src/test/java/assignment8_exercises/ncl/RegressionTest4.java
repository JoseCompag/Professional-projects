package assignment8_exercises.ncl;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test001"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    java.lang.Integer i9 = nodeCachingLinkedList0.get(0);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    int i11 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 20+ "'", i9.equals(20));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[20,10]"+ "'", str10.equals("[20,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 2);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test002"); }

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
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    
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

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test003"); }

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
    java.lang.Integer i17 = nodeCachingLinkedList0.removeIndex(4);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    
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
    org.junit.Assert.assertNull(i17);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test004"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.String str3 = nodeCachingLinkedList0.toString();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)2);
    java.lang.Integer i9 = nodeCachingLinkedList0.get(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 2+ "'", i9.equals(2));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test005"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    int i4 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    int i6 = nodeCachingLinkedList0.getCacheSize();
    int i7 = nodeCachingLinkedList0.getCacheSize();
    int i8 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)3);
    
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
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test006"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    int i4 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex(0);
    int i9 = nodeCachingLinkedList0.getCacheSize();
    int i10 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex(0);
    
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
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 20+ "'", i15.equals(20));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test007"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.String str4 = nodeCachingLinkedList0.toString();
    int i5 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex(0);
    
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
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0]"+ "'", str9.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 0+ "'", i11.equals(0));

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test008"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex((int)(byte)1);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex((int)(byte)1);
    
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

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test009"); }

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
    java.lang.Integer i18 = nodeCachingLinkedList0.get(0);
    
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
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 1+ "'", i18.equals(1));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test010"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.Integer i3 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i4 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i7 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex(0);
    int i12 = nodeCachingLinkedList0.getSize();
    int i13 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 0+ "'", i11.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test011"); }

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
    java.lang.Integer i17 = nodeCachingLinkedList0.removeIndex(1);
    
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
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 100+ "'", i17.equals(100));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test012"); }

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
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    java.lang.Integer i18 = nodeCachingLinkedList0.removeIndex(0);
    
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
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + (-1)+ "'", i18.equals((-1)));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test013"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    int i1 = nodeCachingLinkedList0.getSize();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(short)-1);
    int i5 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)6);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    int i11 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i14 = nodeCachingLinkedList0.getCacheSize();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i16 = nodeCachingLinkedList0.get(4);
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
    org.junit.Assert.assertTrue(i11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test014"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.String str4 = nodeCachingLinkedList0.toString();
    int i5 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i9 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    java.lang.String str12 = nodeCachingLinkedList0.toString();
    
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
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[-1,0]"+ "'", str12.equals("[-1,0]"));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test015"); }

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
    int i14 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i16 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i18 = nodeCachingLinkedList0.removeIndex(0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i20 = nodeCachingLinkedList0.get(20);
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
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 0+ "'", i16.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i18);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test016"); }

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
    org.junit.Assert.assertNull(i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test017"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    int i1 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)6);
    int i7 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i9 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    java.lang.Integer i15 = nodeCachingLinkedList0.get(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 6+ "'", i9.equals(6));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 100+ "'", i15.equals(100));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test018"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    int i8 = nodeCachingLinkedList0.getSize();
    int i9 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i13 = nodeCachingLinkedList0.get(0);
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
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test019"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getSize();
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex(6);
    int i11 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)4);
    
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

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test020"); }

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
    java.lang.String str21 = nodeCachingLinkedList0.toString();
    int i22 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i24 = nodeCachingLinkedList0.removeIndex((int)(byte)-1);
    
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
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[0,0]"+ "'", str21.equals("[0,0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i24);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test021"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.Integer i3 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i4 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i7 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i10 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i12 = nodeCachingLinkedList0.get(0);
    int i13 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i15 = nodeCachingLinkedList0.get(0);
    java.lang.Integer i17 = nodeCachingLinkedList0.get(0);
    java.lang.String str18 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 0+ "'", i15.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 0+ "'", i17.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[0,0]"+ "'", str18.equals("[0,0]"));

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test022"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i13 = nodeCachingLinkedList0.get((int)(short)10);
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
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test023"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.String str4 = nodeCachingLinkedList0.toString();
    int i5 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i9 = nodeCachingLinkedList0.get(0);
    java.lang.Integer i11 = nodeCachingLinkedList0.get(0);
    java.lang.String str12 = nodeCachingLinkedList0.toString();
    
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
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 1+ "'", i9.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 1+ "'", i11.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[1]"+ "'", str12.equals("[1]"));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test024"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    int i1 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)6);
    int i7 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i9 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i12 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 6+ "'", i9.equals(6));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test025"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    int i10 = nodeCachingLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test026"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i4 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i7 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    int i11 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str12 = nodeCachingLinkedList0.toString();
    java.lang.Integer i14 = nodeCachingLinkedList0.get(0);
    int i15 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 0+ "'", i9.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[1]"+ "'", str10.equals("[1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[1]"+ "'", str12.equals("[1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 1+ "'", i14.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test027"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i7 = nodeCachingLinkedList0.get(0);
    int i8 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex((int)'4');
    int i11 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i15 = nodeCachingLinkedList0.get(3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 1+ "'", i7.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test028"); }

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
    int i16 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str17 = nodeCachingLinkedList0.toString();
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
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[0,10]"+ "'", str13.equals("[0,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 0+ "'", i15.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[0,10]"+ "'", str17.equals("[0,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test029"); }

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
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 1+ "'", i14.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test030"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getCacheSize();
    
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
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test031"); }

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
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i19 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str20 = nodeCachingLinkedList0.toString();
    
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
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[1,0]"+ "'", str20.equals("[1,0]"));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test032"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)6);
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    int i9 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[6]"+ "'", str8.equals("[6]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test033"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex((int)(byte)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    int i9 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    int i11 = nodeCachingLinkedList0.getCacheSize();
    int i12 = nodeCachingLinkedList0.getCacheSize();
    int i13 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
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
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test034"); }

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
    java.lang.Integer i18 = nodeCachingLinkedList0.removeIndex(0);
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
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + (-1)+ "'", i18.equals((-1)));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test035"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i3 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getSize();
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    int i9 = nodeCachingLinkedList0.getCacheSize();
    int i10 = nodeCachingLinkedList0.getCacheSize();
    int i11 = nodeCachingLinkedList0.getSize();
    int i12 = nodeCachingLinkedList0.getCacheSize();
    int i13 = nodeCachingLinkedList0.getCacheSize();
    
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
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test036"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex(0);
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
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test037"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    int i5 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((int)'4');
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i12 = nodeCachingLinkedList0.getSize();
    java.lang.String str13 = nodeCachingLinkedList0.toString();
    int i14 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i16 = nodeCachingLinkedList0.removeIndex((int)(short)1);
    int i17 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[0,1]"+ "'", str13.equals("[0,1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 1+ "'", i16.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test038"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getSize();
    int i8 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i12 = nodeCachingLinkedList0.get(0);
    
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
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test039"); }

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
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i15 = nodeCachingLinkedList0.get((int)(short)0);
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

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test040"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getSize();
    int i8 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)5);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i14 = nodeCachingLinkedList0.get(0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i16 = nodeCachingLinkedList0.get(2);
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
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 0+ "'", i14.equals(0));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test041"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    int i1 = nodeCachingLinkedList0.getSize();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(short)-1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0]"+ "'", str7.equals("[0]"));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test042"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(6);
    int i10 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex(1);
    int i13 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex(7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[-1]"+ "'", str7.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i15);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test043"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    int i8 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex((-1));
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex(3);
    
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
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i12);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test044"); }

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
    int i17 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i19 = nodeCachingLinkedList0.get(0);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 0+ "'", i19.equals(0));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test045"); }

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
    java.lang.Integer i18 = nodeCachingLinkedList0.removeIndex(0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i20 = nodeCachingLinkedList0.get((int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + (-1)+ "'", i18.equals((-1)));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test046"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    java.lang.Integer i9 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i12 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i15 = nodeCachingLinkedList0.getCacheSize();
    int i16 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str17 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 20+ "'", i9.equals(20));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[0,1,20,10]"+ "'", str17.equals("[0,1,20,10]"));

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test047"); }

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
    java.lang.Integer i18 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i20 = nodeCachingLinkedList0.get(5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[0,20,0,20,10]"+ "'", str14.equals("[0,20,0,20,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 20+ "'", i16.equals(20));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 0+ "'", i18.equals(0));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test048"); }

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
    java.lang.String str15 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i18 = nodeCachingLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]"+ "'", str15.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test049"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    
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

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test050"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getCacheSize();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i9 = nodeCachingLinkedList0.get(1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test051"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.Integer i3 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(byte)-1);
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test052"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((int)(short)1);
    int i8 = nodeCachingLinkedList0.getCacheSize();
    int i9 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str12 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)3);
    
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
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[0]"+ "'", str12.equals("[0]"));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test053"); }

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
    java.lang.String str18 = nodeCachingLinkedList0.toString();
    int i19 = nodeCachingLinkedList0.getCacheSize();
    int i20 = nodeCachingLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[-1,0,0,20,10]"+ "'", str18.equals("[-1,0,0,20,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 5);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test054"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i10 = nodeCachingLinkedList0.get((int)(byte)0);
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex((int)'4');
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex(0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i17 = nodeCachingLinkedList0.get((int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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
    org.junit.Assert.assertNull(i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 0+ "'", i15.equals(0));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test055"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.Integer i3 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i4 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i7 = nodeCachingLinkedList0.getSize();
    int i8 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex(0);
    int i11 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    
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
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 0+ "'", i10.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test056"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)5);
    int i10 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex((int)'4');
    java.lang.Integer i14 = nodeCachingLinkedList0.get(0);
    
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
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 5+ "'", i14.equals(5));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test057"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.String str4 = nodeCachingLinkedList0.toString();
    int i5 = nodeCachingLinkedList0.getSize();
    int i6 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[10]"+ "'", str4.equals("[10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test058"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.Integer i3 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i4 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex(0);
    int i7 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)6);
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i16 = nodeCachingLinkedList0.get((int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 6+ "'", i13.equals(6));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test059"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getSize();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i10 = nodeCachingLinkedList0.getCacheSize();
    int i11 = nodeCachingLinkedList0.getSize();
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
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test060"); }

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
    int i18 = nodeCachingLinkedList0.getSize();
    int i19 = nodeCachingLinkedList0.getSize();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i21 = nodeCachingLinkedList0.get((int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 6);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test061"); }

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
    java.lang.Integer i16 = nodeCachingLinkedList0.removeIndex(3);
    
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
    org.junit.Assert.assertNull(i16);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test062"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex((int)' ');
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)7);
    
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
    org.junit.Assert.assertNull(i11);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test063"); }

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
    int i17 = nodeCachingLinkedList0.getSize();
    java.lang.String str18 = nodeCachingLinkedList0.toString();
    
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
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[100]"+ "'", str18.equals("[100]"));

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test064"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex((int)(byte)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex(1);
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)6);
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[100]"+ "'", str11.equals("[100]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[6,100]"+ "'", str14.equals("[6,100]"));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test065"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex(6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test066"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.Integer i3 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i4 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex(0);
    int i7 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    int i10 = nodeCachingLinkedList0.getSize();
    int i11 = nodeCachingLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test067"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    java.lang.Integer i9 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i12 = nodeCachingLinkedList0.getSize();
    int i13 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex(0);
    int i16 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i19 = nodeCachingLinkedList0.getSize();
    java.lang.String str20 = nodeCachingLinkedList0.toString();
    
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
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 1+ "'", i15.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[0,20,10]"+ "'", str20.equals("[0,20,10]"));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test068"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    java.lang.Integer i9 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i12 = nodeCachingLinkedList0.getSize();
    int i13 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex(0);
    int i16 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i19 = nodeCachingLinkedList0.getSize();
    int i20 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str21 = nodeCachingLinkedList0.toString();
    java.lang.String str22 = nodeCachingLinkedList0.toString();
    java.lang.Integer i24 = nodeCachingLinkedList0.removeIndex(5);
    
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
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 1+ "'", i15.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[0,20,10]"+ "'", str21.equals("[0,20,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[0,20,10]"+ "'", str22.equals("[0,20,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i24);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test069"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    java.lang.Integer i7 = nodeCachingLinkedList0.get(0);
    int i8 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 100+ "'", i7.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 100+ "'", i10.equals(100));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test070"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    int i4 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex((int)(short)-1);
    int i12 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i14 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.String str17 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0]"+ "'", str7.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 0+ "'", i9.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[1]"+ "'", str17.equals("[1]"));

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test071"); }

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
    int i14 = nodeCachingLinkedList0.getCacheSize();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test072"); }

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
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i16 = nodeCachingLinkedList0.get(1);
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
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[0]"+ "'", str14.equals("[0]"));

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test073"); }

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
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[0]"+ "'", str14.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[0]"+ "'", str15.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test074"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 1+ "'", i7.equals(1));

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test075"); }

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
    java.lang.Integer i24 = nodeCachingLinkedList0.removeIndex(0);
    int i25 = nodeCachingLinkedList0.getSize();
    java.lang.String str26 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    java.lang.Integer i30 = nodeCachingLinkedList0.removeIndex(0);
    
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
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 1+ "'", i24.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[0,0,0,0,20,10]"+ "'", str26.equals("[0,0,0,0,20,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i30 + "' != '" + 100+ "'", i30.equals(100));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test076"); }

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
    java.lang.Integer i16 = nodeCachingLinkedList0.removeIndex((-1));
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i16);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test077"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((int)(short)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex((int)(short)1);
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex(2);
    int i14 = nodeCachingLinkedList0.getSize();
    
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
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test078"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)2);
    int i16 = nodeCachingLinkedList0.getSize();
    int i17 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i19 = nodeCachingLinkedList0.get(4);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    int i22 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i24 = nodeCachingLinkedList0.get(6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 20+ "'", i19.equals(20));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 10+ "'", i24.equals(10));

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test079"); }

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
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test080"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.Integer i3 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i4 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)4);
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i13 = nodeCachingLinkedList0.getSize();
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 4+ "'", i10.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[0]"+ "'", str14.equals("[0]"));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test081"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex((int)'a');
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    java.lang.String str12 = nodeCachingLinkedList0.toString();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i14 = nodeCachingLinkedList0.get(2);
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
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[20]"+ "'", str12.equals("[20]"));

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test082"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    int i4 = nodeCachingLinkedList0.getCacheSize();
    int i5 = nodeCachingLinkedList0.getSize();
    int i6 = nodeCachingLinkedList0.getCacheSize();
    int i7 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i12 = nodeCachingLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test083"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i9 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex((int)' ');
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i15 = nodeCachingLinkedList0.get(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 0+ "'", i15.equals(0));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test084"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getSize();
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i14 = nodeCachingLinkedList0.removeIndex(4);
    
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
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i14);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test085"); }

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
    java.lang.Integer i16 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    java.lang.Integer i18 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i18);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test086"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i5 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((int)(short)-1);
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    java.lang.Integer i10 = nodeCachingLinkedList0.get(0);
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex((-1));
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i14 = nodeCachingLinkedList0.get((int)(short)10);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 0+ "'", i10.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i12);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test087"); }

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
    nodeCachingLinkedList0.addFirst((java.lang.Integer)4);
    java.lang.String str22 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)3);
    
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
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[4,-1,0,0,20,10]"+ "'", str22.equals("[4,-1,0,0,20,10]"));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test088"); }

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
    int i17 = nodeCachingLinkedList0.getSize();
    java.lang.String str18 = nodeCachingLinkedList0.toString();
    java.lang.Integer i20 = nodeCachingLinkedList0.get(0);
    
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
    org.junit.Assert.assertTrue(i17 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[10,20]"+ "'", str18.equals("[10,20]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 10+ "'", i20.equals(10));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test089"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i3 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex(100);
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex(4);
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex((int)' ');
    int i13 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i16 = nodeCachingLinkedList0.getSize();
    int i17 = nodeCachingLinkedList0.getCacheSize();
    
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
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test090"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.String str4 = nodeCachingLinkedList0.toString();
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test091"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[10]"+ "'", str6.equals("[10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[0,0,10]"+ "'", str11.equals("[0,0,10]"));

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test092"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    int i6 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[0,0]"+ "'", str5.equals("[0,0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test093"); }

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
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test094"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i6 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i11 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str12 = nodeCachingLinkedList0.toString();
    int i13 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex(4);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i19 = nodeCachingLinkedList0.get(3);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)3);
    int i22 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[0,0,1,10]"+ "'", str12.equals("[0,0,1,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 1+ "'", i19.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test095"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    java.lang.Integer i9 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i12 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i14 = nodeCachingLinkedList0.removeIndex(3);
    java.lang.Integer i16 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i18 = nodeCachingLinkedList0.get(0);
    int i19 = nodeCachingLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 1+ "'", i16.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 20+ "'", i18.equals(20));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 2);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test096"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    int i1 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i6 = nodeCachingLinkedList0.get(0);
    int i7 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i9 = nodeCachingLinkedList0.get(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 0+ "'", i6.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 0+ "'", i9.equals(0));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test097"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.Integer i9 = nodeCachingLinkedList0.get(0);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    int i11 = nodeCachingLinkedList0.getSize();
    int i12 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 0+ "'", i6.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0]"+ "'", str7.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 0+ "'", i9.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[0]"+ "'", str10.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test098"); }

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
    int i15 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i17 = nodeCachingLinkedList0.get(1);
    
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
    org.junit.Assert.assertTrue(i15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 10+ "'", i17.equals(10));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test099"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    int i12 = nodeCachingLinkedList0.getSize();
    int i13 = nodeCachingLinkedList0.getSize();
    int i14 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    java.lang.Integer i18 = nodeCachingLinkedList0.get(4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 10+ "'", i18.equals(10));

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test100"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    int i8 = nodeCachingLinkedList0.getCacheSize();
    int i9 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    int i12 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test101"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex((int)'a');
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i13 = nodeCachingLinkedList0.get((int)(short)10);
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

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test102"); }

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
    int i14 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i16 = nodeCachingLinkedList0.removeIndex(4);
    
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
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i16);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test103"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i12 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i14 = nodeCachingLinkedList0.removeIndex(5);
    int i15 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 4);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test104"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i4 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i7 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i9 = nodeCachingLinkedList0.get(0);
    int i10 = nodeCachingLinkedList0.getSize();
    int i11 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    int i14 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 0+ "'", i9.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test105"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    int i4 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex(0);
    int i9 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex(0);
    int i12 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str13 = nodeCachingLinkedList0.toString();
    int i14 = nodeCachingLinkedList0.getCacheSize();
    
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
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test106"); }

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
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test107"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    int i11 = nodeCachingLinkedList0.getCacheSize();
    int i12 = nodeCachingLinkedList0.getCacheSize();
    int i13 = nodeCachingLinkedList0.getSize();
    int i14 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i16 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    
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
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 0+ "'", i16.equals(0));

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test108"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    java.lang.Integer i13 = nodeCachingLinkedList0.get(0);
    int i14 = nodeCachingLinkedList0.getSize();
    int i15 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 20+ "'", i13.equals(20));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 4);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test109"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i3 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str4 = nodeCachingLinkedList0.toString();
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    int i6 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex(6);
    java.lang.Integer i10 = nodeCachingLinkedList0.get(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[0]"+ "'", str4.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[0]"+ "'", str5.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 0+ "'", i10.equals(0));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test110"); }

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
    java.lang.Integer i20 = nodeCachingLinkedList0.get(0);
    
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
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 0+ "'", i20.equals(0));

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test111"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex((int)(byte)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    int i9 = nodeCachingLinkedList0.getCacheSize();
    int i10 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)4);
    int i13 = nodeCachingLinkedList0.getCacheSize();
    int i14 = nodeCachingLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test112"); }

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
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 100+ "'", i11.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[100]"+ "'", str12.equals("[100]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test113"); }

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
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    
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

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test114"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i3 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex(100);
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex(4);
    int i11 = nodeCachingLinkedList0.getSize();
    int i12 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i14 = nodeCachingLinkedList0.removeIndex((int)(byte)-1);
    java.lang.String str15 = nodeCachingLinkedList0.toString();
    
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
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]"+ "'", str15.equals("[]"));

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test115"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    int i1 = nodeCachingLinkedList0.getSize();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(short)-1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i7 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i10 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test116"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i7 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    int i9 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i11 = nodeCachingLinkedList0.get((int)(byte)0);
    int i12 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str13 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[1]"+ "'", str8.equals("[1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 1+ "'", i11.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[1]"+ "'", str13.equals("[1]"));

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test117"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    java.lang.Integer i8 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)6);
    int i11 = nodeCachingLinkedList0.getSize();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i13 = nodeCachingLinkedList0.get((int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[10]"+ "'", str6.equals("[10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10+ "'", i8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 2);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test118"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.String str4 = nodeCachingLinkedList0.toString();
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    int i6 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test119"); }

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
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex(6);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i15);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test120"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex(0);
    int i16 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)6);
    int i19 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 0+ "'", i6.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0]"+ "'", str7.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 0+ "'", i9.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 0+ "'", i15.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test121"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i5 = nodeCachingLinkedList0.getSize();
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex(0);
    int i9 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i11 = nodeCachingLinkedList0.get(0);
    java.lang.String str12 = nodeCachingLinkedList0.toString();
    int i13 = nodeCachingLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[0]"+ "'", str12.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test122"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    int i8 = nodeCachingLinkedList0.getSize();
    int i9 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex(0);
    int i12 = nodeCachingLinkedList0.getSize();
    int i13 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex(7);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str18 = nodeCachingLinkedList0.toString();
    
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
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[0]"+ "'", str18.equals("[0]"));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test123"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)2);
    int i13 = nodeCachingLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[0]"+ "'", str10.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 2);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test124"); }

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
    int i18 = nodeCachingLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue(i18 == 1);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test125"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i3 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str4 = nodeCachingLinkedList0.toString();
    int i5 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((int)(short)10);
    int i8 = nodeCachingLinkedList0.getSize();
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[0]"+ "'", str4.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0]"+ "'", str9.equals("[0]"));

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test126"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex((int)'a');
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    java.lang.String str12 = nodeCachingLinkedList0.toString();
    int i13 = nodeCachingLinkedList0.getCacheSize();
    
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
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[20]"+ "'", str12.equals("[20]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test127"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex((int)'a');
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    java.lang.String str12 = nodeCachingLinkedList0.toString();
    java.lang.String str13 = nodeCachingLinkedList0.toString();
    
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
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[20]"+ "'", str12.equals("[20]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[20]"+ "'", str13.equals("[20]"));

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test128"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    int i11 = nodeCachingLinkedList0.getCacheSize();
    int i12 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i14 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i16 = nodeCachingLinkedList0.removeIndex(0);
    
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
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 0+ "'", i14.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i16);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test129"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i7 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 1+ "'", i9.equals(1));

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test130"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    int i5 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex(0);
    int i8 = nodeCachingLinkedList0.getSize();
    int i9 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test131"); }

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
    java.lang.Integer i18 = nodeCachingLinkedList0.removeIndex(0);
    int i19 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i21 = nodeCachingLinkedList0.removeIndex(6);
    java.lang.Integer i23 = nodeCachingLinkedList0.removeIndex(10);
    
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
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 1+ "'", i18.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i23);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test132"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    java.lang.Integer i7 = nodeCachingLinkedList0.get(0);
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)3);
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    int i12 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 100+ "'", i7.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[100]"+ "'", str8.equals("[100]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[3,100]"+ "'", str11.equals("[3,100]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test133"); }

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
    java.lang.Integer i21 = nodeCachingLinkedList0.get(0);
    
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
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test134"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getSize();
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    int i9 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex(0);
    int i12 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test135"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    int i1 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 100+ "'", i5.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test136"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex((int)(byte)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    int i10 = nodeCachingLinkedList0.getCacheSize();
    int i11 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[-1]"+ "'", str9.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test137"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    int i11 = nodeCachingLinkedList0.getSize();
    java.lang.String str12 = nodeCachingLinkedList0.toString();
    java.lang.Integer i14 = nodeCachingLinkedList0.removeIndex(0);
    
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
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i14);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test138"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i7 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    int i9 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i11 = nodeCachingLinkedList0.get((int)(byte)0);
    int i12 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i14 = nodeCachingLinkedList0.get(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[1]"+ "'", str8.equals("[1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 1+ "'", i11.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 1+ "'", i14.equals(1));

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test139"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i3 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex(100);
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex(4);
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex((int)' ');
    int i13 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str18 = nodeCachingLinkedList0.toString();
    int i19 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    
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
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[0,0]"+ "'", str18.equals("[0,0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test140"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((-1));
    int i8 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[0,10]"+ "'", str11.equals("[0,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test141"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    java.lang.Integer i7 = nodeCachingLinkedList0.get(0);
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i14 = nodeCachingLinkedList0.get(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 100+ "'", i7.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[100]"+ "'", str8.equals("[100]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 100+ "'", i14.equals(100));

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test142"); }

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
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i19 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i21 = nodeCachingLinkedList0.removeIndex(4);
    
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
    org.junit.Assert.assertTrue(i19 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i21);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test143"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i7 = nodeCachingLinkedList0.get(0);
    int i8 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex((int)'4');
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    int i13 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 1+ "'", i7.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[10,1,10]"+ "'", str14.equals("[10,1,10]"));

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test144"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.Integer i3 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i4 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex(0);
    int i7 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    int i11 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex(0);
    int i14 = nodeCachingLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test145"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    int i1 = nodeCachingLinkedList0.getSize();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(short)-1);
    int i5 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)6);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex(0);
    int i13 = nodeCachingLinkedList0.getCacheSize();
    int i14 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i16 = nodeCachingLinkedList0.get(0);
    
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
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 1+ "'", i16.equals(1));

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test146"); }

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
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i20 = nodeCachingLinkedList0.get((int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test147"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    int i1 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)6);
    int i7 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i9 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 6+ "'", i9.equals(6));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[0,100,6,0]"+ "'", str14.equals("[0,100,6,0]"));

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test148"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    int i1 = nodeCachingLinkedList0.getSize();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(short)-1);
    int i5 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)6);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)6);
    java.lang.Integer i14 = nodeCachingLinkedList0.get(0);
    
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
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 6+ "'", i14.equals(6));

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test149"); }

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
    int i18 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i20 = nodeCachingLinkedList0.removeIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 100+ "'", i20.equals(100));

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test150"); }

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
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test151"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((-1));
    int i8 = nodeCachingLinkedList0.getSize();
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    int i12 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
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
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[10]"+ "'", str11.equals("[10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test152"); }

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
    java.lang.String str17 = nodeCachingLinkedList0.toString();
    
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
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[0,0,10]"+ "'", str17.equals("[0,0,10]"));

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test153"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    int i6 = nodeCachingLinkedList0.getCacheSize();
    int i7 = nodeCachingLinkedList0.getCacheSize();
    
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
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test154"); }

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
    nodeCachingLinkedList0.addFirst((java.lang.Integer)7);
    java.lang.Integer i20 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i23 = nodeCachingLinkedList0.getSize();
    int i24 = nodeCachingLinkedList0.getCacheSize();
    
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
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 7+ "'", i20.equals(7));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test155"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)'#');
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((int)'#');
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i13 = nodeCachingLinkedList0.get(2);
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
    org.junit.Assert.assertNull(i9);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test156"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    int i5 = nodeCachingLinkedList0.getCacheSize();
    int i6 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i9 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 0+ "'", i4.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test157"); }

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
    int i15 = nodeCachingLinkedList0.getCacheSize();
    int i16 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i20 = nodeCachingLinkedList0.get(0);
    
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
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 0+ "'", i20.equals(0));

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test158"); }

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
    java.lang.Integer i16 = nodeCachingLinkedList0.removeIndex(0);
    
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
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 0+ "'", i16.equals(0));

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test159"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((int)(short)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str12 = nodeCachingLinkedList0.toString();
    int i13 = nodeCachingLinkedList0.getSize();
    int i14 = nodeCachingLinkedList0.getCacheSize();
    
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
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 0+ "'", i11.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test160"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.Integer i3 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i4 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex(0);
    int i7 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
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
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test161"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    java.lang.Integer i7 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i11 = nodeCachingLinkedList0.get((int)(short)0);
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 100+ "'", i7.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 0+ "'", i11.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i15);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test162"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    
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
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0]"+ "'", str9.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[0]"+ "'", str10.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[0]"+ "'", str11.equals("[0]"));

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test163"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    int i12 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 0+ "'", i6.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0]"+ "'", str7.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 0+ "'", i9.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test164"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex((int)' ');
    java.lang.Integer i13 = nodeCachingLinkedList0.get((int)(short)0);
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    java.lang.Integer i16 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
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
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 10+ "'", i13.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[10]"+ "'", str14.equals("[10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 10+ "'", i16.equals(10));

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test165"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i4 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)2);
    int i9 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 2+ "'", i11.equals(2));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test166"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    java.lang.Integer i7 = nodeCachingLinkedList0.get(0);
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)3);
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 100+ "'", i7.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[100]"+ "'", str8.equals("[100]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[3,100]"+ "'", str11.equals("[3,100]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[0,3,100]"+ "'", str14.equals("[0,3,100]"));

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test167"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((-1));
    int i8 = nodeCachingLinkedList0.getSize();
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i14 = nodeCachingLinkedList0.removeIndex(10);
    
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
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 10+ "'", i12.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i14);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test168"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)'4');
    int i6 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i8 = nodeCachingLinkedList0.get(0);
    int i9 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)6);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    java.lang.String str15 = nodeCachingLinkedList0.toString();
    java.lang.String str16 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i20 = nodeCachingLinkedList0.removeIndex(0);
    
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
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[0,6,10]"+ "'", str14.equals("[0,6,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[0,6,10]"+ "'", str15.equals("[0,6,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[0,6,10]"+ "'", str16.equals("[0,6,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 10+ "'", i20.equals(10));

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test169"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.Integer i3 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i4 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex(0);
    int i7 = nodeCachingLinkedList0.getCacheSize();
    int i8 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex((int)(short)1);
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex(0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i15 = nodeCachingLinkedList0.get((int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i13);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test170"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    int i1 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i6 = nodeCachingLinkedList0.get(0);
    int i7 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 0+ "'", i6.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 0+ "'", i9.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test171"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i9 = nodeCachingLinkedList0.getCacheSize();
    int i10 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test172"); }

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
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    java.lang.String str15 = nodeCachingLinkedList0.toString();
    java.lang.String str16 = nodeCachingLinkedList0.toString();
    java.lang.String str17 = nodeCachingLinkedList0.toString();
    int i18 = nodeCachingLinkedList0.getSize();
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
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]"+ "'", str15.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]"+ "'", str17.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test173"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i3 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i10 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i13 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 0+ "'", i5.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 0+ "'", i10.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test174"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((-1));
    int i8 = nodeCachingLinkedList0.getSize();
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i14 = nodeCachingLinkedList0.get(0);
    int i15 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i17 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str18 = nodeCachingLinkedList0.toString();
    int i19 = nodeCachingLinkedList0.getSize();
    java.lang.String str20 = nodeCachingLinkedList0.toString();
    
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
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 0+ "'", i14.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 0+ "'", i17.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[10]"+ "'", str18.equals("[10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[10]"+ "'", str20.equals("[10]"));

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test175"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getSize();
    int i8 = nodeCachingLinkedList0.getSize();
    int i9 = nodeCachingLinkedList0.getCacheSize();
    
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
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test176"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)'4');
    int i6 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i8 = nodeCachingLinkedList0.get(0);
    int i9 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)6);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i14 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str15 = nodeCachingLinkedList0.toString();
    
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
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[1,6,10]"+ "'", str15.equals("[1,6,10]"));

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test177"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    int i7 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    java.lang.String str12 = nodeCachingLinkedList0.toString();
    int i13 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + (-1)+ "'", i9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[20]"+ "'", str12.equals("[20]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test178"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)3);
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[3]"+ "'", str8.equals("[3]"));

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test179"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex(0);
    int i8 = nodeCachingLinkedList0.getCacheSize();
    int i9 = nodeCachingLinkedList0.getSize();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodeCachingLinkedList0.get((int)(short)10);
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
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test180"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((-1));
    int i8 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i11 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex(4);
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
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[0,10]"+ "'", str14.equals("[0,10]"));

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test181"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    int i1 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)6);
    int i7 = nodeCachingLinkedList0.getSize();
    int i8 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i10 = nodeCachingLinkedList0.get(0);
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex((int)(short)100);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str15 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 6+ "'", i10.equals(6));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[0,6,0]"+ "'", str15.equals("[0,6,0]"));

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test182"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    int i8 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    int i10 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[20,10]"+ "'", str9.equals("[20,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test183"); }

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
    java.lang.Integer i19 = nodeCachingLinkedList0.get(0);
    java.lang.Integer i21 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i24 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i26 = nodeCachingLinkedList0.get(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-1)+ "'", i19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + (-1)+ "'", i21.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + 0+ "'", i26.equals(0));

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test184"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i6 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i13 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test185"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    int i1 = nodeCachingLinkedList0.getSize();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(short)-1);
    int i5 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)6);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)3);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[3,6]"+ "'", str10.equals("[3,6]"));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test186"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    int i1 = nodeCachingLinkedList0.getSize();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(short)-1);
    int i5 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[20,1]"+ "'", str10.equals("[20,1]"));

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test187"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i3 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str4 = nodeCachingLinkedList0.toString();
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((int)'#');
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    int i10 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[0]"+ "'", str4.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[0]"+ "'", str5.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 0+ "'", i9.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test188"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test189"); }

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
    int i14 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i16 = nodeCachingLinkedList0.removeIndex(0);
    
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
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i16);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test190"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    int i4 = nodeCachingLinkedList0.getCacheSize();
    int i5 = nodeCachingLinkedList0.getSize();
    int i6 = nodeCachingLinkedList0.getCacheSize();
    int i7 = nodeCachingLinkedList0.getSize();
    
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

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test191"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getSize();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex((int)' ');
    java.lang.Integer i13 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)2);
    int i16 = nodeCachingLinkedList0.getSize();
    int i17 = nodeCachingLinkedList0.getSize();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i19 = nodeCachingLinkedList0.get((-1));
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
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 2);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test192"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i4 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex(0);
    int i9 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 0+ "'", i8.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test193"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    int i8 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex(0);
    
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

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test194"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex((int)(byte)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)2);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)4);
    java.lang.Integer i16 = nodeCachingLinkedList0.get(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 0+ "'", i10.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 4+ "'", i16.equals(4));

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test195"); }

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
    int i16 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)3);
    java.lang.String str19 = nodeCachingLinkedList0.toString();
    
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
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[3]"+ "'", str19.equals("[3]"));

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test196"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i6 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i11 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i13 = nodeCachingLinkedList0.get(0);
    int i14 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i16 = nodeCachingLinkedList0.removeIndex((int)'4');
    java.lang.Integer i18 = nodeCachingLinkedList0.removeIndex((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i18);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test197"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    int i9 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i13 = nodeCachingLinkedList0.get(0);
    
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
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 1+ "'", i13.equals(1));

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test198"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i5 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 0+ "'", i7.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0]"+ "'", str8.equals("[0]"));

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test199"); }

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
    int i15 = nodeCachingLinkedList0.getCacheSize();
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
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test200"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    int i1 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)4);
    int i8 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 100+ "'", i5.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test201"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((-1));
    int i8 = nodeCachingLinkedList0.getSize();
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i14 = nodeCachingLinkedList0.get(0);
    int i15 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i17 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
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
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 0+ "'", i14.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 0+ "'", i17.equals(0));

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test202"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i7 = nodeCachingLinkedList0.get(0);
    int i8 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex((int)'4');
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    int i13 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str16 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 1+ "'", i7.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 10+ "'", i15.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[1,10]"+ "'", str16.equals("[1,10]"));

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test203"); }

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
    java.lang.String str17 = nodeCachingLinkedList0.toString();
    
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
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[0,10]"+ "'", str17.equals("[0,10]"));

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test204"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.Integer i3 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i4 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i7 = nodeCachingLinkedList0.getCacheSize();
    int i8 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
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

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test205"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex((int)'a');
    
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
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i15);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test206"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i3 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)4);
    int i8 = nodeCachingLinkedList0.getSize();
    int i9 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 0+ "'", i5.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[4]"+ "'", str10.equals("[4]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[4]"+ "'", str11.equals("[4]"));

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test207"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex((int)(byte)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    int i9 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i11 = nodeCachingLinkedList0.get((int)(byte)0);
    int i12 = nodeCachingLinkedList0.getCacheSize();
    int i13 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
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
    org.junit.Assert.assertTrue(i13 == 1);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test208"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i5 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((int)(short)-1);
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    java.lang.Integer i10 = nodeCachingLinkedList0.get(0);
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    int i12 = nodeCachingLinkedList0.getSize();
    int i13 = nodeCachingLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue(i12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 2);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test209"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.String str3 = nodeCachingLinkedList0.toString();
    int i4 = nodeCachingLinkedList0.getSize();
    int i5 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex(0);
    
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
    org.junit.Assert.assertNull(i7);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test210"); }

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
    java.lang.Integer i21 = nodeCachingLinkedList0.get(0);
    
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
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test211"); }

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
    java.lang.Integer i17 = nodeCachingLinkedList0.removeIndex((int)'#');
    
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
    org.junit.Assert.assertNull(i17);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test212"); }

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
    int i15 = nodeCachingLinkedList0.getCacheSize();
    int i16 = nodeCachingLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test213"); }

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
    java.lang.String str13 = nodeCachingLinkedList0.toString();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i15 = nodeCachingLinkedList0.get(6);
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
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test214"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getSize();
    int i8 = nodeCachingLinkedList0.getSize();
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    int i10 = nodeCachingLinkedList0.getCacheSize();
    int i11 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex(3);
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    
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
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test215"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getSize();
    int i8 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    int i12 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    
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
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test216"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    int i1 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    int i8 = nodeCachingLinkedList0.getSize();
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[0]"+ "'", str5.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0]"+ "'", str6.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0]"+ "'", str7.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0]"+ "'", str9.equals("[0]"));

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test217"); }

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
    int i13 = nodeCachingLinkedList0.getSize();
    int i14 = nodeCachingLinkedList0.getSize();
    int i15 = nodeCachingLinkedList0.getCacheSize();
    int i16 = nodeCachingLinkedList0.getCacheSize();
    int i17 = nodeCachingLinkedList0.getCacheSize();
    
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
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test218"); }

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
    java.lang.Integer i19 = nodeCachingLinkedList0.get(0);
    
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
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 0+ "'", i19.equals(0));

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test219"); }

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
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i15 = nodeCachingLinkedList0.getSize();
    java.lang.String str16 = nodeCachingLinkedList0.toString();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i18 = nodeCachingLinkedList0.get((int)(short)10);
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
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[0]"+ "'", str16.equals("[0]"));

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test220"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getSize();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str12 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
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
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test221"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[-1]"+ "'", str7.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[-1]"+ "'", str8.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test222"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(6);
    int i10 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex(0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i14 = nodeCachingLinkedList0.get((int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[-1]"+ "'", str7.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + (-1)+ "'", i12.equals((-1)));

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test223"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    int i5 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex((int)' ');
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex((int)(byte)-1);
    
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
    org.junit.Assert.assertNull(i12);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test224"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i5 = nodeCachingLinkedList0.getSize();
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex(0);
    int i9 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i11 = nodeCachingLinkedList0.get(0);
    java.lang.String str12 = nodeCachingLinkedList0.toString();
    java.lang.Integer i14 = nodeCachingLinkedList0.get(0);
    int i15 = nodeCachingLinkedList0.getCacheSize();
    
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
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[0]"+ "'", str12.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 0+ "'", i14.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test225"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i6 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i13 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i15 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
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
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test226"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    int i12 = nodeCachingLinkedList0.getSize();
    int i13 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i15 = nodeCachingLinkedList0.get(2);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i18 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    
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
    org.junit.Assert.assertTrue(i18 == 5);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test227"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    int i1 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    int i6 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i8 = nodeCachingLinkedList0.get(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[0]"+ "'", str5.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 0+ "'", i8.equals(0));

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test228"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i7 = nodeCachingLinkedList0.getCacheSize();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i9 = nodeCachingLinkedList0.get(7);
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
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test229"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    java.lang.String str12 = nodeCachingLinkedList0.toString();
    int i13 = nodeCachingLinkedList0.getCacheSize();
    
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
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test230"); }

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
    int i16 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i18 = nodeCachingLinkedList0.get(0);
    java.lang.String str19 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    
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
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 4+ "'", i18.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[4]"+ "'", str19.equals("[4]"));

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test231"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 0+ "'", i6.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0]"+ "'", str7.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 0+ "'", i9.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[0]"+ "'", str14.equals("[0]"));

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test232"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    int i8 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i10 = nodeCachingLinkedList0.get(0);
    int i11 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex(0);
    int i14 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i17 = nodeCachingLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 20+ "'", i13.equals(20));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test233"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i3 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex(5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 0+ "'", i5.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test234"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.String str4 = nodeCachingLinkedList0.toString();
    int i5 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((int)(short)-1);
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i12 = nodeCachingLinkedList0.get(0);
    
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
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test235"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    int i1 = nodeCachingLinkedList0.getSize();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(short)-1);
    int i5 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)6);
    int i8 = nodeCachingLinkedList0.getSize();
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[6]"+ "'", str9.equals("[6]"));

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test236"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i3 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex(100);
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex(4);
    int i11 = nodeCachingLinkedList0.getSize();
    int i12 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str13 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)7);
    java.lang.Integer i17 = nodeCachingLinkedList0.get(0);
    java.lang.Integer i19 = nodeCachingLinkedList0.get(0);
    
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
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 7+ "'", i17.equals(7));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 7+ "'", i19.equals(7));

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test237"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((int)(short)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str12 = nodeCachingLinkedList0.toString();
    int i13 = nodeCachingLinkedList0.getCacheSize();
    
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
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 0+ "'", i11.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test238"); }

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
    int i16 = nodeCachingLinkedList0.getCacheSize();
    int i17 = nodeCachingLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 2);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test239"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str13 = nodeCachingLinkedList0.toString();
    int i14 = nodeCachingLinkedList0.getSize();
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
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[0]"+ "'", str10.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[0,0]"+ "'", str13.equals("[0,0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test240"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i7 = nodeCachingLinkedList0.get(0);
    int i8 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex((int)'4');
    int i11 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 1+ "'", i7.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test241"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex(1);
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex(100);
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    int i12 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i14 = nodeCachingLinkedList0.removeIndex((int)(byte)100);
    
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
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i14);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test242"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)6);
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    java.lang.Integer i10 = nodeCachingLinkedList0.get(0);
    int i11 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex(0);
    
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
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 100+ "'", i15.equals(100));

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test243"); }

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
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i18 = nodeCachingLinkedList0.get(0);
    java.lang.Integer i20 = nodeCachingLinkedList0.removeIndex(0);
    
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
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 1+ "'", i18.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 1+ "'", i20.equals(1));

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test244"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    int i5 = nodeCachingLinkedList0.getCacheSize();
    int i6 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)4);
    java.lang.Integer i10 = nodeCachingLinkedList0.get(0);
    int i11 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 0+ "'", i4.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 4+ "'", i10.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test245"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    int i5 = nodeCachingLinkedList0.getCacheSize();
    int i6 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i11 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 0+ "'", i4.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test246"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.String str4 = nodeCachingLinkedList0.toString();
    int i5 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    
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
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 0+ "'", i9.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test247"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex((int)(byte)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    int i9 = nodeCachingLinkedList0.getSize();
    int i10 = nodeCachingLinkedList0.getSize();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i12 = nodeCachingLinkedList0.get(10);
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
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test248"); }

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
    int i15 = nodeCachingLinkedList0.getCacheSize();
    
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
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test249"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex((int)(byte)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex(0);
    int i11 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str12 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 100+ "'", i10.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test250"); }

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
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i23 = nodeCachingLinkedList0.get(0);
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

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test251"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getSize();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)5);
    java.lang.String str15 = nodeCachingLinkedList0.toString();
    int i16 = nodeCachingLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[5]"+ "'", str15.equals("[5]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test252"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.String str4 = nodeCachingLinkedList0.toString();
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex(0);
    int i7 = nodeCachingLinkedList0.getCacheSize();
    int i8 = nodeCachingLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test253"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i16 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i18 = nodeCachingLinkedList0.get(0);
    java.lang.String str19 = nodeCachingLinkedList0.toString();
    
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
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 0+ "'", i18.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[0]"+ "'", str19.equals("[0]"));

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test254"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i5 = nodeCachingLinkedList0.getSize();
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i10 = nodeCachingLinkedList0.get(0);
    int i11 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
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

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test255"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex((int)(byte)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    int i9 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i11 = nodeCachingLinkedList0.get(0);
    int i12 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i15 = nodeCachingLinkedList0.getCacheSize();
    
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
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test256"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i3 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex(100);
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex(4);
    int i11 = nodeCachingLinkedList0.getSize();
    int i12 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str13 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)7);
    java.lang.Integer i17 = nodeCachingLinkedList0.removeIndex((int)'a');
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str20 = nodeCachingLinkedList0.toString();
    
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
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[0,7]"+ "'", str20.equals("[0,7]"));

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test257"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    int i10 = nodeCachingLinkedList0.getSize();
    int i11 = nodeCachingLinkedList0.getSize();
    int i12 = nodeCachingLinkedList0.getCacheSize();
    int i13 = nodeCachingLinkedList0.getCacheSize();
    int i14 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test258"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)6);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str13 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 20+ "'", i8.equals(20));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[0,6]"+ "'", str13.equals("[0,6]"));

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test259"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test260"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)'4');
    int i6 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i8 = nodeCachingLinkedList0.get(0);
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex(0);
    
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
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[10]"+ "'", str10.equals("[10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 10+ "'", i12.equals(10));

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test261"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)'4');
    int i6 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i8 = nodeCachingLinkedList0.get(0);
    int i9 = nodeCachingLinkedList0.getCacheSize();
    int i10 = nodeCachingLinkedList0.getCacheSize();
    int i11 = nodeCachingLinkedList0.getCacheSize();
    int i12 = nodeCachingLinkedList0.getSize();
    java.lang.String str13 = nodeCachingLinkedList0.toString();
    
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
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[10]"+ "'", str13.equals("[10]"));

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test262"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.Integer i3 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i4 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i10 = nodeCachingLinkedList0.get(0);
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
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 0+ "'", i10.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[0]"+ "'", str11.equals("[0]"));

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test263"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i4 = nodeCachingLinkedList0.getSize();
    int i5 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex(0);
    int i9 = nodeCachingLinkedList0.getCacheSize();
    int i10 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[1]"+ "'", str6.equals("[1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 1+ "'", i8.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test264"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.String str3 = nodeCachingLinkedList0.toString();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)2);
    int i8 = nodeCachingLinkedList0.getSize();
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    int i10 = nodeCachingLinkedList0.getCacheSize();
    
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
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test265"); }

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
    int i20 = nodeCachingLinkedList0.getSize();
    int i21 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i23 = nodeCachingLinkedList0.removeIndex(0);
    int i24 = nodeCachingLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue(i20 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i23 + "' != '" + 0+ "'", i23.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 5);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test266"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i14 = nodeCachingLinkedList0.removeIndex(0);
    int i15 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
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
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[0]"+ "'", str10.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 0+ "'", i14.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test267"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getCacheSize();
    int i3 = nodeCachingLinkedList0.getCacheSize();
    int i4 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test268"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i3 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getSize();
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    int i9 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
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
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test269"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.String str4 = nodeCachingLinkedList0.toString();
    int i5 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex(0);
    
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
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 0+ "'", i9.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test270"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    int i5 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((int)'4');
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex(0);
    int i12 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 1+ "'", i11.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test271"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i4 = nodeCachingLinkedList0.getSize();
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[1]"+ "'", str5.equals("[1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[1]"+ "'", str6.equals("[1]"));

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test272"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    int i8 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex((int)(byte)10);
    int i14 = nodeCachingLinkedList0.getSize();
    int i15 = nodeCachingLinkedList0.getSize();
    int i16 = nodeCachingLinkedList0.getSize();
    
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
    org.junit.Assert.assertNull(i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 2);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test273"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i10 = nodeCachingLinkedList0.get(2);
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
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test274"); }

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
    java.lang.Integer i18 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i24 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i26 = nodeCachingLinkedList0.removeIndex(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + (-1)+ "'", i15.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + (-1)+ "'", i18.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i24 + "' != '" + 0+ "'", i24.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i26 + "' != '" + (-1)+ "'", i26.equals((-1)));

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test275"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    int i7 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    int i9 = nodeCachingLinkedList0.getCacheSize();
    int i10 = nodeCachingLinkedList0.getSize();
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    int i12 = nodeCachingLinkedList0.getCacheSize();
    int i13 = nodeCachingLinkedList0.getSize();
    int i14 = nodeCachingLinkedList0.getCacheSize();
    
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
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[-1]"+ "'", str11.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test276"); }

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
    java.lang.Integer i19 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 100+ "'", i19.equals(100));

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test277"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i9 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)4);
    java.lang.Integer i13 = nodeCachingLinkedList0.get(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 4+ "'", i13.equals(4));

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test278"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    int i3 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str4 = nodeCachingLinkedList0.toString();
    int i5 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex(0);
    
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

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test279"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getSize();
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    int i9 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex((int)(byte)-1);
    
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
    org.junit.Assert.assertNull(i13);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test280"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    int i1 = nodeCachingLinkedList0.getSize();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    int i3 = nodeCachingLinkedList0.getCacheSize();
    int i4 = nodeCachingLinkedList0.getCacheSize();
    int i5 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test281"); }

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
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i17 = nodeCachingLinkedList0.getCacheSize();
    
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
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test282"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test283"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    int i1 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[0]"+ "'", str5.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0,0]"+ "'", str8.equals("[0,0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0,0]"+ "'", str9.equals("[0,0]"));

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test284"); }

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
    int i14 = nodeCachingLinkedList0.getCacheSize();
    int i15 = nodeCachingLinkedList0.getSize();
    java.lang.String str16 = nodeCachingLinkedList0.toString();
    
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
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test285"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)'4');
    int i6 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i8 = nodeCachingLinkedList0.get(0);
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    int i11 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)4);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i16 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str17 = nodeCachingLinkedList0.toString();
    
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
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[10]"+ "'", str10.equals("[10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[0,4,10]"+ "'", str17.equals("[0,4,10]"));

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test286"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    int i5 = nodeCachingLinkedList0.getCacheSize();
    int i6 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex((int)(short)100);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i10 = nodeCachingLinkedList0.get((int)(byte)0);
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

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test287"); }

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
    int i13 = nodeCachingLinkedList0.getSize();
    int i14 = nodeCachingLinkedList0.getSize();
    int i15 = nodeCachingLinkedList0.getCacheSize();
    int i16 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str17 = nodeCachingLinkedList0.toString();
    
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
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]"+ "'", str17.equals("[]"));

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test288"); }

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
    java.lang.Integer i19 = nodeCachingLinkedList0.get(0);
    java.lang.Integer i21 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i25 = nodeCachingLinkedList0.removeIndex(1);
    java.lang.String str26 = nodeCachingLinkedList0.toString();
    int i27 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i29 = nodeCachingLinkedList0.removeIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-1)+ "'", i19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + (-1)+ "'", i21.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i25 + "' != '" + (-1)+ "'", i25.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[0,0,0,0,20,10]"+ "'", str26.equals("[0,0,0,0,20,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i29 + "' != '" + 0+ "'", i29.equals(0));

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test289"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)2);
    int i16 = nodeCachingLinkedList0.getSize();
    int i17 = nodeCachingLinkedList0.getSize();
    java.lang.String str18 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i21 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[2,0,20,0,20,10]"+ "'", str18.equals("[2,0,20,0,20,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test290"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    int i11 = nodeCachingLinkedList0.getCacheSize();
    int i12 = nodeCachingLinkedList0.getCacheSize();
    int i13 = nodeCachingLinkedList0.getCacheSize();
    
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
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test291"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
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
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 1+ "'", i7.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 10+ "'", i9.equals(10));

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test292"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)'#');
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((int)'#');
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    int i10 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex(0);
    int i13 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)7);
    
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
    org.junit.Assert.assertNull(i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test293"); }

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
    int i17 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
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
    org.junit.Assert.assertTrue(i17 == 4);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test294"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i9 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i11 = nodeCachingLinkedList0.get(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 0+ "'", i11.equals(0));

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test295"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex(20);
    int i9 = nodeCachingLinkedList0.getSize();
    int i10 = nodeCachingLinkedList0.getSize();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i12 = nodeCachingLinkedList0.get(7);
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
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test296"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.String str3 = nodeCachingLinkedList0.toString();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)2);
    int i8 = nodeCachingLinkedList0.getSize();
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    java.lang.Integer i11 = nodeCachingLinkedList0.get(0);
    
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

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test297"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getCacheSize();
    int i3 = nodeCachingLinkedList0.getCacheSize();
    int i4 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex((int)' ');
    int i7 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test298"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    int i1 = nodeCachingLinkedList0.getSize();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(short)-1);
    int i5 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)6);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex((int)'#');
    nodeCachingLinkedList0.addFirst((java.lang.Integer)5);
    int i15 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i18 = nodeCachingLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 4);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test299"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)2);
    java.lang.Integer i9 = nodeCachingLinkedList0.get(0);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    int i11 = nodeCachingLinkedList0.getCacheSize();
    int i12 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 2+ "'", i9.equals(2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[2]"+ "'", str10.equals("[2]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test300"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i4 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)2);
    int i9 = nodeCachingLinkedList0.getCacheSize();
    int i10 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i12 = nodeCachingLinkedList0.get(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 2+ "'", i12.equals(2));

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test301"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getSize();
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    int i9 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex((int)(short)10);
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
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test302"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    int i6 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test303"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex(20);
    int i9 = nodeCachingLinkedList0.getSize();
    int i10 = nodeCachingLinkedList0.getSize();
    int i11 = nodeCachingLinkedList0.getSize();
    int i12 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)6);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
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
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test304"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i7 = nodeCachingLinkedList0.get(0);
    int i8 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex((int)'4');
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str13 = nodeCachingLinkedList0.toString();
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    java.lang.Integer i16 = nodeCachingLinkedList0.removeIndex((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 1+ "'", i7.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[0,1,10]"+ "'", str13.equals("[0,1,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[0,1,10]"+ "'", str14.equals("[0,1,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i16);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test305"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    int i5 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((int)'4');
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)5);
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    java.lang.Integer i16 = nodeCachingLinkedList0.get(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 1+ "'", i11.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[5]"+ "'", str14.equals("[5]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 5+ "'", i16.equals(5));

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test306"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    int i10 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i12 = nodeCachingLinkedList0.get((int)(short)0);
    java.lang.Integer i14 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i16 = nodeCachingLinkedList0.removeIndex(0);
    int i17 = nodeCachingLinkedList0.getCacheSize();
    
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
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test307"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(6);
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i13 = nodeCachingLinkedList0.get(7);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test308"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    int i4 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex(0);
    int i9 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    
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

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test309"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i6 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i14 = nodeCachingLinkedList0.removeIndex(5);
    java.lang.Integer i16 = nodeCachingLinkedList0.removeIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1+ "'", i12.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 0+ "'", i16.equals(0));

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test310"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i10 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex(0);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test311"); }

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
    int i13 = nodeCachingLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue(i13 == 1);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test312"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i6 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i8 = nodeCachingLinkedList0.get(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 1+ "'", i8.equals(1));

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test313"); }

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
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex((int)'4');
    
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
    org.junit.Assert.assertNull(i15);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test314"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i3 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str4 = nodeCachingLinkedList0.toString();
    int i5 = nodeCachingLinkedList0.getSize();
    int i6 = nodeCachingLinkedList0.getCacheSize();
    int i7 = nodeCachingLinkedList0.getSize();
    int i8 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    int i10 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex(0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i15 = nodeCachingLinkedList0.get(1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[0]"+ "'", str4.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0]"+ "'", str9.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[0]"+ "'", str11.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test315"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex((int)(byte)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    int i11 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex(20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[-1]"+ "'", str9.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[-1]"+ "'", str10.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i13);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test316"); }

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
    java.lang.String str20 = nodeCachingLinkedList0.toString();
    
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
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[10]"+ "'", str20.equals("[10]"));

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test317"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    int i1 = nodeCachingLinkedList0.getSize();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(short)-1);
    int i5 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i10 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test318"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)'4');
    int i6 = nodeCachingLinkedList0.getSize();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.Integer i9 = nodeCachingLinkedList0.get(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[10]"+ "'", str7.equals("[10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 10+ "'", i9.equals(10));

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test319"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i3 = nodeCachingLinkedList0.getSize();
    int i4 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i7 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i9 = nodeCachingLinkedList0.get(0);
    int i10 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 0+ "'", i9.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test320"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.String str4 = nodeCachingLinkedList0.toString();
    int i5 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((int)(short)-1);
    int i8 = nodeCachingLinkedList0.getCacheSize();
    int i9 = nodeCachingLinkedList0.getCacheSize();
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
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test321"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((-1));
    int i8 = nodeCachingLinkedList0.getSize();
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str13 = nodeCachingLinkedList0.toString();
    
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
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 10+ "'", i12.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test322"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    int i9 = nodeCachingLinkedList0.getCacheSize();
    int i10 = nodeCachingLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test323"); }

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
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str17 = nodeCachingLinkedList0.toString();
    int i18 = nodeCachingLinkedList0.getSize();
    int i19 = nodeCachingLinkedList0.getCacheSize();
    int i20 = nodeCachingLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[0]"+ "'", str17.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test324"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    int i8 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex((-1));
    int i11 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex((-1));
    
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
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i15);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test325"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i8 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 0+ "'", i8.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test326"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    int i4 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex(0);
    int i9 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex(0);
    int i12 = nodeCachingLinkedList0.getSize();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i14 = nodeCachingLinkedList0.get(0);
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
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test327"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.String str4 = nodeCachingLinkedList0.toString();
    int i5 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i9 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)2);
    
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
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test328"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getSize();
    int i8 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex((-1));
    int i14 = nodeCachingLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test329"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex((int)(byte)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    int i9 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    int i11 = nodeCachingLinkedList0.getSize();
    java.lang.String str12 = nodeCachingLinkedList0.toString();
    int i13 = nodeCachingLinkedList0.getCacheSize();
    
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
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[-1]"+ "'", str12.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test330"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex(1);
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex(100);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i14 = nodeCachingLinkedList0.get(0);
    int i15 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str16 = nodeCachingLinkedList0.toString();
    
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
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 1+ "'", i14.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[1]"+ "'", str16.equals("[1]"));

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test331"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    int i1 = nodeCachingLinkedList0.getSize();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    int i3 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test332"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    int i1 = nodeCachingLinkedList0.getSize();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(short)-1);
    int i5 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)2);
    int i10 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test333"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i19 = nodeCachingLinkedList0.get(0);
    int i20 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 0+ "'", i19.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test334"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getSize();
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test335"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.Integer i3 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i4 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex(0);
    int i7 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
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

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test336"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    java.lang.Integer i9 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i12 = nodeCachingLinkedList0.getSize();
    int i13 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i17 = nodeCachingLinkedList0.removeIndex((int)(short)-1);
    int i18 = nodeCachingLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 1+ "'", i15.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test337"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i8 = nodeCachingLinkedList0.getSize();
    int i9 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i11 = nodeCachingLinkedList0.get(1);
    java.lang.String str12 = nodeCachingLinkedList0.toString();
    
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
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[0,100]"+ "'", str12.equals("[0,100]"));

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test338"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex(0);
    int i8 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex((int)(byte)10);
    
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
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test339"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex((int)' ');
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex(0);
    int i16 = nodeCachingLinkedList0.getCacheSize();
    int i17 = nodeCachingLinkedList0.getCacheSize();
    
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
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 10+ "'", i13.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test340"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i3 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str4 = nodeCachingLinkedList0.toString();
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str13 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[0]"+ "'", str4.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 0+ "'", i6.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[0,0,0]"+ "'", str13.equals("[0,0,0]"));

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test341"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    int i7 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    int i9 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    int i11 = nodeCachingLinkedList0.getCacheSize();
    int i12 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i14 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i16 = nodeCachingLinkedList0.removeIndex(2);
    
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
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[-1]"+ "'", str10.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + (-1)+ "'", i14.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i16);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test342"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getSize();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    int i8 = nodeCachingLinkedList0.getSize();
    int i9 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    int i12 = nodeCachingLinkedList0.getCacheSize();
    int i13 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex(0);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i15);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test343"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex((int)(byte)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    int i9 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i11 = nodeCachingLinkedList0.get((int)(byte)0);
    int i12 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i14 = nodeCachingLinkedList0.removeIndex((int)(byte)-1);
    int i15 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i17 = nodeCachingLinkedList0.removeIndex(0);
    
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
    org.junit.Assert.assertNull(i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 100+ "'", i17.equals(100));

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test344"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)'a');
    int i5 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i8 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test345"); }

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
    java.lang.String str23 = nodeCachingLinkedList0.toString();
    
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
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "[1,0,0,0,0,20,10]"+ "'", str23.equals("[1,0,0,0,0,20,10]"));

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test346"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getSize();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex((int)' ');
    java.lang.Integer i13 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)2);
    int i16 = nodeCachingLinkedList0.getSize();
    int i17 = nodeCachingLinkedList0.getSize();
    java.lang.String str18 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[2,0]"+ "'", str18.equals("[2,0]"));

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test347"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    int i1 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i6 = nodeCachingLinkedList0.get(0);
    int i7 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex(0);
    int i13 = nodeCachingLinkedList0.getSize();
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 0+ "'", i6.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0]"+ "'", str8.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 0+ "'", i10.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test348"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)'4');
    int i6 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i8 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)2);
    int i11 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 10+ "'", i8.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 2);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test349"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getSize();
    int i8 = nodeCachingLinkedList0.getSize();
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    int i10 = nodeCachingLinkedList0.getCacheSize();
    int i11 = nodeCachingLinkedList0.getSize();
    int i12 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i14 = nodeCachingLinkedList0.removeIndex(0);
    
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
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i14);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test350"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    int i1 = nodeCachingLinkedList0.getCacheSize();
    int i2 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[-1]"+ "'", str5.equals("[-1]"));

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test351"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex((int)(byte)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    int i9 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i11 = nodeCachingLinkedList0.get((int)(byte)0);
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex(100);
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)7);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[100]"+ "'", str14.equals("[100]"));

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test352"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str15 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[0,0,0]"+ "'", str15.equals("[0,0,0]"));

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test353"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    int i4 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex(0);
    int i9 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex(0);
    int i14 = nodeCachingLinkedList0.getSize();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i16 = nodeCachingLinkedList0.get(4);
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
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test354"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    int i1 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0,0,100]"+ "'", str8.equals("[0,0,100]"));

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test355"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.Integer i3 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i4 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i8 = nodeCachingLinkedList0.get(0);
    int i9 = nodeCachingLinkedList0.getSize();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodeCachingLinkedList0.get(7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 0+ "'", i8.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test356"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i5 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((int)(short)-1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i10 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test357"); }

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
    int i14 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i16 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i18 = nodeCachingLinkedList0.removeIndex(0);
    int i19 = nodeCachingLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 0+ "'", i16.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test358"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    java.lang.Integer i7 = nodeCachingLinkedList0.get(0);
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 100+ "'", i7.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[100]"+ "'", str8.equals("[100]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 100+ "'", i10.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i12);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test359"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex((int)(byte)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    int i9 = nodeCachingLinkedList0.getCacheSize();
    int i10 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)4);
    java.lang.Integer i14 = nodeCachingLinkedList0.get(0);
    java.lang.Integer i16 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i19 = nodeCachingLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 4+ "'", i14.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 4+ "'", i16.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 2);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test360"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i12 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test361"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i11 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i13 = nodeCachingLinkedList0.get(0);
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    int i15 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[0]"+ "'", str14.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test362"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    int i11 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex((int)(short)-1);
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[0,20,10]"+ "'", str10.equals("[0,20,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[0,20,10]"+ "'", str14.equals("[0,20,10]"));

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test363"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex((-1));
    java.lang.String str12 = nodeCachingLinkedList0.toString();
    
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
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[0,-1]"+ "'", str12.equals("[0,-1]"));

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test364"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i6 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i10 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i13 = nodeCachingLinkedList0.getSize();
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 0+ "'", i10.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[0,0,1,10]"+ "'", str14.equals("[0,0,1,10]"));

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test365"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex((int)(byte)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    int i10 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)4);
    int i13 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[-1]"+ "'", str9.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 4+ "'", i15.equals(4));

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test366"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    nodeCachingLinkedList0.addFirst((java.lang.Integer)3);
    int i12 = nodeCachingLinkedList0.getCacheSize();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i14 = nodeCachingLinkedList0.get((-1));
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
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test367"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)7);
    java.lang.Integer i10 = nodeCachingLinkedList0.get(0);
    
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
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 7+ "'", i10.equals(7));

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test368"); }

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
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[4]"+ "'", str15.equals("[4]"));

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test369"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getSize();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    int i8 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex(0);
    int i11 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex(0);
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
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test370"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    int i4 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex(0);
    int i9 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex(0);
    int i14 = nodeCachingLinkedList0.getCacheSize();
    
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
    org.junit.Assert.assertNull(i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test371"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
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
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 0+ "'", i10.equals(0));

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test372"); }

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
    java.lang.Integer i18 = nodeCachingLinkedList0.removeIndex(1);
    
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
    org.junit.Assert.assertNull(i18);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test373"); }

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
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
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
    org.junit.Assert.assertTrue(i26 == 8);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test374"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)6);
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    java.lang.Integer i10 = nodeCachingLinkedList0.get(0);
    java.lang.Integer i12 = nodeCachingLinkedList0.get((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[6,100]"+ "'", str8.equals("[6,100]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 6+ "'", i10.equals(6));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 100+ "'", i12.equals(100));

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test375"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getSize();
    int i8 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex((-1));
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    int i15 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i19 = nodeCachingLinkedList0.get(0);
    
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
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[0]"+ "'", str14.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 1+ "'", i19.equals(1));

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test376"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)3);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    int i11 = nodeCachingLinkedList0.getSize();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i13 = nodeCachingLinkedList0.get(4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 0+ "'", i6.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0]"+ "'", str7.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[3,0]"+ "'", str10.equals("[3,0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 2);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test377"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)'a');
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex(100);
    int i7 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex(0);
    int i12 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test378"); }

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
    java.lang.Integer i19 = nodeCachingLinkedList0.get(0);
    java.lang.Integer i21 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i24 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-1)+ "'", i19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + (-1)+ "'", i21.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 7);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test379"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex((int)(byte)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    int i9 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)3);
    int i12 = nodeCachingLinkedList0.getSize();
    int i13 = nodeCachingLinkedList0.getCacheSize();
    int i14 = nodeCachingLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue(i12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test380"); }

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
    int i14 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i16 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i18 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    
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
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 0+ "'", i16.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i18);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test381"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex((int)(byte)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex(1);
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[100]"+ "'", str11.equals("[100]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i13);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test382"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i5 = nodeCachingLinkedList0.getSize();
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i10 = nodeCachingLinkedList0.get(0);
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex(10);
    java.lang.String str13 = nodeCachingLinkedList0.toString();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i15 = nodeCachingLinkedList0.get(5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0,0]"+ "'", str6.equals("[0,0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 0+ "'", i8.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 0+ "'", i10.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[0]"+ "'", str13.equals("[0]"));

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test383"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex((int)' ');
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex(0);
    int i14 = nodeCachingLinkedList0.getCacheSize();
    
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
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 10+ "'", i13.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test384"); }

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
    int i18 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i20 = nodeCachingLinkedList0.get(0);
    java.lang.Integer i22 = nodeCachingLinkedList0.removeIndex((int)'#');
    int i23 = nodeCachingLinkedList0.getCacheSize();
    
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
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 1+ "'", i20.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test385"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    int i5 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((int)'4');
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    int i11 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)6);
    java.lang.Integer i17 = nodeCachingLinkedList0.get(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[1]"+ "'", str10.equals("[1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 6+ "'", i17.equals(6));

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test386"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex((int)(short)-1);
    int i10 = nodeCachingLinkedList0.getCacheSize();
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
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]"+ "'", str7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test387"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getSize();
    int i8 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex((int)(byte)10);
    
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

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test388"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    java.lang.Integer i17 = nodeCachingLinkedList0.get(0);
    java.lang.Integer i19 = nodeCachingLinkedList0.get(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + (-1)+ "'", i17.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-1)+ "'", i19.equals((-1)));

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test389"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i5 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((int)(short)-1);
    java.lang.Integer i9 = nodeCachingLinkedList0.get((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 0+ "'", i9.equals(0));

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test390"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i11 = nodeCachingLinkedList0.getCacheSize();
    int i12 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[10]"+ "'", str6.equals("[10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test391"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    int i10 = nodeCachingLinkedList0.getSize();
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    int i12 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
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
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[10]"+ "'", str11.equals("[10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test392"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getSize();
    int i8 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i12 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i14 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i16 = nodeCachingLinkedList0.get(0);
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
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 0+ "'", i14.equals(0));

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test393"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    int i1 = nodeCachingLinkedList0.getSize();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(short)-1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i7 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i10 = nodeCachingLinkedList0.getCacheSize();
    int i11 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test394"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex((int)'a');
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    int i10 = nodeCachingLinkedList0.getCacheSize();
    
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
    org.junit.Assert.assertNull(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test395"); }

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
    int i13 = nodeCachingLinkedList0.getSize();
    int i14 = nodeCachingLinkedList0.getSize();
    int i15 = nodeCachingLinkedList0.getCacheSize();
    int i16 = nodeCachingLinkedList0.getCacheSize();
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
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test396"); }

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
    java.lang.String str18 = nodeCachingLinkedList0.toString();
    
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
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[10,0,20,10]"+ "'", str18.equals("[10,0,20,10]"));

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test397"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    int i1 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i10 = nodeCachingLinkedList0.get((int)(byte)0);
    int i11 = nodeCachingLinkedList0.getSize();
    int i12 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i14 = nodeCachingLinkedList0.get(0);
    int i15 = nodeCachingLinkedList0.getSize();
    java.lang.String str16 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 100+ "'", i5.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 0+ "'", i10.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 0+ "'", i14.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[0]"+ "'", str16.equals("[0]"));

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test398"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex((int)(byte)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    int i9 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex((int)(short)100);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i14 = nodeCachingLinkedList0.get((int)(short)1);
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
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[100]"+ "'", str10.equals("[100]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i12);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test399"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex((int)(byte)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    int i9 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)3);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
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

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test400"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i12 = nodeCachingLinkedList0.getSize();
    int i13 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test401"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    int i10 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    int i12 = nodeCachingLinkedList0.getCacheSize();
    int i13 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 0+ "'", i6.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0]"+ "'", str7.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 0+ "'", i9.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test402"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i10 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i14 = nodeCachingLinkedList0.removeIndex(0);
    int i15 = nodeCachingLinkedList0.getCacheSize();
    int i16 = nodeCachingLinkedList0.getSize();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 0+ "'", i14.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test403"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    int i11 = nodeCachingLinkedList0.getSize();
    int i12 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[0,20,10]"+ "'", str10.equals("[0,20,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test404"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    int i1 = nodeCachingLinkedList0.getSize();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(short)-1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test405"); }

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
    java.lang.Integer i19 = nodeCachingLinkedList0.get(0);
    
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
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 0+ "'", i19.equals(0));

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test406"); }

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
    java.lang.Integer i16 = nodeCachingLinkedList0.removeIndex(4);
    java.lang.String str17 = nodeCachingLinkedList0.toString();
    int i18 = nodeCachingLinkedList0.getSize();
    int i19 = nodeCachingLinkedList0.getSize();
    
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
    org.junit.Assert.assertNull(i16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[0]"+ "'", str17.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test407"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    int i6 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex(0);
    int i9 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test408"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    int i8 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i10 = nodeCachingLinkedList0.get(0);
    int i11 = nodeCachingLinkedList0.getSize();
    int i12 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str13 = nodeCachingLinkedList0.toString();
    
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
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[20]"+ "'", str13.equals("[20]"));

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test409"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    int i5 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getSize();
    int i8 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    java.lang.Integer i13 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
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
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[0]"+ "'", str11.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test410"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    int i12 = nodeCachingLinkedList0.getSize();
    int i13 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i15 = nodeCachingLinkedList0.get(2);
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
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 20+ "'", i15.equals(20));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test411"); }

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
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i15 = nodeCachingLinkedList0.get((int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test412"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i6 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i14 = nodeCachingLinkedList0.removeIndex(5);
    int i15 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 1+ "'", i12.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test413"); }

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
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]"+ "'", str12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[]"+ "'", str13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test414"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getSize();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    int i8 = nodeCachingLinkedList0.getSize();
    int i9 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    int i12 = nodeCachingLinkedList0.getCacheSize();
    int i13 = nodeCachingLinkedList0.getCacheSize();
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
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test415"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    int i5 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((int)'4');
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex((int)(byte)10);
    
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

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test416"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    int i4 = nodeCachingLinkedList0.getCacheSize();
    int i5 = nodeCachingLinkedList0.getSize();
    int i6 = nodeCachingLinkedList0.getCacheSize();
    int i7 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i12 = nodeCachingLinkedList0.getCacheSize();
    
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
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test417"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i3 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i9 = nodeCachingLinkedList0.getCacheSize();
    int i10 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 0+ "'", i5.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test418"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i7 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    int i9 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i11 = nodeCachingLinkedList0.get((int)(byte)0);
    int i12 = nodeCachingLinkedList0.getCacheSize();
    int i13 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[1]"+ "'", str8.equals("[1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 1+ "'", i11.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test419"); }

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
    java.lang.Integer i18 = nodeCachingLinkedList0.get(0);
    int i19 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str20 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 0+ "'", i18.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[0,0,0,0,20,10]"+ "'", str20.equals("[0,0,0,0,20,10]"));

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test420"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
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
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i10);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test421"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.String str3 = nodeCachingLinkedList0.toString();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test422"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)'4');
    int i6 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i8 = nodeCachingLinkedList0.get(0);
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    int i10 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
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
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[10]"+ "'", str9.equals("[10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[10]"+ "'", str11.equals("[10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test423"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex(0);
    int i11 = nodeCachingLinkedList0.getCacheSize();
    int i12 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i15 = nodeCachingLinkedList0.getSize();
    
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
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test424"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.String str4 = nodeCachingLinkedList0.toString();
    int i5 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((int)(short)-1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    
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

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test425"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)6);
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i4 + "' != '" + 0+ "'", i4.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i8 + "' != '" + 6+ "'", i8.equals(6));

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test426"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i19 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 0+ "'", i19.equals(0));

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test427"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)1);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test428"); }

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
    java.lang.Integer i19 = nodeCachingLinkedList0.get(0);
    java.lang.Integer i21 = nodeCachingLinkedList0.removeIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + (-1)+ "'", i19.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i21 + "' != '" + (-1)+ "'", i21.equals((-1)));

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test429"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    int i10 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    int i12 = nodeCachingLinkedList0.getCacheSize();
    int i13 = nodeCachingLinkedList0.getSize();
    int i14 = nodeCachingLinkedList0.getSize();
    int i15 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str16 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 0+ "'", i6.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0]"+ "'", str7.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 0+ "'", i9.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[]"+ "'", str16.equals("[]"));

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test430"); }

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
    int i14 = nodeCachingLinkedList0.getCacheSize();
    int i15 = nodeCachingLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue(i15 == 2);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test431"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    int i5 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((int)'4');
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    int i11 = nodeCachingLinkedList0.getCacheSize();
    int i12 = nodeCachingLinkedList0.getCacheSize();
    int i13 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[1]"+ "'", str10.equals("[1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[1]"+ "'", str14.equals("[1]"));

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test432"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex(0);
    int i7 = nodeCachingLinkedList0.getSize();
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test433"); }

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
    int i14 = nodeCachingLinkedList0.getCacheSize();
    int i15 = nodeCachingLinkedList0.getSize();
    java.lang.String str16 = nodeCachingLinkedList0.toString();
    
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
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "[-1]"+ "'", str16.equals("[-1]"));

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test434"); }

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
    nodeCachingLinkedList0.addFirst((java.lang.Integer)4);
    java.lang.String str22 = nodeCachingLinkedList0.toString();
    java.lang.String str23 = nodeCachingLinkedList0.toString();
    
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
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "[4,-1,0,0,20,10]"+ "'", str22.equals("[4,-1,0,0,20,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "[4,-1,0,0,20,10]"+ "'", str23.equals("[4,-1,0,0,20,10]"));

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test435"); }

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
    java.lang.Integer i18 = nodeCachingLinkedList0.removeIndex((int)(short)10);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str21 = nodeCachingLinkedList0.toString();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[0]"+ "'", str21.equals("[0]"));

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test436"); }

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
    java.lang.Integer i18 = nodeCachingLinkedList0.removeIndex((int)(short)-1);
    
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
    org.junit.Assert.assertNull(i18);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test437"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    java.lang.Integer i7 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    int i11 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i13 = nodeCachingLinkedList0.get(0);
    int i14 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 100+ "'", i7.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[0,100]"+ "'", str10.equals("[0,100]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test438"); }

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
    int i14 = nodeCachingLinkedList0.getSize();
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
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test439"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.Integer i3 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i4 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex(0);
    int i7 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    int i11 = nodeCachingLinkedList0.getSize();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i13 = nodeCachingLinkedList0.get(2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[]"+ "'", str10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test440"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    int i8 = nodeCachingLinkedList0.getSize();
    int i9 = nodeCachingLinkedList0.getSize();
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    java.lang.Integer i12 = nodeCachingLinkedList0.get(0);
    int i13 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex(0);
    
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
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 20+ "'", i15.equals(20));

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test441"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i17 = nodeCachingLinkedList0.get(0);
    int i18 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 0+ "'", i17.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test442"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getSize();
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[]"+ "'", str8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test443"); }

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
    int i19 = nodeCachingLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue(i19 == 1);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test444"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i3 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i10 = nodeCachingLinkedList0.get(0);
    int i11 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 0+ "'", i5.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 0+ "'", i10.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test445"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    int i5 = nodeCachingLinkedList0.getCacheSize();
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(1);
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex(5);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex(0);
    
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
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 0+ "'", i15.equals(0));

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test446"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex((int)(byte)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex((int)(short)10);
    int i11 = nodeCachingLinkedList0.getCacheSize();
    int i12 = nodeCachingLinkedList0.getSize();
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
    org.junit.Assert.assertNull(i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test447"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i3 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)4);
    int i8 = nodeCachingLinkedList0.getSize();
    int i9 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex((int)(byte)1);
    int i12 = nodeCachingLinkedList0.getSize();
    int i13 = nodeCachingLinkedList0.getSize();
    int i14 = nodeCachingLinkedList0.getSize();
    java.lang.String str15 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 0+ "'", i5.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[4]"+ "'", str15.equals("[4]"));

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test448"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getSize();
    int i8 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i12 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i14 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)6);
    int i17 = nodeCachingLinkedList0.getCacheSize();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i19 = nodeCachingLinkedList0.get((int)'#');
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
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 0+ "'", i14.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test449"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.Integer i3 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i4 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i7 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex(20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test450"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.String str3 = nodeCachingLinkedList0.toString();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)2);
    int i8 = nodeCachingLinkedList0.getSize();
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex(0);
    int i12 = nodeCachingLinkedList0.getCacheSize();
    
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

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test451"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.String str3 = nodeCachingLinkedList0.toString();
    int i4 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[]"+ "'", str3.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test452"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    int i1 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex(100);
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex((int)(byte)100);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 100+ "'", i5.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i13);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test453"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getSize();
    int i8 = nodeCachingLinkedList0.getSize();
    int i9 = nodeCachingLinkedList0.getCacheSize();
    
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
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test454"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[-1]"+ "'", str7.equals("[-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i9);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test455"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    int i1 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[0]"+ "'", str5.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[0]"+ "'", str6.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0]"+ "'", str8.equals("[0]"));

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test456"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i12 = nodeCachingLinkedList0.getCacheSize();
    int i13 = nodeCachingLinkedList0.getSize();
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    int i15 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[0,0,20,10]"+ "'", str14.equals("[0,0,20,10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 4);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test457"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    int i9 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i11 = nodeCachingLinkedList0.get(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[20]"+ "'", str7.equals("[20]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[20]"+ "'", str8.equals("[20]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 20+ "'", i11.equals(20));

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test458"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex((int)' ');
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    
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
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[0,10]"+ "'", str14.equals("[0,10]"));

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test459"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)'4');
    int i6 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i8 = nodeCachingLinkedList0.get(0);
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    int i11 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)4);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i15 = nodeCachingLinkedList0.get((int)(byte)10);
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
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[10]"+ "'", str9.equals("[10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[10]"+ "'", str10.equals("[10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test460"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i3 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex(100);
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex(4);
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex((int)' ');
    int i13 = nodeCachingLinkedList0.getSize();
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    java.lang.String str15 = nodeCachingLinkedList0.toString();
    int i16 = nodeCachingLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]"+ "'", str14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]"+ "'", str15.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test461"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    int i1 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i10 = nodeCachingLinkedList0.get((int)(byte)0);
    int i11 = nodeCachingLinkedList0.getSize();
    int i12 = nodeCachingLinkedList0.getCacheSize();
    int i13 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 100+ "'", i5.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 0+ "'", i10.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test462"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getSize();
    int i8 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)5);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i13 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex((int)(short)-1);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i15);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test463"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    java.lang.Integer i7 = nodeCachingLinkedList0.get(0);
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i14 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    java.lang.Integer i20 = nodeCachingLinkedList0.removeIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i7 + "' != '" + 100+ "'", i7.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[100]"+ "'", str8.equals("[100]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 0+ "'", i12.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 100+ "'", i14.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 100+ "'", i20.equals(100));

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test464"); }

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
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i19 = nodeCachingLinkedList0.removeIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 10+ "'", i5.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i19 + "' != '" + 10+ "'", i19.equals(10));

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test465"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    int i1 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i10 = nodeCachingLinkedList0.get((int)(byte)0);
    int i11 = nodeCachingLinkedList0.getSize();
    int i12 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i14 = nodeCachingLinkedList0.get(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)3);
    int i17 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 100+ "'", i5.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 0+ "'", i10.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 0+ "'", i14.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test466"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)4);
    java.lang.Integer i9 = nodeCachingLinkedList0.get(0);
    int i10 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[]"+ "'", str5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 4+ "'", i9.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test467"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i5 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((int)(short)-1);
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    java.lang.Integer i10 = nodeCachingLinkedList0.get(0);
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    int i12 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i14 = nodeCachingLinkedList0.removeIndex(4);
    java.lang.String str15 = nodeCachingLinkedList0.toString();
    int i16 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str17 = nodeCachingLinkedList0.toString();
    java.lang.String str18 = nodeCachingLinkedList0.toString();
    
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
    org.junit.Assert.assertTrue(i12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[0,0]"+ "'", str15.equals("[0,0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[0,0]"+ "'", str17.equals("[0,0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[0,0]"+ "'", str18.equals("[0,0]"));

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test468"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    int i4 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str5 = nodeCachingLinkedList0.toString();
    int i6 = nodeCachingLinkedList0.getCacheSize();
    int i7 = nodeCachingLinkedList0.getCacheSize();
    int i8 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
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
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test469"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    int i4 = nodeCachingLinkedList0.getCacheSize();
    int i5 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test470"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex((int)(byte)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    int i9 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    int i11 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)4);
    int i14 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str15 = nodeCachingLinkedList0.toString();
    java.lang.Integer i17 = nodeCachingLinkedList0.get(0);
    
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
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[4,-1]"+ "'", str15.equals("[4,-1]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 4+ "'", i17.equals(4));

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test471"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i6 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i11 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str12 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[0,0,1,10]"+ "'", str12.equals("[0,0,1,10]"));

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test472"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.String str4 = nodeCachingLinkedList0.toString();
    int i5 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((int)(short)-1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i13 = nodeCachingLinkedList0.get(7);
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
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[]"+ "'", str4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test473"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i6 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i11 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i13 = nodeCachingLinkedList0.get(0);
    int i14 = nodeCachingLinkedList0.getSize();
    int i15 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test474"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i10 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    int i12 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i14 = nodeCachingLinkedList0.removeIndex((int)' ');
    int i15 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i17 = nodeCachingLinkedList0.removeIndex(0);
    int i18 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i20 = nodeCachingLinkedList0.removeIndex(0);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[0]"+ "'", str11.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 0+ "'", i17.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i20);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test475"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i13 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 1+ "'", i5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[0,0]"+ "'", str14.equals("[0,0]"));

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test476"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex((int)(byte)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i11 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex((int)' ');
    int i14 = nodeCachingLinkedList0.getSize();
    int i15 = nodeCachingLinkedList0.getCacheSize();
    
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
    org.junit.Assert.assertNull(i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test477"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)'4');
    int i6 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i8 = nodeCachingLinkedList0.get(0);
    java.lang.Integer i10 = nodeCachingLinkedList0.get(0);
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i14 = nodeCachingLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[10]"+ "'", str11.equals("[10]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test478"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i5 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((int)(short)-1);
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    java.lang.Integer i10 = nodeCachingLinkedList0.get(0);
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    int i12 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i14 = nodeCachingLinkedList0.removeIndex(4);
    java.lang.Integer i16 = nodeCachingLinkedList0.get((int)(short)0);
    java.lang.Integer i18 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    java.lang.Integer i20 = nodeCachingLinkedList0.removeIndex(0);
    
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
    org.junit.Assert.assertTrue(i12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 0+ "'", i16.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 0+ "'", i18.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i20 + "' != '" + 0+ "'", i20.equals(0));

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test479"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getSize();
    int i8 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str12 = nodeCachingLinkedList0.toString();
    java.lang.Integer i14 = nodeCachingLinkedList0.get(0);
    
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
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[0]"+ "'", str12.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i14 + "' != '" + 0+ "'", i14.equals(0));

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test480"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((int)(short)1);
    int i8 = nodeCachingLinkedList0.getCacheSize();
    int i9 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex((int)(byte)10);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i13 = nodeCachingLinkedList0.get((int)(byte)-1);
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
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i11);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test481"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex(0);
    int i14 = nodeCachingLinkedList0.getSize();
    java.lang.String str15 = nodeCachingLinkedList0.toString();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i17 = nodeCachingLinkedList0.get(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[]"+ "'", str15.equals("[]"));

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test482"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.Integer i3 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i4 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)4);
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i13 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i15 = nodeCachingLinkedList0.removeIndex(0);
    int i16 = nodeCachingLinkedList0.getSize();
    java.lang.String str17 = nodeCachingLinkedList0.toString();
    int i18 = nodeCachingLinkedList0.getCacheSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 4+ "'", i10.equals(4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i15 + "' != '" + 0+ "'", i15.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]"+ "'", str17.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test483"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    int i8 = nodeCachingLinkedList0.getSize();
    int i9 = nodeCachingLinkedList0.getSize();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Integer i11 = nodeCachingLinkedList0.get((-1));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test484"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    int i3 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)100);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i9 = nodeCachingLinkedList0.get(0);
    int i10 = nodeCachingLinkedList0.getSize();
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 0+ "'", i9.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[0,100]"+ "'", str11.equals("[0,100]"));

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test485"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i4 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i7 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i9 = nodeCachingLinkedList0.get(0);
    java.lang.Integer i11 = nodeCachingLinkedList0.get(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 0+ "'", i9.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 0+ "'", i11.equals(0));

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test486"); }

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
    int i14 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i16 = nodeCachingLinkedList0.get(0);
    
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
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i16 + "' != '" + 1+ "'", i16.equals(1));

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test487"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex((int)' ');
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex(5);
    int i14 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i16 = nodeCachingLinkedList0.removeIndex(0);
    int i17 = nodeCachingLinkedList0.getCacheSize();
    
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
    org.junit.Assert.assertNull(i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test488"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    java.lang.Integer i11 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str12 = nodeCachingLinkedList0.toString();
    java.lang.String str13 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 0+ "'", i6.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[0,0]"+ "'", str9.equals("[0,0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 0+ "'", i11.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[0]"+ "'", str12.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "[0]"+ "'", str13.equals("[0]"));

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test489"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.Integer i9 = nodeCachingLinkedList0.removeIndex(0);
    int i10 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i6 + "' != '" + 0+ "'", i6.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[0]"+ "'", str7.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i9 + "' != '" + 0+ "'", i9.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]"+ "'", str11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i13);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test490"); }

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
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    
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
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[0,100]"+ "'", str14.equals("[0,100]"));

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test491"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i8 = nodeCachingLinkedList0.removeIndex(1);
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex(100);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    int i13 = nodeCachingLinkedList0.getCacheSize();
    
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
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test492"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i5 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i7 = nodeCachingLinkedList0.removeIndex((int)(short)-1);
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    int i9 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str10 = nodeCachingLinkedList0.toString();
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    int i12 = nodeCachingLinkedList0.getSize();
    int i13 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i16 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i18 = nodeCachingLinkedList0.removeIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0,0]"+ "'", str8.equals("[0,0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "[0,0]"+ "'", str10.equals("[0,0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[0,0]"+ "'", str11.equals("[0,0]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i18 + "' != '" + 0+ "'", i18.equals(0));

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test493"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    int i3 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i6 = nodeCachingLinkedList0.getSize();
    int i7 = nodeCachingLinkedList0.getSize();
    int i8 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    
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
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]"+ "'", str9.equals("[]"));

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test494"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.Integer i2 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex((int)(byte)0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)20);
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    java.lang.Integer i10 = nodeCachingLinkedList0.get(0);
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[20]"+ "'", str7.equals("[20]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[20]"+ "'", str8.equals("[20]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 20+ "'", i10.equals(20));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i12);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test495"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i3 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.String str6 = nodeCachingLinkedList0.toString();
    int i7 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i11 = nodeCachingLinkedList0.get(0);
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex((int)(byte)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)3);
    java.lang.Integer i17 = nodeCachingLinkedList0.removeIndex(0);
    int i18 = nodeCachingLinkedList0.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i5 + "' != '" + 0+ "'", i5.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]"+ "'", str6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i11 + "' != '" + 0+ "'", i11.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i17 + "' != '" + 3+ "'", i17.equals(3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test496"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.Integer i3 = nodeCachingLinkedList0.removeIndex((int)(short)0);
    int i4 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i7 = nodeCachingLinkedList0.getSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i10 = nodeCachingLinkedList0.getSize();
    int i11 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i13 + "' != '" + 0+ "'", i13.equals(0));

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test497"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    int i2 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i6 = nodeCachingLinkedList0.removeIndex((int)(byte)1);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    int i11 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i13 = nodeCachingLinkedList0.removeIndex((int)' ');
    int i14 = nodeCachingLinkedList0.getCacheSize();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    
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
    org.junit.Assert.assertNull(i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test498"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)10);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex((int)'4');
    int i6 = nodeCachingLinkedList0.getCacheSize();
    java.lang.Integer i8 = nodeCachingLinkedList0.get(0);
    java.lang.String str9 = nodeCachingLinkedList0.toString();
    int i10 = nodeCachingLinkedList0.getSize();
    java.lang.Integer i12 = nodeCachingLinkedList0.get(0);
    int i13 = nodeCachingLinkedList0.getSize();
    int i14 = nodeCachingLinkedList0.getSize();
    
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
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i12 + "' != '" + 10+ "'", i12.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test499"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)1);
    java.lang.Integer i5 = nodeCachingLinkedList0.removeIndex(0);
    int i6 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str7 = nodeCachingLinkedList0.toString();
    java.lang.String str8 = nodeCachingLinkedList0.toString();
    nodeCachingLinkedList0.addFirst((java.lang.Integer)5);
    java.lang.String str11 = nodeCachingLinkedList0.toString();
    int i12 = nodeCachingLinkedList0.getCacheSize();
    
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
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4.test500"); }

    assignment8_exercises.ncl.NodeCachingLinkedList nodeCachingLinkedList0 = new assignment8_exercises.ncl.NodeCachingLinkedList();
    java.lang.String str1 = nodeCachingLinkedList0.toString();
    java.lang.String str2 = nodeCachingLinkedList0.toString();
    java.lang.Integer i4 = nodeCachingLinkedList0.removeIndex(0);
    nodeCachingLinkedList0.addFirst((java.lang.Integer)(-1));
    nodeCachingLinkedList0.addFirst((java.lang.Integer)0);
    java.lang.Integer i10 = nodeCachingLinkedList0.removeIndex(0);
    java.lang.Integer i12 = nodeCachingLinkedList0.removeIndex((int)'a');
    int i13 = nodeCachingLinkedList0.getCacheSize();
    java.lang.String str14 = nodeCachingLinkedList0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]"+ "'", str1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]"+ "'", str2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + i10 + "' != '" + 0+ "'", i10.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[-1]"+ "'", str14.equals("[-1]"));

  }

}
