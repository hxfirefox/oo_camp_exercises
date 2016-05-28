package github.hxfirefox.formatter;

import github.hxfirefox.lengthunit.Length;

public interface Formatter {
    public String format();

    public Formatter withParams(Length length);
}
