
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BAC
 */
public class Equipo {
    ArrayList equipos = new ArrayList();
    private String nombreEquipo;
    private int partidosJugados;
    private int ganados;
    private int empatados;
    private int perdidos;
    private int golesFavor;
    private int golesContra;
    private int Diferencia;
    private int pts;

    public Equipo(String nombreEquipo, int partidosJugados, int ganados, int empatados, int perdidos, int golesFavor, int golesContra, int Diferencia, int pts) {
        this.nombreEquipo = nombreEquipo;
        this.partidosJugados = partidosJugados;
        this.ganados = ganados;
        this.empatados = empatados;
        this.perdidos = perdidos;
        this.golesFavor = golesFavor;
        this.golesContra = golesContra;
        this.Diferencia = Diferencia;
        this.pts = pts;
    }
    
    
}
