public class App {
    public static void main(String[] args) throws Exception {
    
    int [] weathers = {30,40,45,17,20};
    weathers[2] = 22;
    for(int weather:weathers ){

        System.out.println(weather+"C");

    }    
}
}