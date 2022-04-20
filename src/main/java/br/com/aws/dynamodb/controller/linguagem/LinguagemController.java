package br.com.aws.dynamodb.controller.linguagem;

import br.com.aws.dynamodb.mapper.InventarioMapper;
import br.com.aws.dynamodb.mapper.LinguagemMapper;
import br.com.aws.dynamodb.response.InventarioResponse;
import br.com.aws.dynamodb.response.LinguagemResponse;
import br.com.aws.dynamodb.usecase.InventarioUseCase;
import br.com.aws.dynamodb.usecase.LanguageUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/buscarLinguagem")
public class LinguagemController {

    private final LanguageUseCase languageUseCase;

    @GetMapping("/{languageId}/linguagem")
    public ResponseEntity<List<LinguagemResponse>> consultarInventarioPorCodicoId(
            @PathVariable(name = "languageId")Integer languageId) {

        List<LinguagemResponse>  response = LinguagemMapper.mapToResponse(languageUseCase.buscaPorLanguageId(languageId));
        return ResponseEntity.ok(response);


    }
}
