/*
* Sistema que recebe cor de uma API para customizar a etiqueta de um elemento na tela
* Apenas as cores: Vermelho, Azul, Amarelo, Branco, Preto e Verde
* */
public class Etiqueta {
    ICor cor;
    CorAdapter adapter;

    public Etiqueta() {
        cor = new CorRgb();
        adapter = new CorAdapter(cor);
    }

    public void setCor(String coloracao) {
        cor.setCor(coloracao);
        adapter.salvarCor();
    }

    public String getCor() {
        return adapter.recuperarCor();
    }

}
