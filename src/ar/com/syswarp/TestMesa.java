/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.syswarp;

/**
 *
 * @author riddick
 */
import ar.com.syswarp.controlador.*;
import ar.com.syswarp.modelo.*;
import static java.lang.System.exit;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
        
public class TestMesa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Comienzo la pruebas de metodos ");
        
        //PROBAR PRACTICOS!!!
        
        // alta
        /*
        Operaciones o = new Operaciones();
        Tiposusuarios t = new Tiposusuarios( "prueba5");
        o.TipousuariosCreate(t);
        o=null;
        t=null;
        */
        /*
        Operaciones o = new Operaciones();
        PrAgencias t = new PrAgencias( "AGE2", "AGENCIA 2", "30-70921944-4", "Chacabuco 361 CABA");
        o.AgenciasCreate(t);
        o=null;
        t=null;
        */
        /*
        Operaciones o = new Operaciones();
        PrBuques t = new PrBuques( "YXXX", "ALBERTO FERNANDEZ", "ARG", new BigDecimal(1), new BigDecimal(1),new BigDecimal(1), new BigDecimal(1), new BigDecimal(1), new BigDecimal(1), new BigDecimal(1));
        o.BuquesCreate(t);
        o=null;
        t=null;
        */
        
        /*
        Operaciones o = new Operaciones();
        PrEmpresasCoordinacion t = new PrEmpresasCoordinacion("EMPRESA MARCELA LEDESMA S.A.", "30-70921944-4","CALLE 164 NRO 5834 CONSTITUCION" );
        o.EmpresasCreate(t);
        o=null;
        t=null;
        */
        /*
        Date hoy = new Date(System.currentTimeMillis());
        Operaciones o = new Operaciones();
        PrPracticos t = new PrPracticos( "Virginia Vallejos", "120", "Telefono", "Celular", "otroTelefono", "Direccion", hoy, hoy);
        o.PracticosCreate(t);
        o=null;
        t=null;
        */   
        
        /*
        Operaciones o = new Operaciones();
        PrPuertos t = new PrPuertos( "Puerto prueba2", new BigDecimal(0), new BigDecimal(0), new Integer(0),new Double(0), new Double(0), "Domicilio");
        o.PuertosCreate(t);
        o=null;
        t=null;
        */
                
        
  //SUPER IMPORTANTE PARA INSERTAR CON PK tengo que instanciar el objeto relacion y pararme en el que quiero cargar.
    
  /*
        Operaciones o = new Operaciones();
        PrPuertos pu= o.getPuertosFindByPK(2);
        PrMuelles t = new PrMuelles(  "Muelle 1-Puerto Alvear2 ",new Long(1), "N", new Long(1), "Estructura", new BigDecimal(0), new Double(0), new Double(1), pu);
         o.MuellesCreate(t);
         o=null;
         t=null;
   */     
   
 /*
        Operaciones o = new Operaciones();
        Tiposusuarios pu= o.getTiposusuariosFindByPK(1);
        Usuarios t = new Usuarios(1, pu, "jtoledo@gylgroup.com", "123456", "Jose Toledo", "S");
        o.UsuariosCreate(t);
        o=null;
        t=null;
 */
  
        // traer todo
       /*  
        Operaciones o = new Operaciones();
        List<PrAgencias> l = o.getAgenciasAll();
        Iterator<PrAgencias> iter = l.iterator();
        while(iter.hasNext()){
           PrAgencias tu = (PrAgencias) iter.next();
           System.out.println(tu.toString());
        }
        */

        /*
        Operaciones o = new Operaciones();
        List<Tiposusuarios> l = o.getTiposusuariosAll();
        Iterator<Tiposusuarios> iter = l.iterator();
        while(iter.hasNext()){
           Tiposusuarios tu = (Tiposusuarios) iter.next();
           System.out.println(tu.toString());
        }
        
        */
        /*
        Operaciones o = new Operaciones();
        List<PrBuques> l = o.getBuquesAll();
        Iterator<PrBuques> iter = l.iterator();
        while(iter.hasNext()){
           PrBuques tu = (PrBuques) iter.next();
           System.out.println(tu.toString());
        }
        
        
        
      */
       /*
        Operaciones o = new Operaciones();
        List<PrPracticos> l = o.getPracticosll();
        Iterator<PrPracticos> iter = l.iterator();
        while(iter.hasNext()){
           PrPracticos tu = (PrPracticos) iter.next();
           System.out.println(tu.toString());
        }     
        */
        
        /*
        Operaciones o = new Operaciones();
        List<PrEmpresasCoordinacion> l = o.getEmpresasAll();
        Iterator<PrEmpresasCoordinacion> iter = l.iterator();
        while(iter.hasNext()){
           PrEmpresasCoordinacion tu = (PrEmpresasCoordinacion) iter.next();
           System.out.println(tu.toString());
        }
        */
        
        /*
        Operaciones o = new Operaciones();
        List<PrPuertos> l = o.getPuertosAll();
        Iterator<PrPuertos> iter = l.iterator();
        while(iter.hasNext()){
           PrPuertos tu = (PrPuertos) iter.next();
           System.out.println(tu.toString());
        } 
        */
        
        /*
        Operaciones o = new Operaciones();
        List<PrMuelles> l = o.getMuellesAll();
        Iterator<PrMuelles> iter = l.iterator();
        while(iter.hasNext()){
           PrMuelles tu = (PrMuelles) iter.next();
           System.out.println(tu.toString());
        }    
        */
        /*
        Operaciones o = new Operaciones();
        List<Usuarios> l = o.getUsuariosAll();
        Iterator<Usuarios> iter = l.iterator();
        while(iter.hasNext()){
           Usuarios tu = (Usuarios) iter.next();
           System.out.println(tu.toString());
        }    
        */
        
       
        // buscar uno solo por pk
        /*
        Operaciones o = new Operaciones();
        List<Tiposusuarios> l = o.getTiposusuariosPK(1);
        Iterator<Tiposusuarios> iter = l.iterator();
        while(iter.hasNext()){
           Tiposusuarios tu = (Tiposusuarios) iter.next();
           System.out.println(tu.toString());
        }
        */
        /*
        Operaciones o = new Operaciones();
        List<PrAgencias> l = o.getAgenciasPK(20);
        Iterator<PrAgencias> iter = l.iterator();
        while(iter.hasNext()){
           PrAgencias tu = (PrAgencias) iter.next();
           System.out.println(tu.toString());
        }
        */
        
        /*
        Operaciones o = new Operaciones();
        List<PrBuques> l = o.getBuquesPK(1);
        Iterator<PrBuques> iter = l.iterator();
        while(iter.hasNext()){
           PrBuques tu = (PrBuques) iter.next();
           System.out.println(tu.toString());
        }
        */
        /*
        Operaciones o = new Operaciones();
        List<PrEmpresasCoordinacion> l = o.getEmpresasPK(1);
        Iterator<PrEmpresasCoordinacion> iter = l.iterator();
        while(iter.hasNext()){
           PrEmpresasCoordinacion tu = (PrEmpresasCoordinacion) iter.next();
           System.out.println(tu.toString());
        }
        */

        /*
        Operaciones o = new Operaciones();
        List<PrPracticos> l = o.getPracticosPK(1);
        Iterator<PrPracticos> iter = l.iterator();
        while(iter.hasNext()){
           PrPracticos tu = (PrPracticos) iter.next();
           System.out.println(tu.toString());
        }
        */
        /*
        Operaciones o = new Operaciones();
        List<PrPuertos> l = o.getPuertosPK(1);
        Iterator<PrPuertos> iter = l.iterator();
        while(iter.hasNext()){
           PrPuertos tu = (PrPuertos) iter.next();
           System.out.println(tu.toString());
        } 
        */
        
        /*
        Operaciones o = new Operaciones();
        List<PrMuelles> l = o.getMuellesPK(2);
        Iterator<PrMuelles> iter = l.iterator();
        while(iter.hasNext()){
           PrMuelles tu = (PrMuelles) iter.next();
           System.out.println(tu.toString());
        } 
        */
        /*
        Operaciones o = new Operaciones();
        List<Usuarios> l = o.getUsuariosPK(1);
        Iterator<Usuarios> iter = l.iterator();
        while(iter.hasNext()){
           Usuarios tu = (Usuarios) iter.next();
           System.out.println(tu.toString());
        } 
        */
        
        // traer un solo registro en un objeto
        /*
        Operaciones o = new Operaciones();
        
        Tiposusuarios tu= o.getTiposusuariosFindByPK(2); 
        System.out.println(tu);
        */
        
        // borrar un registro
        /*
        Operaciones o = new Operaciones();
        Integer i = o.TiposusuariosDel(0); 
        System.out.println("Se borraron :" + i );
        */
        
        
       /* 
        Operaciones o = new Operaciones();
        Integer i = o.AgenciasDel(78);
        System.out.println("Se borraron :" + i );
       */ 
        
       /*
        Operaciones o = new Operaciones();
        Integer i = o.BuquesDel(3);
        System.out.println("Se borraron :" + i );      
        */
       
       /*
        Operaciones o = new Operaciones();
        Integer i = o.EmpresasDel(4);
        System.out.println("Se borraron :" + i );      
        */
       /*
        Operaciones o = new Operaciones();
        Integer i = o.PracticosDel(0);
        System.out.println("Se borraron :" + i );      
        */
       /*
       Operaciones o = new Operaciones();
        Integer i = o.PuertosDel(23);
        System.out.println("Se borraron :" + i );       
       */
       /*
        Operaciones o = new Operaciones();
        Integer i = o.MuellesDel(1);
        System.out.println("Se borraron :" + i );       
        */
        
       /*
        Operaciones o = new Operaciones();
        Integer i = o.UsuariosDel(1);
        System.out.println("Se borraron :" + i );       
        */ 
       
