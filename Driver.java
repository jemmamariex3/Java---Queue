/*
Jemma Tiongson
Section #16031
App: Driver.java (Queue App)
Purpose: Demonstrate Queue
-------------------------------------------------------------------------

Terminal:
   Compile: javac Driver.java Queue.java
   Run: java Driver
_________________________________________________________________________
*/
class Driver{
   public static void main (String [] args){
      Queue queue = new Queue();
      queue.peek();
      queue.peek();
      System.out.print("\n__________________");
      queue.poll();
      queue.poll();
      System.out.print("\n__________________");
      queue.add(1);
      queue.add(2);
      queue.add(3);
      queue.add(4);
      queue.add(5);
      queue.add(6);
      queue.add(7);
      queue.add(8);
      queue.add(9);
      queue.add(10);
      queue.add(11);
      queue.add(12);
      queue.add(13);
      System.out.print("\n__________________");
      queue.peek();
      queue.poll();
      queue.poll();
      queue.poll();
      queue.poll();
      queue.poll();
      queue.poll();
      queue.poll();
      queue.poll();
      queue.poll();
      queue.poll();
      queue.poll();
      queue.poll();
      queue.poll();
      queue.poll();
      queue.poll();
      System.out.print("\n__________________");
      queue.peek();
      
      
      

   }
}