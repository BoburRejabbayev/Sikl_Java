public class taskReturn {
    public static void main(String[] args) {
        double d = randomValue(1);
        System.out.println(d);
    }

    public static double randomValue(int i){
        return Math.random()*i; // вернет значение от 0 до 1
    }

}
