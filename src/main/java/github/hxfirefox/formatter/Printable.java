package github.hxfirefox.formatter;

import github.hxfirefox.lengthunit.Length;

@FunctionalInterface
public interface Printable {
    public String print(Length length);
}
