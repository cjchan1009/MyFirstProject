public class Hello {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void printValue() {
        if (null != value) {
            System.out.println(value);
        }
    }
}
