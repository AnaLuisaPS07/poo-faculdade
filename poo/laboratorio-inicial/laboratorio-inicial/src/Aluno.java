public class Aluno {
	String nome;
	int matricula;
	double nota1;
	double nota2;
	double nota3;
	
	Aluno(String nome, int matricula, double nota1, double nota2, double nota3) {
		this.nome = nome;
		this.matricula = matricula;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	
	double calculaMedia() {
		return (nota1+nota2+nota3)/3;
	}
	
    //método para verificar aprovação ou não
    public String verificaAprovacao() {
        return (calculaMedia() >= 7.0) ? "Aprovado" : "Reprovado";
    }

	public String toString() {
		return nome + " (Matrícula - " + matricula + ")";
	}
}