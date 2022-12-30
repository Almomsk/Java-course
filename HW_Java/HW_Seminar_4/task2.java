//Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
//(Подобную задачу решали на семинаре. Здесь так же нужно создать класс, который будет реализовывать указанные методы)

package HW_Java.HW_Seminar_4;

public class task2 
{
    public static void main(String[] args) 
    {
        Task2method queue = new Task2method();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.dequeue());
        System.out.println(queue.first());
        System.out.println(queue.get());
    }
}    
