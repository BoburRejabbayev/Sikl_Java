public class TaskBreak {
    public static void main(String[] args) {
        outer:
        for (int i = 0; i<3; i++){
            System.out.print("Proxod " + i + " : ");
            for (int j = 0; j< 100; j++){
                if (j == 10){
                    break outer; // break остановит цикл где указано outer, continue тожу можно использовать outer
                }
                System.out.print(j+" ");
            }
            System.out.println("Nepravilno");
        }
    }
}
