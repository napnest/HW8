import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] people = new int[10];
        int summa =0;
        int count=0;
        for (int i = 0; i < people.length ; i++) {
            people[i]= new Random().nextInt(100-40)+40;
            summa+=people[i];
            if(people[i]>=60 && people[i]<=80){
                count++;
            }
        }

        for(int i:people){
            System.out.print(i+" ");
        }
        System.out.println();
        double average=(double)summa/10;
        System.out.println("Средний вес составляет: "+average);
        System.out.println("Количество людей с весом от 60 до 80 (включительно): "+count);

    }
}
