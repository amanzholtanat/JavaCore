public class break_continue {
    public static void main(String[] args) {
        int i;
        for(i=0; i<=15; i++){
         if(i%2==0){
             continue;
            }
            System.out.println("Это нечетное число - " + i);
        }
    }
}
