package br.com.aws.dynamodb.message;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public enum ErrorMessage {

    E000("0000", "Código do Actor não foi encontrado"),
    E001("0001", "Código do Adress não foi encontrado"),
    E002("0002", "Código do Category não foi encontrado"),
    E003("0003", "Código do City não foi encontrado"),
    E004("0004", "Código do Contry não foi encontrado"),
    E005("0005", "Código do Custumer não foi encontrado"),
    E006("0006", "Código do Filme Ator não foi encontrado"),
    E007("0007", "Código do Filme Categoria não foi encontrado"),
    E008("0008", "Código do Filme não foi encontrado"),
    E009("0009", "Código do Inventory não foi encontrado"),
    E0010("0010", "Código do Language não foi encontrado"),
    E0011("0011", "Código do Payment não foi encontrado"),
    E0012("0012", "Código do Rental não foi encontrado"),
    E0013("0013", "Código do Staff não foi encontrado"),
    E0014("0014", "Código do Store não foi encontrado"),
    E9998("E9998", "Ocorreu um erro no sistemas consulte o  Administrador");


    private final String codigo;
    private final String mensagem;

    public String getCodigo() {
        return codigo;
    }

    public String getMensagem() {
        return mensagem;
    }

    ErrorMessage(String codigo, String mensagem) {
        this.codigo = codigo;
        this.mensagem = mensagem;
    }


    public String getMensagemCompleta() {
        return this.mensagem + " (Erro: " + this.codigo + ")";
    }

    public String formatarMensagem(Object... itens) {
        try {
            return String.format(this.mensagem, itens);
        } catch (Exception e) {
            log.error(
                    "Não foi possível interpolar a mensagem da chave [{}], aplicando os argumentos , {}",
                    this.codigo,
                    Arrays.toString(itens));
            return E9998.mensagem;
        }
    }
}
