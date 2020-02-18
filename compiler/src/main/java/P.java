public class P implements Comparable<P>{

  private final String type;

  private final String name;

  private final String repeated;

  private final int index;

  public P(final int index, final String type, final String name) {

    this.index = index;
    this.type = type;
    this.name = name;
    this.repeated = "";
  }

  public P(final int index, final String type, final String name, final boolean isRepeated) {

    this.index = index;

    this.type = type;
    this.name = name;
    this.repeated = isRepeated ? "repeated " : "";
  }

  public String getType() {

    return this.type;
  }

  public String getName() {

    return this.name;
  }

  public String getRepeatedTokenWithSpace() {

    return this.repeated;
  }

  public int getIndex() {

    return index;
  }

  @Override
  public int compareTo(P o) {
    return (o.getType() + o.getName()).compareTo(this.getType() + this.getName());
  }
}