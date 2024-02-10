package albergue;

import java.util.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class menuCliente{
	private static List<Cliente> listaClientes = new ArrayList<>();
	private static List<Quarto> listaQuartos = new ArrayList<>();
	private static List<Cama> listaCamas = new ArrayList<>();
	private static List<Reserva> listaReservas = new ArrayList<>();
	
  public void processamento(){
    int opcao;
    Scanner sc = new Scanner (System.in);
    do{
      System.out.println("Qual menu deseja acessar?");
      System.out.println("1-Clientes");
      System.out.println("2-Quartos");
      System.out.println("3-Camas");
      System.out.println("4-Reservas");
      System.out.println("5-Sair");
      
      opcao = sc.nextInt();

      switch(opcao){
        case 1:
          MenuClientes();
          break;
        case 2:
          MenuQuartos();
          break;
        case 3:
          MenuCamas();
        case 4:
          MenuReservas();
        default:
          System.out.println("Selecione uma opcao valida.");
      }
    }while (opcao!=5);
  }
    }
  }
public void MenuClientes(){
	int opcao1;
	do{
		System.out.println("O que deseja fazer?");
		System.out.println("1 - Incluir Cliente");
		System.out.println("2 - Alterar Cliente");
		System.out.println("3 - Excluir Cliente");
		System.out.println("4 - Listar Clientes");
		System.out.println("5 - Voltar");

		opcao1 = sc.nextInt();

		switch (opcao1){
			case 1:
			IncluirCliente();
			break;
			case 2:
			AlterarCliente();
			break;
			case 3:
			ExcluirCliente();
			break;
			case 4:
			ListarCliente();
			break;
		}
	}while(opcao!=5)
}
public void MenuQuartos(){
	int opcao2;
	do{
		System.out.println("O que deseja fazer?");
		System.out.println("1 - Incluir Quarto");
		System.out.println("2 - Alterar Quarto");
		System.out.println("3 - Excluir Quarto");
		System.out.println("4 - Listar Quartos");
		System.out.println("5 - Voltar");

		opcao2 = sc.nextInt();

		switch (opcao1){
			case 1:
			IncluirQuarto();
			break;
			case 2:
			AlterarQuarto();
			break;
			case 3:
			ExcluirQuarto();
			break;
			case 4:
			ListarQuarto();
			break;
		}
	}while(opcao!=5)
}
public void MenuCamas(){
	int opcao3;
	do{
		System.out.println("O que deseja fazer?");
		System.out.println("1 - Incluir Cama");
		System.out.println("2 - Alterar Cama");
		System.out.println("3 - Excluir Cama");
		System.out.println("4 - Listar Camas");
		System.out.println("5 - Voltar");

		opcao3 = sc.nextInt();

		switch (opcao1){
			case 1:
			IncluirCama();
			break;
			case 2:
			AlterarCama();
			break;
			case 3:
			ExcluirCama();
			break;
			case 4:
			ListarCama();
			break;
		}
	}while(opcao!=5)
}
public void MenuReservas(){
	int opcao4;
	do{
		System.out.println("O que deseja fazer?");
		System.out.println("1 - Incluir Reserva");
		System.out.println("2 - Alterar Reserva");
		System.out.println("3 - Excluir Reserva");
		System.out.println("4 - Listar Reservas");
		System.out.println("5 - Voltar");

		opcao4 = sc.nextInt();

		switch (opcao1){
			case 1:
			IncluirReserva();
			break;
			case 2:
			AlterarReserva();
			break;
			case 3:
			ExcluirReserva();
			break;
			case 4:
			ListarReserva();
			break;
		}
	}while(opcao!=5)
}
  public void IncluirClientes(){
    int id;
    String nome="";
    String endereco="";
    String postalCode="";
    String pais="";
    String cpf="";
    String passaporte="";
    String email="";
    Date dataNascimento="";

    Scanner sc = new Scanner(System.in);
    System.out.println("Informe o id do cliente:");
				id = sc.nextInt();
    System.out.println("Informe o nome do cliente:");
				nome = sc.next();
    System.out.println("Informe o endereco do cliente:");
				matricula = sc.next();
    System.out.println("Informe o postalcode do cliente:");
				postalCode = sc.next();
    System.out.println("Informe o pais do cliente:");
				pais = sc.next();
    System.out.println("Informe o cpf do cliente:");
				cpf = sc.next();
    System.out.println("Informe o passaporte do cliente:");
				passaporte = sc.next();
    System.out.println("Informe o email do cliente:");
				email = sc.next();
    System.out.print("Data de Nascimento (dd/MM/yyyy): ");
        String dataNascimentoStr = scanner.nextLine();
        try {
            Date dataNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(dataNascimentoStr);
            novoCliente.setDataNascimento(dataNascimento);
        } catch (ParseException e) {
            System.out.println("Formato de data inválido. O cliente não será incluído.");
            return;
        }
    Cliente novoCliente=new Cliente(id,nome,endereco,postalCode,pais,cpf,passaporte,email,dataNascimento);
    listaClientes.add(Cliente);
  }
