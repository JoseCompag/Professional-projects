package assignment4_exercises.pattern_index;
// Introduction to Software Testing
// Authors: Paul Ammann & Jeff Offutt
// Chapter 7, page 141; chapter 9, page 256
// See PatternIndexTest.java, DataDrivenPatternIndexTest.java  for JUnit tests

import assignment4_exercises.Path;

public class PatternIndex{

   private Path paths = new Path();

   public PatternIndex(){

   }
   /**
    * Find index of pattern in subject string
    *
    * @param subject String to search
    * @param pattern String to find
    * @return index (zero-based) of first occurrence of pattern in subject; -1 if not found
    * @throws NullPointerException if subject or pattern is null
    */
   public int patternIndex(String subject, String pattern){

      paths.add(1);
      final int NOTFOUND = -1;
      int  iSub = 0, rtnIndex = NOTFOUND;
      boolean isPat  = false;
      int subjectLen = subject.length();
      int patternLen = pattern.length();
      paths.add(2);

      paths.add(3);
      while (isPat == false && iSub + patternLen - 1 < subjectLen){

         paths.add(4);
         if (subject.charAt(iSub) == pattern.charAt(0)){

            paths.add(5);
            rtnIndex = iSub; // Starting at zero
            isPat = true;
            //paths.add(6);
            paths.add(6);
            for (int iPat = 1; iPat < patternLen; iPat ++){

               paths.add(7);
               if (subject.charAt(iSub + iPat) != pattern.charAt(iPat)){

                  paths.add(8);
                  rtnIndex = NOTFOUND;
                  isPat = false;
                  /* MB: isPat = true; */
                  break;  // out of for loop
               }
               paths.add(9);
               paths.add(6);
            }
         }
         paths.add(10);
         iSub ++;
         paths.add(3);
      }
      paths.add(11);
      return (rtnIndex);
   }


   public Path getPaths() {
      return paths;
   }
}

