package at.fhj.msd;

public interface IQueue {

  public abstract boolean offer(String obj);

  //returns + del 1st element; null if nothing in there
   //
  public abstract String poll();

  /* 
  same as poll, if there is nothing in there error NoSuchElementException
   */
  public abstract String remove();

  // 1st element without delete, otherwise null
   
  public abstract String peek();

  // element is to peek what remove is to poll
  
  public abstract String element();
}