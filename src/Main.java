public class Main {
    public static void main(String[] args) {

        // Equipo 1: T1
        Entrenador entrenadorT1 = new Entrenador("Kim", "Jeong-soo", 36, "kkOma");
        Equipo equipoT1 = new Equipo("T1", "T1");

        // Jugadores titulares
        Jugador jugadorT1_1 = new Jugador("Choi", "Hyeon-joon", 24, "Doran", Posicion.TOP);
        Jugador jugadorT1_2 = new Jugador("Mun", "Hyeon-jun", 22, "Oner", Posicion.JUNGLE);
        Jugador jugadorT1_3 = new Jugador("Lee", "Sang-hyeok", 28, "Faker", Posicion.MID);
        Jugador jugadorT1_4 = new Jugador("Lee", "Min-hyeong", 21, "Gumayusi", Posicion.ADC);
        Jugador jugadorT1_5 = new Jugador("Ryu", "Min-seok", 23, "Keria", Posicion.SUPPORT);

        // Jugador suplente
        Jugador jugadorT1_6 = new Jugador("Kim", "Dong-hyeon", 20, "Poby", Posicion.MID); // Suplente

        // Agregar jugadores al equipo
        equipoT1.agregarTitulares(jugadorT1_2);
        equipoT1.agregarTitulares(jugadorT1_4);
        equipoT1.agregarTitulares(jugadorT1_1);
        equipoT1.agregarTitulares(jugadorT1_3);
        equipoT1.agregarTitulares(jugadorT1_5);

        equipoT1.agregarReservas(jugadorT1_6);

        equipoT1.setEntrenador(entrenadorT1);

        // Equipo 2: G2 Esports
        Entrenador entrenadorG2 = new Entrenador("Dylan", "Falco", 34, "Dylan Falco");
        Equipo equipoG2 = new Equipo("G2", "G2 Esports");

        // Jugadores titulares
        Jugador jugadorG2_1 = new Jugador("Sergen", "Çelik", 24, "BrokenBlade", Posicion.TOP);
        Jugador jugadorG2_2 = new Jugador("SkewMond", "", 22, "SkewMond", Posicion.JUNGLE);
        Jugador jugadorG2_3 = new Jugador("Rasmus", "Winther", 24, "Caps", Posicion.MID);
        Jugador jugadorG2_4 = new Jugador("Steven", "Liv", 24, "Hans Sama", Posicion.ADC);
        Jugador jugadorG2_5 = new Jugador("Labros", "Papoutsakis", 26, "Labrov", Posicion.SUPPORT);

        // Jugador suplente
        Jugador jugadorG2_6 = new Jugador("Pawel", "Pruski", 21, "Fresskowy", Posicion.MID); // Suplente

        // Agregar jugadores al equipo
        equipoG2.agregarTitulares(jugadorG2_2);
        equipoG2.agregarTitulares(jugadorG2_4);
        equipoG2.agregarTitulares(jugadorG2_1);
        equipoG2.agregarTitulares(jugadorG2_3);
        equipoG2.agregarTitulares(jugadorG2_5);

        equipoG2.agregarReservas(jugadorG2_6);

        equipoG2.setEntrenador(entrenadorG2);

        // Equipo 3: JD Gaming
        Entrenador entrenadorJDG = new Entrenador("Yoon", "Sung-young", 40, "Homme");
        Equipo equipoJDG = new Equipo("JDG", "JD Gaming");

        // Jugadores titulares
        Jugador jugadorJDG_1 = new Jugador("Bai", "Jiahao", 23, "369", Posicion.TOP);
        Jugador jugadorJDG_2 = new Jugador("Seo", "Jin-hyeok", 24, "Kanavi", Posicion.JUNGLE);
        Jugador jugadorJDG_3 = new Jugador("Zhuo", "Ding", 23, "Knight", Posicion.MID);
        Jugador jugadorJDG_4 = new Jugador("Park", "Jae-hyuk", 23, "Ruler", Posicion.ADC);
        Jugador jugadorJDG_5 = new Jugador("Lou", "Yang", 22, "Missing", Posicion.SUPPORT);

        // Jugador suplente
        Jugador jugadorJDG_6 = new Jugador("Yan", "Yangwei", 22, "Wei", Posicion.JUNGLE); // Suplente

        // Agregar jugadores al equipo
        equipoJDG.agregarTitulares(jugadorJDG_1);
        equipoJDG.agregarTitulares(jugadorJDG_2);
        equipoJDG.agregarTitulares(jugadorJDG_3);
        equipoJDG.agregarTitulares(jugadorJDG_4);
        equipoJDG.agregarTitulares(jugadorJDG_5);

        equipoJDG.agregarReservas(jugadorJDG_6);

        equipoJDG.setEntrenador(entrenadorJDG);




        // Pruebas
        equipoT1.printAlineacion();
        equipoG2.printAlineacion();

    }
}
