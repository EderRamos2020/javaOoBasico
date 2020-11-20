package com.testAutomationCoach.aAbstraccion;

public class EjemploPelicula {

    public static void main(String[] args) {

        Pelicula beta = new Pelicula();
        Pelicula alfa = new Pelicula();
        Pelicula omega = new Pelicula();
        Pelicula[] delta = {beta, alfa, omega};
        Pelicula[] gamma = new Pelicula[3];
        Pelicula[] epsilon = delta;
        Pelicula[][] kappa = {delta, gamma, epsilon};


        beta.idPel = 0;
        beta.titulo = "";
        beta.duracion=0;
        beta.sinopsis="Esta es la historia de un conejito saltarin";
        beta.productora="";
        beta.factura=0;
        beta.cantidad=0;
        beta.precio=0;
        beta.idPersona=0;

        beta.idPersona=Pelicula.get_idPer();
        beta.idPel=beta.seaFilm("accion");
        //double idFilm= beta.idPel;
        beta.precio=Pelicula.alquilar(beta.idPel);
        beta.premio(beta.idPel,beta.idPersona, beta.precio);
        double descPor=8.5;
        double valEnviar=valDesc(beta, beta.idPersona, descPor);

    }

    public static double valDesc(Pelicula objDesc, int id, double desc1)
    {
        double descu = objDesc.precio * (desc1/100);
        double valTot= objDesc.precio - descu;
        System.out.println("valor con descuento : "+valTot);
        objDesc.valTotal = valTot;
        return valTot;
    }
}
