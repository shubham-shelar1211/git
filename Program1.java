class Program {
  static void sum( int num1, float num2 ){  // 2 method parameters
    float result = num1 + num2;
    System.out.println("Result  : "+result);
  }
  static void sum( float num1, int num2 ){  // 2 method parameters
    float result = num1 + num2;
    System.out.println("Result  : "+result);
  }
  public static void main(String[] args) {
    Program.sum( 10, 20.2f );
    Program.sum( 10.1f, 20 );
  }  
}
