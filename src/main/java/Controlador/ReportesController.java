/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.dao.*;
import Modelo.vo.*;
import java.util.ArrayList;

public class ReportesController {

    public static ArrayList<LiderVo> getinformacionLideres() {
        ArrayList<LiderVo> InformacionLider = LiderDao.informacionLider();
        return InformacionLider;
    }
    
    public static ArrayList<ProyectoVo> getinformacionProyectos() {
        ArrayList<ProyectoVo> InformacionProyecto = ProyectoDao.informacionProyecto();
        return InformacionProyecto;
    }

    public static ArrayList<ComprasVo> getinformacionCompras() {
        ArrayList<ComprasVo> InformacionCompras = ComprasDao.informacionCompra();
        return InformacionCompras;
    }
}
