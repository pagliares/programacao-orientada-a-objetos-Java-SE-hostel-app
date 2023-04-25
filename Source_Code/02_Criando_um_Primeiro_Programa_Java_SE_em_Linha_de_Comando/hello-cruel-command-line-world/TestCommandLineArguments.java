class TestCommandLineArguments {
   
  public static void main(String[] args) {
    if (args.length != 0){
      for (int i=0; i<args.length; i++)
         System.out.println(args[i]);
    }
    System.out.println("That's all !");
  }

}
