class Execution {
  public void display() {
    System.out.println("Calculating Method execution time:");
  }
  public static void main(String[] args) {

    Execution E = new Execution();

    long start = System.nanoTime();
    E.display();
    long end = System.nanoTime();
    long execution = end - start;
    System.out.println("Execution time: " + execution + " nanoseconds");
  }
}