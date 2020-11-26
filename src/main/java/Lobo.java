class Lobo {
    Double peso = 5.0;

    void comer(Comida algo) {
        peso += algo.calorias();
    }

    Double peso() {
        return peso;
    }
}
