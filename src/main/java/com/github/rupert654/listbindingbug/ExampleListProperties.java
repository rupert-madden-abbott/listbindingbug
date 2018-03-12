package com.github.rupert654.listbindingbug;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("example.multiple")
public class ExampleListProperties {
  private List<ExampleProperties> list;

  public List<ExampleProperties> getList() {
    return list;
  }

  public void setList(final List<ExampleProperties> list) {
    this.list = list;
  }

  public static class ExampleProperties {
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
}
