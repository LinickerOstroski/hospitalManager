package hospitalmanager;

import java.util.List;
import java.util.Scanner;

 /*
 * This code is provided for educational purposes only. It may contain errors,
 * not follow best programming practices, and may not be properly formatted.
 * This code should not be used in a production environment without proper 
 * review and modifications to meet appropriate quality standards.
 */

public class ClassePrincipal {

    public static void cadastrarInternacao() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastrando Internação:");
        System.out.println("+++++++++++++++++++++");
        System.out.println("Digite o motivo da internação:");
        String motivoInternacao = scanner.nextLine();

        listarMedico();

        System.out.print("*** Digite o ID do médico responsável: ");
        int numeroMedico = scanner.nextInt();
        Medico medicoResponsavel = Medico.getMedicos().get(numeroMedico);

        System.out.println("\n\n\n");
        listarPacientes();
        System.out.print("*** Digite o ID do paciente selecionado: ");
        int numeroPaciente = scanner.nextInt();
        Paciente pacienteInternado = Paciente.getPacientes().get(numeroPaciente);

        System.out.println("\n\n\n");
        listarEnfermeiro();
        System.out.print("*** Digite o ID do enfermeiro selecionado: ");
        int numeroEnfermeiro = scanner.nextInt();
        Enfermeiro enfermeiroResponsavel = Enfermeiro.getEnfermeiros().get(numeroEnfermeiro);

        System.out.println("\n\n\n");
        System.out.println("*** Digite o custo da internação:");
        double custoInternacao = scanner.nextDouble();

        Internacao internacao = new Internacao(motivoInternacao, medicoResponsavel, pacienteInternado, enfermeiroResponsavel, custoInternacao);

