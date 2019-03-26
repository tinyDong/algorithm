public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        ThreadLocal threadLocal = new ThreadLocal();
        threadLocal.set(123);
        threadLocal.get();
    }
}
