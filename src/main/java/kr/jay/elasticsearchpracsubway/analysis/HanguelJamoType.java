package kr.jay.elasticsearchpracsubway.analysis;

public enum HanguelJamoType {
  JAMO("JAMO"),
  CHOSUNG("CHOSUNG"),
  JUNGSUNG("JUNGSUNG"),
  JONGSUNG("JONGSUNG"),
  KORTOENG("KORTOENG");

  private String name;

  HanguelJamoType(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }
}
