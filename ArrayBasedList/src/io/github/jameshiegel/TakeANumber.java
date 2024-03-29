/** This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <http://www.gnu.org/licenses/>.
 */
package io.github.jameshiegel;

/**
 * Copyright (C) <year> James
 */
public class TakeANumber {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      IntArrayQueue pharmacyLine = new IntArrayQueue();

      System.out.println("Start: " + pharmacyLine.toString());

      pharmacyLine.add(1);
      pharmacyLine.add(2);
      pharmacyLine.add(3);
      System.out.println("Add three: " + pharmacyLine.toString());

      pharmacyLine.remove();
      System.out.println("Remove one: " + pharmacyLine.toString());

      pharmacyLine.add(4);
      pharmacyLine.add(5);
      pharmacyLine.add(6);
      pharmacyLine.add(7);
      System.out.println("Add four: " + pharmacyLine.toString());

      pharmacyLine.remove();
      pharmacyLine.remove();
      System.out.println("Remove two: " + pharmacyLine.toString());

      pharmacyLine.add(8);
      pharmacyLine.add(9);
      pharmacyLine.add(10);
      pharmacyLine.add(11);
      System.out.println("Add four: " + pharmacyLine.toString());

      pharmacyLine.remove();
      pharmacyLine.remove();
      System.out.println("Remove two: " + pharmacyLine.toString());
   }

}
