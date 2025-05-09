package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria extends Conteudo{

    private final LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria(String titulo, String descricao, LocalDate data) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
    }

    @Override
    public String toString() {
        return String.format(
                "%s {titulo='%s', descricao='%s', data=%s}",
                this.getClass().getSimpleName(),
                titulo,
                descricao,
                data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
        );
    }
}
