public class main {
  public static void main(String[] args) {
      Lingkaran a = new Lingkaran(5);
      Lingkaran b = new Lingkaran(10);
      Lingkaran c = new Lingkaran(20);
      Lingkaran d = new Lingkaran(30);

      System.out.println("Lingkaran a:");
      System.out.println("Luas: " + a.getLuas());
      System.out.println("Keliling: " + a.getKeliling());
      System.out.println();

      System.out.println("Lingkaran b:");
      System.out.println("Luas: " + b.getLuas());
      System.out.println("Keliling: " + b.getKeliling());
      System.out.println();

      System.out.println("Lingkaran c:");
      System.out.println("Luas: " + c.getLuas());
      System.out.println("Keliling: " + c.getKeliling());
      System.out.println();

      System.out.println("Lingkaran d:");
      System.out.println("Luas: " + d.getLuas());
      System.out.println("Keliling: " + d.getKeliling());
      System.out.println();
  }
}
