package Singleton;

public class ConfiguracaoAplicativo {

    private ConfiguracaoAplicativo() {};

    private static final ConfiguracaoAplicativo instance = new ConfiguracaoAplicativo();

    public static ConfiguracaoAplicativo getInstance() {
        return instance;
    }

    private String temaSistema;
    private String idiomaPadrao;

    public String getTemaSistema() {
        return temaSistema;
    }

    public void setTemaSistema(String temaSistema) {
        this.temaSistema = temaSistema;
    }

    public String getIdiomaPadrao() {
        return idiomaPadrao;
    }

    public void setIdiomaPadrao(String idiomaPadrao) {
        this.idiomaPadrao = idiomaPadrao;
    }
}
