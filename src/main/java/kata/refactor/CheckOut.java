// Created with permission from Dave Thomas (given May 11, 2012)
// Variation of Dave Thomas' Pragmatic Programmer's "Kata Nine: Back to the CheckOut"
// from http://codekata.pragprog.com/2007/01/kata_nine_back_.html 
// Dave Thomas' Pragmatic Programmer

package kata.refactor;

public class CheckOut {

   int totalSoFar = 0;
  // int myACounter = 0;

   public CheckOut() {
   }

   public int total() {
      return totalSoFar;
   }

   public void scan(char good) {

      System.out.println("\nThe character is: " + good);

      totalSoFar = totalSoFar + 50;




 //hi
      // later


//        if (good == 'A') {
//            totalSoFar = totalSoFar + 50;
//        } else {
//            totalSoFar = totalSoFar + 30;
//        }

      // useful much later

  //      switch (good) {
//            case 'A':
//                totalSoFar = totalSoFar + 50;
//                break;
//            case 'B':
//                totalSoFar = totalSoFar + 30;
//                break;
//            case 'C':
//                totalSoFar = totalSoFar + 20;
//                break;
//            case 'D':
//                totalSoFar = totalSoFar + 15;
//                break;
//        }
   }
}

