package com.github.rupert654.listbindingbug;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("example.single")
public class ExampleProperties {
  private String first;

  private String second;

  public String getFirst() {
    return first;
  }

  public void setFirst(final String first) {
    this.first = first;
  }

  public String getSecond() {
    return second;
  }

  public void setSecond(final String second) {
    this.second = second;
  }

  @Override
  public String toString() {
    return "ExampleProperties{" + "first='" + first + '\''
        + ", second='" + second + '\''
        + '}';
  }
}
