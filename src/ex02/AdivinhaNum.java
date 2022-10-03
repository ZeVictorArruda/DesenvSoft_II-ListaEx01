package ex02;

public class AdivinhaNum {
	
	private GeraNum gr;
    private int num = 0, ultimaTentativa = 0, sit = 0;

    public AdivinhaNum() {
        setGr(new GeraNum());
        getGr().setNum();
    }

    public String situacao() {
    	
        int atual = 0, anterior = 0;
        atual = getNum() - getGr().getNum();
        anterior = getUltimatentativa() - getGr().getNum();
        if (getNum() == getGr().getNum()) {
            setUltimatentativa(getNum());
            setSitcor(1);
            return "Acertou!";

        } else if (Math.abs(atual) < Math.abs(anterior)) {
            setUltimatentativa(getNum());
            setSitcor(2);
            return "Está mais perto...";
        } else if (Math.abs(atual) > Math.abs(anterior)) {
            setUltimatentativa(getNum());
            setSitcor(3);
            return "Está mais longe...";
        }
        return null;
    }

    public GeraNum getGr() {
        return gr;
    }

    public void setGr(GeraNum gerador) {
        this.gr = gerador;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getUltimatentativa() {
        return ultimaTentativa;
    }

    public void setUltimatentativa(int ultimatentativa) {
        this.ultimaTentativa = ultimatentativa;
    }

    public int getSitcor() {
        return sit;
    }

    public void setSitcor(int sitcor) {
        this.sit = sitcor;
    }

}