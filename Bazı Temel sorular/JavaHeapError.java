public class HeapExample {
    public static void main(String[] args) {
        // dizi ve dizi heap belleğine yazdırsın
        int[] numbers = new int[5];

        // numbers dizisine elemanları atayalım

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
        }
        System.out.println("Numbers dizisi içeriği");
        System.out.println(numbers);

    }

}
