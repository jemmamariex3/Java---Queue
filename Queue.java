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
class Queue{
   int MAX_SIZE;
   int front;
   int rear;
   int [] num;
   
   public Queue(){
      MAX_SIZE = 10;
      num = new int[10];
      front = -1;
      rear = -1;
   }
   public void add(int item){
      if(rear == MAX_SIZE-1) {
         System.out.print("\nQueue is full. Pop one off!");
         return;
      }
      else{
         rear++;
         num[rear] = item;
         System.out.print("\nThe newly added item is: "+num[rear]);
      }
      
      if(front == -1){
         front = 0;
      }
      
   }
   public void poll(){
      if(front == -1){
         System.out.print("\nWould do this poll thing, but queue is empty!");
      }
      else{
         System.out.print("\nExecuting poll process to next item in 'front'");
         if(front == rear){
            front = -1;
            rear = -1;
         }
         else{
            front++;
         }
      }
   }
   public void peek(){
      if(front > -1){
         System.out.print("\nPeeking! Item: " +num[front]);
      }
      else{
         System.out.print("\nPeeking! But queue is empty");
      }
   }
}