package med.voll.api.domain.consulta;

public record DadosDetalhamentoConsulta(Long id, Long medicoId, Long pacienteId, String data) {
    public DadosDetalhamentoConsulta(Consulta consulta) {
        this(consulta.getId(), consulta.getMedico().getId(), consulta.getPaciente().getId(), consulta.getData().toString());
    }
}
