package CANTINA;

import java.util.Date;

public class Almoco {
    private Integer QuantidadeDoAlmoco;
    private String TamanhoDoAlmoco;
    private Integer TipoDoAlmoco;

    public Integer getQuantidade() {
        return QuantidadeDoAlmoco;
    }

    public void setQuantidade(Integer quantidade) {
        QuantidadeDoAlmoco = quantidade;
    }

    public String getTamanhoDoAlmoco() {
        return TamanhoDoAlmoco;
    }

    public void setTamanhoDoAlmoco(String tamanhoDoAlmoco) {
        TamanhoDoAlmoco = tamanhoDoAlmoco;
    }

    public Integer getTipoDoAlmoco() {
        return TipoDoAlmoco;
    }

    public void setTipoDoAlmoco(Integer tipoDoAlmoco) {
        TipoDoAlmoco = tipoDoAlmoco;
    }
}

