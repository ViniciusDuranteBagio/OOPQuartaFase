import javax.swing.JOptionPane;
import java.util.List;

public class Main {

    private static Agenda agenda = new Agenda();

    public static void main(String[] args) {

        while (true) {

            String menuPrincipal =
                    "1 - Listar consultas\n" +
                            "2 - Cadastrar consulta\n" +
                            "3 - Sair\n\n" +
                            "Digite a opção:";

            String opcaoMenu = JOptionPane.showInputDialog(menuPrincipal);
            if (opcaoMenu == null) return;

            switch (opcaoMenu.trim()) {
                case "1":
                    listarConsultas();
                    break;
                case "2":
                    cadastrarConsulta();
                    break;
                case "3":
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }
    }

    private static void listarConsultas() {
        List<Consulta> listaConsultas = agenda.listar();

        if (listaConsultas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhuma consulta cadastrada.");
            return;
        }

        String textoConsultas = "";
        int numeroConsulta = 1;

        for (Consulta consulta : listaConsultas) {
            textoConsultas += numeroConsulta + ") " + consulta.toString() + "\n\n";
            numeroConsulta++;
        }

        JOptionPane.showMessageDialog(null, textoConsultas);
    }

    private static void cadastrarConsulta() {

        try {
            String menuAnimal =
                    "1 - Cachorro\n" +
                            "2 - Gato\n" +
                            "3 - Coelho\n\n" +
                            "Digite o tipo de animal:";

            String tipoAnimalDigitado = JOptionPane.showInputDialog(menuAnimal);
            if (tipoAnimalDigitado == null) return;

            int tipoAnimalEscolhido = Integer.parseInt(tipoAnimalDigitado.trim());

            if (tipoAnimalEscolhido < 1 || tipoAnimalEscolhido > 3) {
                JOptionPane.showMessageDialog(null, "Tipo de animal inválido.");
                return;
            }

            String nomeAnimal = JOptionPane.showInputDialog("Nome do animal:");
            if (nomeAnimal == null) return;

            String idadeAnimalDigitada = JOptionPane.showInputDialog("Idade do animal:");
            if (idadeAnimalDigitada == null) return;
            int idadeAnimal = Integer.parseInt(idadeAnimalDigitada.trim());

            String racaAnimal = JOptionPane.showInputDialog("Raça do animal:");
            if (racaAnimal == null) return;

            Animal animalCriado;

            if (tipoAnimalEscolhido == 1) {
                animalCriado = new Cachorro(nomeAnimal, idadeAnimal, racaAnimal);
            } else if (tipoAnimalEscolhido == 2) {
                animalCriado = new Gato(nomeAnimal, idadeAnimal, racaAnimal);
            } else {
                animalCriado = new Coelho(nomeAnimal, idadeAnimal, racaAnimal);
            }

            String menuAtendimento =
                    "1 - Banho\n" +
                            "2 - Tosa\n" +
                            "3 - Banho e Tosa\n" +
                            "4 - Consulta\n\n" +
                            "Digite o tipo de atendimento:";

            String tipoAtendimentoDigitado = JOptionPane.showInputDialog(menuAtendimento);
            if (tipoAtendimentoDigitado == null) return;

            int tipoAtendimentoEscolhido = Integer.parseInt(tipoAtendimentoDigitado.trim());

            if (tipoAtendimentoEscolhido < 1 || tipoAtendimentoEscolhido > 4) {
                JOptionPane.showMessageDialog(null, "Tipo de atendimento inválido.");
                return;
            }

            Consulta.TipoAtendimento tipoAtendimentoEnum =
                    Consulta.TipoAtendimento.values()[tipoAtendimentoEscolhido - 1];

            String doencaSelecionada = null;

            if (tipoAtendimentoEnum == Consulta.TipoAtendimento.CONSULTA) {

                String animalDoenteResposta = JOptionPane.showInputDialog("Animal está doente? (s/n)");
                if (animalDoenteResposta == null) return;

                if (animalDoenteResposta.trim().equalsIgnoreCase("s")) {

                    List<String> listaDoencas = animalCriado.getDoencasPossiveis();
                    String menuDoencas = "";

                    for (int i = 0; i < listaDoencas.size(); i++) {
                        menuDoencas += (i + 1) + " - " + listaDoencas.get(i) + "\n";
                    }

                    String doencaDigitada = JOptionPane.showInputDialog("Escolha a doença:\n\n" + menuDoencas);
                    if (doencaDigitada == null) return;

                    int indiceDoencaEscolhida = Integer.parseInt(doencaDigitada.trim());

                    if (indiceDoencaEscolhida < 1 || indiceDoencaEscolhida > listaDoencas.size()) {
                        JOptionPane.showMessageDialog(null, "Opção inválida.");
                        return;
                    }

                    doencaSelecionada = listaDoencas.get(indiceDoencaEscolhida - 1);
                }
            }

            Consulta novaConsulta = new Consulta(animalCriado, tipoAtendimentoEnum, doencaSelecionada);
            agenda.adicionarConsulta(novaConsulta);

            JOptionPane.showMessageDialog(null, "Consulta cadastrada com sucesso.");

        } catch (ValidacaoException erroValidacao) {
            JOptionPane.showMessageDialog(null, erroValidacao.getMessage());
        } catch (NumberFormatException erroNumero) {
            JOptionPane.showMessageDialog(null, "Valor numérico inválido.");
        } catch (Exception erroGeral) {
            JOptionPane.showMessageDialog(null, "Erro: " + erroGeral.getMessage());
        }
    }
}