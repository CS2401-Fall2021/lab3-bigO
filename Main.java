class Main {
  
  public static void main(String[] args) {
    timeIsEven();
    timeAddNumbersV1();
    timeAddNumbersV2();
    timeAddNumbersV3();
    timeAddToArray();
   
  }
// TODO part 3: Implement code to print out the time it takes to run each method. 
  private static void timeIsEven(){
    int n=1;
    System.out.printLn("timing isEven for n="+n);
    
  }
  
  private static void timeAddNumbersV1(){

  }
  
   private static void timeAddNumversV2(){

  }
 
  private static void timeAddNumversV3(){

  }
  
  private static void timeAddToArray(){

  }
  
  
  private static boolean isEven(int n){		
    return n%2;
  }
  
  private static int addNumbersOneThroughNv1(int n){
    int count =0;
    for(int i=0;i<n;i++){
      for(int j=0;j<i;j++){
        count ++;
      }
    }
  }
  
  private static int addNumbersOneThroughNv2(int n){
    return n*(n+1)/2;
  }
  
  private static int addNumbersOneThroughNv3(int n){
    int count =0;
    for(int i=0;i<n;i++){
        count +=n;
    }
  }
  
  private static void addToArray(int n){
    // create an populate initial array
    int[] oldArray = new int[n];
    for(int i=0;i<n;i++){
      oldArray[i]=i;
    }
    // Create and populate inital array with old values
    int[] newArray = new int[n+1];
    for( int j=0;j<newArray.length; j++){
      newArray[j]= oldArray[i];
    }
    // Add new value to the end
    newArray[n] = -5;
  }
}
