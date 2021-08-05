public class Main {
  static int[] ns={100,500,1000,5000};
  public static void main(String[] args) {
    timeIsEven();
    timeAddNumbersV1();
    timeAddNumbersV2();
    timeAddNumbersV3();
    timeAddToArray();
   
  }
// TODO part 3: Implement code to print out the time it takes to run each method. 
  private static void timeIsEven(){
      System.out.println("timing isEven for n=");
      long startTime=System.nanoTime();
     
  }
  
  private static void timeAddNumbersV1(){
   
  }
  
   private static void timeAddNumbersV2(){
    
  }
 
  private static void timeAddNumbersV3(){
    
  }
  
  private static void timeAddToArray(){

  }
  
  
  private static boolean isEven(int n){		
    return n%2==0;
  }
  
  private static int addNumbersOneThroughNv1(int n){
    int count =0;
    for(int i=0;i<n;i++){
      for(int j=0;j<i;j++){
        count++;
      }
    }
    return count;
  }
  
  private static int addNumbersOneThroughNv2(int n){
    return n*(n+1)/2;
  }
  
  private static int addNumbersOneThroughNv3(int n){
    int count =0;
    for(int i=0;i<n;i++){
        count +=n;
    }
    return count;
  }
  
  private static void addToArray(int n){
    // create an populate initial array
    int[] oldArray = new int[n];
    for(int i=0;i<n;i++){
      oldArray[i]=i;
    }
    // Create and populate inital array with old values
    int[] newArray = new int[n+1];
    for(int j=0;j<oldArray.length; j++){
      newArray[j]= oldArray[j];
    }
    // Add new value to the end
    newArray[n] = -5;
  }
}
