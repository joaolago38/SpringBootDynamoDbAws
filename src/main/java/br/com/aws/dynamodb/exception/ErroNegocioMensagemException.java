package br.com.aws.dynamodb.exception;



import br.com.aws.dynamodb.message.ErrorMessage;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ErroNegocioMensagemException extends RuntimeException {


    private final ErrorWarningMensagem errorWarningMensagem;

    public ErroNegocioMensagemException(
            String codigo, String mensagem, List<ErrorWarningCampo> campos) {
        super(mensagem);
        this.errorWarningMensagem = new ErrorWarningMensagem(codigo, mensagem, campos);
    }

    public ErroNegocioMensagemException(String codigo, String mensagem) {
        super(mensagem);
        this.errorWarningMensagem = new ErrorWarningMensagem(codigo, mensagem, new ArrayList<>());
    }

    public ErroNegocioMensagemException(
            String codigo, String mensagem, ErrorWarningCampo campoUnico) {
        super(mensagem);
        List<ErrorWarningCampo> list = new ArrayList<>();
        list.add(campoUnico);
        this.errorWarningMensagem = new ErrorWarningMensagem(codigo, mensagem, list);
    }

    public ErroNegocioMensagemException(ErrorMessage errorMessage, ErrorWarningCampo campo) {
        super(errorMessage.getMensagem());
        this.errorWarningMensagem =
                new ErrorWarningMensagem(
                        errorMessage.getCodigo(), errorMessage.getMensagem(), List.of(campo));
    }

    public ErroNegocioMensagemException(ErrorMessage errorMessage) {
        super(errorMessage.getMensagem());
        this.errorWarningMensagem =
                new ErrorWarningMensagem(errorMessage.getCodigo(), errorMessage.getMensagem(), null);
    }

    public ErroNegocioMensagemException(ErrorWarningMensagem errorWarningMensagem) {
        super(errorWarningMensagem.getMensagem());
        this.errorWarningMensagem = errorWarningMensagem;
    }
}
