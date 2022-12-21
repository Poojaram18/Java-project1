public class Main {
	
void m1(){
    
    System.out.println("0-arg constructor");
}
void m1(int a){
    
    System.out.println("1-arg constructor");
}
void m1(int a,int b){
    System.out.println("2-arg constructor");
}
void m1(char c){
    System.out.println("1-arg constructor");
}

 public static void main (String[] args) {

   Main ref=new Main();
   ref.m1();
    ref.m1(10);
     ref.m1(10,20);
      ref.m1('a');
   
   
}
}
