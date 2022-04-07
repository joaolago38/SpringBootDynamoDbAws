package br.com.aws.dynamodb.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ErrorWarningCampo implements Serializable{
    private String campo;
    private String mensagem;
    private String valor;

    public ErrorWarningCampo(String campo, String mensagem) {
        this.campo = campo;
        this.mensagem = mensagem;
    }
}
