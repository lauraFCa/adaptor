public class CorAdapter extends CorHexadecimal{

    private ICor corRgb;

    public CorAdapter(ICor corRgb) {
        this.corRgb = corRgb;
    }

    public String recuperarCor() {
        String x = this.getCor();
        if(this.getCor().contains("#000000"))
            corRgb.setCor("0,0,0");
        else if (this.getCor().contains("#ffffff"))
            corRgb.setCor("255,255,255");
        else
            if (this.getCor().contains("#ff0"))
                corRgb.setCor("255,0,0");
            else if(this.getCor().contains("#00f"))
                corRgb.setCor("0,255,0");
            else if(this.getCor().contains("00f"))
                corRgb.setCor("0,0,255");
            else if(this.getCor().contains("ff0"))
                corRgb.setCor("255,255,0");
            else if(this.getCor().contains("#"))
                throw new IllegalArgumentException("Cor fora do padrao!");

        return corRgb.getCor();
    }
    public void salvarCor() {
        if(corRgb.getCor().equals("0,0,0"))
            this.setCor("#000000");
        else if (corRgb.getCor().equals("255,255,255"))
            this.setCor("#ffffff");
        else
            if (corRgb.getCor().equals("255,0,0"))
                this.setCor("#ff0");
            else if(corRgb.getCor().equals("0,255,0"))
                this.setCor("#00f");
            else if(corRgb.getCor().equals("0,0,255"))
                this.setCor("00f");
            else if(corRgb.getCor().equals("255,255,0"))
                this.setCor("ff0");
            else if(corRgb.getCor().contains(","))
                throw new IllegalArgumentException("Valor fora do padrao!");
            else
                this.setCor(corRgb.getCor());
    }

}
