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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/buscarAllLinguagem")
public class LinguagemAllController {


    private final LanguageUseCase languageUseCase;

    @GetMapping()
    public ResponseEntity<List<LinguagemResponse>> consultarLinguagemPorAll( ) {

        List<LinguagemResponse>  response = LinguagemMapper.mapToResponse(languageUseCase.buscaLinguagemAll());
        return ResponseEntity.ok(response);


    }
}