// actualizar un registro
       /* 
        Operaciones o = new Operaciones();
        Integer i = o.TiposusuariosUPD(6,"Nuevo update"); 
        System.out.println("Se actualizaron :" + i );
        */
       
       /*
        Operaciones o = new Operaciones();
        Integer i = o.AgenciasUPD(80, "UPD", "AGRUPACION EVITA", "20-22032985-3", null, null, "Avendida de Mayo 725 piso 3");
        System.out.println("Se actualizaron :" + i );
       */
       
       /*
        Operaciones o = new Operaciones();
        Integer i = o.BuquesUPD(4,"YXXX", "PRESIDENTE ALBERTO FERNANDEZ", "ARG", new BigDecimal(2), new BigDecimal(2), new BigDecimal(2), new BigDecimal(2), new BigDecimal(2), new BigDecimal(2), new BigDecimal(2)); 

        System.out.println("Se actualizaron :" + i );
       */
        /*
        Operaciones o = new Operaciones();
        Integer i = o.EmpresasUPD(5, "Ledesma Traviata S.A.","30-70921944-4", "Daniel Oviedo Nro 840");
        System.out.println("Se actualizaron :" + i );
        */
        /*
        Date hoy = new Date(System.currentTimeMillis());
        Operaciones o = new Operaciones();
        Integer i = o.PracticosUPD(20, "Robledo Araya, Manuela", "999", "1554028667", "4215-1142", "No", "Calle 175 berazategui", hoy, hoy);
        System.out.println("Se actualizaron :" + i );
        */
        /* 
        Operaciones o = new Operaciones();
        Integer i = o.PuertosUPD(21, "Puerto Desado", new BigDecimal(0), new BigDecimal(0), new Integer(1), new Double(9), new Double(9),"Viva Peron");
        System.out.println("Se actualizaron :" + i );
        */
        /*
        Operaciones o = new Operaciones();
        Integer i = o.MuellesUPD(new Integer(2), new Integer(2),"Muelle San Julian", new Long(0), "", new Long(0), "", new BigDecimal(9), new Double(0) , new Double(0));
        System.out.println("Se actualizaron :" + i );
        */
        
        /*
        Operaciones o = new Operaciones();
        Integer i = o.UsuariosUPD(  2, "tayara@gylgroup.com","123456","Tom Araya", "S" , 1 );
        System.out.println("Se actualizaron :" + i );
        */
        
        
        // encriptar desencriptar.
        /*
        Operaciones o = new Operaciones();
        System.out.println(o.Encriptar("Carlos"));
        System.out.println(o.Desencriptar("OqujO9M0hIc="));
        */
        exit(0);
            
    }
    
}
