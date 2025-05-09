package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private final int cargaHoraria;

    public Curso(String titulo, String descricao, int cargaHoraria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return String.format(
                "%s {titulo='%s', descricao='%s', cargaHoraria=%d}",
                this.getClass().getSimpleName(),
                titulo,
                descricao,
                cargaHoraria
        );
    }
}
