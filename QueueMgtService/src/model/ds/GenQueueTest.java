package model.ds;

public class GenQueueTest {
    
   public static void main(String[] args) {
       
      GenQueue<Employee> empList = new GenQueue<Employee>();
      GenQueue<HourlyEmployee> hList = new GenQueue<HourlyEmployee>();
      hList.enqueue(new HourlyEmployee("T", "David"));
      hList.enqueue(new HourlyEmployee("G", "Bob"));
      hList.enqueue(new HourlyEmployee("F", "Sam"));
      empList.addItems(hList);
      
      System.out.println("The employees' names are:");
      
      while (empList.hasItems()) {
         Employee emp = empList.dequeue();
         System.out.println(emp.firstName + " " + emp.lastName);
         System.out.println("Queue size : "+empList.size()); 
      }
   }
}