        System.out.println("\nInternação cadastrada com sucesso!");
    }

    public static void listarInternacao() {
        List<Internacao> internacoes = Internacao.getInternacao();

        System.out.println("-------------------");
        System.out.println("Lista das internações:");
        for (Internacao internacao : internacoes) {
            System.out.println("Internação de número: " + internacao.getIdentificador());
            System.out.println("Motivo internação: " + internacao.getMotivoInternacao());
            System.out.println("Paciente internado: " + internacao.getPacienteInternado().getNome());
            System.out.println("Médico responsável: " + internacao.getMedicoResponsavel().getNome());
            System.out.println("Enfermeiro responsável: " + internacao.getEnfermeiroResponsavel().getNome());
            System.out.println("Custo da internação: " + internacao.getCustoInternacao());
            System.out.println("--------------------");
        }

    }

    public static void listarPacientes() {
        List<Paciente> pacientes = Paciente.getPacientes();

        System.out.println("-------------------");
        System.out.println("Lista de Pacientes:");
        for (Paciente paciente : pacientes) {
            System.out.println("Id do Paciente: " + paciente.getIdPaciente());
            System.out.println("Nome: " + paciente.getNome());
            System.out.println("Sexo: " + paciente.getSexo());
            System.out.println("Idade: " + paciente.getIdade());
            System.out.println("Gasto total: " + paciente.getValorTotalDeInternacao());
            System.out.println("--------------------");
        }
    }

    public static void listarMedico() {
        List<Medico> medicos = Medico.getMedicos();

        System.out.println("-------------------");
        System.out.println("Lista de Medicos:");
        for (Medico medico : medicos) {
            System.out.println("Id do Medicos: " + medico.getIdMedico());
            System.out.println("Nome: " + medico.getNome());
            System.out.println("Sexo: " + medico.getSexo());
            System.out.println("Idade: " + medico.getIdade());
            System.out.println("Formação " + medico.getFormacao());
            System.out.println("--------------------");
        }
    }

    public static void listarEnfermeiro() {
        List<Enfermeiro> enfermeiros = Enfermeiro.getEnfermeiros();

        System.out.println("-------------------");
        System.out.println("Lista de Enfermeiros:");
        for (Enfermeiro enfermeiro : enfermeiros) {
            System.out.println("Id do Enfermeiro: " + enfermeiro.getIdEnfermeiro());
            System.out.println("Nome: " + enfermeiro.getNome());
            System.out.println("Sexo: " + enfermeiro.getSexo());
            System.out.println("Idade: " + enfermeiro.getIdade());
            System.out.println("--------------------");
        }
    }

    public static void cadastraPaciente() {

        Scanner scanner = new Scanner(System.in);
        char sexo = '\0';

        System.out.println("Cadastrando Paciente:");
        System.out.println("+++++++++++++++++++++");
        System.out.println("Digite o nome do paciente:");

        String nomePaciente = scanner.nextLine();

        do {
            Scanner doWhileScanner = new Scanner(System.in);

            System.out.println("Digite o sexo -> apenas digite (M) masculino ou (F) para feminino");
            String input = doWhileScanner.nextLine();

            if (input.length() == 1) {
                sexo = input.charAt(0);
            } else {
                System.out.println("Entrada inválida, tente novamente!\n");
                sexo = '\0';
            }

        } while (sexo != 'M' && sexo != 'm' && sexo != 'F' && sexo != 'f');

        System.out.println("Digite a idade do Paciente");
        int idade = scanner.nextInt();

        Paciente paciente = new Paciente(nomePaciente, sexo, idade);

        System.out.println("Paciente cadastrado com sucesso!");
    }// Fim cadastra paciente

    public static void cadastraMedico() {

        Scanner scannerMedico = new Scanner(System.in);
        char sexo = '\0';

        System.out.println("Cadastrando Médico:");
        System.out.println("+++++++++++++++++++++");
        System.out.println("Digite o nome do médico:");

        String nomeMedico = scannerMedico.nextLine();

        do {

            System.out.println("Digite o sexo -> apenas digite (M) masculino ou (F) para feminino");
            String input = scannerMedico.nextLine();

            if (input.length() == 1) {
                sexo = input.charAt(0);
            } else {
                System.out.println("Entrada inválida, tente novamente!\n");
                sexo = '\0';
            }

        } while (sexo != 'M' && sexo != 'm' && sexo != 'F' && sexo != 'f');

        System.out.println("Digite a idade do Médico");
        int idade = scannerMedico.nextInt();

        Scanner scannerMedico2 = new Scanner(System.in);

        System.out.println("Digite a formação do Médico");
        String formacao = scannerMedico2.nextLine();

        Medico medico = new Medico(nomeMedico, sexo, idade, formacao);

        System.out.println("Médico cadastrado com sucesso!");
    }// Fim cadastra médico

    public static void cadastraEnfermeiro() {

        Scanner scanner = new Scanner(System.in);
        char sexo = '\0';

        System.out.println("Cadastrando Enfermeiro:");
        System.out.println("+++++++++++++++++++++");
        System.out.println("Digite o nome do Enfermeiro:");

        String nomeEnfermeiro = scanner.nextLine();

        do {
            Scanner doWhileScanner = new Scanner(System.in);

            System.out.println("Digite o sexo -> apenas digite (M) masculino ou (F) para feminino");
            String input = doWhileScanner.nextLine();

            if (input.length() == 1) {
                sexo = input.charAt(0);
            } else {
                System.out.println("Entrada inválida, tente novamente!\n");
                sexo = '\0';
            }

        } while (sexo != 'M' && sexo != 'm' && sexo != 'F' && sexo != 'f');

        System.out.println("Digite a idade do Enfermeiro");
        int idade = scanner.nextInt();

        Enfermeiro enfermeiro = new Enfermeiro(nomeEnfermeiro, sexo, idade);

        System.out.println("Enfermeiro cadastrado com sucesso!");
    }// Fim cadastra Enfermeiro

    public static int menu() {

        int operador;
        Scanner scanner0 = new Scanner(System.in);

        System.out.println("\n\n-----------------------");
        System.out.println("O que deseja realizar?");
        System.out.println("0 - Sair do programa");
        System.out.println("\n");
        System.out.println("1 - realizar cadastro de Paciente");
        System.out.println("2 - realizar cadastro de Médico");
        System.out.println("3 - realizar cadastro de Enfermeiro");
        System.out.println("4 - realizar cadastro de Internação");
        System.out.println("\n");
        System.out.println("5 - listar as internações");
        System.out.println("6 - listar todos os Pacientes");
        System.out.println("7 - listar todos os Medicos");
        System.out.println("8 - listar todos os Enfermeiros");
        operador = scanner0.nextInt();

        return operador;
    }

    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        boolean program = true;

        do {

            int op = menu();

            switch (op) {

                case 0:
                    program = false;
                    break;

                case 1:
                    cadastraPaciente();
                    break;

                case 2:
                    cadastraMedico();
                    break;

                case 3:
                    cadastraEnfermeiro();
                    break;
                case 4:
                    cadastrarInternacao();
                    break;
                case 5:
                    listarInternacao();
                    break;
                case 6:
                    listarPacientes();
                    break;

                case 7:
                    listarMedico();
                    break;

                case 8:
                    listarEnfermeiro();
                    break;

            }// Fim do switch
            System.out.println("Precione qualquer tecla para continuar\n");
            scanner1.nextLine();

        } while (program);
    }
}
