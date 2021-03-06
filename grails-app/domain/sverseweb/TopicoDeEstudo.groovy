package sverseweb

class TopicoDeEstudo {
    String nome
    Date dataCriacao
    Date dataAtualizacao

    static belongsTo = [topicoDeEstudo : TopicoDeEstudo]
    static hasMany = [boletinsDeEstudo : BoletimDeEstudo]

    static constraints = {
        nome(nullable: false, blank: false,        maxSize: 100, unique:false)
        dataCriacao(nullable: false, blank: false,        maxSize: 100, unique:false)
        dataAtualizacao(nullable: false, blank: false,        maxSize: 100, unique:false)
    }
}
