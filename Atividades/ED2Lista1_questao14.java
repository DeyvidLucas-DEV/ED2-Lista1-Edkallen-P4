 /**
 * Função: 
 * Autor: Deyvid Lucas Amorim
 * Data: 05/10/2024
 * Observações: 
 */

 import java.util.Scanner;

 // Classe que representa um passageiro
 class Passenger {
    String name;
    String cpf;
    String phone;
    Passenger next; // Referência para o próximo passageiro

    public Passenger(String name, String cpf, String phone) {
        this.name = name;
        this.cpf = cpf;
        this.phone = phone;
        this.next = null;
    }
}

 // Classe que representa a lista de passageiros
 class PassengerList {
    private Passenger head;

    // Adiciona um novo passageiro ao final da lista
    public void addPassenger(String name, String cpf, String phone) {
        Passenger newPassenger = new Passenger(name, cpf, phone);
        if (head == null) {
            head = newPassenger;
        } else {
            Passenger current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newPassenger;
        }
    }

    // Exibe a lista de passageiros
    public void displayPassengers() {
        Passenger current = head;
        while (current != null) {
            System.out.println("Nome: " + current.name + ", CPF: " + current.cpf + ", Telefone: " + current.phone);
            current = current.next;
        }
    }
}

 // Classe que representa um voo
 class Flight {
    int flightNumber;
    String destination;
    int totalSeats;
    int availableSeats;
    PassengerList passengers; // Lista de passageiros
    Flight next; // Referência para o próximo voo
    int priority; // Fila de espera

    public Flight(int flightNumber, String destination, int totalSeats, int priority) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;
        this.passengers = new PassengerList();
        this.priority = priority;
        this.next = null; // Inicialmente, o próximo voo é null
    }
}

 // Classe que representa a lista de voos
 class FlightList {
    private Flight head;

    // Adiciona um novo voo ao final da lista
    public void addFlight(int flightNumber, String destination, int totalSeats, int priority) {
        Flight newFlight = new Flight(flightNumber, destination, totalSeats, priority);
        if (head == null) {
            head = newFlight;
        } else {
            Flight current = head;
            while (current.next != null) {
                current = current.next; // Navega até o último voo
            }
            current.next = newFlight; // Adiciona o novo voo ao final
        }
    }

    // Exibe a lista de voos
    public void displayFlights() {
        Flight current = head;
        while (current != null) {
            System.out.println("Voo: " + current.flightNumber + ", Destino: " + current.destination +
                    ", Assentos Totais: " + current.totalSeats + ", Disponíveis: " + current.availableSeats +
                    ", Prioridade: " + current.priority);
            current.passengers.displayPassengers(); // Exibe passageiros do voo
            current = current.next;
        }
    }

    // Método para reservar assento em um voo
    public void reserveSeat(int flightNumber, String name, String cpf, String phone) {
        Flight flight = findFlight(flightNumber);
        if (flight != null) {
            if (flight.availableSeats > 0) {
                flight.passengers.addPassenger(name, cpf, phone);
                flight.availableSeats--;
                System.out.println("Assento reservado com sucesso para " + name + " no voo " + flightNumber);
            } else {
                System.out.println("Não há assentos disponíveis para o voo " + flightNumber);
            }
        } else {
            System.out.println("Voo não encontrado.");
        }
    }

    // Método para encontrar um voo pelo número
    private Flight findFlight(int flightNumber) {
        Flight current = head;
        while (current != null) {
            if (current.flightNumber == flightNumber) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
}

 // Classe principal
 public class ED2Lista1_questao14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FlightList flightList = new FlightList();

        // Adicionando alguns voos
        flightList.addFlight(101, "São Paulo", 100, 1);
        flightList.addFlight(102, "Rio de Janeiro", 50, 2);
        flightList.addFlight(103, "Belo Horizonte", 75, 3);

        // Reservando assentos
        System.out.print("Digite o número do voo para reserva: ");
        int flightNumber = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer
        System.out.print("Digite o nome do passageiro: ");
        String name = scanner.nextLine();
        System.out.print("Digite o CPF do passageiro: ");
        String cpf = scanner.nextLine();
        System.out.print("Digite o telefone do passageiro: ");
        String phone = scanner.nextLine();

        flightList.reserveSeat(flightNumber, name, cpf, phone);

        // Exibindo voos
        System.out.println("\nLista de voos:");
        flightList.displayFlights();

        scanner.close();
    }
}