public void AlterarCliente(){
		int i;
		int idCliente;
		System.out.println("Informe o id cliente que deseja alterar:");
				idCliente = sc.nextInt();
		System.out.println("Escolha o atributo a ser alterado:");
       		System.out.println("1. Nome");
		System.out.println("2. Endereço");
	    	System.out.println("3. Postal Code");
	    	System.out.println("4. País");
	    	System.out.println("5. CPF");
	    	System.out.println("6. Passaporte");
    	   	System.out.println("7. E-mail");
    		System.out.println("8. Data de Nascimento");
	i = sc.nextInt();

      switch(i){
        case 1:
		System.out.print("Novo Nome: ");
                cliente.setNome(scanner.nextLine());
          break;
        case 2:
        	System.out.print("Novo Endereço: ");
                cliente.setEndereco(scanner.nextLine());
          break;
        case 3:
          	System.out.print("Novo Postal Code: ");
                cliente.setPostalCode(scanner.nextLine());
        case 4:
        	System.out.print("Novo País: ");
                cliente.setPais(scanner.nextLine());
        case 5:
          	System.out.print("Novo CPF: ");
                cliente.setCpf(scanner.nextLine());
        case 6:
          	System.out.print("Novo Passaporte: ");
                cliente.setPassaporte(scanner.nextLine());
        case 7:
      		System.out.print("Novo E-mail: ");
                cliente.setEmail(scanner.nextLine());
        case 8:
         	System.out.print("Nova Data de Nascimento (dd/MM/yyyy): ");
                String dataNascimentoStr = scanner.nextLine();
                	try {
                        Date dataNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(dataNascimentoStr);
                        cliente.setDataNascimento(dataNascimento);
                    } catch (ParseException e) {
                        System.out.println("Formato de data inválido. Os dados do cliente não serão alterados.");
                    }
        default:
          System.out.println("Selecione uma opcao valida.");
      }
public void ExcluirCliente(){
		int idCliente;
		System.out.println("Informe o id do cliente a excluir:");
				idCliente = sc.nextInt();
		listaClientes.removeIf(cliente -> cliente.getId() == idCliente);
	}
public void ListarClientes(){
	if (listaClientes.isEmpty()) {
            System.out.println("Nao ha clientes.");
        } else {
            System.out.println("Lista de Clientes:");
            for (Cliente cliente : listaClientes) {
                exibirInformacoesCliente(cliente);
                System.out.println("____________________________");
            }
	}
public void IncluirQuarto(){
		
	}
public void AlterarQuarto(){
		
	}
public void ExcluirQuarto(){
		int idQuarto;
		System.out.println("Informe o id do quarto a excluir:");
				idQuarto = sc.nextInt();
		listaQuartos.removeIf(quarto -> quarto.getId() == idQuarto);
	}
public void ListarQuartos(){
		if (listaQuartos.isEmpty()) {
            System.out.println("Nao ha quartos.");
        } else {
            System.out.println("Lista de Quartos:");
            for (Quarto quarto : listaQuartos) {
                exibirInformacoesQuarto(quarto);
                System.out.println("____________________________");
            }
	}
public void IncluirCama(){
		
	}
public void AlterarCama(){
		
	}
public void ExcluirCama(){
		int idCama;
		System.out.println("Informe o id da cama a excluir:");
				idCama = sc.nextInt();
		listaCamas.removeIf(cama -> cama.getId() == idCliente);
	}
public void ListarCama(){
		if (listaCamas.isEmpty()) {
            System.out.println("Nao ha camas.");
        } else {
            System.out.println("Lista de Camas:");
            for (Cama cama : listaCamas) {
                exibirInformacoesCama(cama);
                System.out.println("____________________________");
            }
	}
public void IncluirReserva(){
		
	}
public void AlterarReserva(){
		
	}
public void ExcluirReserva(){
		int idReserva;
		System.out.println("Informe o id da reserva a excluir:");
				idReserva = sc.nextInt();
		listaReservas.removeIf(reserva -> reserva.getId() == idCliente);
	}
public void ListarReserva(){
		if (listaReserva.isEmpty()) {
            System.out.println("Nao ha reservas.");
        } else {
            System.out.println("Lista de Reservas:");
            for (Reserva reserva : listaReservas) {
                exibirInformacoesReserva(reserva);
                System.out.println("____________________________");
            }
	}
private static void exibirInformacoesCliente(Cliente cliente) {
        System.out.println("ID: " + cliente.getId());
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Endereço: " + cliente.getEndereco());
        System.out.println("Postal Code: " + cliente.getPostalCode());
        System.out.println("País: " + cliente.getPais());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Passaporte: " + cliente.getPassaporte());
        System.out.println("E-mail: " + cliente.getEmail());
        System.out.println("Data de Nascimento: " + cliente.getDataNascimento());
    }
private static void exibirInformacoesCama(Cama cama) {
        System.out.println("ID: " + cama.getId());
        System.out.println("Código da Cama: " + cama.getCodigoCama());
        System.out.println("É Beliche: " + (cama.isEhBeliche() ? "Sim" : "Não"));
        System.out.println("Posição: " + cama.getPosicao());
        System.out.println("Descrição: " + cama.getDescricao());
    }
private static void exibirInformacoesQuarto(Quarto quarto) {
        System.out.println("ID: " + quarto.getId());
        System.out.println("Nome do Quarto: " + quarto.getNomeQuarto());
        System.out.println("Quantidade de Camas: " + quarto.getQtdeCamas());
        System.out.println("Tem Banheiro: " + (quarto.temBanheiro() ? "Sim" : "Não"));
        System.out.println("Descrição: " + quarto.getDescricao());
    }
private static void exibirInformacoesReserva(Reserva reserva) {
        System.out.println("ID da Reserva: " + reserva.getId());
        System.out.println("ID do Quarto: " + reserva.getIdQuarto());
        System.out.println("ID da Cama: " + reserva.getIdCama());
        System.out.println("ID do Cliente: " + reserva.getIdCliente());
        System.out.println("Data de Entrada: " + formatarData(reserva.getDataEntrada()));
        System.out.println("Data de Saída: " + formatarData(reserva.getDataSaida()));
    }
}
