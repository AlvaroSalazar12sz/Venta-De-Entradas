package com.mycompany.sistemaventaentradasunmsm;

import controlador.CompraController;
import modelo.SistemaVentaEntradas;
import vista.CompraEntradaView;

public class SistemaVentaEntradasUNMSM {

    public static void main(String[] args) {

        SistemaVentaEntradas sistema = new SistemaVentaEntradas();
        CompraController compraController = new CompraController(sistema);

        CompraEntradaView ventana = new CompraEntradaView(compraController);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
}