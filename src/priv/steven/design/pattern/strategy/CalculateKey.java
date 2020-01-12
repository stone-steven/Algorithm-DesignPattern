package priv.steven.design.pattern.strategy;

/**
 * @author steven
 * @date 2020/1/12
 */
public enum CalculateKey {
    ADD("add"),SUB("sub");

    private String key;

    CalculateKey(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}
