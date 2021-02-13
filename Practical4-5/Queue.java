import java.util.Arrays;
import java.util.Random;

public class Queue {
    int[] queue;
    int maxSize;
    int front;
    int rear;
    int nElem;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        queue = new int[maxSize];
        rear = -1;
        front = 0;
        nElem = 0;
    }

    public void Put(int elem) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queue[++rear] = elem;
        nElem++;
    }

    public int Get() {
        return queue[front];
    }

    public static void GetAll(int[] queue) {
        int[] newQueue = Arrays.copyOf(queue, queue.length);
        System.out.print(Arrays.toString(newQueue));


    }
    //Сортировка чет-нечет, означает сортировку по возрастанию элементов массива
    private static void Sort(int[] queue, int n) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            int temp = 0;

            for (int i = 1; i <= n - 2; i = i + 2) {
                if (queue[i] > queue[i + 1]) {
                    temp = queue[i];
                    queue[i] = queue[i + 1];
                    queue[i + 1] = temp;
                    isSorted = false;
                }
            }
            for (int i = 0; i <= n - 2; i = i +2){
                if (queue[i] > queue[i+1]){
                    temp = queue[i];
                    queue[i] = queue[i + 1];
                    queue[i + 1] = temp;
                    isSorted = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] myQueue = new int[40];   // Массив из 40 элементов
        int EvenSum = 0;                // Четная сумма
        int OddSum = 0;                 // Нечетная сумма
        int n = myQueue.length;

        Random rand = new Random();    // Заполнение массива рандомными числами
        for (int i = 0; i < myQueue.length; i++){
            myQueue[i] = rand.nextInt(10);
        }

        System.out.println("Random array of 40 elements: ");
        System.out.println(Arrays.toString(myQueue));
        System.out.println("Sorted array:" );

        Sort(myQueue, n);              // Вызов метода сортировки массива
        for (int j : myQueue) System.out.print(j + " ");       // Цикл для вывода отсортированных элементов массива
        System.out.println(" ");

        for (int i = 0; i < myQueue.length; i++){      // Цикл для подсчета суммы положительных и отриц. элем. массива
            if (myQueue[i] % 2 == 0){
                EvenSum += myQueue[i];
            }
            else {
                OddSum += myQueue[i];
            }
        }

        System.out.println("even sum: " + EvenSum);
        System.out.format("odd sum: %d\n", OddSum);
        

    }
}