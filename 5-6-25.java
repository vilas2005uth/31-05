REVERSE RECCURSIVE CALL

class Main {
    public static void main(String[] args) {
        printRange(1, 5); // Example usage
    }

    public static void printRange(int start, int end) {
        if (start > end) {
            return;
        }
        printRange(start + 1, end);
        System.out.println(start);
    }
}
