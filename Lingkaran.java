public class Lingkaran {
  private double diameter;

  public Lingkaran(double diameter) {
      this.diameter = diameter;
  }

  public double getJariJari() {
      return diameter / 2;
  }

  public double getLuas() {
      double jariJari = getJariJari();
      return Math.PI * jariJari * jariJari;
  }

  public double getKeliling() {
      double jariJari = getJariJari();
      return 2 * Math.PI * jariJari;
  }
}
