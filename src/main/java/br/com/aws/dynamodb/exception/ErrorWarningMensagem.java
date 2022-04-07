package br.com.aws.dynamodb.exception;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ErrorWarningMensagem implements Serializable{

    private String codigo;
    private String mensagem;
    private List<ErrorWarningCampo> campos = new ArrayList<>();

    public ErrorWarningMensagem(String codigo, String mensagem) {
        this.codigo = codigo;
        this.mensagem = mensagem;
    }
}
