import java.util.*;

public class Main {
    public static void main(String[] args) {
        Programador prog1 = new Programador(1, "Marcos", 7800.00);
        Programador prog2 = new Programador(2, "Roger", 5500.00);
        Programador prog3 = new Programador(3, "Alessandra", 5500.00);

        Analista anl1 = new Analista(4, "Pedro", 8500.00);
        Analista anl2 = new Analista(5, "Mayara", 8500.00);

        Gerente gr1 = new Gerente(6, "Carlos", 13950.00);
        Gerente gr2 = new Gerente(7, "Isadora", 14600.00);

        List<Programador> a = new ArrayList<>();
        a.add(prog1);

        Departamento<Programador> pa = new Departamento<>(new ArrayList<>(), new ArrayList<>());

    }
}