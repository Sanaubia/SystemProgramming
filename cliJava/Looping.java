public class Looping extends Thread{

  public void run (){

    try{
      while(true){
        System.out.println("Tiisu, We want More!");
        sleep(5000);
      }
    }
    catch(Exception e){
      System.out.println(e);
    }
  }

}
