
package DTO;

public class UsuarioDTO {
    
    private int cpf_usuario;
    private String username;
    private String senha;
    private String nome_aluno;
    private String turma;
    private String escola;
    private String turno;

    /**
     * @return the cpf_usuario
     */
    public int getCpf_usuario() {
        return cpf_usuario;
    }

    /**
     * @param cpf_usuario the cpf_usuario to set
     */
    public void setCpf_usuario(int cpf_usuario) {
        this.cpf_usuario = cpf_usuario;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the nome_aluno
     */
    public String getNome_aluno() {
        return nome_aluno;
    }

    /**
     * @param nome_aluno the nome_aluno to set
     */
    public void setNome_aluno(String nome_aluno) {
        this.nome_aluno = nome_aluno;
    }

    /**
     * @return the turma
     */
    public String getTurma() {
        return turma;
    }

    /**
     * @param turma the turma to set
     */
    public void setTurma(String turma) {
        this.turma = turma;
    }

    /**
     * @return the escola
     */
    public String getEscola() {
        return escola;
    }

    /**
     * @param escola the escola to set
     */
    public void setEscola(String escola) {
        this.escola = escola;
    }

    /**
     * @return the turno
     */
    public String getTurno() {
        return turno;
    }

    /**
     * @param turno the turno to set
     */
    public void setTurno(String turno) {
        this.turno = turno;
    }
       
}
