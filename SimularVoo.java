public class SimularVoo {
    public static void main(String[] args) {
        Piloto p1,p2;
        Aviao a1;
        p1 = new Piloto("Vinicius");
        p2 = new Piloto("João");
        a1 = new Aviao();
        a1.fazVoo(40, p1);
        a1.fazVoo(100, p2);
        a1.fazVoo(170,p2);
        a1.fazVoo(30, p1);
        a1.fazRevisao();
        a1.fazVoo(20, p1);
        p1.Imprime();
        p2.Imprime();
        a1.Imprime();
    }
}

