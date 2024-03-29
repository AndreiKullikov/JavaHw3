import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ToyStore store = new ToyStore();

        // add some toys
        store.addToy(1, "teddy bear", 10, 20);
        store.addToy(2, "drum", 5, 10);
        store.addToy(3, "doll", 20, 70);

        // set the weight of a toy
        store.setToyWeight(2, 30);

        // play the game
        store.play();

        // get the prize toy
        try {
            store.getPrizeToy();
        } catch (IOException e) {
            // Обработка исключения, например, вывод сообщения об ошибке
            e.printStackTrace();
        }
    }
}
