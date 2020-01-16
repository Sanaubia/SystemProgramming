class JavaMain
{
  public static void main(String[] args){

    looppaus();

  }

  private void looppaus(){
      Looping thread = new Looping();
      thread.start();
  }
}
