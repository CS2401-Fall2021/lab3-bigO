
public class Main {
  static int[] ns={10, 20,30,40,50,60,70,80,90,100,110,500};
  public static void main(String[] args) {
    // This is to ensure our time doesn't take into account loading the methods.
    isEven(0);
    addNumbersOneThroughNv1(0);
    addNumbersOneThroughNv2(0);
    addNumbersOneThroughNv3(0);
    guessPassword(0);

    timeIsEven();
    timeAddNumbersV1();
    timeAddNumbersV2();
    timeAddNumbersV3();
    timePassword();
   
  }
// TODO part 3: Implement code to print out the time it takes to run each method. 
  private static void timeIsEven(){
    System.out.println("timing isEven");

  }
  
  private static void timeAddNumbersV1(){
    System.out.println("timing NumV1");

  }
  
  private static void timeAddNumbersV2(){
     System.out.println("timing NumV2");

  }
  
  private static void timeAddNumbersV3(){
     System.out.println("timing NumV3");

  }

  private static void timePassword(){
    System.out.println("timing password");

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
        count=count+n;
    }
    return count;
  }
  
  
  private static void guessPassword(int n){
    int count=0;
    for(int i=0;i<(Math.pow(2,n/10));i++) {
      count++;
    }
  }

}
