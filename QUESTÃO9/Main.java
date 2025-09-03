/*- Crie uma classe Funcionario com atributos nome e salario.
- Crie um método calcularBonus() que retorna 10% do salário.
- Crie uma subclasse Gerente que sobrescreve esse método para retornar 20% do salário.
 */

class Funcionario {
    String nome;
    double salario;

    public double calcularBonus() {
        return salario * 0.10;
    }
}  
class Gerente extends Funcionario {

    @Override
    public double calcularBonus() {
        return salario * 0.20;
    }
}