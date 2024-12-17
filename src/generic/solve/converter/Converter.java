package generic.solve.converter;

public interface Converter<I, O> {
    O convert(I input);
}