package med.voll.api.domain.consulta.validacoes;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.ConsultaRepository;
import med.voll.api.domain.consulta.DadosAgendamentoConsulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorConflitoDeHorarioConsulta implements ValidadorAgendamentoDeConsulta{

    @Autowired
    private ConsultaRepository repository;


    public void validar(DadosAgendamentoConsulta dados) {

        var medicoPossuiConflitoDeConsulta = repository.existsByMedicoIdAndData(dados.idMedico(), dados.data());

        if(medicoPossuiConflitoDeConsulta) {
            throw  new ValidacaoException("Medico ja tem consulta marcada nesse horario.");
        }

    }

}
